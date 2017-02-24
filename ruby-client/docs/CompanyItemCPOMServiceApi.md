# SwaggerClient::CompanyItemCPOMServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_cpom_city_code_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_city_code_get) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companies_company_id_items_code_cpom_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_get) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**create_item_cpom**](CompanyItemCPOMServiceApi.md#create_item_cpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**delete_item_cpom**](CompanyItemCPOMServiceApi.md#delete_item_cpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**update_item_cpom**](CompanyItemCPOMServiceApi.md#update_item_cpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **companies_company_id_items_code_cpom_city_code_get**
> ItemCpom companies_company_id_items_code_cpom_city_code_get(company_idcode, city_code)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemCPOMServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

city_code = 3.4 # Float | City Code


begin
  result = api_instance.companies_company_id_items_code_cpom_city_code_get(company_idcode, city_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_city_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **city_code** | **Float**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_items_code_cpom_get**
> Array&lt;ItemCpom&gt; companies_company_id_items_code_cpom_get(company_idcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemCPOMServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
}

begin
  result = api_instance.companies_company_id_items_code_cpom_get(company_idcode, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **x_pagination_limit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **String**|  | [optional] 

### Return type

[**Array&lt;ItemCpom&gt;**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_item_cpom**
> InlineResponse201 create_item_cpom(company_idcode, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemCPOMServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

body = SwaggerClient::ItemCpom.new # ItemCpom | Transaction Message


begin
  #Create custom agast for one company
  result = api_instance.create_item_cpom(company_idcode, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemCPOMServiceApi->create_item_cpom: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_item_cpom**
> delete_item_cpom(company_idcode, city_code)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemCPOMServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

city_code = 3.4 # Float | City Code


begin
  api_instance.delete_item_cpom(company_idcode, city_code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemCPOMServiceApi->delete_item_cpom: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **city_code** | **Float**| City Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_item_cpom**
> update_item_cpom(company_idcode, city_codebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemCPOMServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

city_code = 3.4 # Float | City Code

body = SwaggerClient::ItemCpom.new # ItemCpom | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_item_cpom(company_idcode, city_codebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemCPOMServiceApi->update_item_cpom: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **city_code** | **Float**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



