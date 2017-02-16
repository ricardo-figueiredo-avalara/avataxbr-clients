# SwaggerClient::InvoiceNFeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfe_print**](InvoiceNFeDANFEApi.md#nfe_print) | **GET** /invoices/nfe/{key} | Retrieve Danfe


# **nfe_print**
> File nfe_print(authorization, key)

Retrieve Danfe

Retrieve the Danfe 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceNFeDANFEApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key


begin
  #Retrieve Danfe
  result = api_instance.nfe_print(authorization, key)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceNFeDANFEApi->nfe_print: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

**File**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf



