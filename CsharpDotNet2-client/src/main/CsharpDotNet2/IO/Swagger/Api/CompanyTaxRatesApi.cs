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
    public interface ICompanyTaxRatesApi
    {
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param>
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param>
        /// <param name="xPaginationSort"></param>
        /// <returns>List&lt;CustomTaxTypeRate&gt;</returns>
        List<CustomTaxTypeRate> CompaniesCompanyIdTaxratesGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort);
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="taxType">Tax Type</param>
        /// <returns>CustomTaxTypeRate</returns>
        CustomTaxTypeRate CompaniesCompanyIdTaxratesTaxTypeGet (Guid? companyId, string taxType);
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateCustomTaxes (Guid? companyId, CustomTaxTypeRate body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="taxType">Tax Type</param>
        /// <returns></returns>
        void DeleteCustomTaxes (Guid? companyId, string taxType);
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="taxType">Tax Type</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateCustomTaxes (Guid? companyId, string taxType, CustomTaxTypeRate body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyTaxRatesApi : ICompanyTaxRatesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyTaxRatesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyTaxRatesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyTaxRatesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyTaxRatesApi(String basePath)
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
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param> 
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param> 
        /// <param name="xPaginationSort"></param> 
        /// <returns>List&lt;CustomTaxTypeRate&gt;</returns>            
        public List<CustomTaxTypeRate> CompaniesCompanyIdTaxratesGet (Guid? companyId, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdTaxratesGet");
            
    
            var path = "/companies/{companyId}/taxrates";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdTaxratesGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdTaxratesGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<CustomTaxTypeRate>) ApiClient.Deserialize(response.Content, typeof(List<CustomTaxTypeRate>), response.Headers);
        }
    
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="taxType">Tax Type</param> 
        /// <returns>CustomTaxTypeRate</returns>            
        public CustomTaxTypeRate CompaniesCompanyIdTaxratesTaxTypeGet (Guid? companyId, string taxType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdTaxratesTaxTypeGet");
            
            // verify the required parameter 'taxType' is set
            if (taxType == null) throw new ApiException(400, "Missing required parameter 'taxType' when calling CompaniesCompanyIdTaxratesTaxTypeGet");
            
    
            var path = "/companies/{companyId}/taxrates/{taxType}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "taxType" + "}", ApiClient.ParameterToString(taxType));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdTaxratesTaxTypeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdTaxratesTaxTypeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (CustomTaxTypeRate) ApiClient.Deserialize(response.Content, typeof(CustomTaxTypeRate), response.Headers);
        }
    
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateCustomTaxes (Guid? companyId, CustomTaxTypeRate body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateCustomTaxes");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateCustomTaxes");
            
    
            var path = "/companies/{companyId}/taxrates";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCustomTaxes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateCustomTaxes: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="taxType">Tax Type</param> 
        /// <returns></returns>            
        public void DeleteCustomTaxes (Guid? companyId, string taxType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteCustomTaxes");
            
            // verify the required parameter 'taxType' is set
            if (taxType == null) throw new ApiException(400, "Missing required parameter 'taxType' when calling DeleteCustomTaxes");
            
    
            var path = "/companies/{companyId}/taxrates/{taxType}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "taxType" + "}", ApiClient.ParameterToString(taxType));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCustomTaxes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteCustomTaxes: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="taxType">Tax Type</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateCustomTaxes (Guid? companyId, string taxType, CustomTaxTypeRate body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateCustomTaxes");
            
            // verify the required parameter 'taxType' is set
            if (taxType == null) throw new ApiException(400, "Missing required parameter 'taxType' when calling UpdateCustomTaxes");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateCustomTaxes");
            
    
            var path = "/companies/{companyId}/taxrates/{taxType}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "taxType" + "}", ApiClient.ParameterToString(taxType));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCustomTaxes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateCustomTaxes: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
