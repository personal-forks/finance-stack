package cmd

import (
	"context"
	"github.com/numary/ledger/pkg/ledgertesting"
	storage2 "github.com/numary/ledger/pkg/storage"
	"github.com/numary/ledger/pkg/storage/sqlstorage"
	"github.com/stretchr/testify/assert"
	"go.uber.org/fx"
	"testing"
)

func TestContainers(t *testing.T) {

	type testCase struct {
		name    string
		options []option
	}

	for _, tc := range []testCase{
		{
			name: "default",
			options: []option{
				WithOption(fx.Provide(func() storage2.Driver {
					return sqlstorage.NewInMemorySQLiteDriver()
				})),
			},
		},
		{
			name: "pg",
			options: []option{
				WithRememberConfig(false),
				WithOption(fx.Provide(ledgertesting.PostgresServer)),
				WithOption(fx.Provide(func(t *testing.T, pgServer *ledgertesting.PGServer) storage2.Driver {
					return sqlstorage.NewCachedDBDriver("postgres", sqlstorage.PostgreSQL, pgServer.ConnString())
				})),
				WithOption(fx.Invoke(func(t *testing.T, storageFactory storage2.Factory) {
					store, err := storageFactory.GetStore("testing")
					assert.NoError(t, err)
					assert.NoError(t, store.Close(context.Background()))
				})),
			},
		},
	} {
		t.Run(tc.name, func(t *testing.T) {
			run := make(chan struct{}, 1)
			options := append(tc.options,
				WithRememberConfig(false),
				WithOption(fx.Invoke(func() {
					run <- struct{}{}
				})),
				WithOption(fx.Provide(func() *testing.T {
					return t
				})),
			)
			app := NewContainer(options...)

			err := app.Start(context.Background())
			if err != nil {
				t.Fatal(err)
			}
			defer app.Stop(context.Background())

			select {
			case <-run:
			default:
				t.Fatal("application not started correctly")
			}
		})
	}

}
