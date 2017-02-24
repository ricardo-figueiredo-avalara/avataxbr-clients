# WWW::SwaggerClient::ServiceCalculationsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ServiceCalculationsApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculations_account_account_id_company_company_code_transaction_type_document_code_get**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculations_account_account_id_company_company_code_transaction_type_get**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservice_payment_post**](ServiceCalculationsApi.md#calculationsservice_payment_post) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservice_purchase_post**](ServiceCalculationsApi.md#calculationsservice_purchase_post) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsservice_receipt_post**](ServiceCalculationsApi.md#calculationsservice_receipt_post) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsservice_sales_post**](ServiceCalculationsApi.md#calculationsservice_sales_post) | **POST** /calculations?service-sales | Calculation Method


# **calculations_account_account_id_company_company_code_transaction_type_document_code_get**
> calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code)

Retrieve transactions

Retrieve a single transaction

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)
my $document_code = 'document_code_example'; # string | Document Code

eval { 
    $api_instance->calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **account_id** | **UUID**| Account ID | 
 **company_code** | **string**| Company Code | 
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **string**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**
> calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code)

Promote a calculation to transaction

Promote a calculation to transaction

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)
my $document_code = 'document_code_example'; # string | Document Code

eval { 
    $api_instance->calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **account_id** | **UUID**| Account ID | 
 **company_code** | **string**| Company Code | 
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **string**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculations_account_account_id_company_company_code_transaction_type_get**
> calculations_account_account_id_company_company_code_transaction_type_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)

eval { 
    $api_instance->calculations_account_account_id_company_company_code_transaction_type_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **account_id** | **UUID**| Account ID | 
 **company_code** | **string**| Company Code | 
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsservice_payment_post**
> PaymentTransactionOut calculationsservice_payment_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::PaymentTransactionIn->new(); # PaymentTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsservice_payment_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculationsservice_payment_post: $@\n";
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

# **calculationsservice_purchase_post**
> PurchaseTransactionOut calculationsservice_purchase_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::PurchaseTransactionIn->new(); # PurchaseTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsservice_purchase_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculationsservice_purchase_post: $@\n";
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

# **calculationsservice_receipt_post**
> ReceiptTransactionOut calculationsservice_receipt_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::ReceiptTransactionIn->new(); # ReceiptTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsservice_receipt_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculationsservice_receipt_post: $@\n";
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

# **calculationsservice_sales_post**
> SalesTransactionOut calculationsservice_sales_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceCalculationsApi;

my $api_instance = WWW::SwaggerClient::ServiceCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::SalesTransactionIn->new(); # SalesTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsservice_sales_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceCalculationsApi->calculationsservice_sales_post: $@\n";
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

