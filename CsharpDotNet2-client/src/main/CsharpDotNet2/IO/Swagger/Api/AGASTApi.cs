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
    public interface IAGASTApi
    {
        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="code">Agast Code</param>
        /// <returns>Agast</returns>
        Agast AgastsCodeGet (string code);
        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateAgast (Agast body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="code">Agast Code</param>
        /// <returns></returns>
        void DeleteAgast (string code);
        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="text">Text query</param>
        /// <returns>List&lt;InlineResponse2001&gt;</returns>
        List<InlineResponse2001> GetAgastList (string text);
        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateAgast (string code, Agast body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AGASTApi : IAGASTApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AGASTApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AGASTApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AGASTApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AGASTApi(String basePath)
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
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="code">Agast Code</param> 
        /// <returns>Agast</returns>            
        public Agast AgastsCodeGet (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling AgastsCodeGet");
            
    
            var path = "/agasts/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling AgastsCodeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AgastsCodeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Agast) ApiClient.Deserialize(response.Content, typeof(Agast), response.Headers);
        }
    
        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateAgast (Agast body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateAgast");
            
    
            var path = "/agasts";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateAgast: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateAgast: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="code">Agast Code</param> 
        /// <returns></returns>            
        public void DeleteAgast (string code)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteAgast");
            
    
            var path = "/agasts/{code}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAgast: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAgast: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="text">Text query</param> 
        /// <returns>List&lt;InlineResponse2001&gt;</returns>            
        public List<InlineResponse2001> GetAgastList (string text)
        {
            
    
            var path = "/agasts";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (text != null) queryParams.Add("text", ApiClient.ParameterToString(text)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgastList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgastList: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<InlineResponse2001>) ApiClient.Deserialize(response.Content, typeof(List<InlineResponse2001>), response.Headers);
        }
    
        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <param name="code">Agast Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateAgast (string code, Agast body)
        {
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateAgast");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateAgast");
            
    
            var path = "/agasts/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAgast: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAgast: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
