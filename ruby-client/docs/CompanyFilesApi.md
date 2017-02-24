# SwaggerClient::CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_nfse_certificate_delete**](CompanyFilesApi.md#companies_company_id_nfse_certificate_delete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_get**](CompanyFilesApi.md#companies_company_id_nfse_certificate_get) | **GET** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_post**](CompanyFilesApi.md#companies_company_id_nfse_certificate_post) | **POST** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_put**](CompanyFilesApi.md#companies_company_id_nfse_certificate_put) | **PUT** /companies/{companyId}/nfse-certificate | 


# **companies_company_id_nfse_certificate_delete**
> companies_company_id_nfse_certificate_delete(company_idcompany_id2)



Deletes a company file store.  

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyFilesApi.new

company_id = "company_id_example" # String | Company ID

company_id2 = "company_id_example" # String | Company ID


begin
  api_instance.companies_company_id_nfse_certificate_delete(company_idcompany_id2)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **company_id2** | **String**| Company ID | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_nfse_certificate_get**
> companies_company_id_nfse_certificate_get(company_idcompany_id2, opts)



Gets an existing NFSe certificate file for this company. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyFilesApi.new

company_id = "company_id_example" # String | Company ID

company_id2 = "company_id_example" # String | Company ID

opts = { 
  peek: 3.4 # Float | Use this parameter to check the existence of the file without downloading it.
}

begin
  api_instance.companies_company_id_nfse_certificate_get(company_idcompany_id2, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **company_id2** | **String**| Company ID | 
 **peek** | **Float**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream



# **companies_company_id_nfse_certificate_post**
> InlineResponse2002 companies_company_id_nfse_certificate_post(company_idbody)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyFilesApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::Body3.new # Body3 | Content


begin
  result = api_instance.companies_company_id_nfse_certificate_post(company_idbody)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **companies_company_id_nfse_certificate_put**
> InlineResponse2002 companies_company_id_nfse_certificate_put(company_idcompany_id2body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyFilesApi.new

company_id = "company_id_example" # String | Company ID

company_id2 = "company_id_example" # String | Company ID

body = SwaggerClient::Body2.new # Body2 | Content


begin
  result = api_instance.companies_company_id_nfse_certificate_put(company_idcompany_id2body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **company_id2** | **String**| Company ID | 
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



