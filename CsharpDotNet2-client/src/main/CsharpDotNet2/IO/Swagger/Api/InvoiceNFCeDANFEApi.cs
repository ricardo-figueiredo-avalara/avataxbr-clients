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
    public interface IInvoiceNFCeDANFEApi
    {
        /// <summary>
        /// NFCe Danfe Print Retrieve the Danfe in NFCe format. 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="key">Invoice Key</param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream InvoicesNfceKeyGet (string authorization, string key);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class InvoiceNFCeDANFEApi : IInvoiceNFCeDANFEApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceNFCeDANFEApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public InvoiceNFCeDANFEApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceNFCeDANFEApi"/> class.
        /// </summary>
        /// <returns></returns>
        public InvoiceNFCeDANFEApi(String basePath)
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
        /// NFCe Danfe Print Retrieve the Danfe in NFCe format. 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="key">Invoice Key</param> 
        /// <returns>System.IO.Stream</returns>            
        public System.IO.Stream InvoicesNfceKeyGet (string authorization, string key)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesNfceKeyGet");
            
            // verify the required parameter 'key' is set
            if (key == null) throw new ApiException(400, "Missing required parameter 'key' when calling InvoicesNfceKeyGet");
            
    
            var path = "/invoices/nfce/{key}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "key" + "}", ApiClient.ParameterToString(key));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesNfceKeyGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesNfceKeyGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (System.IO.Stream) ApiClient.Deserialize(response.Content, typeof(System.IO.Stream), response.Headers);
        }
    
    }
}
