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
    public interface ICompanyLocationApi
    {
        /// <summary>
        ///  This operation return location 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Location Code</param>
        /// <returns>Location</returns>
        Location CompaniesCompanyIdLocationsCodeGet (Guid? companyId, string code);
        /// <summary>
        ///  This operation return all locations 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param>
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param>
        /// <param name="xPaginationSort"></param>
        /// <returns>List&lt;Location&gt;</returns>
        List<Location> CompaniesCompanyIdLocationsGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort);
        /// <summary>
        /// Create new location for company This method operation create a new location for company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateLocation (Guid? companyId, Location body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Location Code</param>
        /// <returns></returns>
        void DeleteLocation (Guid? companyId, string code);
        /// <summary>
        /// Update location for company This method operation update a location for company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Location Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateLocation (Guid? companyId, string code, Location body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyLocationApi : ICompanyLocationApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyLocationApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyLocationApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyLocationApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyLocationApi(String basePath)
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
        ///  This operation return location 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Location Code</param> 
        /// <returns>Location</returns>            
        public Location CompaniesCompanyIdLocationsCodeGet (Guid? companyId, string code)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdLocationsCodeGet");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdLocationsCodeGet");
            
    
            var path = "/companies/{companyId}/locations/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdLocationsCodeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdLocationsCodeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Location) ApiClient.Deserialize(response.Content, typeof(Location), response.Headers);
        }
    
        /// <summary>
        ///  This operation return all locations 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param> 
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param> 
        /// <param name="xPaginationSort"></param> 
        /// <returns>List&lt;Location&gt;</returns>            
        public List<Location> CompaniesCompanyIdLocationsGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdLocationsGet");
            
    
            var path = "/companies/{companyId}/locations";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (xPaginationLimit != null) headerParams.Add("X-Pagination-Limit", ApiClient.ParameterToString(xPaginationLimit)); // header parameter
 if (xPaginationCurrentPage != null) headerParams.Add("X-Pagination-Current-Page", ApiClient.ParameterToString(xPaginationCurrentPage)); // header parameter
 if (xPaginationSort != null) headerParams.Add("X-Pagination-Sort", ApiClient.ParameterToString(xPaginationSort)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdLocationsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdLocationsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Location>) ApiClient.Deserialize(response.Content, typeof(List<Location>), response.Headers);
        }
    
        /// <summary>
        /// Create new location for company This method operation create a new location for company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateLocation (Guid? companyId, Location body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateLocation");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateLocation");
            
    
            var path = "/companies/{companyId}/locations";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateLocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateLocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Location Code</param> 
        /// <returns></returns>            
        public void DeleteLocation (Guid? companyId, string code)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteLocation");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteLocation");
            
    
            var path = "/companies/{companyId}/locations/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteLocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteLocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update location for company This method operation update a location for company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Location Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateLocation (Guid? companyId, string code, Location body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateLocation");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateLocation");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateLocation");
            
    
            var path = "/companies/{companyId}/locations/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateLocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateLocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
