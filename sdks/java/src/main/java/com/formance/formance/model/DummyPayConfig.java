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
 * DummyPayConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DummyPayConfig {
  public static final String SERIALIZED_NAME_FILE_POLLING_PERIOD = "filePollingPeriod";
  @SerializedName(SERIALIZED_NAME_FILE_POLLING_PERIOD)
  private String filePollingPeriod = "10s";

  public static final String SERIALIZED_NAME_FILE_GENERATION_PERIOD = "fileGenerationPeriod";
  @SerializedName(SERIALIZED_NAME_FILE_GENERATION_PERIOD)
  private String fileGenerationPeriod = "10s";

  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public DummyPayConfig() {
  }

  public DummyPayConfig filePollingPeriod(String filePollingPeriod) {
    
    this.filePollingPeriod = filePollingPeriod;
    return this;
  }

   /**
   * The frequency at which the connector will try to fetch new payment objects from the directory
   * @return filePollingPeriod
  **/
  @javax.annotation.Nullable

  public String getFilePollingPeriod() {
    return filePollingPeriod;
  }


  public void setFilePollingPeriod(String filePollingPeriod) {
    this.filePollingPeriod = filePollingPeriod;
  }


  public DummyPayConfig fileGenerationPeriod(String fileGenerationPeriod) {
    
    this.fileGenerationPeriod = fileGenerationPeriod;
    return this;
  }

   /**
   * The frequency at which the connector will create new payment objects in the directory
   * @return fileGenerationPeriod
  **/
  @javax.annotation.Nullable

  public String getFileGenerationPeriod() {
    return fileGenerationPeriod;
  }


  public void setFileGenerationPeriod(String fileGenerationPeriod) {
    this.fileGenerationPeriod = fileGenerationPeriod;
  }


  public DummyPayConfig directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @javax.annotation.Nonnull

  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DummyPayConfig dummyPayConfig = (DummyPayConfig) o;
    return Objects.equals(this.filePollingPeriod, dummyPayConfig.filePollingPeriod) &&
        Objects.equals(this.fileGenerationPeriod, dummyPayConfig.fileGenerationPeriod) &&
        Objects.equals(this.directory, dummyPayConfig.directory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePollingPeriod, fileGenerationPeriod, directory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DummyPayConfig {\n");
    sb.append("    filePollingPeriod: ").append(toIndentedString(filePollingPeriod)).append("\n");
    sb.append("    fileGenerationPeriod: ").append(toIndentedString(fileGenerationPeriod)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
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

