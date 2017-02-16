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

import io.swagger.model.AccountCompany;
import io.swagger.model.Body;
import io.swagger.model.InlineResponse201;
import io.swagger.model.Message;
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
 * API tests for AccountApi
 */
public class AccountApiTest {


    private AccountApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://br16-dev-app03.br.avalara.com/v2", AccountApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Retrieve Companies by account
     *
     * Retrieve list companies of one account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountsAccountIdCompaniesGetTest() {
        String accountId = null;
	//List<List<AccountCompany>> response = api.accountsAccountIdCompaniesGet(accountId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create company and your data configuration
     *
     * This method operation create a company for a account 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountCompanyTest() {
        String accountId = null;
        Body body = null;
	//InlineResponse201 response = api.createAccountCompany(accountId, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}