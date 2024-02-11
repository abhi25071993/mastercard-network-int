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
import com.mastercard.api.mastercom.model.DocumentStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateChargebackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class UpdateChargebackRequest {
  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_CREDIT_VOUCHER_ACTION = "creditVoucherAction";
  @SerializedName(SERIALIZED_NAME_CREDIT_VOUCHER_ACTION)
  private String creditVoucherAction;

  public static final String SERIALIZED_NAME_FILE_ATTACHMENT = "fileAttachment";
  @SerializedName(SERIALIZED_NAME_FILE_ATTACHMENT)
  private DocumentStructure fileAttachment;


  public UpdateChargebackRequest memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Memo.   Length: 1-100   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a test memo", value = "Memo.   Length: 1-100   Valid Values/Format: Alphanumeric / Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public UpdateChargebackRequest creditVoucherAction(String creditVoucherAction) {
    
    this.creditVoucherAction = creditVoucherAction;
    return this;
  }

   /**
   * Action to be performed on 1st chargeback.   CONDITIONAL: This field is required and only applicable if fileAttachment is not provided. Length: 6-7   Valid Values/Format: ACCEPT, DECLINE
   * @return creditVoucherAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCEPT", value = "Action to be performed on 1st chargeback.   CONDITIONAL: This field is required and only applicable if fileAttachment is not provided. Length: 6-7   Valid Values/Format: ACCEPT, DECLINE")

  public String getCreditVoucherAction() {
    return creditVoucherAction;
  }


  public void setCreditVoucherAction(String creditVoucherAction) {
    this.creditVoucherAction = creditVoucherAction;
  }


  public UpdateChargebackRequest fileAttachment(DocumentStructure fileAttachment) {
    
    this.fileAttachment = fileAttachment;
    return this;
  }

   /**
   * Get fileAttachment
   * @return fileAttachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentStructure getFileAttachment() {
    return fileAttachment;
  }


  public void setFileAttachment(DocumentStructure fileAttachment) {
    this.fileAttachment = fileAttachment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChargebackRequest updateChargebackRequest = (UpdateChargebackRequest) o;
    return Objects.equals(this.memo, updateChargebackRequest.memo) &&
        Objects.equals(this.creditVoucherAction, updateChargebackRequest.creditVoucherAction) &&
        Objects.equals(this.fileAttachment, updateChargebackRequest.fileAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memo, creditVoucherAction, fileAttachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChargebackRequest {\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    creditVoucherAction: ").append(toIndentedString(creditVoucherAction)).append("\n");
    sb.append("    fileAttachment: ").append(toIndentedString(fileAttachment)).append("\n");
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
