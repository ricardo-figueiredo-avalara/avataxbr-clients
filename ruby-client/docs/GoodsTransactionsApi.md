# SwaggerClient::GoodsTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsgoods_purchase_post**](GoodsTransactionsApi.md#transactionsgoods_purchase_post) | **POST** /transactions?goods-purchase | Transaction Method
[**transactionsgoods_sales_post**](GoodsTransactionsApi.md#transactionsgoods_sales_post) | **POST** /transactions?goods-sales | Transaction Method


# **transactionsgoods_purchase_post**
> TransactionForGoodsOut transactionsgoods_purchase_post(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::GoodsTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::TransactionForGoodsIn.new # TransactionForGoodsIn | Transaction Message


begin
  #Transaction Method
  result = api_instance.transactionsgoods_purchase_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GoodsTransactionsApi->transactionsgoods_purchase_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transactionsgoods_sales_post**
> TransactionForGoodsOut transactionsgoods_sales_post(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::GoodsTransactionsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::TransactionForGoodsIn.new # TransactionForGoodsIn | Transaction Message


begin
  #Transaction Method
  result = api_instance.transactionsgoods_sales_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GoodsTransactionsApi->transactionsgoods_sales_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



