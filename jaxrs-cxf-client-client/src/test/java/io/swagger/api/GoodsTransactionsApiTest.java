/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.TransactionForGoodsIn;
import io.swagger.model.TransactionForGoodsOut;
import io.swagger.model.ValidationError;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * API tests for GoodsTransactionsApi
 */
public class GoodsTransactionsApiTest {


    private GoodsTransactionsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://br16-dev-app03.br.avalara.com/v2", GoodsTransactionsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Transaction Method
     *
     * This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsgoodsPurchasePostTest() {
        String authorization = null;
        TransactionForGoodsIn body = null;
	//TransactionForGoodsOut response = api.transactionsgoodsPurchasePost(authorization, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Transaction Method
     *
     * This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsgoodsSalesPostTest() {
        String authorization = null;
        TransactionForGoodsIn body = null;
	//TransactionForGoodsOut response = api.transactionsgoodsSalesPost(authorization, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
