using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IInvoiceContingencyApi
    {
        /// <summary>
        /// Invoice Drop Contingency per State Drop State in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <returns></returns>
        void InvoiceDropContingency (string state);
        /// <summary>
        /// Invoice Set Contingency per State Set State in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="body">Set Contingency</param>
        /// <returns></returns>
        void InvoiceSetContingency (string state, Body4 body);
        /// <summary>
        /// Invoice Verify Contingency per State Check if State was in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <returns>InlineResponse2003</returns>
        InlineResponse2003 InvoiceVerifyContingency (string state);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class InvoiceContingencyApi : IInvoiceContingencyApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceContingencyApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public InvoiceContingencyApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceContingencyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public InvoiceContingencyApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// Invoice Drop Contingency per State Drop State in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <returns></returns>            
        public void InvoiceDropContingency (string state)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling InvoiceDropContingency");
            
    
            var path = "/invoices/contingency/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceDropContingency: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceDropContingency: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Invoice Set Contingency per State Set State in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="body">Set Contingency</param> 
        /// <returns></returns>            
        public void InvoiceSetContingency (string state, Body4 body)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling InvoiceSetContingency");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling InvoiceSetContingency");
            
    
            var path = "/invoices/contingency/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceSetContingency: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceSetContingency: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Invoice Verify Contingency per State Check if State was in Contingency
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <returns>InlineResponse2003</returns>            
        public InlineResponse2003 InvoiceVerifyContingency (string state)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling InvoiceVerifyContingency");
            
    
            var path = "/invoices/contingency/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceVerifyContingency: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoiceVerifyContingency: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2003) ApiClient.Deserialize(response.Content, typeof(InlineResponse2003), response.Headers);
        }
    
    }
}
