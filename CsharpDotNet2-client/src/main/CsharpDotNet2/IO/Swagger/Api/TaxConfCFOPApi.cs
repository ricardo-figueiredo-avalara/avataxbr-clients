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
    public interface ITaxConfCFOPApi
    {
        /// <summary>
        /// create a new CFOP configuration 
        /// </summary>
        /// <param name="body">The pet JSON you want to post</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateCfop (CfopConf body);
        /// <summary>
        /// disable a CFOP. 
        /// </summary>
        /// <param name="code">CFOP Code</param>
        /// <returns></returns>
        void DeleteCfop (string code);
        /// <summary>
        /// get CFOP information. This operation return CFOP configuration 
        /// </summary>
        /// <param name="code">CFOP Code</param>
        /// <returns>CfopConf</returns>
        CfopConf GetCfop (string code);
        /// <summary>
        /// retrive list of CFOP. This operation return CFOP configurations that match with parameters queries 
        /// </summary>
        /// <param name="suffixcode">Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type </param>
        /// <param name="date">When informed return valid version configuration for this date </param>
        /// <param name="inactive">return the inactive versions too </param>
        /// <returns>List&lt;CfopConf&gt;</returns>
        List<CfopConf> GetCfopList (string suffixcode, DateTime? date, bool? inactive);
        /// <summary>
        /// update a CFOP configuration 
        /// </summary>
        /// <param name="code">CFOP Code</param>
        /// <param name="taxconfcfop">The pet JSON you want to post</param>
        /// <returns></returns>
        void UpdateCfop (string code, CfopConf taxconfcfop);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TaxConfCFOPApi : ITaxConfCFOPApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfCFOPApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TaxConfCFOPApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfCFOPApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TaxConfCFOPApi(String basePath)
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
        /// create a new CFOP configuration 
        /// </summary>
        /// <param name="body">The pet JSON you want to post</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateCfop (CfopConf body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateCfop");
            
    
            var path = "/taxconf/cfop";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCfop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCfop: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// disable a CFOP. 
        /// </summary>
        /// <param name="code">CFOP Code</param> 
        /// <returns></returns>            
        public void DeleteCfop (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteCfop");
            
    
            var path = "/taxconf/cfop/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCfop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCfop: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// get CFOP information. This operation return CFOP configuration 
        /// </summary>
        /// <param name="code">CFOP Code</param> 
        /// <returns>CfopConf</returns>            
        public CfopConf GetCfop (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling GetCfop");
            
    
            var path = "/taxconf/cfop/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetCfop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCfop: " + response.ErrorMessage, response.ErrorMessage);
    
            return (CfopConf) ApiClient.Deserialize(response.Content, typeof(CfopConf), response.Headers);
        }
    
        /// <summary>
        /// retrive list of CFOP. This operation return CFOP configurations that match with parameters queries 
        /// </summary>
        /// <param name="suffixcode">Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type </param> 
        /// <param name="date">When informed return valid version configuration for this date </param> 
        /// <param name="inactive">return the inactive versions too </param> 
        /// <returns>List&lt;CfopConf&gt;</returns>            
        public List<CfopConf> GetCfopList (string suffixcode, DateTime? date, bool? inactive)
        {
            
    
            var path = "/taxconf/cfop";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (suffixcode != null) queryParams.Add("suffixcode", ApiClient.ParameterToString(suffixcode)); // query parameter
 if (date != null) queryParams.Add("date", ApiClient.ParameterToString(date)); // query parameter
 if (inactive != null) queryParams.Add("inactive", ApiClient.ParameterToString(inactive)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCfopList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCfopList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<CfopConf>) ApiClient.Deserialize(response.Content, typeof(List<CfopConf>), response.Headers);
        }
    
        /// <summary>
        /// update a CFOP configuration 
        /// </summary>
        /// <param name="code">CFOP Code</param> 
        /// <param name="taxconfcfop">The pet JSON you want to post</param> 
        /// <returns></returns>            
        public void UpdateCfop (string code, CfopConf taxconfcfop)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateCfop");
            
            // verify the required parameter 'taxconfcfop' is set
            if (taxconfcfop == null) throw new ApiException(400, "Missing required parameter 'taxconfcfop' when calling UpdateCfop");
            
    
            var path = "/taxconf/cfop/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(taxconfcfop); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCfop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCfop: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
