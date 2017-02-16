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
    public interface ICompanyFilesApi
    {
        /// <summary>
        ///  Deletes a company file store.  
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="companyId2">Company ID</param>
        /// <returns></returns>
        void CompaniesCompanyIdNfseCertificateDelete (Guid? companyId, Guid? companyId2);
        /// <summary>
        ///  Gets an existing NFSe certificate file for this company. 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="companyId2">Company ID</param>
        /// <param name="peek">Use this parameter to check the existence of the file without downloading it.</param>
        /// <returns></returns>
        void CompaniesCompanyIdNfseCertificateGet (Guid? companyId, Guid? companyId2, double? peek);
        /// <summary>
        ///  If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="body">Content</param>
        /// <returns>InlineResponse2002</returns>
        InlineResponse2002 CompaniesCompanyIdNfseCertificatePost (Guid? companyId, Body3 body);
        /// <summary>
        ///  Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 
        /// </summary>
        /// <param name="companyId">Company ID</param>
        /// <param name="companyId2">Company ID</param>
        /// <param name="body">Content</param>
        /// <returns>InlineResponse2002</returns>
        InlineResponse2002 CompaniesCompanyIdNfseCertificatePut (Guid? companyId, Guid? companyId2, Body2 body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CompanyFilesApi : ICompanyFilesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyFilesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CompanyFilesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyFilesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CompanyFilesApi(String basePath)
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
        ///  Deletes a company file store.  
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="companyId2">Company ID</param> 
        /// <returns></returns>            
        public void CompaniesCompanyIdNfseCertificateDelete (Guid? companyId, Guid? companyId2)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdNfseCertificateDelete");
            
            // verify the required parameter 'companyId2' is set
            if (companyId2 == null) throw new ApiException(400, "Missing required parameter 'companyId2' when calling CompaniesCompanyIdNfseCertificateDelete");
            
    
            var path = "/companies/{companyId}/nfse-certificate";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId2));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificateDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificateDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  Gets an existing NFSe certificate file for this company. 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="companyId2">Company ID</param> 
        /// <param name="peek">Use this parameter to check the existence of the file without downloading it.</param> 
        /// <returns></returns>            
        public void CompaniesCompanyIdNfseCertificateGet (Guid? companyId, Guid? companyId2, double? peek)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdNfseCertificateGet");
            
            // verify the required parameter 'companyId2' is set
            if (companyId2 == null) throw new ApiException(400, "Missing required parameter 'companyId2' when calling CompaniesCompanyIdNfseCertificateGet");
            
    
            var path = "/companies/{companyId}/nfse-certificate";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId2));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (peek != null) queryParams.Add("peek", ApiClient.ParameterToString(peek)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificateGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificateGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="body">Content</param> 
        /// <returns>InlineResponse2002</returns>            
        public InlineResponse2002 CompaniesCompanyIdNfseCertificatePost (Guid? companyId, Body3 body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdNfseCertificatePost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CompaniesCompanyIdNfseCertificatePost");
            
    
            var path = "/companies/{companyId}/nfse-certificate";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificatePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificatePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2002) ApiClient.Deserialize(response.Content, typeof(InlineResponse2002), response.Headers);
        }
    
        /// <summary>
        ///  Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 
        /// </summary>
        /// <param name="companyId">Company ID</param> 
        /// <param name="companyId2">Company ID</param> 
        /// <param name="body">Content</param> 
        /// <returns>InlineResponse2002</returns>            
        public InlineResponse2002 CompaniesCompanyIdNfseCertificatePut (Guid? companyId, Guid? companyId2, Body2 body)
        {
            
            // verify the required parameter 'companyId' is set
            if (companyId == null) throw new ApiException(400, "Missing required parameter 'companyId' when calling CompaniesCompanyIdNfseCertificatePut");
            
            // verify the required parameter 'companyId2' is set
            if (companyId2 == null) throw new ApiException(400, "Missing required parameter 'companyId2' when calling CompaniesCompanyIdNfseCertificatePut");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CompaniesCompanyIdNfseCertificatePut");
            
    
            var path = "/companies/{companyId}/nfse-certificate";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId));
path = path.Replace("{" + "companyId" + "}", ApiClient.ParameterToString(companyId2));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificatePut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CompaniesCompanyIdNfseCertificatePut: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2002) ApiClient.Deserialize(response.Content, typeof(InlineResponse2002), response.Headers);
        }
    
    }
}
