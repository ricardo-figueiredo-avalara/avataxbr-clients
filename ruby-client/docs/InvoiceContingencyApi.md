# SwaggerClient::InvoiceContingencyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_drop_contingency**](InvoiceContingencyApi.md#invoice_drop_contingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoice_set_contingency**](InvoiceContingencyApi.md#invoice_set_contingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoice_verify_contingency**](InvoiceContingencyApi.md#invoice_verify_contingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **invoice_drop_contingency**
> invoice_drop_contingency(state, )

Invoice Drop Contingency per State

Drop State in Contingency

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceContingencyApi.new

state = "state_example" # String | Brazilian State


begin
  #Invoice Drop Contingency per State
  api_instance.invoice_drop_contingency(state, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceContingencyApi->invoice_drop_contingency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoice_set_contingency**
> invoice_set_contingency(state, body)

Invoice Set Contingency per State

Set State in Contingency

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceContingencyApi.new

state = "state_example" # String | Brazilian State

body = SwaggerClient::Body4.new # Body4 | Set Contingency


begin
  #Invoice Set Contingency per State
  api_instance.invoice_set_contingency(state, body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceContingencyApi->invoice_set_contingency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **body** | [**Body4**](Body4.md)| Set Contingency | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoice_verify_contingency**
> InlineResponse2003 invoice_verify_contingency(state, )

Invoice Verify Contingency per State

Check if State was in Contingency

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceContingencyApi.new

state = "state_example" # String | Brazilian State


begin
  #Invoice Verify Contingency per State
  result = api_instance.invoice_verify_contingency(state, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceContingencyApi->invoice_verify_contingency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



