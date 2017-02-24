# SwaggerClient::AddressApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_zip_code**](AddressApi.md#get_zip_code) | **GET** /addresses/{zipcode} | 


# **get_zip_code**
> Array&lt;Address&gt; get_zip_code(zipcode)



This operation return address

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AddressApi.new

zipcode = "zipcode_example" # String | ZIP Code


begin
  result = api_instance.get_zip_code(zipcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->get_zip_code: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **String**| ZIP Code | 

### Return type

[**Array&lt;Address&gt;**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



