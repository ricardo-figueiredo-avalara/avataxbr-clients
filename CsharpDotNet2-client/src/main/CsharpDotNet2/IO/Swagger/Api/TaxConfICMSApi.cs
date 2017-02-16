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
    public interface ITaxConfICMSApi
    {
        /// <summary>
        /// create a new ICMS Configuration 
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="icmsConfState">The pet JSON you want to post</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateIcmsconfstate (string state, IcmsConfByState icmsConfState);
        /// <summary>
        /// disable a ICMS by State. 
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="code">ICMS Code</param>
        /// <returns></returns>
        void DeleteIcmsConf (string state, string code);
        /// <summary>
        /// get ICMS information by State. This operation return configurations of icms that match with parameters queries 
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="code">ICMS Code</param>
        /// <returns>List&lt;IcmsConfByState&gt;</returns>
        List<IcmsConfByState> GetIcmsConfByState (string state, string code);
        /// <summary>
        /// retrive list of ICMS. This operation return ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="suffixcode">Identify this ICMS</param>
        /// <param name="date">When informed return valid version configuration for this date</param>
        /// <param name="inactive">return the inactive versions too</param>
        /// <returns>List&lt;IcmsConfByState&gt;</returns>
        List<IcmsConfByState> GetIcmsList (string state, string suffixcode, DateTime? date, bool? inactive);
        /// <summary>
        /// retrive list of ICMS. This operation return ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="text">Search for codes</param>
        /// <param name="state">Filter for states</param>
        /// <returns>List&lt;IcmsConfByState&gt;</returns>
        List<IcmsConfByState> GetIcmsList_1 (string text, string state);
        /// <summary>
        /// update a IcmsConf State, 
        /// </summary>
        /// <param name="state">Brazilian State</param>
        /// <param name="code">ICMS Code</param>
        /// <param name="icmsConfState">The pet JSON you want to post</param>
        /// <returns></returns>
        void UpdateIcmsconfstate (string state, string code, IcmsConfByState icmsConfState);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TaxConfICMSApi : ITaxConfICMSApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfICMSApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TaxConfICMSApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfICMSApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TaxConfICMSApi(String basePath)
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
        /// create a new ICMS Configuration 
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="icmsConfState">The pet JSON you want to post</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateIcmsconfstate (string state, IcmsConfByState icmsConfState)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling CreateIcmsconfstate");
            
            // verify the required parameter 'icmsConfState' is set
            if (icmsConfState == null) throw new ApiException(400, "Missing required parameter 'icmsConfState' when calling CreateIcmsconfstate");
            
    
            var path = "/taxconf/icms/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(icmsConfState); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIcmsconfstate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIcmsconfstate: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// disable a ICMS by State. 
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="code">ICMS Code</param> 
        /// <returns></returns>            
        public void DeleteIcmsConf (string state, string code)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling DeleteIcmsConf");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteIcmsConf");
            
    
            var path = "/taxconf/icms/{state}/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIcmsConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIcmsConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// get ICMS information by State. This operation return configurations of icms that match with parameters queries 
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="code">ICMS Code</param> 
        /// <returns>List&lt;IcmsConfByState&gt;</returns>            
        public List<IcmsConfByState> GetIcmsConfByState (string state, string code)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling GetIcmsConfByState");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling GetIcmsConfByState");
            
    
            var path = "/taxconf/icms/{state}/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsConfByState: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsConfByState: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IcmsConfByState>) ApiClient.Deserialize(response.Content, typeof(List<IcmsConfByState>), response.Headers);
        }
    
        /// <summary>
        /// retrive list of ICMS. This operation return ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="suffixcode">Identify this ICMS</param> 
        /// <param name="date">When informed return valid version configuration for this date</param> 
        /// <param name="inactive">return the inactive versions too</param> 
        /// <returns>List&lt;IcmsConfByState&gt;</returns>            
        public List<IcmsConfByState> GetIcmsList (string state, string suffixcode, DateTime? date, bool? inactive)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling GetIcmsList");
            
    
            var path = "/taxconf/icms/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IcmsConfByState>) ApiClient.Deserialize(response.Content, typeof(List<IcmsConfByState>), response.Headers);
        }
    
        /// <summary>
        /// retrive list of ICMS. This operation return ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="text">Search for codes</param> 
        /// <param name="state">Filter for states</param> 
        /// <returns>List&lt;IcmsConfByState&gt;</returns>            
        public List<IcmsConfByState> GetIcmsList_1 (string text, string state)
        {
            
            // verify the required parameter 'text' is set
            if (text == null) throw new ApiException(400, "Missing required parameter 'text' when calling GetIcmsList_1");
            
    
            var path = "/taxconf/icms-search/";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (text != null) queryParams.Add("text", ApiClient.ParameterToString(text)); // query parameter
 if (state != null) queryParams.Add("state", ApiClient.ParameterToString(state)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsList_1: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIcmsList_1: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IcmsConfByState>) ApiClient.Deserialize(response.Content, typeof(List<IcmsConfByState>), response.Headers);
        }
    
        /// <summary>
        /// update a IcmsConf State, 
        /// </summary>
        /// <param name="state">Brazilian State</param> 
        /// <param name="code">ICMS Code</param> 
        /// <param name="icmsConfState">The pet JSON you want to post</param> 
        /// <returns></returns>            
        public void UpdateIcmsconfstate (string state, string code, IcmsConfByState icmsConfState)
        {
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling UpdateIcmsconfstate");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateIcmsconfstate");
            
            // verify the required parameter 'icmsConfState' is set
            if (icmsConfState == null) throw new ApiException(400, "Missing required parameter 'icmsConfState' when calling UpdateIcmsconfstate");
            
    
            var path = "/taxconf/icms/{state}/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(icmsConfState); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIcmsconfstate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIcmsconfstate: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
