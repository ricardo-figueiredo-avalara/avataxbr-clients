# SwaggerClient::GoodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoods_purchase_post**](GoodsCalculationsApi.md#calculationsgoods_purchase_post) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoods_sales_post**](GoodsCalculationsApi.md#calculationsgoods_sales_post) | **POST** /calculations?goods-sales | Calculation Method


# **calculationsgoods_purchase_post**
> TransactionForGoodsOut calculationsgoods_purchase_post(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::GoodsCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::TransactionForGoodsIn.new # TransactionForGoodsIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsgoods_purchase_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GoodsCalculationsApi->calculationsgoods_purchase_post: #{e}"
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



# **calculationsgoods_sales_post**
> TransactionForGoodsOut calculationsgoods_sales_post(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::GoodsCalculationsApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::TransactionForGoodsIn.new # TransactionForGoodsIn | Transaction Message


begin
  #Calculation Method
  result = api_instance.calculationsgoods_sales_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GoodsCalculationsApi->calculationsgoods_sales_post: #{e}"
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



