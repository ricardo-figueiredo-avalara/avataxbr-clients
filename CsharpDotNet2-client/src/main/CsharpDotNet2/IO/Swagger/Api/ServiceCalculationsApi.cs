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
    public interface IServiceCalculationsApi
    {
        /// <summary>
        /// Retrieve transactions Retrieve a single transaction
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="accountId">Account ID</param>
        /// <param name="companyCode">Company Code</param>
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode);
        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="accountId">Account ID</param>
        /// <param name="companyCode">Company Code</param>
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode);
        /// <summary>
        /// Retrieve transactions Retrieve a list of transactions
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="accountId">Account ID</param>
        /// <param name="companyCode">Company Code</param>
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns></returns>
        void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        PaymentTransactionOut CalculationsservicePaymentPost (string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        PurchaseTransactionOut CalculationsservicePurchasePost (string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        ReceiptTransactionOut CalculationsserviceReceiptPost (string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        SalesTransactionOut CalculationsserviceSalesPost (string authorization, SalesTransactionIn body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ServiceCalculationsApi : IServiceCalculationsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceCalculationsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ServiceCalculationsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceCalculationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ServiceCalculationsApi(String basePath)
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
        /// Retrieve transactions Retrieve a single transaction
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="accountId">Account ID</param> 
        /// <param name="companyCode">Company Code</param> 
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param> 
        /// <param name="documentCode">Document Code</param> 
        /// <returns></returns>            
        public void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'documentCode' is set
            if (documentCode == null) throw new ApiException(400, "Missing required parameter 'documentCode' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
    
            var path = "/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "accountId" + "}", ApiClient.ParameterToString(accountId));
path = path.Replace("{" + "companyCode" + "}", ApiClient.ParameterToString(companyCode));
path = path.Replace("{" + "transactionType" + "}", ApiClient.ParameterToString(transactionType));
path = path.Replace("{" + "documentCode" + "}", ApiClient.ParameterToString(documentCode));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="accountId">Account ID</param> 
        /// <param name="companyCode">Company Code</param> 
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param> 
        /// <param name="documentCode">Document Code</param> 
        /// <returns></returns>            
        public void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
            
            // verify the required parameter 'documentCode' is set
            if (documentCode == null) throw new ApiException(400, "Missing required parameter 'documentCode' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
            
    
            var path = "/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "accountId" + "}", ApiClient.ParameterToString(accountId));
path = path.Replace("{" + "companyCode" + "}", ApiClient.ParameterToString(companyCode));
path = path.Replace("{" + "transactionType" + "}", ApiClient.ParameterToString(transactionType));
path = path.Replace("{" + "documentCode" + "}", ApiClient.ParameterToString(documentCode));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Retrieve transactions Retrieve a list of transactions
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="accountId">Account ID</param> 
        /// <param name="companyCode">Company Code</param> 
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param> 
        /// <returns></returns>            
        public void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
    
            var path = "/calculations/account/{accountId}/company/{companyCode}/{transactionType}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "accountId" + "}", ApiClient.ParameterToString(accountId));
path = path.Replace("{" + "companyCode" + "}", ApiClient.ParameterToString(companyCode));
path = path.Replace("{" + "transactionType" + "}", ApiClient.ParameterToString(transactionType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>PaymentTransactionOut</returns>            
        public PaymentTransactionOut CalculationsservicePaymentPost (string authorization, PaymentTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsservicePaymentPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CalculationsservicePaymentPost");
            
    
            var path = "/calculations?service-payment";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsservicePaymentPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsservicePaymentPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PaymentTransactionOut) ApiClient.Deserialize(response.Content, typeof(PaymentTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>PurchaseTransactionOut</returns>            
        public PurchaseTransactionOut CalculationsservicePurchasePost (string authorization, PurchaseTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsservicePurchasePost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CalculationsservicePurchasePost");
            
    
            var path = "/calculations?service-purchase";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsservicePurchasePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsservicePurchasePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PurchaseTransactionOut) ApiClient.Deserialize(response.Content, typeof(PurchaseTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>ReceiptTransactionOut</returns>            
        public ReceiptTransactionOut CalculationsserviceReceiptPost (string authorization, ReceiptTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsserviceReceiptPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CalculationsserviceReceiptPost");
            
    
            var path = "/calculations?service-receipt";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsserviceReceiptPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsserviceReceiptPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ReceiptTransactionOut) ApiClient.Deserialize(response.Content, typeof(ReceiptTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>SalesTransactionOut</returns>            
        public SalesTransactionOut CalculationsserviceSalesPost (string authorization, SalesTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CalculationsserviceSalesPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CalculationsserviceSalesPost");
            
    
            var path = "/calculations?service-sales";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsserviceSalesPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CalculationsserviceSalesPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SalesTransactionOut) ApiClient.Deserialize(response.Content, typeof(SalesTransactionOut), response.Headers);
        }
    
    }
}
