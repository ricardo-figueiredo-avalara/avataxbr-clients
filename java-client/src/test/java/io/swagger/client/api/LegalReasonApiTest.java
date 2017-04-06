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
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.LegalReason;
import io.swagger.client.model.ProcessScenario;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LegalReasonApi
 */
@Ignore
public class LegalReasonApiTest {

    private final LegalReasonApi api = new LegalReasonApi();

    
    /**
     * Create Legal Reason.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReason_Test() throws ApiException {
        String authorization = null;
        LegalReason body = null;
        InlineResponse201 response = api.createReason_(authorization, body);

        // TODO: test validations
    }
    
    /**
     * Delete a Legal Reason entry.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReason_Test() throws ApiException {
        String authorization = null;
        String uuid = null;
        api.deleteReason_(authorization, uuid);

        // TODO: test validations
    }
    
    /**
     * Get single Legal Reason.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReason_Test() throws ApiException {
        String authorization = null;
        String uuid = null;
        ProcessScenario response = api.getReason_(authorization, uuid);

        // TODO: test validations
    }
    
    /**
     * List Legal Reasons.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReasonTest() throws ApiException {
        String authorization = null;
        String companyId = null;
        List<LegalReason> response = api.listReason(authorization, companyId);

        // TODO: test validations
    }
    
    /**
     * Update Legal Reason.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReason_Test() throws ApiException {
        String authorization = null;
        LegalReason body = null;
        api.updateReason_(authorization, body);

        // TODO: test validations
    }
    
}