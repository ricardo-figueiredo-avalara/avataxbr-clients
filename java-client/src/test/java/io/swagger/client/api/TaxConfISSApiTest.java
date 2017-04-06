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
        String authorization = null;
        IssConfByCity issConfByCity = null;
        InlineResponse201 response = api.createIssConfByCity(authorization, issConfByCity);

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
        String authorization = null;
        BigDecimal cityCode = null;
        api.deleteIssConf(authorization, cityCode);

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
        String authorization = null;
        BigDecimal cityCode = null;
        String code = null;
        LocalDate date = null;
        Boolean inactive = null;
        List<IssConfByCity> response = api.getIssConfByCity(authorization, cityCode, code, date, inactive);

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
        String authorization = null;
        String suffixcode = null;
        LocalDate date = null;
        Boolean inactive = null;
        List<IssConfByCity> response = api.getIssList(authorization, suffixcode, date, inactive);

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
        String authorization = null;
        BigDecimal cityCode = null;
        IssConfByCity issConfByCity = null;
        api.updateIssConfByCity(authorization, cityCode, issConfByCity);

        // TODO: test validations
    }
    
}
