/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StageSendSourcePayment {
    @JsonProperty("id")
    public String id;

    public StageSendSourcePayment withId(String id) {
        this.id = id;
        return this;
    }
    
    public StageSendSourcePayment(@JsonProperty("id") String id) {
        this.id = id;
  }
}