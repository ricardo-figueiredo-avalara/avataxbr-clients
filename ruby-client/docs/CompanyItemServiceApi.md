# SwaggerClient::CompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemServiceApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codeservice_get**](CompanyItemServiceApi.md#companies_company_id_items_codeservice_get) | **GET** /companies/{companyId}/items/{code}?service | 
[**companies_company_id_itemsservice_get**](CompanyItemServiceApi.md#companies_company_id_itemsservice_get) | **GET** /companies/{companyId}/items?service | 
[**create_item_service**](CompanyItemServiceApi.md#create_item_service) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**delete_item_service**](CompanyItemServiceApi.md#delete_item_service) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**update_item_service**](CompanyItemServiceApi.md#update_item_service) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **companies_company_id_items_code_change_code_put**
> companies_company_id_items_code_change_code_put(company_idcode, body, opts)



Change the code of a given item. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

body = SwaggerClient::Body1.new # Body1 | Requisition

opts = { 
  goods: "goods_example", # String | Provide to apply to goods items.
  service: "service_example" # String | Provide to apply to service items.
}

begin
  api_instance.companies_company_id_items_code_change_code_put(company_idcode, body, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->companies_company_id_items_code_change_code_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **body** | [**Body1**](Body1.md)| Requisition | 
 **goods** | **String**| Provide to apply to goods items. | [optional] 
 **service** | **String**| Provide to apply to service items. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_items_codeservice_get**
> ItemSimple companies_company_id_items_codeservice_get(company_idcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

opts = { 
  avalara_product_type: "service" # String | Avalara Product Type
  agast: "agast_example" # String | Custom Agast Code
}

begin
  result = api_instance.companies_company_id_items_codeservice_get(company_idcode, , opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->companies_company_id_items_codeservice_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalara_product_type** | **String**| Avalara Product Type | [optional] [default to service]
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_itemsservice_get**
> Array&lt;ItemSimple&gt; companies_company_id_itemsservice_get(company_id, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  avalara_product_type: "service" # String | Avalara Product Type
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
  code: "code_example", # String | Item Code
  agast: "agast_example" # String | Custom Agast Code
}

begin
  result = api_instance.companies_company_id_itemsservice_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->companies_company_id_itemsservice_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **avalara_product_type** | **String**| Avalara Product Type | [optional] [default to service]
 **x_pagination_limit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **String**|  | [optional] 
 **code** | **String**| Item Code | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**Array&lt;ItemSimple&gt;**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_item_service**
> InlineResponse201 create_item_service(company_idbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::ItemSimple.new # ItemSimple | Transaction Message

opts = { 
  avalara_product_type: "service" # String | Avalara Product Type
}

begin
  #Create custom agast for one company
  result = api_instance.create_item_service(company_idbody, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->create_item_service: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_item_service**
> delete_item_service(company_idcode, , opts)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

opts = { 
  avalara_product_type: "service" # String | Avalara Product Type
}

begin
  api_instance.delete_item_service(company_idcode, , opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->delete_item_service: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalara_product_type** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_item_service**
> update_item_service(company_idcode, body, opts)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemServiceApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

body = SwaggerClient::ItemSimple.new # ItemSimple | Transaction Message

opts = { 
  avalara_product_type: "service" # String | Avalara Product Type
}

begin
  #Update custom agast for one company
  api_instance.update_item_service(company_idcode, body, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemServiceApi->update_item_service: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



