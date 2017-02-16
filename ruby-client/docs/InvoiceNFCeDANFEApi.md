# SwaggerClient::InvoiceNFCeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_nfce_key_get**](InvoiceNFCeDANFEApi.md#invoices_nfce_key_get) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


# **invoices_nfce_key_get**
> File invoices_nfce_key_get(authorization, key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceNFCeDANFEApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key


begin
  #NFCe Danfe Print
  result = api_instance.invoices_nfce_key_get(authorization, key)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceNFCeDANFEApi->invoices_nfce_key_get: #{e}"
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



