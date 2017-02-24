# SwaggerClient::InvoiceSEFAZApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_sefaz_delete**](InvoiceSEFAZApi.md#invoices_sefaz_delete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoices_sefaz_key_delete**](InvoiceSEFAZApi.md#invoices_sefaz_key_delete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoices_sefaz_key_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_get) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoices_sefaz_key_lookup_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_lookup_get) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoices_sefaz_key_put**](InvoiceSEFAZApi.md#invoices_sefaz_key_put) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoices_sefaz_post**](InvoiceSEFAZApi.md#invoices_sefaz_post) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoices_sefaz_status_get**](InvoiceSEFAZApi.md#invoices_sefaz_status_get) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **invoices_sefaz_delete**
> SefazInvoiceBasicStatus invoices_sefaz_delete(authorization, body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = SwaggerClient::SefazDisableRangeIn.new # SefazDisableRangeIn | Disable Range e-Invoice


begin
  #Disable Range e-Invoice
  result = api_instance.invoices_sefaz_delete(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**SefazDisableRangeIn**](SefazDisableRangeIn.md)| Disable Range e-Invoice | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_key_delete**
> SefazInvoiceBasicStatus invoices_sefaz_key_delete(authorization, keybody)

Cancel invoice

Cancel the invoice

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key

body = SwaggerClient::SefazItDeleteIn.new # SefazItDeleteIn | Cancel Message


begin
  #Cancel invoice
  result = api_instance.invoices_sefaz_key_delete(authorization, keybody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_key_get**
> SefazItGetOut invoices_sefaz_key_get(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key


begin
  #Retrieve invoice
  result = api_instance.invoices_sefaz_key_get(authorization, key)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_key_lookup_get**
> TransactionForSefazGoodsList invoices_sefaz_key_lookup_get(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key


begin
  #Retrieve invoice
  result = api_instance.invoices_sefaz_key_lookup_get(authorization, key)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_lookup_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_key_put**
> SefazInvoiceBasicStatus invoices_sefaz_key_put(authorization, keybody)

Fix Letter

Fix Letter

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

key = "key_example" # String | Invoice Key

body = SwaggerClient::SefazItPutIn.new # SefazItPutIn | Fix Message


begin
  #Fix Letter
  result = api_instance.invoices_sefaz_key_put(authorization, keybody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_post**
> SefazPostOut invoices_sefaz_post(authorization, body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}

body = [SwaggerClient::TransactionForSefazGoods.new] # Array<TransactionForSefazGoods> | Invoices


begin
  #Send an e-Invoice
  result = api_instance.invoices_sefaz_post(authorization, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**Array&lt;TransactionForSefazGoods&gt;**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoices_sefaz_status_get**
> String invoices_sefaz_status_get(authorization, )

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InvoiceSEFAZApi.new

authorization = "authorization_example" # String | Bearer {auth}


begin
  #Retrieve Status of SEFAZ Server
  result = api_instance.invoices_sefaz_status_get(authorization, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InvoiceSEFAZApi->invoices_sefaz_status_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



