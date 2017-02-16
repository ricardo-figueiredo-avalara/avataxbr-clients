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
    public interface ICompanyItemGoodsApi
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
        /// <returns>ItemGoods</returns>
        ItemGoods CompaniesCompanyIdItemsCodegoodsGet (Guid? companyId, string code, string avalaraProductType, string agast);
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
        /// <returns>List&lt;ItemGoods&gt;</returns>
        List<ItemGoods> CompaniesCompanyIdItemsgoodsGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast);
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateItem (Guid? companyId, string avalaraProductType, ItemGoods body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <returns></returns>
        void DeleteItem (Guid? companyId, string code, string avalaraProductType);
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="code">Item Code</param>
        /// <param name="avalaraProductType">Avalara Product Type</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateItem (Guid? companyId, string code, string avalaraProductType, ItemGoods body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyItemGoodsApi : ICompanyItemGoodsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemGoodsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyItemGoodsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyItemGoodsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyItemGoodsApi(String basePath)
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
        /// <returns>ItemGoods</returns>            
        public ItemGoods CompaniesCompanyIdItemsCodegoodsGet (Guid? companyId, string code, string avalaraProductType, string agast)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsCodegoodsGet");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling CompaniesCompanyIdItemsCodegoodsGet");
            
            // verify the required parameter 'avalaraProductType' is set
            if (avalaraProductType == null) throw new ApiException(400, "Missing required parameter 'avalaraProductType' when calling CompaniesCompanyIdItemsCodegoodsGet");
            
    
            var path = "/companies/{companyId}/items/{code}?goods";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodegoodsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsCodegoodsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ItemGoods) ApiClient.Deserialize(response.Content, typeof(ItemGoods), response.Headers);
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
        /// <returns>List&lt;ItemGoods&gt;</returns>            
        public List<ItemGoods> CompaniesCompanyIdItemsgoodsGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdItemsgoodsGet");
            
            // verify the required parameter 'avalaraProductType' is set
            if (avalaraProductType == null) throw new ApiException(400, "Missing required parameter 'avalaraProductType' when calling CompaniesCompanyIdItemsgoodsGet");
            
    
            var path = "/companies/{companyId}/items?goods";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsgoodsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdItemsgoodsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ItemGoods>) ApiClient.Deserialize(response.Content, typeof(List<ItemGoods>), response.Headers);
        }
    
        /// <summary>
        /// Create custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>InlineResponse201</returns>            
        public InlineResponse201 CreateItem (Guid? companyId, string avalaraProductType, ItemGoods body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CreateItem");
            
            // verify the required parameter 'avalaraProductType' is set
            if (avalaraProductType == null) throw new ApiException(400, "Missing required parameter 'avalaraProductType' when calling CreateItem");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CreateItem");
            
    
            var path = "/companies/{companyId}/items?goods";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItem: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateItem: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse201) ApiClient.Deserialize(response.Content, typeof(InlineResponse201), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <returns></returns>            
        public void DeleteItem (Guid? companyId, string code, string avalaraProductType)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling DeleteItem");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling DeleteItem");
            
            // verify the required parameter 'avalaraProductType' is set
            if (avalaraProductType == null) throw new ApiException(400, "Missing required parameter 'avalaraProductType' when calling DeleteItem");
            
    
            var path = "/companies/{companyId}/items/{code}?goods";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItem: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteItem: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Update custom agast for one company This method operation create a custom agast for one company 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="code">Item Code</param> 
        /// <param name="avalaraProductType">Avalara Product Type</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void UpdateItem (Guid? companyId, string code, string avalaraProductType, ItemGoods body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling UpdateItem");
            
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling UpdateItem");
            
            // verify the required parameter 'avalaraProductType' is set
            if (avalaraProductType == null) throw new ApiException(400, "Missing required parameter 'avalaraProductType' when calling UpdateItem");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateItem");
            
    
            var path = "/companies/{companyId}/items/{code}?goods";
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
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItem: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateItem: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
