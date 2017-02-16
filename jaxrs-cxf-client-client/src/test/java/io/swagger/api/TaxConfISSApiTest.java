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
import io.swagger.model.IssConfByCity;
import org.joda.time.LocalDate;
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
 * API tests for TaxConfISSApi
 */
public class TaxConfISSApiTest {


    private TaxConfISSApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://br16-dev-app03.br.avalara.com/v2", TaxConfISSApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * create a new ISS Configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIssConfByCityTest() {
        IssConfByCity issConfByCity = null;
	//InlineResponse201 response = api.createIssConfByCity(issConfByCity);
        //assertNotNull(response);
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
    public void deleteIssConfTest() {
        BigDecimal cityCode = null;
	// response = api.deleteIssConf(cityCode);
        //assertNotNull(response);
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
    public void getIssConfByCityTest() {
        BigDecimal cityCode = null;
        String code = null;
        LocalDate date = null;
        Boolean inactive = null;
	//List<List<IssConfByCity>> response = api.getIssConfByCity(cityCode, code, date, inactive);
        //assertNotNull(response);
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
    public void getIssListTest() {
        String suffixcode = null;
        LocalDate date = null;
        Boolean inactive = null;
	//List<List<IssConfByCity>> response = api.getIssList(suffixcode, date, inactive);
        //assertNotNull(response);
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
    public void updateIssConfByCityTest() {
        BigDecimal cityCode = null;
        IssConfByCity issConfByCity = null;
	// response = api.updateIssConfByCity(cityCode, issConfByCity);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
