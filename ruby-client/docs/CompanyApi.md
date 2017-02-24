# SwaggerClient::CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_get**](CompanyApi.md#companies_get) | **GET** /companies | Retrieve Companies by account
[**create_company**](CompanyApi.md#create_company) | **POST** /companies | Create company and your data configuration
[**delete_account_company**](CompanyApi.md#delete_account_company) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**delete_company**](CompanyApi.md#delete_company) | **DELETE** /companies/{companyId} | 
[**info_company**](CompanyApi.md#info_company) | **GET** /companies/{companyId} | Get company information and your data configuration
[**update_company**](CompanyApi.md#update_company) | **PUT** /companies/{companyId} | Update company information and your data configuration


# **companies_get**
> Array&lt;Company&gt; companies_get

Retrieve Companies by account

Retrieve list companies of one account

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

begin
  #Retrieve Companies by account
  result = api_instance.companies_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->companies_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Company&gt;**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_company**
> Company create_company(body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

body = SwaggerClient::Company.new # Company | Transaction Message


begin
  #Create company and your data configuration
  result = api_instance.create_company(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->create_company: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_account_company**
> delete_account_company(account_id, company_id)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

account_id = "account_id_example" # String | Account ID

company_id = "company_id_example" # String | Company ID


begin
  api_instance.delete_account_company(account_id, company_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->delete_account_company: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **String**| Account ID | 
 **company_id** | **String**| Company ID | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_company**
> delete_company(company_idcompany_id2)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

company_id = "company_id_example" # String | Company ID

company_id2 = "company_id_example" # String | Company ID


begin
  api_instance.delete_company(company_idcompany_id2)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->delete_company: #{e}"
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



# **info_company**
> Company info_company(company_id)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

company_id = "company_id_example" # String | Company ID


begin
  #Get company information and your data configuration
  result = api_instance.info_company(company_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->info_company: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_company**
> update_company(company_idbody)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CompanyApi.new

company_id = "company_id_example" # String | Company ID

body = SwaggerClient::Company.new # Company | Transaction Message


begin
  #Update company information and your data configuration
  api_instance.update_company(company_idbody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CompanyApi->update_company: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



