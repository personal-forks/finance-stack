package delay

import (
	"github.com/formancehq/orchestration/internal/schema"
	"github.com/formancehq/orchestration/internal/workflow/stages"
	"github.com/formancehq/stack/libs/go-libs/time"
)

type Delay struct {
	Duration *schema.Duration `json:"duration,omitempty"`
	Until    *time.Time       `json:"until,omitempty"`
}

func (d Delay) GetWorkflow() any {
	return RunDelay
}

func init() {
	schema.RegisterOneOf(Delay{})
	stages.Register("delay", Delay{})
}
