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
 * TransactionSingleSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class TransactionSingleSearchRequest {
  public static final String SERIALIZED_NAME_PRIMARY_ACCOUNT_NUMBER = "primaryAccountNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ACCOUNT_NUMBER)
  private String primaryAccountNumber;

  public static final String SERIALIZED_NAME_SETTLEMENT_FROM_DATE = "settlementFromDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_FROM_DATE)
  private String settlementFromDate;

  public static final String SERIALIZED_NAME_SETTLEMENT_TO_DATE = "settlementToDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TO_DATE)
  private String settlementToDate;

  public static final String SERIALIZED_NAME_ACQUIRER_REF_NUMBER = "acquirerRefNumber";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_REF_NUMBER)
  private String acquirerRefNumber;

  public static final String SERIALIZED_NAME_SWITCH_SERIAL_NUMBER = "switchSerialNumber";
  @SerializedName(SERIALIZED_NAME_SWITCH_SERIAL_NUMBER)
  private String switchSerialNumber;


  public TransactionSingleSearchRequest primaryAccountNumber(String primaryAccountNumber) {
    
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * Primary Account Number [PAN] is a series of digits used to identify a customer account or relationship.   Length: 12-19   Valid Values/Format: Numeric
   * @return primaryAccountNumber
  **/
  @ApiModelProperty(example = "5488888888887192", required = true, value = "Primary Account Number [PAN] is a series of digits used to identify a customer account or relationship.   Length: 12-19   Valid Values/Format: Numeric")

  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }


  public void setPrimaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
  }


  public TransactionSingleSearchRequest settlementFromDate(String settlementFromDate) {
    
    this.settlementFromDate = settlementFromDate;
    return this;
  }

   /**
   * From date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return settlementFromDate
  **/
  @ApiModelProperty(example = "2021-01-01", required = true, value = "From date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getSettlementFromDate() {
    return settlementFromDate;
  }


  public void setSettlementFromDate(String settlementFromDate) {
    this.settlementFromDate = settlementFromDate;
  }


  public TransactionSingleSearchRequest settlementToDate(String settlementToDate) {
    
    this.settlementToDate = settlementToDate;
    return this;
  }

   /**
   * To date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return settlementToDate
  **/
  @ApiModelProperty(example = "2021-01-31", required = true, value = "To date of Settlement date range to search for a transaction. Mastercard uses Settlement Date to group the transactions for reporting and for subsequent settlement. The search range is a maximum of 30 days, and searches can be completed for up to 180 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getSettlementToDate() {
    return settlementToDate;
  }


  public void setSettlementToDate(String settlementToDate) {
    this.settlementToDate = settlementToDate;
  }


  public TransactionSingleSearchRequest acquirerRefNumber(String acquirerRefNumber) {
    
    this.acquirerRefNumber = acquirerRefNumber;
    return this;
  }

   /**
   * Acquirer Reference Data is data an acquirer supplies in an acquirer-originated message that may be required for an issuer to return to the acquirer in a subsequent message
   * @return acquirerRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05436847276000293995738", value = "Acquirer Reference Data is data an acquirer supplies in an acquirer-originated message that may be required for an issuer to return to the acquirer in a subsequent message")

  public String getAcquirerRefNumber() {
    return acquirerRefNumber;
  }


  public void setAcquirerRefNumber(String acquirerRefNumber) {
    this.acquirerRefNumber = acquirerRefNumber;
  }


  public TransactionSingleSearchRequest switchSerialNumber(String switchSerialNumber) {
    
    this.switchSerialNumber = switchSerialNumber;
    return this;
  }

   /**
   * The Switch Serial Number is a unique transaction identification number generated (or assigned) by the Single Message.   Length: 9   Valid Values/Format: Numeric
   * @return switchSerialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "142389095", value = "The Switch Serial Number is a unique transaction identification number generated (or assigned) by the Single Message.   Length: 9   Valid Values/Format: Numeric")

  public String getSwitchSerialNumber() {
    return switchSerialNumber;
  }


  public void setSwitchSerialNumber(String switchSerialNumber) {
    this.switchSerialNumber = switchSerialNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSingleSearchRequest transactionSingleSearchRequest = (TransactionSingleSearchRequest) o;
    return Objects.equals(this.primaryAccountNumber, transactionSingleSearchRequest.primaryAccountNumber) &&
        Objects.equals(this.settlementFromDate, transactionSingleSearchRequest.settlementFromDate) &&
        Objects.equals(this.settlementToDate, transactionSingleSearchRequest.settlementToDate) &&
        Objects.equals(this.acquirerRefNumber, transactionSingleSearchRequest.acquirerRefNumber) &&
        Objects.equals(this.switchSerialNumber, transactionSingleSearchRequest.switchSerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAccountNumber, settlementFromDate, settlementToDate, acquirerRefNumber, switchSerialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSingleSearchRequest {\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    settlementFromDate: ").append(toIndentedString(settlementFromDate)).append("\n");
    sb.append("    settlementToDate: ").append(toIndentedString(settlementToDate)).append("\n");
    sb.append("    acquirerRefNumber: ").append(toIndentedString(acquirerRefNumber)).append("\n");
    sb.append("    switchSerialNumber: ").append(toIndentedString(switchSerialNumber)).append("\n");
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

