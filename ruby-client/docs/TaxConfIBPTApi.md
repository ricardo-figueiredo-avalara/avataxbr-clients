# SwaggerClient::TaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_ibpt_conf**](TaxConfIBPTApi.md#create_ibpt_conf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**delete_ibpt_conf**](TaxConfIBPTApi.md#delete_ibpt_conf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**get_ibpt_conf**](TaxConfIBPTApi.md#get_ibpt_conf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**get_ibpt_conf_list**](TaxConfIBPTApi.md#get_ibpt_conf_list) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**update_ibpt_conf**](TaxConfIBPTApi.md#update_ibpt_conf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


# **create_ibpt_conf**
> InlineResponse201 create_ibpt_conf(taxconfprocess)

create a new Process Type configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfIBPTApi.new

taxconfprocess = SwaggerClient::IbptConf.new # IbptConf | The pet JSON you want to post


begin
  #create a new Process Type configuration
  result = api_instance.create_ibpt_conf(taxconfprocess)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfIBPTApi->create_ibpt_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_ibpt_conf**
> delete_ibpt_conf(code)

disable a IBPT.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfIBPTApi.new

code = "code_example" # String | IBPT Code


begin
  #disable a IBPT.
  api_instance.delete_ibpt_conf(code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfIBPTApi->delete_ibpt_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_ibpt_conf**
> IbptConf get_ibpt_conf(code)

get IBPT information.

This operation return Process Type configuration 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfIBPTApi.new

code = "code_example" # String | IBPT Code


begin
  #get IBPT information.
  result = api_instance.get_ibpt_conf(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfIBPTApi->get_ibpt_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_ibpt_conf_list**
> Array&lt;IbptConf&gt; get_ibpt_conf_list(opts)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfIBPTApi.new

opts = { 
  account_id: "account_id_example", # String | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date 
  inactive: true # BOOLEAN | return the inactive versions too 
}

begin
  #retrive list of IBPT.
  result = api_instance.get_ibpt_conf_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfIBPTApi->get_ibpt_conf_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **String**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **BOOLEAN**| return the inactive versions too  | [optional] 

### Return type

[**Array&lt;IbptConf&gt;**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_ibpt_conf**
> update_ibpt_conf(codetaxconfprocess)

update a Process Type configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfIBPTApi.new

code = "code_example" # String | IBPT Code

taxconfprocess = SwaggerClient::IbptConf.new # IbptConf | The pet JSON you want to post


begin
  #update a Process Type configuration
  api_instance.update_ibpt_conf(codetaxconfprocess)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfIBPTApi->update_ibpt_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



