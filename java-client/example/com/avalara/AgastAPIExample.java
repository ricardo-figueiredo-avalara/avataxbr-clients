/**
 * 
 */
package com.avalara;

import java.util.Base64;
import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.AGASTApi;
import io.swagger.client.api.AuthApi;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;

/**
 * @author everton.amorim
 *
 */
public class AgastAPIExample {

	/**
	 * @throws ApiException 
	 * 
	 */
	public static String auth (String user, String pass) throws ApiException {
		
		AuthApi authAPI = new AuthApi();
		String authorization = "Basic " + Base64.getEncoder().encodeToString((user+":"+pass).getBytes());;
        InlineResponse200 response = authAPI.getAuthorization(authorization);
		return response.getToken();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AGASTApi apiInstance = new AGASTApi();
        try {
        	String authorization = "Bearer " + auth("yourUserName","yourPassword"); // String | Bearer {auth}
            List<InlineResponse2001> result = apiInstance.getAgastList(authorization, "" );
            System.out.println(result.size());
        } catch (ApiException e) {
            System.err.println("Exception when calling AGASTApi#createAgast");
            e.printStackTrace();
        }

	}

}
