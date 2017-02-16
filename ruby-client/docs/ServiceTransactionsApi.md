# SwaggerClient::ServiceTransactionsApi

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
> transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code, )

Retrieve transactions

Retrieve a single transaction

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)

document_code = "document_code_example" # String | Document Code


begin
  #Retrieve transactions
  api_instance.transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **account_id** | **String**| Account ID | 
 **company_code** | **String**| Company Code | 
 **transaction_type** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **String**| Document Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**
> transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization, account_id, company_code, transaction_type, document_code, body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)

document_code = "document_code_example" # String | Document Code

body = SwaggerClient::StateTransition.new # StateTransition | Transaction Message


begin
  #Transaction State Transition
  api_instance.transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization, account_id, company_code, transaction_type, document_code, body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **account_id** | **String**| Account ID | 
 **company_code** | **String**| Company Code | 
 **transaction_type** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **String**| Document Code | 
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactions_account_account_id_company_company_code_transaction_type_get**
> transactions_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type, )

Retrieve transactions

Retrieve a list of transactions

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)


begin
  #Retrieve transactions
  api_instance.transactions_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **account_id** | **String**| Account ID | 
 **company_code** | **String**| Company Code | 
 **transaction_type** | **String**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactionsservice_payment_post**
> PaymentTransactionOut transactionsservice_payment_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::PaymentTransactionIn.new # PaymentTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.transactionsservice_payment_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactionsservice_payment_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactionsservice_purchase_post**
> PurchaseTransactionOut transactionsservice_purchase_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::PurchaseTransactionIn.new # PurchaseTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.transactionsservice_purchase_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactionsservice_purchase_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactionsservice_receipt_post**
> ReceiptTransactionOut transactionsservice_receipt_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::ReceiptTransactionIn.new # ReceiptTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.transactionsservice_receipt_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactionsservice_receipt_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactionsservice_sales_post**
> SalesTransactionOut transactionsservice_sales_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::SalesTransactionIn.new # SalesTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.transactionsservice_sales_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceTransactionsApi->transactionsservice_sales_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



