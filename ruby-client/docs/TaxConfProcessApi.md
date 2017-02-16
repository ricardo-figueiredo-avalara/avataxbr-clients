# SwaggerClient::TaxConfProcessApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_process**](TaxConfProcessApi.md#create_process) | **POST** /taxconf/process | create a new Process Type configuration
[**delete_process**](TaxConfProcessApi.md#delete_process) | **DELETE** /taxconf/process/{code} | disable a Process.
[**get_process**](TaxConfProcessApi.md#get_process) | **GET** /taxconf/process/{code} | get Process information.
[**get_process_list**](TaxConfProcessApi.md#get_process_list) | **GET** /taxconf/process | retrive list of Process.
[**update_process**](TaxConfProcessApi.md#update_process) | **PUT** /taxconf/process/{code} | update a Process Type configuration


# **create_process**
> InlineResponse201 create_process(taxconfprocess)

create a new Process Type configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfProcessApi.new

taxconfprocess = SwaggerClient::ProcessScenario.new # ProcessScenario | The pet JSON you want to post


begin
  #create a new Process Type configuration
  result = api_instance.create_process(taxconfprocess)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfProcessApi->create_process: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_process**
> delete_process(code)

disable a Process.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfProcessApi.new

code = "code_example" # String | Process Code


begin
  #disable a Process.
  api_instance.delete_process(code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfProcessApi->delete_process: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_process**
> ProcessScenario get_process(code)

get Process information.

This operation return Process Type configuration 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfProcessApi.new

code = "code_example" # String | Process Code


begin
  #get Process information.
  result = api_instance.get_process(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfProcessApi->get_process: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_process_list**
> Array&lt;ProcessScenario&gt; get_process_list(opts)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfProcessApi.new

opts = { 
  account_id: "account_id_example", # String | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date 
  inactive: true # BOOLEAN | return the inactive versions too 
}

begin
  #retrive list of Process.
  result = api_instance.get_process_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfProcessApi->get_process_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **String**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **BOOLEAN**| return the inactive versions too  | [optional] 

### Return type

[**Array&lt;ProcessScenario&gt;**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_process**
> update_process(codetaxconfprocess)

update a Process Type configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfProcessApi.new

code = "code_example" # String | Process Code

taxconfprocess = SwaggerClient::ProcessScenario.new # ProcessScenario | The pet JSON you want to post


begin
  #update a Process Type configuration
  api_instance.update_process(codetaxconfprocess)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfProcessApi->update_process: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



