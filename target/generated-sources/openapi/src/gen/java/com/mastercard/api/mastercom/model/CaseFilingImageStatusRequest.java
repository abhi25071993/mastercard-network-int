/*
 * MasterCom
 * MasterCom
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.mastercom.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CaseFilingImageStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CaseFilingImageStatusRequest {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;


  public CaseFilingImageStatusRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Case filing image status.   Length: 6-11   Valid Values/Format: COMPLETED, FAILED, UNPROCESSED
   * @return status
  **/
  @ApiModelProperty(example = "COMPLETED", required = true, value = "Case filing image status.   Length: 6-11   Valid Values/Format: COMPLETED, FAILED, UNPROCESSED")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CaseFilingImageStatusRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Case filing image processing start date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return startDate
  **/
  @ApiModelProperty(example = "2021-02-11", required = true, value = "Case filing image processing start date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public CaseFilingImageStatusRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Case filing image processing end date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return endDate
  **/
  @ApiModelProperty(example = "2021-02-20", required = true, value = "Case filing image processing end date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingImageStatusRequest caseFilingImageStatusRequest = (CaseFilingImageStatusRequest) o;
    return Objects.equals(this.status, caseFilingImageStatusRequest.status) &&
        Objects.equals(this.startDate, caseFilingImageStatusRequest.startDate) &&
        Objects.equals(this.endDate, caseFilingImageStatusRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingImageStatusRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

