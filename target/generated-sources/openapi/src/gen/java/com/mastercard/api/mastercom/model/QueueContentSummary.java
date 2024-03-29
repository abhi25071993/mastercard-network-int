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
import com.mastercard.api.mastercom.model.ClaimSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueueContentSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class QueueContentSummary {
  public static final String SERIALIZED_NAME_PAGE_COUNT = "pageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private String pageCount;

  public static final String SERIALIZED_NAME_CLAIM_LIST = "claimList";
  @SerializedName(SERIALIZED_NAME_CLAIM_LIST)
  private List<ClaimSummary> claimList = null;


  public QueueContentSummary pageCount(String pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages queue results can be returned
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of pages queue results can be returned")

  public String getPageCount() {
    return pageCount;
  }


  public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
  }


  public QueueContentSummary claimList(List<ClaimSummary> claimList) {
    
    this.claimList = claimList;
    return this;
  }

  public QueueContentSummary addClaimListItem(ClaimSummary claimListItem) {
    if (this.claimList == null) {
      this.claimList = new ArrayList<ClaimSummary>();
    }
    this.claimList.add(claimListItem);
    return this;
  }

   /**
   * Get claimList
   * @return claimList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClaimSummary> getClaimList() {
    return claimList;
  }


  public void setClaimList(List<ClaimSummary> claimList) {
    this.claimList = claimList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueContentSummary queueContentSummary = (QueueContentSummary) o;
    return Objects.equals(this.pageCount, queueContentSummary.pageCount) &&
        Objects.equals(this.claimList, queueContentSummary.claimList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageCount, claimList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueContentSummary {\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    claimList: ").append(toIndentedString(claimList)).append("\n");
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

