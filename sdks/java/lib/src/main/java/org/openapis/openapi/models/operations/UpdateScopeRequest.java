/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;

public class UpdateScopeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.UpdateScopeRequest updateScopeRequest;

    public UpdateScopeRequest withUpdateScopeRequest(org.openapis.openapi.models.shared.UpdateScopeRequest updateScopeRequest) {
        this.updateScopeRequest = updateScopeRequest;
        return this;
    }
    
    /**
     * Scope ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;

    public UpdateScopeRequest withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
    public UpdateScopeRequest(@JsonProperty("scopeId") String scopeId) {
        this.scopeId = scopeId;
  }
}