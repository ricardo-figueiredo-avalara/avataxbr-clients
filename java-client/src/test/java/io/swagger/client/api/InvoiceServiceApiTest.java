/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.model.AbrasfItDeleteIn;
import io.swagger.client.model.AbrasfItGetOut;
import io.swagger.client.model.AbrasfPostOut;
import io.swagger.client.model.TransactionForAbrasfList;

/**
 * API tests for InvoiceServiceApi
 */
@Ignore
public class InvoiceServiceApiTest {

    private final InvoiceServiceApi api = new InvoiceServiceApi();

    
    /**
     * Cancel e-Invoice Service
     *
     * Cancel the invoice
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelInvoiceServiceTest() throws ApiException {
        String authorization = null;
        String key = null;
        AbrasfItDeleteIn body = null;
        api.cancelInvoiceService(authorization, key, body);

        // TODO: test validations
    }
    
    /**
     * Retrieve e-Invoice Service
     *
     * Retrieve the invoice
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInvoiceServiceTest() throws ApiException {
        String authorization = null;
        String key = null;
        AbrasfItGetOut response = api.retrieveInvoiceService(authorization, key);

        // TODO: test validations
    }
    
    /**
     * Send an e-Invoice Service
     *
     * Send a invoice
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendInvoiceServiceTest() throws ApiException {
        String authorization = null;
        TransactionForAbrasfList body = null;
        AbrasfPostOut response = api.sendInvoiceService(authorization, body);

        // TODO: test validations
    }
    
}
