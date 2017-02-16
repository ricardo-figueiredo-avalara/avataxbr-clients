# SwaggerClient::AccountApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accounts_account_id_companies_get**](AccountApi.md#accounts_account_id_companies_get) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**create_account_company**](AccountApi.md#create_account_company) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


# **accounts_account_id_companies_get**
> Array&lt;AccountCompany&gt; accounts_account_id_companies_get(account_id, )

Retrieve Companies by account

Retrieve list companies of one account

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountApi.new

account_id = "account_id_example" # String | Account ID


begin
  #Retrieve Companies by account
  result = api_instance.accounts_account_id_companies_get(account_id, )
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountApi->accounts_account_id_companies_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **String**| Account ID | 

### Return type

[**Array&lt;AccountCompany&gt;**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_account_company**
> InlineResponse201 create_account_company(account_id, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountApi.new

account_id = "account_id_example" # String | Account ID

body = SwaggerClient::Body.new # Body | Company Code


begin
  #Create company and your data configuration
  result = api_instance.create_account_company(account_id, body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountApi->create_account_company: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **String**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



