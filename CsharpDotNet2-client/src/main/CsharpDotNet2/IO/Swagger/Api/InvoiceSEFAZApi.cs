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
    public interface IInvoiceSEFAZApi
    {
        /// <summary>
        /// Disable Range e-Invoice Send disable range of NFes to SEFAZ 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Disable Range e-Invoice</param>
        /// <returns>SefazInvoiceBasicStatus</returns>
        SefazInvoiceBasicStatus InvoicesSefazDelete (string authorization, SefazDisableRangeIn body);
        /// <summary>
        /// Cancel invoice Cancel the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="key">Invoice Key</param>
        /// <param name="body">Cancel Message</param>
        /// <returns>SefazInvoiceBasicStatus</returns>
        SefazInvoiceBasicStatus InvoicesSefazKeyDelete (string authorization, string key, SefazItDeleteIn body);
        /// <summary>
        /// Retrieve invoice Retrieve the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="key">Invoice Key</param>
        /// <returns>SefazItGetOut</returns>
        SefazItGetOut InvoicesSefazKeyGet (string authorization, string key);
        /// <summary>
        /// Retrieve invoice Retrieve the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="key">Invoice Key</param>
        /// <returns>TransactionForSefazGoodsList</returns>
        TransactionForSefazGoodsList InvoicesSefazKeyLookupGet (string authorization, string key);
        /// <summary>
        /// Fix Letter Fix Letter
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="key">Invoice Key</param>
        /// <param name="body">Fix Message</param>
        /// <returns>SefazInvoiceBasicStatus</returns>
        SefazInvoiceBasicStatus InvoicesSefazKeyPut (string authorization, string key, SefazItPutIn body);
        /// <summary>
        /// Send an e-Invoice Send a invoice to SEFAZ 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Invoices</param>
        /// <returns>SefazPostOut</returns>
        SefazPostOut InvoicesSefazPost (string authorization, List<TransactionForSefazGoods> body);
        /// <summary>
        /// Retrieve Status of SEFAZ Server Retrieve Status of SEFAZ Server
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <returns>string</returns>
        string InvoicesSefazStatusGet (string authorization);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class InvoiceSEFAZApi : IInvoiceSEFAZApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceSEFAZApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public InvoiceSEFAZApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="InvoiceSEFAZApi"/> class.
        /// </summary>
        /// <returns></returns>
        public InvoiceSEFAZApi(String basePath)
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
        /// Disable Range e-Invoice Send disable range of NFes to SEFAZ 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Disable Range e-Invoice</param> 
        /// <returns>SefazInvoiceBasicStatus</returns>            
        public SefazInvoiceBasicStatus InvoicesSefazDelete (string authorization, SefazDisableRangeIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazDelete");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling InvoicesSefazDelete");
            
    
            var path = "/invoices/sefaz";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SefazInvoiceBasicStatus) ApiClient.Deserialize(response.Content, typeof(SefazInvoiceBasicStatus), response.Headers);
        }
    
        /// <summary>
        /// Cancel invoice Cancel the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="key">Invoice Key</param> 
        /// <param name="body">Cancel Message</param> 
        /// <returns>SefazInvoiceBasicStatus</returns>            
        public SefazInvoiceBasicStatus InvoicesSefazKeyDelete (string authorization, string key, SefazItDeleteIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazKeyDelete");
            
            // verify the required parameter 'key' is set
            if (key == null) throw new ApiException(400, "Missing required parameter 'key' when calling InvoicesSefazKeyDelete");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling InvoicesSefazKeyDelete");
            
    
            var path = "/invoices/sefaz/{key}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "key" + "}", ApiClient.ParameterToString(key));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SefazInvoiceBasicStatus) ApiClient.Deserialize(response.Content, typeof(SefazInvoiceBasicStatus), response.Headers);
        }
    
        /// <summary>
        /// Retrieve invoice Retrieve the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="key">Invoice Key</param> 
        /// <returns>SefazItGetOut</returns>            
        public SefazItGetOut InvoicesSefazKeyGet (string authorization, string key)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazKeyGet");
            
            // verify the required parameter 'key' is set
            if (key == null) throw new ApiException(400, "Missing required parameter 'key' when calling InvoicesSefazKeyGet");
            
    
            var path = "/invoices/sefaz/{key}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SefazItGetOut) ApiClient.Deserialize(response.Content, typeof(SefazItGetOut), response.Headers);
        }
    
        /// <summary>
        /// Retrieve invoice Retrieve the invoice
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="key">Invoice Key</param> 
        /// <returns>TransactionForSefazGoodsList</returns>            
        public TransactionForSefazGoodsList InvoicesSefazKeyLookupGet (string authorization, string key)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazKeyLookupGet");
            
            // verify the required parameter 'key' is set
            if (key == null) throw new ApiException(400, "Missing required parameter 'key' when calling InvoicesSefazKeyLookupGet");
            
    
            var path = "/invoices/sefaz/{key}/lookup";
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
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyLookupGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyLookupGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TransactionForSefazGoodsList) ApiClient.Deserialize(response.Content, typeof(TransactionForSefazGoodsList), response.Headers);
        }
    
        /// <summary>
        /// Fix Letter Fix Letter
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="key">Invoice Key</param> 
        /// <param name="body">Fix Message</param> 
        /// <returns>SefazInvoiceBasicStatus</returns>            
        public SefazInvoiceBasicStatus InvoicesSefazKeyPut (string authorization, string key, SefazItPutIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazKeyPut");
            
            // verify the required parameter 'key' is set
            if (key == null) throw new ApiException(400, "Missing required parameter 'key' when calling InvoicesSefazKeyPut");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling InvoicesSefazKeyPut");
            
    
            var path = "/invoices/sefaz/{key}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "key" + "}", ApiClient.ParameterToString(key));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyPut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazKeyPut: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SefazInvoiceBasicStatus) ApiClient.Deserialize(response.Content, typeof(SefazInvoiceBasicStatus), response.Headers);
        }
    
        /// <summary>
        /// Send an e-Invoice Send a invoice to SEFAZ 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Invoices</param> 
        /// <returns>SefazPostOut</returns>            
        public SefazPostOut InvoicesSefazPost (string authorization, List<TransactionForSefazGoods> body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling InvoicesSefazPost");
            
    
            var path = "/invoices/sefaz";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SefazPostOut) ApiClient.Deserialize(response.Content, typeof(SefazPostOut), response.Headers);
        }
    
        /// <summary>
        /// Retrieve Status of SEFAZ Server Retrieve Status of SEFAZ Server
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <returns>string</returns>            
        public string InvoicesSefazStatusGet (string authorization)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling InvoicesSefazStatusGet");
            
    
            var path = "/invoices/sefaz/status";
            path = path.Replace("{format}", "json");
                
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
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazStatusGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling InvoicesSefazStatusGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
