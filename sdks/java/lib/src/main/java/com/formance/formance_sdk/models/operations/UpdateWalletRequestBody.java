/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateWalletRequestBody {
    /**
     * Custom metadata to attach to this wallet.
     */
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public UpdateWalletRequestBody withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public UpdateWalletRequestBody(@JsonProperty("metadata") java.util.Map<String, String> metadata) {
        this.metadata = metadata;
  }
}