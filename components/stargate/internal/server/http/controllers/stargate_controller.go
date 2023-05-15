package controllers

import (
	"io"
	"net/http"
	"strings"

	service "github.com/formancehq/stack/components/stargate/internal/api"
	"github.com/formancehq/stack/libs/go-libs/api"
	"github.com/pkg/errors"
	"go.opentelemetry.io/otel/attribute"
	"google.golang.org/protobuf/proto"
)

func (s *StargateController) HandleCalls(w http.ResponseWriter, r *http.Request) {
	ctx := r.Context()
	organizationID, stackID, err := getOrganizationAndStackID(r.Host)
	if err != nil {
		ResponseError(w, r, err)
		return
	}

	attrs := []attribute.KeyValue{
		attribute.String("organization_id", organizationID),
		attribute.String("stack_id", stackID),
		attribute.String("path", r.URL.Path),
	}
	s.metricsRegistry.ReceivedHTTPCallByPath().Add(ctx, 1, attrs...)

	msg, err := requestToProto(r)
	if err != nil {
		ResponseError(w, r, errors.Wrapf(err, "failed to parse request"))
		return
	}

	buf, err := proto.Marshal(msg)
	if err != nil {
		ResponseError(w, r, errors.Wrapf(err, "failed to marshal message"))
		return
	}

	subject := GetNatsSubject(organizationID, stackID)
	// requestCtx, cancel := context.WithTimeout(ctx, s.config.natsRequestTimeout)
	// defer cancel()
	resp, err := s.natsConn.Request(subject, buf, s.config.natsRequestTimeout)
	if err != nil {
		ResponseError(w, r, errors.Wrapf(err, "failed to send message"))
		return
	}

	var response service.StargateClientMessage
	if err = proto.Unmarshal(resp.Data, &response); err != nil {
		ResponseError(w, r, errors.Wrapf(err, "failed to unmarshal response"))
		return
	}

	switch ev := response.Event.(type) {
	case *service.StargateClientMessage_ApiCallResponse:
		for k, v := range ev.ApiCallResponse.Headers {
			for _, vv := range v.Values {
				w.Header().Add(k, vv)
			}
		}

		api.WriteResponse(w, int(ev.ApiCallResponse.StatusCode), ev.ApiCallResponse.Body)
		return
	default:
		ResponseError(w, r, errors.Wrapf(err, "invalid response from client"))
		return
	}
}

func GetNatsSubject(organizationID, stackID string) string {
	return organizationID + "." + stackID
}

func getOrganizationAndStackID(host string) (string, string, error) {
	hostSplit := strings.Split(host, ".")
	if len(hostSplit) < 1 {
		return "", "", errors.Wrapf(ErrValidation, "invalid host: %s", host)
		// ResponseError(w, r, errors.Wrapf(ErrValidation, "invalid host: %s", r.Host))
	}

	l := strings.Split(hostSplit[0], "-")
	if len(l) != 2 {
		return "", "", errors.Wrapf(ErrValidation, "invalid host: %s", host)
	}

	return l[0], l[1], nil
}

func requestToProto(r *http.Request) (*service.StargateServerMessage, error) {
	urlQuery := make(map[string]*service.Values)
	for k, v := range r.URL.Query() {
		urlQuery[k] = &service.Values{Values: v}
	}

	body, err := io.ReadAll(r.Body)
	if err != nil {
		return nil, err
	}

	headers := make(map[string]*service.Values)
	for k, v := range r.Header {
		headers[k] = &service.Values{Values: v}
	}

	return &service.StargateServerMessage{
		Event: &service.StargateServerMessage_ApiCall{
			ApiCall: &service.StargateServerMessage_APICall{
				Method:  r.Method,
				Path:    r.URL.Path,
				Query:   urlQuery,
				Body:    body,
				Headers: headers,
			},
		},
	}, nil
}