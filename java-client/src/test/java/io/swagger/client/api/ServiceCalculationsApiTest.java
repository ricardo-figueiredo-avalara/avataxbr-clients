/*
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Message;
import io.swagger.client.model.PaymentTransactionIn;
import io.swagger.client.model.PaymentTransactionOut;
import io.swagger.client.model.PurchaseTransactionIn;
import io.swagger.client.model.PurchaseTransactionOut;
import io.swagger.client.model.ReceiptTransactionIn;
import io.swagger.client.model.ReceiptTransactionOut;
import io.swagger.client.model.SalesTransactionIn;
import io.swagger.client.model.SalesTransactionOut;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceCalculationsApi
 */
@Ignore
public class ServiceCalculationsApiTest {

    private final ServiceCalculationsApi api = new ServiceCalculationsApi();

    
    /**
     * Retrieve transactions
     *
     * Retrieve a single transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetTest() throws ApiException {
        String authorization = null;
        String accountId = null;
        String companyCode = null;
        String transactionType = null;
        String documentCode = null;
        api.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode);

        // TODO: test validations
    }
    
    /**
     * Promote a calculation to transaction
     *
     * Promote a calculation to transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPostTest() throws ApiException {
        String authorization = null;
        String accountId = null;
        String companyCode = null;
        String transactionType = null;
        String documentCode = null;
        api.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode);

        // TODO: test validations
    }
    
    /**
     * Retrieve transactions
     *
     * Retrieve a list of transactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGetTest() throws ApiException {
        String authorization = null;
        String accountId = null;
        String companyCode = null;
        String transactionType = null;
        api.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType);

        // TODO: test validations
    }
    
    /**
     * Calculation Method
     *
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsservicePaymentPostTest() throws ApiException {
        String authorization = null;
        PaymentTransactionIn body = null;
        PaymentTransactionOut response = api.calculationsservicePaymentPost(authorization, body);

        // TODO: test validations
    }
    
    /**
     * Calculation Method
     *
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsservicePurchasePostTest() throws ApiException {
        String authorization = null;
        PurchaseTransactionIn body = null;
        PurchaseTransactionOut response = api.calculationsservicePurchasePost(authorization, body);

        // TODO: test validations
    }
    
    /**
     * Calculation Method
     *
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsserviceReceiptPostTest() throws ApiException {
        String authorization = null;
        ReceiptTransactionIn body = null;
        ReceiptTransactionOut response = api.calculationsserviceReceiptPost(authorization, body);

        // TODO: test validations
    }
    
    /**
     * Calculation Method
     *
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculationsserviceSalesPostTest() throws ApiException {
        String authorization = null;
        SalesTransactionIn body = null;
        SalesTransactionOut response = api.calculationsserviceSalesPost(authorization, body);

        // TODO: test validations
    }
    
}
