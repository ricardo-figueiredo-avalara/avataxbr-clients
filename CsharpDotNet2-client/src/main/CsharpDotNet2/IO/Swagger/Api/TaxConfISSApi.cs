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
    public interface ITaxConfISSApi
    {
        /// <summary>
        /// create a new ISS Configuration 
        /// </summary>
        /// <param name="issConfByCity">The pet JSON you want to post</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateIssConfByCity (IssConfByCity issConfByCity);
        /// <summary>
        /// disable a ISS by City Code. 
        /// </summary>
        /// <param name="cityCode">City Code</param>
        /// <returns></returns>
        void DeleteIssConf (double? cityCode);
        /// <summary>
        /// get ISS information by City Code. This operation return configurations of ISS that match with parameters queries 
        /// </summary>
        /// <param name="cityCode">City Code</param>
        /// <param name="code">Identificator of this configuration, it is unique for account or standard namedspace </param>
        /// <param name="date">When informed return valid version configuration for this date </param>
        /// <param name="inactive">return the inctives versions too </param>
        /// <returns>List&lt;IssConfByCity&gt;</returns>
        List<IssConfByCity> GetIssConfByCity (double? cityCode, string code, DateTime? date, bool? inactive);
        /// <summary>
        /// retrive list of ISS This operation return ISS configurations that match with parameters queries 
        /// </summary>
        /// <param name="suffixcode">Identify this ISS </param>
        /// <param name="date">When informed return valid version configuration for this date </param>
        /// <param name="inactive">return the inactive versions too </param>
        /// <returns>List&lt;IssConfByCity&gt;</returns>
        List<IssConfByCity> GetIssList (string suffixcode, DateTime? date, bool? inactive);
        /// <summary>
        /// update a ISS by City Code. 
        /// </summary>
        /// <param name="cityCode">City Code</param>
        /// <param name="issConfByCity">The pet JSON you want to post</param>
        /// <returns></returns>
        void UpdateIssConfByCity (double? cityCode, IssConfByCity issConfByCity);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TaxConfISSApi : ITaxConfISSApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfISSApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TaxConfISSApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfISSApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TaxConfISSApi(String basePath)
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
        /// create a new ISS Configuration 
        /// </summary>
        /// <param name="issConfByCity">The pet JSON you want to post</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateIssConfByCity (IssConfByCity issConfByCity)
        {
            
            // verify the required parameter 'issConfByCity' is set
            if (issConfByCity == null) throw new ApiException(400, "Missing required parameter 'issConfByCity' when calling CreateIssConfByCity");
            
    
            var path = "/taxconf/iss";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(issConfByCity); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIssConfByCity: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateIssConfByCity: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// disable a ISS by City Code. 
        /// </summary>
        /// <param name="cityCode">City Code</param> 
        /// <returns></returns>            
        public void DeleteIssConf (double? cityCode)
        {
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling DeleteIssConf");
            
    
            var path = "/taxconf/iss/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "cityCode" + "}", ApiClient.ParameterToString(cityCode));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIssConf: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteIssConf: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// get ISS information by City Code. This operation return configurations of ISS that match with parameters queries 
        /// </summary>
        /// <param name="cityCode">City Code</param> 
        /// <param name="code">Identificator of this configuration, it is unique for account or standard namedspace </param> 
        /// <param name="date">When informed return valid version configuration for this date </param> 
        /// <param name="inactive">return the inctives versions too </param> 
        /// <returns>List&lt;IssConfByCity&gt;</returns>            
        public List<IssConfByCity> GetIssConfByCity (double? cityCode, string code, DateTime? date, bool? inactive)
        {
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling GetIssConfByCity");
            
    
            var path = "/taxconf/iss/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "cityCode" + "}", ApiClient.ParameterToString(cityCode));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (code != null) queryParams.Add("code", ApiClient.ParameterToString(code)); // query parameter
 if (date != null) queryParams.Add("date", ApiClient.ParameterToString(date)); // query parameter
 if (inactive != null) queryParams.Add("inactive", ApiClient.ParameterToString(inactive)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIssConfByCity: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIssConfByCity: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IssConfByCity>) ApiClient.Deserialize(response.Content, typeof(List<IssConfByCity>), response.Headers);
        }
    
        /// <summary>
        /// retrive list of ISS This operation return ISS configurations that match with parameters queries 
        /// </summary>
        /// <param name="suffixcode">Identify this ISS </param> 
        /// <param name="date">When informed return valid version configuration for this date </param> 
        /// <param name="inactive">return the inactive versions too </param> 
        /// <returns>List&lt;IssConfByCity&gt;</returns>            
        public List<IssConfByCity> GetIssList (string suffixcode, DateTime? date, bool? inactive)
        {
            
    
            var path = "/taxconf/iss";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetIssList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetIssList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<IssConfByCity>) ApiClient.Deserialize(response.Content, typeof(List<IssConfByCity>), response.Headers);
        }
    
        /// <summary>
        /// update a ISS by City Code. 
        /// </summary>
        /// <param name="cityCode">City Code</param> 
        /// <param name="issConfByCity">The pet JSON you want to post</param> 
        /// <returns></returns>            
        public void UpdateIssConfByCity (double? cityCode, IssConfByCity issConfByCity)
        {
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling UpdateIssConfByCity");
            
            // verify the required parameter 'issConfByCity' is set
            if (issConfByCity == null) throw new ApiException(400, "Missing required parameter 'issConfByCity' when calling UpdateIssConfByCity");
            
    
            var path = "/taxconf/iss/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "cityCode" + "}", ApiClient.ParameterToString(cityCode));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(issConfByCity); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIssConfByCity: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateIssConfByCity: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
