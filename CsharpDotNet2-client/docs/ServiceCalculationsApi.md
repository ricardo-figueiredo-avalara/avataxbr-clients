# IO.Swagger..ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodetransactionspost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**CalculationsservicePaymentPost**](ServiceCalculationsApi.md#calculationsservicepaymentpost) | **POST** /calculations?service-payment | Calculation Method
[**CalculationsservicePurchasePost**](ServiceCalculationsApi.md#calculationsservicepurchasepost) | **POST** /calculations?service-purchase | Calculation Method
[**CalculationsserviceReceiptPost**](ServiceCalculationsApi.md#calculationsservicereceiptpost) | **POST** /calculations?service-receipt | Calculation Method
[**CalculationsserviceSalesPost**](ServiceCalculationsApi.md#calculationsservicesalespost) | **POST** /calculations?service-sales | Calculation Method


<a name="calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget"></a>
# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)

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
    public class CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)
            var documentCode = documentCode_example;  // string | Document Code

            try
            {
                // Retrieve transactions
                apiInstance.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: " + e.Message );
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

<a name="calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodetransactionspost"></a>
# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
> void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost (string authorization, Guid? accountId, string companyCode, string transactionType, string documentCode)

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)
            var documentCode = documentCode_example;  // string | Document Code

            try
            {
                // Promote a calculation to transaction
                apiInstance.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost: " + e.Message );
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

<a name="calculationsaccountaccountidcompanycompanycodetransactiontypeget"></a>
# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> void CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet (string authorization, Guid? accountId, string companyCode, string transactionType)

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
    public class CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGetExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var accountId = accountId_example;  // Guid? | Account ID
            var companyCode = companyCode_example;  // string | Company Code
            var transactionType = transactionType_example;  // string | Transaction Type (sale, purchase, receipts or payment)

            try
            {
                // Retrieve transactions
                apiInstance.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: " + e.Message );
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

<a name="calculationsservicepaymentpost"></a>
# **CalculationsservicePaymentPost**
> PaymentTransactionOut CalculationsservicePaymentPost (string authorization, PaymentTransactionIn body)

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
    public class CalculationsservicePaymentPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                PaymentTransactionOut result = apiInstance.CalculationsservicePaymentPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsservicePaymentPost: " + e.Message );
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

<a name="calculationsservicepurchasepost"></a>
# **CalculationsservicePurchasePost**
> PurchaseTransactionOut CalculationsservicePurchasePost (string authorization, PurchaseTransactionIn body)

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
    public class CalculationsservicePurchasePostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                PurchaseTransactionOut result = apiInstance.CalculationsservicePurchasePost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsservicePurchasePost: " + e.Message );
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

<a name="calculationsservicereceiptpost"></a>
# **CalculationsserviceReceiptPost**
> ReceiptTransactionOut CalculationsserviceReceiptPost (string authorization, ReceiptTransactionIn body)

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
    public class CalculationsserviceReceiptPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                ReceiptTransactionOut result = apiInstance.CalculationsserviceReceiptPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsserviceReceiptPost: " + e.Message );
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

<a name="calculationsservicesalespost"></a>
# **CalculationsserviceSalesPost**
> SalesTransactionOut CalculationsserviceSalesPost (string authorization, SalesTransactionIn body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CalculationsserviceSalesPostExample
    {
        public void main()
        {
            
            var apiInstance = new ServiceCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new SalesTransactionIn(); // SalesTransactionIn | Transaction Message

            try
            {
                // Calculation Method
                SalesTransactionOut result = apiInstance.CalculationsserviceSalesPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ServiceCalculationsApi.CalculationsserviceSalesPost: " + e.Message );
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

