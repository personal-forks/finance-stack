/*
GENERIC connector API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: v0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package genericclient

import (
	"encoding/json"
	"time"
)

// checks if the Balances type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Balances{}

// Balances struct for Balances
type Balances struct {
	Id string `json:"id"`
	AccountID string `json:"accountID"`
	At time.Time `json:"at"`
	Balances []Balance `json:"balances"`
}

// NewBalances instantiates a new Balances object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBalances(id string, accountID string, at time.Time, balances []Balance) *Balances {
	this := Balances{}
	this.Id = id
	this.AccountID = accountID
	this.At = at
	this.Balances = balances
	return &this
}

// NewBalancesWithDefaults instantiates a new Balances object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBalancesWithDefaults() *Balances {
	this := Balances{}
	return &this
}

// GetId returns the Id field value
func (o *Balances) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Balances) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Balances) SetId(v string) {
	o.Id = v
}

// GetAccountID returns the AccountID field value
func (o *Balances) GetAccountID() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccountID
}

// GetAccountIDOk returns a tuple with the AccountID field value
// and a boolean to check if the value has been set.
func (o *Balances) GetAccountIDOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccountID, true
}

// SetAccountID sets field value
func (o *Balances) SetAccountID(v string) {
	o.AccountID = v
}

// GetAt returns the At field value
func (o *Balances) GetAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.At
}

// GetAtOk returns a tuple with the At field value
// and a boolean to check if the value has been set.
func (o *Balances) GetAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.At, true
}

// SetAt sets field value
func (o *Balances) SetAt(v time.Time) {
	o.At = v
}

// GetBalances returns the Balances field value
func (o *Balances) GetBalances() []Balance {
	if o == nil {
		var ret []Balance
		return ret
	}

	return o.Balances
}

// GetBalancesOk returns a tuple with the Balances field value
// and a boolean to check if the value has been set.
func (o *Balances) GetBalancesOk() ([]Balance, bool) {
	if o == nil {
		return nil, false
	}
	return o.Balances, true
}

// SetBalances sets field value
func (o *Balances) SetBalances(v []Balance) {
	o.Balances = v
}

func (o Balances) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Balances) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["accountID"] = o.AccountID
	toSerialize["at"] = o.At
	toSerialize["balances"] = o.Balances
	return toSerialize, nil
}

type NullableBalances struct {
	value *Balances
	isSet bool
}

func (v NullableBalances) Get() *Balances {
	return v.value
}

func (v *NullableBalances) Set(val *Balances) {
	v.value = val
	v.isSet = true
}

func (v NullableBalances) IsSet() bool {
	return v.isSet
}

func (v *NullableBalances) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBalances(val *Balances) *NullableBalances {
	return &NullableBalances{value: val, isSet: true}
}

func (v NullableBalances) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBalances) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


