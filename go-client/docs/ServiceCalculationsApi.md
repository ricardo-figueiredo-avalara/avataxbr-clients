# \ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceCalculationsApi.md#CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **Get** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](ServiceCalculationsApi.md#CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost) | **Post** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceCalculationsApi.md#CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **Get** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**CalculationsservicePaymentPost**](ServiceCalculationsApi.md#CalculationsservicePaymentPost) | **Post** /calculations?service-payment | Calculation Method
[**CalculationsservicePurchasePost**](ServiceCalculationsApi.md#CalculationsservicePurchasePost) | **Post** /calculations?service-purchase | Calculation Method
[**CalculationsserviceReceiptPost**](ServiceCalculationsApi.md#CalculationsserviceReceiptPost) | **Post** /calculations?service-receipt | Calculation Method
[**CalculationsserviceSalesPost**](ServiceCalculationsApi.md#CalculationsserviceSalesPost) | **Post** /calculations?service-sales | Calculation Method


# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet($authorization, $accountId, $companyCode, $transactionType, $documentCode)

Retrieve transactions

Retrieve a single transaction


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **string**| Account ID | 
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

# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
> CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost($authorization, $accountId, $companyCode, $transactionType, $documentCode)

Promote a calculation to transaction

Promote a calculation to transaction


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **string**| Account ID | 
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

# **CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet($authorization, $accountId, $companyCode, $transactionType)

Retrieve transactions

Retrieve a list of transactions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **accountId** | **string**| Account ID | 
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

# **CalculationsservicePaymentPost**
> PaymentTransactionOut CalculationsservicePaymentPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.


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

# **CalculationsservicePurchasePost**
> PurchaseTransactionOut CalculationsservicePurchasePost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.


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

# **CalculationsserviceReceiptPost**
> ReceiptTransactionOut CalculationsserviceReceiptPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.


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

# **CalculationsserviceSalesPost**
> SalesTransactionOut CalculationsserviceSalesPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.


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

