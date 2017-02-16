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
    public interface ICompanyICMSApi
    {
        /// <summary>
        ///  This operation return custom ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param>
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param>
        /// <param name="xPaginationSort"></param>
        /// <returns>List&lt;CustomIcmsConfByState&gt;</returns>
        List<CustomIcmsConfByState> CompaniesCompanyIdIcmsGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort);
        /// <summary>
        ///  This operation return custom ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="state">Brazilian State</param>
        /// <returns>CustomIcmsConfByState</returns>
        CustomIcmsConfByState CompaniesCompanyIdIcmsStateGet (Guid? companyId, string state);
        /// <summary>
        /// Create custom ICMS tax for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateICMS (Guid? companyId, CustomIcmsConfByState body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="state">Brazilian State</param>
        /// <returns></returns>
        void DeleteCustomIcmsConfByState (Guid? companyId, string state);
        /// <summary>
        /// Update custom agast for one company This method operation update a custom ICMS tax for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="state">Brazilian State</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateCustomIcmsConfByState (Guid? companyId, string state, CustomIcmsConfByState body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyICMSApi : ICompanyICMSApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyICMSApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyICMSApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyICMSApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyICMSApi(String basePath)
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
        ///  This operation return custom ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param> 
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param> 
        /// <param name="xPaginationSort"></param> 
        /// <returns>List&lt;CustomIcmsConfByState&gt;</returns>            
        public List<CustomIcmsConfByState> CompaniesCompanyIdIcmsGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdIcmsGet");
            
    
            var path = "/companies/{companyId}/icms";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdIcmsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdIcmsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<CustomIcmsConfByState>) ApiClient.Deserialize(response.Content, typeof(List<CustomIcmsConfByState>), response.Headers);
        }
    
        /// <summary>
        ///  This operation return custom ICMS configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="state">Brazilian State</param> 
        /// <returns>CustomIcmsConfByState</returns>            
        public CustomIcmsConfByState CompaniesCompanyIdIcmsStateGet (Guid? companyId, string state)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdIcmsStateGet");
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling CompaniesCompanyIdIcmsStateGet");
            
    
            var path = "/companies/{companyId}/icms/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdIcmsStateGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdIcmsStateGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (CustomIcmsConfByState) ApiClient.Deserialize(response.Content, typeof(CustomIcmsConfByState), response.Headers);
        }
    
        /// <summary>
        /// Create custom ICMS tax for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateICMS (Guid? companyId, CustomIcmsConfByState body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateICMS");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateICMS");
            
    
            var path = "/companies/{companyId}/icms";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateICMS: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateICMS: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="state">Brazilian State</param> 
        /// <returns></returns>            
        public void DeleteCustomIcmsConfByState (Guid? companyId, string state)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteCustomIcmsConfByState");
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling DeleteCustomIcmsConfByState");
            
    
            var path = "/companies/{companyId}/icms/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCustomIcmsConfByState: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCustomIcmsConfByState: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update custom agast for one company This method operation update a custom ICMS tax for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="state">Brazilian State</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateCustomIcmsConfByState (Guid? companyId, string state, CustomIcmsConfByState body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateCustomIcmsConfByState");
            
            // verify the required parameter 'state' is set
            if (state == null) throw new ApiException(400, "Missing required parameter 'state' when calling UpdateCustomIcmsConfByState");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateCustomIcmsConfByState");
            
    
            var path = "/companies/{companyId}/icms/{state}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "state" + "}", ApiClient.ParameterToString(state));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCustomIcmsConfByState: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCustomIcmsConfByState: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
