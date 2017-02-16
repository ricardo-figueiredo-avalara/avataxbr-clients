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

import java.math.BigDecimal;
import io.swagger.model.InlineResponse201;
import io.swagger.model.ItemCpom;
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
 * API tests for CompanyItemCPOMServiceApi
 */
public class CompanyItemCPOMServiceApiTest {


    private CompanyItemCPOMServiceApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://br16-dev-app03.br.avalara.com/v2", CompanyItemCPOMServiceApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * 
     *
     * This operation return custom agast configurations that match with parameters queries 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesCompanyIdItemsCodeCpomCityCodeGetTest() {
        String companyId = null;
        String code = null;
        BigDecimal cityCode = null;
	//ItemCpom response = api.companiesCompanyIdItemsCodeCpomCityCodeGet(companyId, code, cityCode);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * 
     *
     * This operation return custom agast configurations that match with parameters queries 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesCompanyIdItemsCodeCpomGetTest() {
        String companyId = null;
        String code = null;
        Integer xPaginationLimit = null;
        Integer xPaginationCurrentPage = null;
        String xPaginationSort = null;
	//List<List<ItemCpom>> response = api.companiesCompanyIdItemsCodeCpomGet(companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create custom agast for one company
     *
     * This method operation create a custom agast for one company 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createItemCPOMTest() {
        String companyId = null;
        String code = null;
        ItemCpom body = null;
	//InlineResponse201 response = api.createItemCPOM(companyId, code, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemCPOMTest() {
        String companyId = null;
        String code = null;
        BigDecimal cityCode = null;
	// response = api.deleteItemCPOM(companyId, code, cityCode);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update custom agast for one company
     *
     * This method operation create a custom agast for one company 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemCPOMTest() {
        String companyId = null;
        String code = null;
        BigDecimal cityCode = null;
        ItemCpom body = null;
	// response = api.updateItemCPOM(companyId, code, cityCode, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
