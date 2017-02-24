# SwaggerClient::InvoiceSettingsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_settings**](InvoiceSettingsApi.md#invoice_settings) | **GET** /invoices/settings | Invoice Settigns


# **invoice_settings**
> InlineResponse2004 invoice_settings

Invoice Settigns

Get Enviroment Settigns

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSettingsApi.new

begin
  #Invoice Settigns
  result = api_instance.invoice_settings
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSettingsApi->invoice_settings: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



