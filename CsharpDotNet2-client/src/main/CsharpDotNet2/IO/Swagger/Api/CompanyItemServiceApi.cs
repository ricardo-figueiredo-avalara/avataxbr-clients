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
    public interface ICompanyItemServiceApi
    {
        /// <summary>
        ///  Change the code of a given item. 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="body">Requisition</param>
        /// <param name="goods">Provide to apply to goods items.</param>
        /// <param name="service">Provide to apply to service items.</param>
        /// <returns></returns>
        void CompaniesCompanyIdItemsCodeChangeCodePut (Guid? companyId, string code, Body1 body, string goods, string service);
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <param name="agast">Custom Agast Code</param>
        /// <returns>ItemSimple</returns>
        ItemSimple CompaniesCompanyIdItemsCodeserviceGet (Guid? companyId, string code, string avalaraProductType, string agast);
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param>
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param>
        /// <param name="xPaginationSort"></param>
        /// <param name="code">Item Code</param>
        /// <param name="agast">Custom Agast Code</param>
        /// <returns>List&lt;ItemSimple&gt;</returns>
        List<ItemSimple> CompaniesCompanyIdItemsserviceGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast);
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="body">Transaction Message</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateItemService (Guid? companyId, ItemSimple body, string avalaraProductType);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <returns></returns>
        void DeleteItemService (Guid? companyId, string code, string avalaraProductType);
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="body">Transaction Message</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <returns></returns>
        void UpdateItemService (Guid? companyId, string code, ItemSimple body, string avalaraProductType);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyItemServiceApi : ICompanyItemServiceApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemServiceApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyItemServiceApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyItemServiceApi(String basePath)
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
        ///  Change the code of a given item. 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="body">Requisition</param> 
        /// <param name="goods">Provide to apply to goods items.</param> 
        /// <param name="service">Provide to apply to service items.</param> 
        /// <returns></returns>            
        public void CompaniesCompanyIdItemsCodeChangeCodePut (Guid? companyId, string code, Body1 body, string goods, string service)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsCodeChangeCodePut");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdItemsCodeChangeCodePut");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CompaniesCompanyIdItemsCodeChangeCodePut");
            
    
            var path = "/companies/{companyId}/items/{code}/change-code";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (goods != null) queryParams.Add("goods", ApiClient.ParameterToString(goods)); // query parameter
 if (service != null) queryParams.Add("service", ApiClient.ParameterToString(service)); // query parameter
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeChangeCodePut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeChangeCodePut: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <param name="agast">Custom Agast Code</param> 
        /// <returns>ItemSimple</returns>            
        public ItemSimple CompaniesCompanyIdItemsCodeserviceGet (Guid? companyId, string code, string avalaraProductType, string agast)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsCodeserviceGet");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdItemsCodeserviceGet");
            
    
            var path = "/companies/{companyId}/items/{code}?service";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (agast != null) queryParams.Add("agast", ApiClient.ParameterToString(agast)); // query parameter
             if (avalaraProductType != null) headerParams.Add("Avalara-Product-Type", ApiClient.ParameterToString(avalaraProductType)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeserviceGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodeserviceGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ItemSimple) ApiClient.Deserialize(response.Content, typeof(ItemSimple), response.Headers);
        }
    
        /// <summary>
        ///  This operation return custom agast configurations that match with parameters queries 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100).</param> 
        /// <param name="xPaginationCurrentPage">The current page. Defaults to 1.</param> 
        /// <param name="xPaginationSort"></param> 
        /// <param name="code">Item Code</param> 
        /// <param name="agast">Custom Agast Code</param> 
        /// <returns>List&lt;ItemSimple&gt;</returns>            
        public List<ItemSimple> CompaniesCompanyIdItemsserviceGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsserviceGet");
            
    
            var path = "/companies/{companyId}/items?service";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (code != null) queryParams.Add("code", ApiClient.ParameterToString(code)); // query parameter
 if (agast != null) queryParams.Add("agast", ApiClient.ParameterToString(agast)); // query parameter
             if (avalaraProductType != null) headerParams.Add("Avalara-Product-Type", ApiClient.ParameterToString(avalaraProductType)); // header parameter
 if (xPaginationLimit != null) headerParams.Add("X-Pagination-Limit", ApiClient.ParameterToString(xPaginationLimit)); // header parameter
 if (xPaginationCurrentPage != null) headerParams.Add("X-Pagination-Current-Page", ApiClient.ParameterToString(xPaginationCurrentPage)); // header parameter
 if (xPaginationSort != null) headerParams.Add("X-Pagination-Sort", ApiClient.ParameterToString(xPaginationSort)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsserviceGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsserviceGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ItemSimple>) ApiClient.Deserialize(response.Content, typeof(List<ItemSimple>), response.Headers);
        }
    
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="body">Transaction Message</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateItemService (Guid? companyId, ItemSimple body, string avalaraProductType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateItemService");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateItemService");
            
    
            var path = "/companies/{companyId}/items?service";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (avalaraProductType != null) headerParams.Add("Avalara-Product-Type", ApiClient.ParameterToString(avalaraProductType)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItemService: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItemService: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <returns></returns>            
        public void DeleteItemService (Guid? companyId, string code, string avalaraProductType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteItemService");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteItemService");
            
    
            var path = "/companies/{companyId}/items/{code}?service";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (avalaraProductType != null) headerParams.Add("Avalara-Product-Type", ApiClient.ParameterToString(avalaraProductType)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItemService: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItemService: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <returns></returns>            
        public void UpdateItemService (Guid? companyId, string code, ItemSimple body, string avalaraProductType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateItemService");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateItemService");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateItemService");
            
    
            var path = "/companies/{companyId}/items/{code}?service";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (avalaraProductType != null) headerParams.Add("Avalara-Product-Type", ApiClient.ParameterToString(avalaraProductType)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItemService: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItemService: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}