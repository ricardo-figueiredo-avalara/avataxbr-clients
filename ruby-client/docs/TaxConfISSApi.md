# SwaggerClient::TaxConfISSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_iss_conf_by_city**](TaxConfISSApi.md#create_iss_conf_by_city) | **POST** /taxconf/iss | create a new ISS Configuration
[**delete_iss_conf**](TaxConfISSApi.md#delete_iss_conf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**get_iss_conf_by_city**](TaxConfISSApi.md#get_iss_conf_by_city) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**get_iss_list**](TaxConfISSApi.md#get_iss_list) | **GET** /taxconf/iss | retrive list of ISS
[**update_iss_conf_by_city**](TaxConfISSApi.md#update_iss_conf_by_city) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **create_iss_conf_by_city**
> InlineResponse201 create_iss_conf_by_city(iss_conf_by_city)

create a new ISS Configuration

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfISSApi.new

iss_conf_by_city = SwaggerClient::IssConfByCity.new # IssConfByCity | The pet JSON you want to post


begin
  #create a new ISS Configuration
  result = api_instance.create_iss_conf_by_city(iss_conf_by_city)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfISSApi->create_iss_conf_by_city: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_iss_conf**
> delete_iss_conf(city_code)

disable a ISS by City Code.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfISSApi.new

city_code = 3.4 # Float | City Code


begin
  #disable a ISS by City Code.
  api_instance.delete_iss_conf(city_code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfISSApi->delete_iss_conf: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Float**| City Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_iss_conf_by_city**
> Array&lt;IssConfByCity&gt; get_iss_conf_by_city(city_code, opts)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfISSApi.new

city_code = 3.4 # Float | City Code

opts = { 
  code: "code_example", # String | Identificator of this configuration, it is unique for account or standard namedspace 
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date 
  inactive: true # BOOLEAN | return the inctives versions too 
}

begin
  #get ISS information by City Code.
  result = api_instance.get_iss_conf_by_city(city_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfISSApi->get_iss_conf_by_city: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Float**| City Code | 
 **code** | **String**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **BOOLEAN**| return the inctives versions too  | [optional] 

### Return type

[**Array&lt;IssConfByCity&gt;**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_iss_list**
> Array&lt;IssConfByCity&gt; get_iss_list(opts)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfISSApi.new

opts = { 
  suffixcode: "suffixcode_example", # String | Identify this ISS 
  date: Date.parse("2013-10-20"), # Date | When informed return valid version configuration for this date 
  inactive: true # BOOLEAN | return the inactive versions too 
}

begin
  #retrive list of ISS
  result = api_instance.get_iss_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfISSApi->get_iss_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **String**| Identify this ISS  | [optional] 
 **date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **BOOLEAN**| return the inactive versions too  | [optional] 

### Return type

[**Array&lt;IssConfByCity&gt;**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_iss_conf_by_city**
> update_iss_conf_by_city(city_codeiss_conf_by_city)

update a ISS by City Code.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::TaxConfISSApi.new

city_code = 3.4 # Float | City Code

iss_conf_by_city = SwaggerClient::IssConfByCity.new # IssConfByCity | The pet JSON you want to post


begin
  #update a ISS by City Code.
  api_instance.update_iss_conf_by_city(city_codeiss_conf_by_city)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TaxConfISSApi->update_iss_conf_by_city: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Float**| City Code | 
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



