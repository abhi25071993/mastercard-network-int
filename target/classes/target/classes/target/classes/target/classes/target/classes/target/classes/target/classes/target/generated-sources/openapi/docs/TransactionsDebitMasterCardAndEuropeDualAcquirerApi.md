# TransactionsDebitMasterCardAndEuropeDualAcquirerApi

All URIs are relative to *https://api.mastercard.com/mastercom*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionDebitMCMessageDetail**](TransactionsDebitMasterCardAndEuropeDualAcquirerApi.md#transactionDebitMCMessageDetail) | **GET** /v6/{claim-id}/transactions/debitmc/detail | 
[**transactionMessageSearchDebitMC**](TransactionsDebitMasterCardAndEuropeDualAcquirerApi.md#transactionMessageSearchDebitMC) | **POST** /v6/transactions/debitmc/search | 


<a name="transactionDebitMCMessageDetail"></a>
# **transactionDebitMCMessageDetail**
> TransactionSingleMessageDetail transactionDebitMCMessageDetail(claimId)



After an issuer creates a claim, the issuer uses this endpoint to retrieve details for the Mastercard Debit or Europe Dual Acquirer original transaction involved in the claim.

### Example
```java
// Import classes:
import com.mastercard.api.mastercom.ApiClient;
import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.Configuration;
import com.mastercard.api.mastercom.models.*;
import com.mastercard.api.mastercom.api.TransactionsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    TransactionsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new TransactionsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    String claimId = "200002020654"; // String | Claim Id.   Length: 1-19   Valid Values/Format: Numeric
    try {
      TransactionSingleMessageDetail result = apiInstance.transactionDebitMCMessageDetail(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsDebitMasterCardAndEuropeDualAcquirerApi#transactionDebitMCMessageDetail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **claimId** | **String**| Claim Id.   Length: 1-19   Valid Values/Format: Numeric |

### Return type

[**TransactionSingleMessageDetail**](TransactionSingleMessageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**500** | Internal Server Error |  -  |

<a name="transactionMessageSearchDebitMC"></a>
# **transactionMessageSearchDebitMC**
> TransactionSingleMessageSummaryList transactionMessageSearchDebitMC(body)



An issuer uses this endpoint to search for information about an Mastercard Debit or Europe Dual Acquirer original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.

### Example
```java
// Import classes:
import com.mastercard.api.mastercom.ApiClient;
import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.Configuration;
import com.mastercard.api.mastercom.models.*;
import com.mastercard.api.mastercom.api.TransactionsDebitMasterCardAndEuropeDualAcquirerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/mastercom");

    TransactionsDebitMasterCardAndEuropeDualAcquirerApi apiInstance = new TransactionsDebitMasterCardAndEuropeDualAcquirerApi(defaultClient);
    TransactionSingleSearchRequest body = new TransactionSingleSearchRequest(); // TransactionSingleSearchRequest | Transaction DebitMC Message Search Request
    try {
      TransactionSingleMessageSummaryList result = apiInstance.transactionMessageSearchDebitMC(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsDebitMasterCardAndEuropeDualAcquirerApi#transactionMessageSearchDebitMC");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionSingleSearchRequest**](TransactionSingleSearchRequest.md)| Transaction DebitMC Message Search Request |

### Return type

[**TransactionSingleMessageSummaryList**](TransactionSingleMessageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**500** | Internal Server Error |  -  |

