# SwaggerClient::TaxConfICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_icmsconfstate**](TaxConfICMSApi.md#create_icmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**delete_icms_conf**](TaxConfICMSApi.md#delete_icms_conf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**get_icms_conf_by_state**](TaxConfICMSApi.md#get_icms_conf_by_state) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**get_icms_list**](TaxConfICMSApi.md#get_icms_list) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**get_icms_list_0**](TaxConfICMSApi.md#get_icms_list_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**update_icmsconfstate**](TaxConfICMSApi.md#update_icmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **create_icmsconfstate**
> InlineResponse201 create_icmsconfstate(state, icms_conf_state)

create a new ICMS Configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

state = "state_example" # String | Brazilian State

icms_conf_state = SwaggerClient::IcmsConfByState.new # IcmsConfByState | The pet JSON you want to post


begin
  #create a new ICMS Configuration
  result = api_instance.create_icmsconfstate(state, icms_conf_state)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->create_icmsconfstate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_icms_conf**
> delete_icms_conf(state, code)

disable a ICMS by State.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

state = "state_example" # String | Brazilian State

code = "code_example" # String | ICMS Code


begin
  #disable a ICMS by State.
  api_instance.delete_icms_conf(state, code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->delete_icms_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_icms_conf_by_state**
> Array&lt;IcmsConfByState&gt; get_icms_conf_by_state(state, code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

state = "state_example" # String | Brazilian State

code = "code_example" # String | ICMS Code


begin
  #get ICMS information by State.
  result = api_instance.get_icms_conf_by_state(state, code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->get_icms_conf_by_state: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 

### Return type

[**Array&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_icms_list**
> Array&lt;IcmsConfByState&gt; get_icms_list(state, , opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

state = "state_example" # String | Brazilian State

opts = { 
  suffixcode: "suffixcode_example", # String | Identify this ICMS
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date
  inactive: true # BOOLEAN | return the inactive versions too
}

begin
  #retrive list of ICMS.
  result = api_instance.get_icms_list(state, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->get_icms_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **suffixcode** | **String**| Identify this ICMS | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **BOOLEAN**| return the inactive versions too | [optional] 

### Return type

[**Array&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_icms_list_0**
> Array&lt;IcmsConfByState&gt; get_icms_list_0(text, opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

text = "text_example" # String | Search for codes

opts = { 
  state: "state_example" # String | Filter for states
}

begin
  #retrive list of ICMS.
  result = api_instance.get_icms_list_0(text, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->get_icms_list_0: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Search for codes | 
 **state** | **String**| Filter for states | [optional] 

### Return type

[**Array&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_icmsconfstate**
> update_icmsconfstate(state, codeicms_conf_state)

update a IcmsConf State,

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfICMSApi.new

state = "state_example" # String | Brazilian State

code = "code_example" # String | ICMS Code

icms_conf_state = SwaggerClient::IcmsConfByState.new # IcmsConfByState | The pet JSON you want to post


begin
  #update a IcmsConf State,
  api_instance.update_icmsconfstate(state, codeicms_conf_state)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfICMSApi->update_icmsconfstate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



