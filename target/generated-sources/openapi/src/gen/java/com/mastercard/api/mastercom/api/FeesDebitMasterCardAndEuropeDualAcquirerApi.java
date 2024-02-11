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


package com.mastercard.api.mastercom.api;

import com.mastercard.api.mastercom.ApiCallback;
import com.mastercard.api.mastercom.ApiClient;
import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.ApiResponse;
import com.mastercard.api.mastercom.Configuration;
import com.mastercard.api.mastercom.Pair;
import com.mastercard.api.mastercom.ProgressRequestBody;
import com.mastercard.api.mastercom.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mastercard.api.mastercom.model.CreateFeeRequestSingle;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.FeeSingleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeesDebitMasterCardAndEuropeDualAcquirerApi {
    private ApiClient localVarApiClient;

    public FeesDebitMasterCardAndEuropeDualAcquirerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FeesDebitMasterCardAndEuropeDualAcquirerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createFeeDebitMC
     * @param claimId Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fee Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFeeDebitMCCall(String claimId, CreateFeeRequestSingle body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v6/claims/{claim-id}/fee/debitmc"
            .replaceAll("\\{" + "claim-id" + "\\}", localVarApiClient.escapeString(claimId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createFeeDebitMCValidateBeforeCall(String claimId, CreateFeeRequestSingle body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling createFeeDebitMC(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFeeDebitMC(Async)");
        }
        

        okhttp3.Call localVarCall = createFeeDebitMCCall(claimId, body, _callback);
        return localVarCall;

    }

    /**
     * 
     * Senders (issuers) use this endpoint to create a fee collection for receivers (acquirers) for Mastercard Debit or Europe Dual Acquirer. Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.
     * @param claimId Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fee Request (required)
     * @return FeeSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public FeeSingleResponse createFeeDebitMC(String claimId, CreateFeeRequestSingle body) throws ApiException {
        ApiResponse<FeeSingleResponse> localVarResp = createFeeDebitMCWithHttpInfo(claimId, body);
        return localVarResp.getData();
    }

    /**
     * 
     * Senders (issuers) use this endpoint to create a fee collection for receivers (acquirers) for Mastercard Debit or Europe Dual Acquirer. Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.
     * @param claimId Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fee Request (required)
     * @return ApiResponse&lt;FeeSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeeSingleResponse> createFeeDebitMCWithHttpInfo(String claimId, CreateFeeRequestSingle body) throws ApiException {
        okhttp3.Call localVarCall = createFeeDebitMCValidateBeforeCall(claimId, body, null);
        Type localVarReturnType = new TypeToken<FeeSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Senders (issuers) use this endpoint to create a fee collection for receivers (acquirers) for Mastercard Debit or Europe Dual Acquirer. Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.
     * @param claimId Claim Id for the fee item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fee Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFeeDebitMCAsync(String claimId, CreateFeeRequestSingle body, final ApiCallback<FeeSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFeeDebitMCValidateBeforeCall(claimId, body, _callback);
        Type localVarReturnType = new TypeToken<FeeSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}