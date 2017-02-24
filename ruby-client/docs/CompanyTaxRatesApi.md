# SwaggerClient::CompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_taxrates_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_get) | **GET** /companies/{companyId}/taxrates | 
[**companies_company_id_taxrates_tax_type_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_tax_type_get) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**create_custom_taxes**](CompanyTaxRatesApi.md#create_custom_taxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**delete_custom_taxes**](CompanyTaxRatesApi.md#delete_custom_taxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**update_custom_taxes**](CompanyTaxRatesApi.md#update_custom_taxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **companies_company_id_taxrates_get**
> Array&lt;CustomTaxTypeRate&gt; companies_company_id_taxrates_get(company_id, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyTaxRatesApi.new

company_id = "company_id_example" # String | Company ID

opts = { 
  x_pagination_limit: 10, # Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  x_pagination_current_page: 1, # Integer | The current page. Defaults to 1.
  x_pagination_sort: "x_pagination_sort_example" # String | 
}

begin
  result = api_instance.companies_company_id_taxrates_get(company_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_get: #{e}"
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

[**Array&lt;CustomTaxTypeRate&gt;**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_taxrates_tax_type_get**
> CustomTaxTypeRate companies_company_id_taxrates_tax_type_get(company_idtax_type)



This operation return custom agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyTaxRatesApi.new

company_id = "company_id_example" # String | Company ID

tax_type = "tax_type_example" # String | Tax Type


begin
  result = api_instance.companies_company_id_taxrates_tax_type_get(company_idtax_type)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_tax_type_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **tax_type** | **String**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_custom_taxes**
> InlineResponse201 create_custom_taxes(company_idbody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyTaxRatesApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::CustomTaxTypeRate.new # CustomTaxTypeRate | Transaction Message


begin
  #Create custom agast for one company
  result = api_instance.create_custom_taxes(company_idbody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyTaxRatesApi->create_custom_taxes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_custom_taxes**
> delete_custom_taxes(company_idtax_type)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyTaxRatesApi.new

company_id = "company_id_example" # String | Company ID

tax_type = "tax_type_example" # String | Tax Type


begin
  api_instance.delete_custom_taxes(company_idtax_type)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyTaxRatesApi->delete_custom_taxes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **tax_type** | **String**| Tax Type | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_custom_taxes**
> update_custom_taxes(company_idtax_typebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyTaxRatesApi.new

company_id = "company_id_example" # String | Company ID

tax_type = "tax_type_example" # String | Tax Type

body = SwaggerClient::CustomTaxTypeRate.new # CustomTaxTypeRate | Transaction Message


begin
  #Update custom agast for one company
  api_instance.update_custom_taxes(company_idtax_typebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyTaxRatesApi->update_custom_taxes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **tax_type** | **String**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



