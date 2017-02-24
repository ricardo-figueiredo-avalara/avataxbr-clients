# SwaggerClient::CompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_agasts_code_get**](CompanyAGASTApi.md#companies_company_id_agasts_code_get) | **GET** /companies/{companyId}/agasts/{code} | 
[**companies_company_id_agasts_get**](CompanyAGASTApi.md#companies_company_id_agasts_get) | **GET** /companies/{companyId}/agasts | 
[**create_custom_agast**](CompanyAGASTApi.md#create_custom_agast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**delete_agast**](CompanyAGASTApi.md#delete_agast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**update_custom_agast**](CompanyAGASTApi.md#update_custom_agast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **companies_company_id_agasts_code_get**
> CustomAgast companies_company_id_agasts_code_get(company_idcode, opts)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyAGASTApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Agast Code

opts = { 
  parent: "parent_example" # String | Agast parent code, means that this agast is a specialization of parent agast 
}

begin
  result = api_instance.companies_company_id_agasts_code_get(company_idcode, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyAGASTApi->companies_company_id_agasts_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Agast Code | 
 **parent** | **String**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_agasts_get**
> Array&lt;InlineResponse2001&gt; companies_company_id_agasts_get(company_id, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyAGASTApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  text: "text_example" # String | Text query
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
  agast: "agast_example" # String | Custom Agast Code
  parent: "parent_example" # String | Agast Code
}

begin
  result = api_instance.companies_company_id_agasts_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyAGASTApi->companies_company_id_agasts_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **text** | **String**| Text query | [optional] 
 **x_pagination_limit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **String**|  | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 
 **parent** | **String**| Agast Code | [optional] 

### Return type

[**Array&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_custom_agast**
> InlineResponse201 create_custom_agast(company_idbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyAGASTApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::CustomAgast.new # CustomAgast | Transaction Message

opts = { 
  text: "text_example" # String | Text query
}

begin
  #Create custom agast for one company
  result = api_instance.create_custom_agast(company_idbody, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyAGASTApi->create_custom_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **String**| Text query | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_agast**
> delete_agast(company_idcode)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyAGASTApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Agast Code


begin
  api_instance.delete_agast(company_idcode)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyAGASTApi->delete_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Agast Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_custom_agast**
> update_custom_agast(company_idcodebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyAGASTApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Agast Code

body = SwaggerClient::CustomAgast.new # CustomAgast | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_custom_agast(company_idcodebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyAGASTApi->update_custom_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



