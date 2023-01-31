/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: develop
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * StripeTransferRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StripeTransferRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public StripeTransferRequest() {
  }

  public StripeTransferRequest amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nullable

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public StripeTransferRequest asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable

  public String getAsset() {
    return asset;
  }


  public void setAsset(String asset) {
    this.asset = asset;
  }


  public StripeTransferRequest destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public StripeTransferRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can attach to a transfer object. It can be useful for storing additional information about the transfer in a structured format. 
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeTransferRequest stripeTransferRequest = (StripeTransferRequest) o;
    return Objects.equals(this.amount, stripeTransferRequest.amount) &&
        Objects.equals(this.asset, stripeTransferRequest.asset) &&
        Objects.equals(this.destination, stripeTransferRequest.destination) &&
        Objects.equals(this.metadata, stripeTransferRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, asset, destination, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeTransferRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

