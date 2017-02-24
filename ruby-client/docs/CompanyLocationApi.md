# SwaggerClient::CompanyLocationApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_locations_code_get**](CompanyLocationApi.md#companies_company_id_locations_code_get) | **GET** /companies/{companyId}/locations/{code} | 
[**companies_company_id_locations_get**](CompanyLocationApi.md#companies_company_id_locations_get) | **GET** /companies/{companyId}/locations | 
[**create_location**](CompanyLocationApi.md#create_location) | **POST** /companies/{companyId}/locations | Create new location for company
[**delete_location**](CompanyLocationApi.md#delete_location) | **DELETE** /companies/{companyId}/locations/{code} | 
[**update_location**](CompanyLocationApi.md#update_location) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


# **companies_company_id_locations_code_get**
> Location companies_company_id_locations_code_get(company_idcode)



This operation return location 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyLocationApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Location Code


begin
  result = api_instance.companies_company_id_locations_code_get(company_idcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyLocationApi->companies_company_id_locations_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_locations_get**
> Array&lt;Location&gt; companies_company_id_locations_get(company_id, opts)



This operation return all locations 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyLocationApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
}

begin
  result = api_instance.companies_company_id_locations_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyLocationApi->companies_company_id_locations_get: #{e}"
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

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_location**
> InlineResponse201 create_location(company_idbody)

Create new location for company

This method operation create a new location for company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyLocationApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::Location.new # Location | Transaction Message


begin
  #Create new location for company
  result = api_instance.create_location(company_idbody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyLocationApi->create_location: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_location**
> delete_location(company_idcode)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyLocationApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Location Code


begin
  api_instance.delete_location(company_idcode)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyLocationApi->delete_location: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_location**
> update_location(company_idcodebody)

Update location for company

This method operation update a location for company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyLocationApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Location Code

body = SwaggerClient::Location.new # Location | Transaction Message


begin
  #Update location for company
  api_instance.update_location(company_idcodebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyLocationApi->update_location: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



