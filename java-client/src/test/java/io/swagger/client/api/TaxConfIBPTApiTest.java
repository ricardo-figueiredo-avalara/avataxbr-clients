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
import io.swagger.client.model.IbptConf;
import io.swagger.client.model.InlineResponse201;
import org.joda.time.LocalDate;
import io.swagger.client.model.Message;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxConfIBPTApi
 */
@Ignore
public class TaxConfIBPTApiTest {

    private final TaxConfIBPTApi api = new TaxConfIBPTApi();

    
    /**
     * create a new Process Type configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIbptConfTest() throws ApiException {
        IbptConf taxconfprocess = null;
        InlineResponse201 response = api.createIbptConf(taxconfprocess);

        // TODO: test validations
    }
    
    /**
     * disable a IBPT.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIbptConfTest() throws ApiException {
        String code = null;
        api.deleteIbptConf(code);

        // TODO: test validations
    }
    
    /**
     * get IBPT information.
     *
     * This operation return Process Type configuration 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIbptConfTest() throws ApiException {
        String code = null;
        IbptConf response = api.getIbptConf(code);

        // TODO: test validations
    }
    
    /**
     * retrive list of IBPT.
     *
     * This operation return Process Type configurations that match with parameters queries 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIbptConfListTest() throws ApiException {
        String accountId = null;
        LocalDate date = null;
        Boolean inactive = null;
        List<IbptConf> response = api.getIbptConfList(accountId, date, inactive);

        // TODO: test validations
    }
    
    /**
     * update a Process Type configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIbptConfTest() throws ApiException {
        String code = null;
        IbptConf taxconfprocess = null;
        api.updateIbptConf(code, taxconfprocess);

        // TODO: test validations
    }
    
}
