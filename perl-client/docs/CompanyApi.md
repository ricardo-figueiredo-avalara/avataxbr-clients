# WWW::SwaggerClient::CompanyApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_get**](CompanyApi.md#companies_get) | **GET** /companies | Retrieve Companies by account
[**create_company**](CompanyApi.md#create_company) | **POST** /companies | Create company and your data configuration
[**delete_account_company**](CompanyApi.md#delete_account_company) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**delete_company**](CompanyApi.md#delete_company) | **DELETE** /companies/{companyId} | 
[**info_company**](CompanyApi.md#info_company) | **GET** /companies/{companyId} | Get company information and your data configuration
[**update_company**](CompanyApi.md#update_company) | **PUT** /companies/{companyId} | Update company information and your data configuration


# **companies_get**
> ARRAY[Company] companies_get()

Retrieve Companies by account

Retrieve list companies of one account

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();

eval { 
    my $result = $api_instance->companies_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyApi->companies_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ARRAY[Company]**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_company**
> Company create_company(body => $body)

Create company and your data configuration

This method operation create a company for a account 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();
my $body = WWW::SwaggerClient::Object::Company->new(); # Company | Transaction Message

eval { 
    my $result = $api_instance->create_company(body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyApi->create_company: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_company**
> delete_account_company(account_id => $account_id, company_id => $company_id)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();
my $account_id = 'account_id_example'; # UUID | Account ID
my $company_id = 'company_id_example'; # UUID | Company ID

eval { 
    $api_instance->delete_account_company(account_id => $account_id, company_id => $company_id);
};
if ($@) {
    warn "Exception when calling CompanyApi->delete_account_company: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **UUID**| Account ID | 
 **company_id** | **UUID**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_company**
> delete_company(company_id => $company_id, company_id2 => $company_id2)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $company_id2 = 'company_id_example'; # UUID | Company ID

eval { 
    $api_instance->delete_company(company_id => $company_id, company_id2 => $company_id2);
};
if ($@) {
    warn "Exception when calling CompanyApi->delete_company: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **company_id2** | **UUID**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **info_company**
> Company info_company(company_id => $company_id)

Get company information and your data configuration

This method operation get a company for a account 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID

eval { 
    my $result = $api_instance->info_company(company_id => $company_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyApi->info_company: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_company**
> update_company(company_id => $company_id, body => $body)

Update company information and your data configuration

This method operation create a company for a account 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyApi;

my $api_instance = WWW::SwaggerClient::CompanyApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::Company->new(); # Company | Transaction Message

eval { 
    $api_instance->update_company(company_id => $company_id, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyApi->update_company: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

