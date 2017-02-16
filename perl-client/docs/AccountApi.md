# WWW::SwaggerClient::AccountApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AccountApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accounts_account_id_companies_get**](AccountApi.md#accounts_account_id_companies_get) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**create_account_company**](AccountApi.md#create_account_company) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


# **accounts_account_id_companies_get**
> ARRAY[AccountCompany] accounts_account_id_companies_get(account_id => $account_id)

Retrieve Companies by account

Retrieve list companies of one account

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AccountApi;

my $api_instance = WWW::SwaggerClient::AccountApi->new();
my $account_id = 'account_id_example'; # UUID | Account ID

eval { 
    my $result = $api_instance->accounts_account_id_companies_get(account_id => $account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AccountApi->accounts_account_id_companies_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **UUID**| Account ID | 

### Return type

[**ARRAY[AccountCompany]**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_company**
> InlineResponse201 create_account_company(account_id => $account_id, body => $body)

Create company and your data configuration

This method operation create a company for a account 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AccountApi;

my $api_instance = WWW::SwaggerClient::AccountApi->new();
my $account_id = 'account_id_example'; # UUID | Account ID
my $body = WWW::SwaggerClient::Object::Body->new(); # Body | Company Code

eval { 
    my $result = $api_instance->create_account_company(account_id => $account_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AccountApi->create_account_company: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **UUID**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

