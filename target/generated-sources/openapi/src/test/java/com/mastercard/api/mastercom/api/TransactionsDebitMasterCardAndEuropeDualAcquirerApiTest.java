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

import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.TransactionSingleMessageDetail;
import com.mastercard.api.mastercom.model.TransactionSingleMessageSummaryList;
import com.mastercard.api.mastercom.model.TransactionSingleSearchRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsDebitMasterCardAndEuropeDualAcquirerApi
 */
@Ignore
public class TransactionsDebitMasterCardAndEuropeDualAcquirerApiTest {

    private final TransactionsDebitMasterCardAndEuropeDualAcquirerApi api = new TransactionsDebitMasterCardAndEuropeDualAcquirerApi();

    
    /**
     * 
     *
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve details for the Mastercard Debit or Europe Dual Acquirer original transaction involved in the claim.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionDebitMCMessageDetailTest() throws ApiException {
        String claimId = null;
        TransactionSingleMessageDetail response = api.transactionDebitMCMessageDetail(claimId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * An issuer uses this endpoint to search for information about an Mastercard Debit or Europe Dual Acquirer original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionMessageSearchDebitMCTest() throws ApiException {
        TransactionSingleSearchRequest body = null;
        TransactionSingleMessageSummaryList response = api.transactionMessageSearchDebitMC(body);

        // TODO: test validations
    }
    
}
