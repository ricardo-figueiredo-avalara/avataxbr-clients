# SwaggerClient::CompanyICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_icms_get**](CompanyICMSApi.md#companies_company_id_icms_get) | **GET** /companies/{companyId}/icms | 
[**companies_company_id_icms_state_get**](CompanyICMSApi.md#companies_company_id_icms_state_get) | **GET** /companies/{companyId}/icms/{state} | 
[**create_icms**](CompanyICMSApi.md#create_icms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**delete_custom_icms_conf_by_state**](CompanyICMSApi.md#delete_custom_icms_conf_by_state) | **DELETE** /companies/{companyId}/icms/{state} | 
[**update_custom_icms_conf_by_state**](CompanyICMSApi.md#update_custom_icms_conf_by_state) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **companies_company_id_icms_get**
> Array&lt;CustomIcmsConfByState&gt; companies_company_id_icms_get(company_id, opts)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyICMSApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
}

begin
  result = api_instance.companies_company_id_icms_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyICMSApi->companies_company_id_icms_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **x_pagination_limit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **String**|  | [optional] 

### Return type

[**Array&lt;CustomIcmsConfByState&gt;**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_icms_state_get**
> CustomIcmsConfByState companies_company_id_icms_state_get(company_idstate, )



This operation return custom ICMS configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyICMSApi.new

company_id = "company_id_example" # String | Company ID

state = "state_example" # String | Brazilian State


begin
  result = api_instance.companies_company_id_icms_state_get(company_idstate, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyICMSApi->companies_company_id_icms_state_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_icms**
> InlineResponse201 create_icms(company_idbody)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyICMSApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::CustomIcmsConfByState.new # CustomIcmsConfByState | Transaction Message


begin
  #Create custom ICMS tax for one company
  result = api_instance.create_icms(company_idbody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyICMSApi->create_icms: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_custom_icms_conf_by_state**
> delete_custom_icms_conf_by_state(company_idstate, )



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyICMSApi.new

company_id = "company_id_example" # String | Company ID

state = "state_example" # String | Brazilian State


begin
  api_instance.delete_custom_icms_conf_by_state(company_idstate, )
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyICMSApi->delete_custom_icms_conf_by_state: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_custom_icms_conf_by_state**
> update_custom_icms_conf_by_state(company_idstate, body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyICMSApi.new

company_id = "company_id_example" # String | Company ID

state = "state_example" # String | Brazilian State

body = SwaggerClient::CustomIcmsConfByState.new # CustomIcmsConfByState | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_custom_icms_conf_by_state(company_idstate, body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyICMSApi->update_custom_icms_conf_by_state: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



