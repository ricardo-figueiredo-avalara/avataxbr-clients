# SwaggerClient::ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

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
> calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code, )

Retrieve transactions

Retrieve a single transaction

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)

document_code = "document_code_example" # String | Document Code


begin
  #Retrieve transactions
  api_instance.calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_get: #{e}"
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



# **calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**
> calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization, account_id, company_code, transaction_type, document_code, )

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)

document_code = "document_code_example" # String | Document Code


begin
  #Promote a calculation to transaction
  api_instance.calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization, account_id, company_code, transaction_type, document_code, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post: #{e}"
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



# **calculations_account_account_id_company_company_code_transaction_type_get**
> calculations_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type, )

Retrieve transactions

Retrieve a list of transactions

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

account_id = "account_id_example" # String | Account ID

company_code = "company_code_example" # String | Company Code

transaction_type = "transaction_type_example" # String | Transaction Type (sale, purchase, receipts or payment)


begin
  #Retrieve transactions
  api_instance.calculations_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_get: #{e}"
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



# **calculationsservice_payment_post**
> PaymentTransactionOut calculationsservice_payment_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::PaymentTransactionIn.new # PaymentTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsservice_payment_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculationsservice_payment_post: #{e}"
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



# **calculationsservice_purchase_post**
> PurchaseTransactionOut calculationsservice_purchase_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::PurchaseTransactionIn.new # PurchaseTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsservice_purchase_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculationsservice_purchase_post: #{e}"
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



# **calculationsservice_receipt_post**
> ReceiptTransactionOut calculationsservice_receipt_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::ReceiptTransactionIn.new # ReceiptTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsservice_receipt_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculationsservice_receipt_post: #{e}"
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



# **calculationsservice_sales_post**
> SalesTransactionOut calculationsservice_sales_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ServiceCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::SalesTransactionIn.new # SalesTransactionIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsservice_sales_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ServiceCalculationsApi->calculationsservice_sales_post: #{e}"
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



