# V2GetWorkflowResponse


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `ContentType`                                                                 | *string*                                                                      | :heavy_check_mark:                                                            | HTTP response content type for this operation                                 |
| `StatusCode`                                                                  | *int*                                                                         | :heavy_check_mark:                                                            | HTTP response status code for this operation                                  |
| `RawResponse`                                                                 | [*http.Response](https://pkg.go.dev/net/http#Response)                        | :heavy_minus_sign:                                                            | Raw HTTP response; suitable for custom response parsing                       |
| `V2Error`                                                                     | [*shared.V2Error](../../models/shared/v2error.md)                             | :heavy_minus_sign:                                                            | General error                                                                 |
| `V2GetWorkflowResponse`                                                       | [*shared.V2GetWorkflowResponse](../../models/shared/v2getworkflowresponse.md) | :heavy_minus_sign:                                                            | The workflow                                                                  |