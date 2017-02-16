# WWW::SwaggerClient::ServiceTransactionsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ServiceTransactionsApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactions_account_account_id_company_company_code_transaction_type_document_code_get**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactions_account_account_id_company_company_code_transaction_type_get**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**transactionsservice_payment_post**](ServiceTransactionsApi.md#transactionsservice_payment_post) | **POST** /transactions?service-payment | Calculation Method
[**transactionsservice_purchase_post**](ServiceTransactionsApi.md#transactionsservice_purchase_post) | **POST** /transactions?service-purchase | Calculation Method
[**transactionsservice_receipt_post**](ServiceTransactionsApi.md#transactionsservice_receipt_post) | **POST** /transactions?service-receipt | Calculation Method
[**transactionsservice_sales_post**](ServiceTransactionsApi.md#transactionsservice_sales_post) | **POST** /transactions?service-sales | Calculation Method


# **transactions_account_account_id_company_company_code_transaction_type_document_code_get**
> transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code)

Retrieve transactions

Retrieve a single transaction

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)
my $document_code = 'document_code_example'; # string | Document Code

eval { 
    $api_instance->transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_get: $@\n";
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

# **transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**
> transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code, body => $body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)
my $document_code = 'document_code_example'; # string | Document Code
my $body = WWW::SwaggerClient::Object::StateTransition->new(); # StateTransition | Transaction Message

eval { 
    $api_instance->transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code, body => $body);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post: $@\n";
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
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactions_account_account_id_company_company_code_transaction_type_get**
> transactions_account_account_id_company_company_code_transaction_type_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_code = 'company_code_example'; # string | Company Code
my $transaction_type = 'transaction_type_example'; # string | Transaction Type (sale, purchase, receipts or payment)

eval { 
    $api_instance->transactions_account_account_id_company_company_code_transaction_type_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_get: $@\n";
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

# **transactionsservice_payment_post**
> PaymentTransactionOut transactionsservice_payment_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::PaymentTransactionIn->new(); # PaymentTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsservice_payment_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactionsservice_payment_post: $@\n";
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

# **transactionsservice_purchase_post**
> PurchaseTransactionOut transactionsservice_purchase_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::PurchaseTransactionIn->new(); # PurchaseTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsservice_purchase_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactionsservice_purchase_post: $@\n";
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

# **transactionsservice_receipt_post**
> ReceiptTransactionOut transactionsservice_receipt_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::ReceiptTransactionIn->new(); # ReceiptTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsservice_receipt_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactionsservice_receipt_post: $@\n";
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

# **transactionsservice_sales_post**
> SalesTransactionOut transactionsservice_sales_post(authorization => $authorization, body => $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::ServiceTransactionsApi;

my $api_instance = WWW::SwaggerClient::ServiceTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::SalesTransactionIn->new(); # SalesTransactionIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsservice_sales_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServiceTransactionsApi->transactionsservice_sales_post: $@\n";
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

