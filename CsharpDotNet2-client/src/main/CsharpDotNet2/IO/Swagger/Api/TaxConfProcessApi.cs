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
    public interface ITaxConfProcessApi
    {
        /// <summary>
        /// create a new Process Type configuration 
        /// </summary>
        /// <param name="taxconfprocess">The pet JSON you want to post</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateProcess (ProcessScenario taxconfprocess);
        /// <summary>
        /// disable a Process. 
        /// </summary>
        /// <param name="code">Process Code</param>
        /// <returns></returns>
        void DeleteProcess (string code);
        /// <summary>
        /// get Process information. This operation return Process Type configuration 
        /// </summary>
        /// <param name="code">Process Code</param>
        /// <returns>ProcessScenario</returns>
        ProcessScenario GetProcess (string code);
        /// <summary>
        /// retrive list of Process. This operation return Process Type configurations that match with parameters queries 
        /// </summary>
        /// <param name="accountId">filter the configuration by accountID, if not informed, only the standard configuration will be returned </param>
        /// <param name="date">When informed return valid version configuration for this date </param>
        /// <param name="inactive">return the inactive versions too </param>
        /// <returns>List&lt;ProcessScenario&gt;</returns>
        List<ProcessScenario> GetProcessList (string accountId, DateTime? date, bool? inactive);
        /// <summary>
        /// update a Process Type configuration 
        /// </summary>
        /// <param name="code">Process Code</param>
        /// <param name="taxconfprocess">The pet JSON you want to post</param>
        /// <returns></returns>
        void UpdateProcess (string code, ProcessScenario taxconfprocess);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TaxConfProcessApi : ITaxConfProcessApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfProcessApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TaxConfProcessApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConfProcessApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TaxConfProcessApi(String basePath)
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
        public InlineResponse201 CreateProcess (ProcessScenario taxconfprocess)
        {
            
            // verify the required parameter 'taxconfprocess' is set
            if (taxconfprocess == null) throw new ApiException(400, "Missing required parameter 'taxconfprocess' when calling CreateProcess");
            
    
            var path = "/taxconf/process";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateProcess: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateProcess: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// disable a Process. 
        /// </summary>
        /// <param name="code">Process Code</param> 
        /// <returns></returns>            
        public void DeleteProcess (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteProcess");
            
    
            var path = "/taxconf/process/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteProcess: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteProcess: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// get Process information. This operation return Process Type configuration 
        /// </summary>
        /// <param name="code">Process Code</param> 
        /// <returns>ProcessScenario</returns>            
        public ProcessScenario GetProcess (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling GetProcess");
            
    
            var path = "/taxconf/process/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetProcess: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetProcess: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ProcessScenario) ApiClient.Deserialize(response.Content, typeof(ProcessScenario), response.Headers);
        }
    
        /// <summary>
        /// retrive list of Process. This operation return Process Type configurations that match with parameters queries 
        /// </summary>
        /// <param name="accountId">filter the configuration by accountID, if not informed, only the standard configuration will be returned </param> 
        /// <param name="date">When informed return valid version configuration for this date </param> 
        /// <param name="inactive">return the inactive versions too </param> 
        /// <returns>List&lt;ProcessScenario&gt;</returns>            
        public List<ProcessScenario> GetProcessList (string accountId, DateTime? date, bool? inactive)
        {
            
    
            var path = "/taxconf/process";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetProcessList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetProcessList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ProcessScenario>) ApiClient.Deserialize(response.Content, typeof(List<ProcessScenario>), response.Headers);
        }
    
        /// <summary>
        /// update a Process Type configuration 
        /// </summary>
        /// <param name="code">Process Code</param> 
        /// <param name="taxconfprocess">The pet JSON you want to post</param> 
        /// <returns></returns>            
        public void UpdateProcess (string code, ProcessScenario taxconfprocess)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateProcess");
            
            // verify the required parameter 'taxconfprocess' is set
            if (taxconfprocess == null) throw new ApiException(400, "Missing required parameter 'taxconfprocess' when calling UpdateProcess");
            
    
            var path = "/taxconf/process/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateProcess: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateProcess: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
