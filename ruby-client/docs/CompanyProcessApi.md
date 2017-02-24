# SwaggerClient::CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_process_code_get**](CompanyProcessApi.md#companies_company_id_process_code_get) | **GET** /companies/{companyId}/process/{code} | 
[**companies_company_id_process_get**](CompanyProcessApi.md#companies_company_id_process_get) | **GET** /companies/{companyId}/process | 
[**create_custom_process_scenario**](CompanyProcessApi.md#create_custom_process_scenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**delete_custom_process_scenario**](CompanyProcessApi.md#delete_custom_process_scenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**update_custom_process_scenario**](CompanyProcessApi.md#update_custom_process_scenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


# **companies_company_id_process_code_get**
> CustomProcessScenario companies_company_id_process_code_get(company_idcode)



This operation return custom process configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyProcessApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Process Code


begin
  result = api_instance.companies_company_id_process_code_get(company_idcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyProcessApi->companies_company_id_process_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_process_get**
> Array&lt;CustomProcessScenario&gt; companies_company_id_process_get(company_id, opts)



This operation return custom process configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyProcessApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
}

begin
  result = api_instance.companies_company_id_process_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyProcessApi->companies_company_id_process_get: #{e}"
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

[**Array&lt;CustomProcessScenario&gt;**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_custom_process_scenario**
> InlineResponse201 create_custom_process_scenario(company_idbody)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyProcessApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::CustomProcessScenario.new # CustomProcessScenario | Transaction Message


begin
  #Create custom process tax for one company
  result = api_instance.create_custom_process_scenario(company_idbody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyProcessApi->create_custom_process_scenario: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_custom_process_scenario**
> delete_custom_process_scenario(company_idcode)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyProcessApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Process Code


begin
  api_instance.delete_custom_process_scenario(company_idcode)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyProcessApi->delete_custom_process_scenario: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_custom_process_scenario**
> update_custom_process_scenario(company_idcodebody)

Update custom agast for one company

This method operation update a custom process for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyProcessApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Process Code

body = SwaggerClient::CustomProcessScenario.new # CustomProcessScenario | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_custom_process_scenario(company_idcodebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyProcessApi->update_custom_process_scenario: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



