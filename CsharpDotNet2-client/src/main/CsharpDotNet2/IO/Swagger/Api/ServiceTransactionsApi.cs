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
    public interface IServiceTransactionsApi
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
        void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode);
        /// <summary>
        /// Transaction State Transition Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="accountId">Account ID</param>
        /// <param name="companyCode">Company Code</param>
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <param name="documentCode">Document Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode, StateTransition body);
        /// <summary>
        /// Retrieve transactions Retrieve a list of transactions
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="accountId">Account ID</param>
        /// <param name="companyCode">Company Code</param>
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns></returns>
        void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        PaymentTransactionOut TransactionsservicePaymentPost (string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        PurchaseTransactionOut TransactionsservicePurchasePost (string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        ReceiptTransactionOut TransactionsserviceReceiptPost (string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        SalesTransactionOut TransactionsserviceSalesPost (string authorization, SalesTransactionIn body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ServiceTransactionsApi : IServiceTransactionsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceTransactionsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ServiceTransactionsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceTransactionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ServiceTransactionsApi(String basePath)
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
        public void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
            // verify the required parameter 'documentCode' is set
            if (documentCode == null) throw new ApiException(400, "Missing required parameter 'documentCode' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
            
    
            var path = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Transaction State Transition Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="accountId">Account ID</param> 
        /// <param name="companyCode">Company Code</param> 
        /// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param> 
        /// <param name="documentCode">Document Code</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns></returns>            
        public void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode, StateTransition body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
            // verify the required parameter 'documentCode' is set
            if (documentCode == null) throw new ApiException(400, "Missing required parameter 'documentCode' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
            
    
            var path = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions";
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
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost: " + response.ErrorMessage, response.ErrorMessage);
    
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
        public void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'accountId' is set
            if (accountId == null) throw new ApiException(400, "Missing required parameter 'accountId' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'companyCode' is set
            if (companyCode == null) throw new ApiException(400, "Missing required parameter 'companyCode' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
            // verify the required parameter 'transactionType' is set
            if (transactionType == null) throw new ApiException(400, "Missing required parameter 'transactionType' when calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
            
    
            var path = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>PaymentTransactionOut</returns>            
        public PaymentTransactionOut TransactionsservicePaymentPost (string authorization, PaymentTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsservicePaymentPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TransactionsservicePaymentPost");
            
    
            var path = "/transactions?service-payment";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsservicePaymentPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsservicePaymentPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PaymentTransactionOut) ApiClient.Deserialize(response.Content, typeof(PaymentTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>PurchaseTransactionOut</returns>            
        public PurchaseTransactionOut TransactionsservicePurchasePost (string authorization, PurchaseTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsservicePurchasePost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TransactionsservicePurchasePost");
            
    
            var path = "/transactions?service-purchase";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsservicePurchasePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsservicePurchasePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PurchaseTransactionOut) ApiClient.Deserialize(response.Content, typeof(PurchaseTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>ReceiptTransactionOut</returns>            
        public ReceiptTransactionOut TransactionsserviceReceiptPost (string authorization, ReceiptTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsserviceReceiptPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TransactionsserviceReceiptPost");
            
    
            var path = "/transactions?service-receipt";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsserviceReceiptPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsserviceReceiptPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ReceiptTransactionOut) ApiClient.Deserialize(response.Content, typeof(ReceiptTransactionOut), response.Headers);
        }
    
        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <param name="authorization">Bearer {auth}</param> 
        /// <param name="body">Transaction Message</param> 
        /// <returns>SalesTransactionOut</returns>            
        public SalesTransactionOut TransactionsserviceSalesPost (string authorization, SalesTransactionIn body)
        {
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling TransactionsserviceSalesPost");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TransactionsserviceSalesPost");
            
    
            var path = "/transactions?service-sales";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsserviceSalesPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TransactionsserviceSalesPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SalesTransactionOut) ApiClient.Deserialize(response.Content, typeof(SalesTransactionOut), response.Headers);
        }
    
    }
}
