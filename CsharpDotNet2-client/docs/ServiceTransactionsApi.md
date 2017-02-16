# IO.Swagger..ServiceTransactionsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodestatetransitionspost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**TransactionsservicePaymentPost**](ServiceTransactionsApi.md#transactionsservicepaymentpost) | **POST** /transactions?service-payment | Calculation Method
[**TransactionsservicePurchasePost**](ServiceTransactionsApi.md#transactionsservicepurchasepost) | **POST** /transactions?service-purchase | Calculation Method
[**TransactionsserviceReceiptPost**](ServiceTransactionsApi.md#transactionsservicereceiptpost) | **POST** /transactions?service-receipt | Calculation Method
[**TransactionsserviceSalesPost**](ServiceTransactionsApi.md#transactionsservicesalespost) | **POST** /transactions?service-sales | Calculation Method


<a name="transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget"></a>
# **TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)

Retrieve transactions

Retrieve a single transaction

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)
            var documentCode = documentCode_example;  // string | Document Code

            try
            {
                // Retrieve transactions
                apiInstance.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **Guid?**| Account ID | 
 **companyCode** | **string**| Company Code | 
 **transactionType** | **string**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **string**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodestatetransitionspost"></a>
# **TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**
> void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode, StateTransition body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)
            var documentCode = documentCode_example;  // string | Document Code
            var body = new StateTransition(); // StateTransition | Transaction Message

            try
            {
                // Transaction State Transition
                apiInstance.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost(authorization, accountId, companyCode, transactionType, documentCode, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **Guid?**| Account ID | 
 **companyCode** | **string**| Company Code | 
 **transactionType** | **string**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **string**| Document Code | 
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsaccountaccountidcompanycompanycodetransactiontypeget"></a>
# **TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> void TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType)

Retrieve transactions

Retrieve a list of transactions

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGetExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)

            try
            {
                // Retrieve transactions
                apiInstance.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **Guid?**| Account ID | 
 **companyCode** | **string**| Company Code | 
 **transactionType** | **string**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsservicepaymentpost"></a>
# **TransactionsservicePaymentPost**
> PaymentTransactionOut TransactionsservicePaymentPost (string authorization, PaymentTransactionIn body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsservicePaymentPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                PaymentTransactionOut result = apiInstance.TransactionsservicePaymentPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsservicePaymentPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsservicepurchasepost"></a>
# **TransactionsservicePurchasePost**
> PurchaseTransactionOut TransactionsservicePurchasePost (string authorization, PurchaseTransactionIn body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsservicePurchasePostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                PurchaseTransactionOut result = apiInstance.TransactionsservicePurchasePost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsservicePurchasePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsservicereceiptpost"></a>
# **TransactionsserviceReceiptPost**
> ReceiptTransactionOut TransactionsserviceReceiptPost (string authorization, ReceiptTransactionIn body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsserviceReceiptPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                ReceiptTransactionOut result = apiInstance.TransactionsserviceReceiptPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsserviceReceiptPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transactionsservicesalespost"></a>
# **TransactionsserviceSalesPost**
> SalesTransactionOut TransactionsserviceSalesPost (string authorization, SalesTransactionIn body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsserviceSalesPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new SalesTransactionIn(); // SalesTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                SalesTransactionOut result = apiInstance.TransactionsserviceSalesPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceTransactionsApi.TransactionsserviceSalesPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

