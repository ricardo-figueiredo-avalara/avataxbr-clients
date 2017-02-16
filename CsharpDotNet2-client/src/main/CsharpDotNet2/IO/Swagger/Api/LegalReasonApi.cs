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
    public interface ILegalReasonApi
    {
        /// <summary>
        /// Create Legal Reason. 
        /// </summary>
        /// <param name="body"></param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateReason (LegalReason body);
        /// <summary>
        /// Delete a Legal Reason entry. 
        /// </summary>
        /// <param name="uuid"></param>
        /// <returns></returns>
        void DeleteReason (string uuid);
        /// <summary>
        /// Get single Legal Reason. 
        /// </summary>
        /// <param name="uuid"></param>
        /// <returns>ProcessScenario</returns>
        ProcessScenario GetReason (string uuid);
        /// <summary>
        /// List Legal Reasons. 
        /// </summary>
        /// <param name="companyId">Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries. </param>
        /// <returns>List&lt;LegalReason&gt;</returns>
        List<LegalReason> ListReason (string companyId);
        /// <summary>
        /// Update Legal Reason. 
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        void UpdateReason (LegalReason body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class LegalReasonApi : ILegalReasonApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LegalReasonApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public LegalReasonApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="LegalReasonApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LegalReasonApi(String basePath)
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
        /// Create Legal Reason. 
        /// </summary>
        /// <param name="body"></param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateReason (LegalReason body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateReason");
            
    
            var path = "/taxconf/legal-reason";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateReason: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateReason: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        /// Delete a Legal Reason entry. 
        /// </summary>
        /// <param name="uuid"></param> 
        /// <returns></returns>            
        public void DeleteReason (string uuid)
        {
            
            // verify the required parameter 'uuid' is set
            if (uuid == null) throw new ApiException(400, "Missing required parameter 'uuid' when calling DeleteReason");
            
    
            var path = "/taxconf/legal-reason/{uuid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "uuid" + "}", ApiClient.ParameterToString(uuid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteReason: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteReason: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get single Legal Reason. 
        /// </summary>
        /// <param name="uuid"></param> 
        /// <returns>ProcessScenario</returns>            
        public ProcessScenario GetReason (string uuid)
        {
            
            // verify the required parameter 'uuid' is set
            if (uuid == null) throw new ApiException(400, "Missing required parameter 'uuid' when calling GetReason");
            
    
            var path = "/taxconf/legal-reason/{uuid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "uuid" + "}", ApiClient.ParameterToString(uuid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetReason: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetReason: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ProcessScenario) ApiClient.Deserialize(response.Content, typeof(ProcessScenario), response.Headers);
        }
    
        /// <summary>
        /// List Legal Reasons. 
        /// </summary>
        /// <param name="companyId">Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries. </param> 
        /// <returns>List&lt;LegalReason&gt;</returns>            
        public List<LegalReason> ListReason (string companyId)
        {
            
    
            var path = "/taxconf/legal-reason";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (companyId != null) queryParams.Add("companyId", ApiClient.ParameterToString(companyId)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ListReason: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListReason: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<LegalReason>) ApiClient.Deserialize(response.Content, typeof(List<LegalReason>), response.Headers);
        }
    
        /// <summary>
        /// Update Legal Reason. 
        /// </summary>
        /// <param name="body"></param> 
        /// <returns></returns>            
        public void UpdateReason (LegalReason body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateReason");
            
    
            var path = "/taxconf/legal-reason";
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateReason: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateReason: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
