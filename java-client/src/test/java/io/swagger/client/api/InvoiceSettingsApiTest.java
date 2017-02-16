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
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.Message;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceSettingsApi
 */
@Ignore
public class InvoiceSettingsApiTest {

    private final InvoiceSettingsApi api = new InvoiceSettingsApi();

    
    /**
     * Invoice Settigns
     *
     * Get Enviroment Settigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceSettingsTest() throws ApiException {
        InlineResponse2004 response = api.invoiceSettings();

        // TODO: test validations
    }
    
}