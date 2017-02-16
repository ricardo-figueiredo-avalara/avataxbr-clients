# SwaggerClient::TaxConfCFOPApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cfop**](TaxConfCFOPApi.md#create_cfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**delete_cfop**](TaxConfCFOPApi.md#delete_cfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**get_cfop**](TaxConfCFOPApi.md#get_cfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**get_cfop_list**](TaxConfCFOPApi.md#get_cfop_list) | **GET** /taxconf/cfop | retrive list of CFOP.
[**update_cfop**](TaxConfCFOPApi.md#update_cfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


# **create_cfop**
> InlineResponse201 create_cfop(body)

create a new CFOP configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfCFOPApi.new

body = SwaggerClient::CfopConf.new # CfopConf | The pet JSON you want to post


begin
  #create a new CFOP configuration
  result = api_instance.create_cfop(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfCFOPApi->create_cfop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_cfop**
> delete_cfop(code)

disable a CFOP.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfCFOPApi.new

code = "code_example" # String | CFOP Code


begin
  #disable a CFOP.
  api_instance.delete_cfop(code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfCFOPApi->delete_cfop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_cfop**
> CfopConf get_cfop(code)

get CFOP information.

This operation return CFOP configuration 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfCFOPApi.new

code = "code_example" # String | CFOP Code


begin
  #get CFOP information.
  result = api_instance.get_cfop(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfCFOPApi->get_cfop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_cfop_list**
> Array&lt;CfopConf&gt; get_cfop_list(opts)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfCFOPApi.new

opts = { 
  suffixcode: "suffixcode_example", # String | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type 
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date 
  inactive: true # BOOLEAN | return the inactive versions too 
}

begin
  #retrive list of CFOP.
  result = api_instance.get_cfop_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfCFOPApi->get_cfop_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **String**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **BOOLEAN**| return the inactive versions too  | [optional] 

### Return type

[**Array&lt;CfopConf&gt;**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_cfop**
> update_cfop(codetaxconfcfop)

update a CFOP configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfCFOPApi.new

code = "code_example" # String | CFOP Code

taxconfcfop = SwaggerClient::CfopConf.new # CfopConf | The pet JSON you want to post


begin
  #update a CFOP configuration
  api_instance.update_cfop(codetaxconfcfop)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfCFOPApi->update_cfop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



