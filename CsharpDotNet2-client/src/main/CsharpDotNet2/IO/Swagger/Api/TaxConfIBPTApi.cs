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
    public interface ITaxConfIBPTApi
    {
        /// <summary>
        /// create a new Process Type configuration 
        /// </summary>
        /// <param name="taxconfprocess">The pet JSON you want to post</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateIbptConf (IbptConf taxconfprocess);
        /// <summary>
        /// disable a IBPT. 
        /// </summary>
        /// <param name="code">IBPT Code</param>
        /// <returns></returns>
        void DeleteIbptConf (string code);
        /// <summary>
        /// get IBPT information. This operation return Process Type configuration 
        /// </summary>
        /// <param name="code">IBPT Code</param>
        /// <returns>IbptConf</returns>
        IbptConf GetIbptConf (string code);
        /// <summary>
        /// retrive list of IBPT. This operation return Process Type configurations that match with parameters queries 
        /// </summary>
        /// <param name="accountId">filter the configuration by accountID, if not informed, only the standard configuration will be returned </param>
        /// <param name="date">When informed return valid version configuration for this date </param>
        /// <param name="inactive">return the inactive versions too </param>
        /// <returns>List&lt;IbptConf&gt;</returns>
        List<IbptConf> GetIbptConfList (string accountId, DateTime? date, bool? inactive);
        /// <summary>
        /// update a Process Type configuration 
        /// </summary>
        /// <param name="code">IBPT Code</param>
        /// <param name="taxconfprocess">The pet JSON you want to post</param>
        /// <returns></returns>
        void UpdateIbptConf (string code, IbptConf taxconfprocess);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TaxConfIBPTApi : ITaxConfIBPTApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfIBPTApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TaxConfIBPTApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfIBPTApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TaxConfIBPTApi(String basePath)
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
        /// create a new Process Type configuration 
        /// </summary>
        /// <param name="taxconfprocess">The pet JSON you want to post</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateIbptConf (IbptConf taxconfprocess)
        {
            
            // verify the required parameter 'taxconfprocess' is set
            if (taxconfprocess == null) throw new ApiException(400, "Missing required parameter 'taxconfprocess' when calling CreateIbptConf");
            
    
            var path = "/taxconf/ibpt";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(taxconfprocess); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIbptConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIbptConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// disable a IBPT. 
        /// </summary>
        /// <param name="code">IBPT Code</param> 
        /// <returns></returns>            
        public void DeleteIbptConf (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteIbptConf");
            
    
            var path = "/taxconf/ibpt/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIbptConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIbptConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// get IBPT information. This operation return Process Type configuration 
        /// </summary>
        /// <param name="code">IBPT Code</param> 
        /// <returns>IbptConf</returns>            
        public IbptConf GetIbptConf (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling GetIbptConf");
            
    
            var path = "/taxconf/ibpt/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetIbptConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIbptConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return (IbptConf) ApiClient.Deserialize(response.Content, typeof(IbptConf), response.Headers);
        }
    
        /// <summary>
        /// retrive list of IBPT. This operation return Process Type configurations that match with parameters queries 
        /// </summary>
        /// <param name="accountId">filter the configuration by accountID, if not informed, only the standard configuration will be returned </param> 
        /// <param name="date">When informed return valid version configuration for this date </param> 
        /// <param name="inactive">return the inactive versions too </param> 
        /// <returns>List&lt;IbptConf&gt;</returns>            
        public List<IbptConf> GetIbptConfList (string accountId, DateTime? date, bool? inactive)
        {
            
    
            var path = "/taxconf/ibpt";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accountId != null) queryParams.Add("accountId", ApiClient.ParameterToString(accountId)); // query parameter
 if (date != null) queryParams.Add("date", ApiClient.ParameterToString(date)); // query parameter
 if (inactive != null) queryParams.Add("inactive", ApiClient.ParameterToString(inactive)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIbptConfList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIbptConfList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IbptConf>) ApiClient.Deserialize(response.Content, typeof(List<IbptConf>), response.Headers);
        }
    
        /// <summary>
        /// update a Process Type configuration 
        /// </summary>
        /// <param name="code">IBPT Code</param> 
        /// <param name="taxconfprocess">The pet JSON you want to post</param> 
        /// <returns></returns>            
        public void UpdateIbptConf (string code, IbptConf taxconfprocess)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateIbptConf");
            
            // verify the required parameter 'taxconfprocess' is set
            if (taxconfprocess == null) throw new ApiException(400, "Missing required parameter 'taxconfprocess' when calling UpdateIbptConf");
            
    
            var path = "/taxconf/ibpt/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(taxconfprocess); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIbptConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIbptConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
