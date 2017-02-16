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
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.IssConfByCity;
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
 * API tests for TaxConfISSApi
 */
@Ignore
public class TaxConfISSApiTest {

    private final TaxConfISSApi api = new TaxConfISSApi();

    
    /**
     * create a new ISS Configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIssConfByCityTest() throws ApiException {
        IssConfByCity issConfByCity = null;
        InlineResponse201 response = api.createIssConfByCity(issConfByCity);

        // TODO: test validations
    }
    
    /**
     * disable a ISS by City Code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssConfTest() throws ApiException {
        BigDecimal cityCode = null;
        api.deleteIssConf(cityCode);

        // TODO: test validations
    }
    
    /**
     * get ISS information by City Code.
     *
     * This operation return configurations of ISS that match with parameters queries 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssConfByCityTest() throws ApiException {
        BigDecimal cityCode = null;
        String code = null;
        LocalDate date = null;
        Boolean inactive = null;
        List<IssConfByCity> response = api.getIssConfByCity(cityCode, code, date, inactive);

        // TODO: test validations
    }
    
    /**
     * retrive list of ISS
     *
     * This operation return ISS configurations that match with parameters queries 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssListTest() throws ApiException {
        String suffixcode = null;
        LocalDate date = null;
        Boolean inactive = null;
        List<IssConfByCity> response = api.getIssList(suffixcode, date, inactive);

        // TODO: test validations
    }
    
    /**
     * update a ISS by City Code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIssConfByCityTest() throws ApiException {
        BigDecimal cityCode = null;
        IssConfByCity issConfByCity = null;
        api.updateIssConfByCity(cityCode, issConfByCity);

        // TODO: test validations
    }
    
}