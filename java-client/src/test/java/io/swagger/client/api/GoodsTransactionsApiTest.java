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
import io.swagger.client.model.Message;
import io.swagger.client.model.TransactionForGoodsIn;
import io.swagger.client.model.TransactionForGoodsOut;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GoodsTransactionsApi
 */
@Ignore
public class GoodsTransactionsApiTest {

    private final GoodsTransactionsApi api = new GoodsTransactionsApi();

    
    /**
     * Transaction Method
     *
     * This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionGoodsPurchaseTest() throws ApiException {
        String authorization = null;
        TransactionForGoodsIn body = null;
        TransactionForGoodsOut response = api.transactionGoodsPurchase(authorization, body);

        // TODO: test validations
    }
    
}