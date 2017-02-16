# SwaggerClient::CompanyItemGoodsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemGoodsApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codegoods_get**](CompanyItemGoodsApi.md#companies_company_id_items_codegoods_get) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companies_company_id_itemsgoods_get**](CompanyItemGoodsApi.md#companies_company_id_itemsgoods_get) | **GET** /companies/{companyId}/items?goods | 
[**create_item**](CompanyItemGoodsApi.md#create_item) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**delete_item**](CompanyItemGoodsApi.md#delete_item) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**update_item**](CompanyItemGoodsApi.md#update_item) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


# **companies_company_id_items_code_change_code_put**
> companies_company_id_items_code_change_code_put(company_idcode, body, opts)



Change the code of a given item. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

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
  puts "Exception when calling CompanyItemGoodsApi->companies_company_id_items_code_change_code_put: #{e}"
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



# **companies_company_id_items_codegoods_get**
> ItemGoods companies_company_id_items_codegoods_get(company_idcode, avalara_product_type, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

avalara_product_type = "goods" # String | Avalara Product Type

opts = { 
  agast: "agast_example" # String | Custom Agast Code
}

begin
  result = api_instance.companies_company_id_items_codegoods_get(company_idcode, avalara_product_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemGoodsApi->companies_company_id_items_codegoods_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalara_product_type** | **String**| Avalara Product Type | [default to goods]
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_itemsgoods_get**
> Array&lt;ItemGoods&gt; companies_company_id_itemsgoods_get(company_idavalara_product_type, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

company_id = "company_id_example" # String | Company ID

avalara_product_type = "goods" # String | Avalara Product Type

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
  code: "code_example", # String | Item Code
  agast: "agast_example" # String | Custom Agast Code
}

begin
  result = api_instance.companies_company_id_itemsgoods_get(company_idavalara_product_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemGoodsApi->companies_company_id_itemsgoods_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **avalara_product_type** | **String**| Avalara Product Type | [default to goods]
 **x_pagination_limit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **String**|  | [optional] 
 **code** | **String**| Item Code | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**Array&lt;ItemGoods&gt;**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_item**
> InlineResponse201 create_item(company_idavalara_product_typebody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

company_id = "company_id_example" # String | Company ID

avalara_product_type = "goods" # String | Avalara Product Type

body = SwaggerClient::ItemGoods.new # ItemGoods | Transaction Message


begin
  #Create custom agast for one company
  result = api_instance.create_item(company_idavalara_product_typebody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemGoodsApi->create_item: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **avalara_product_type** | **String**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_item**
> delete_item(company_idcode, avalara_product_type)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

avalara_product_type = "goods" # String | Avalara Product Type


begin
  api_instance.delete_item(company_idcode, avalara_product_type)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemGoodsApi->delete_item: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalara_product_type** | **String**| Avalara Product Type | [default to goods]

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_item**
> update_item(company_idcode, avalara_product_typebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyItemGoodsApi.new

company_id = "company_id_example" # String | Company ID

code = "code_example" # String | Item Code

avalara_product_type = "goods" # String | Avalara Product Type

body = SwaggerClient::ItemGoods.new # ItemGoods | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_item(company_idcode, avalara_product_typebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyItemGoodsApi->update_item: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalara_product_type** | **String**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



