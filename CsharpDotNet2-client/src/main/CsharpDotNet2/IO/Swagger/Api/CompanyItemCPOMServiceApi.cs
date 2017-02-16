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
    public interface ICompanyItemCPOMServiceApi
    {
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="cityCode">City Code</param>
        /// <returns>ItemCpom</returns>
        ItemCpom CompaniesCompanyIdItemsCodeCpomCityCodeGet (Guid? companyId, string code, double? cityCode);
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param>
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param>
        /// <param name="xPaginationSort"></param>
        /// <returns>List&lt;ItemCpom&gt;</returns>
        List<ItemCpom> CompaniesCompanyIdItemsCodeCpomGet (Guid? companyId, string code, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort);
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateItemCPOM (Guid? companyId, string code, ItemCpom body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="cityCode">City Code</param>
        /// <returns></returns>
        void DeleteItemCPOM (Guid? companyId, string code, double? cityCode);
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="cityCode">City Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateItemCPOM (Guid? companyId, string code, double? cityCode, ItemCpom body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyItemCPOMServiceApi : ICompanyItemCPOMServiceApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemCPOMServiceApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyItemCPOMServiceApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemCPOMServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyItemCPOMServiceApi(String basePath)
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
        /// <param name="code">Item Code</param> 
        /// <param name="cityCode">City Code</param> 
        /// <returns>ItemCpom</returns>            
        public ItemCpom CompaniesCompanyIdItemsCodeCpomCityCodeGet (Guid? companyId, string code, double? cityCode)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsCodeCpomCityCodeGet");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdItemsCodeCpomCityCodeGet");
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling CompaniesCompanyIdItemsCodeCpomCityCodeGet");
            
    
            var path = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
path = path.Replace("{" + "cityCode" + "}", ApiClient.ParameterToString(cityCode));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeCpomCityCodeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeCpomCityCodeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ItemCpom) ApiClient.Deserialize(response.Content, typeof(ItemCpom), response.Headers);
        }
    
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param> 
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param> 
        /// <param name="xPaginationSort"></param> 
        /// <returns>List&lt;ItemCpom&gt;</returns>            
        public List<ItemCpom> CompaniesCompanyIdItemsCodeCpomGet (Guid? companyId, string code, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsCodeCpomGet");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdItemsCodeCpomGet");
            
    
            var path = "/companies/{companyId}/items/{code}/cpom";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeCpomGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeCpomGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ItemCpom>) ApiClient.Deserialize(response.Content, typeof(List<ItemCpom>), response.Headers);
        }
    
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateItemCPOM (Guid? companyId, string code, ItemCpom body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateItemCPOM");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CreateItemCPOM");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateItemCPOM");
            
    
            var path = "/companies/{companyId}/items/{code}/cpom";
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItemCPOM: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItemCPOM: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="cityCode">City Code</param> 
        /// <returns></returns>            
        public void DeleteItemCPOM (Guid? companyId, string code, double? cityCode)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteItemCPOM");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteItemCPOM");
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling DeleteItemCPOM");
            
    
            var path = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItemCPOM: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItemCPOM: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="cityCode">City Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateItemCPOM (Guid? companyId, string code, double? cityCode, ItemCpom body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateItemCPOM");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateItemCPOM");
            
            // verify the required parameter 'cityCode' is set
            if (cityCode == null) throw new ApiException(400, "Missing required parameter 'cityCode' when calling UpdateItemCPOM");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateItemCPOM");
            
    
            var path = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
path = path.Replace("{" + "cityCode" + "}", ApiClient.ParameterToString(cityCode));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItemCPOM: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItemCPOM: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
