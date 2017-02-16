# WWW::SwaggerClient::CompanyICMSApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyICMSApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_icms_get**](CompanyICMSApi.md#companies_company_id_icms_get) | **GET** /companies/{companyId}/icms | 
[**companies_company_id_icms_state_get**](CompanyICMSApi.md#companies_company_id_icms_state_get) | **GET** /companies/{companyId}/icms/{state} | 
[**create_icms**](CompanyICMSApi.md#create_icms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**delete_custom_icms_conf_by_state**](CompanyICMSApi.md#delete_custom_icms_conf_by_state) | **DELETE** /companies/{companyId}/icms/{state} | 
[**update_custom_icms_conf_by_state**](CompanyICMSApi.md#update_custom_icms_conf_by_state) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **companies_company_id_icms_get**
> ARRAY[CustomIcmsConfByState] companies_company_id_icms_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort)



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyICMSApi;

my $api_instance = WWW::SwaggerClient::CompanyICMSApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 

eval { 
    my $result = $api_instance->companies_company_id_icms_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyICMSApi->companies_company_id_icms_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional] 

### Return type

[**ARRAY[CustomIcmsConfByState]**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_icms_state_get**
> CustomIcmsConfByState companies_company_id_icms_state_get(company_id => $company_id, state => $state)



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyICMSApi;

my $api_instance = WWW::SwaggerClient::CompanyICMSApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $state = 'state_example'; # string | Brazilian State

eval { 
    my $result = $api_instance->companies_company_id_icms_state_get(company_id => $company_id, state => $state);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyICMSApi->companies_company_id_icms_state_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_icms**
> InlineResponse201 create_icms(company_id => $company_id, body => $body)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyICMSApi;

my $api_instance = WWW::SwaggerClient::CompanyICMSApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::CustomIcmsConfByState->new(); # CustomIcmsConfByState | Transaction Message

eval { 
    my $result = $api_instance->create_icms(company_id => $company_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyICMSApi->create_icms: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_icms_conf_by_state**
> delete_custom_icms_conf_by_state(company_id => $company_id, state => $state)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyICMSApi;

my $api_instance = WWW::SwaggerClient::CompanyICMSApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $state = 'state_example'; # string | Brazilian State

eval { 
    $api_instance->delete_custom_icms_conf_by_state(company_id => $company_id, state => $state);
};
if ($@) {
    warn "Exception when calling CompanyICMSApi->delete_custom_icms_conf_by_state: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_icms_conf_by_state**
> update_custom_icms_conf_by_state(company_id => $company_id, state => $state, body => $body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyICMSApi;

my $api_instance = WWW::SwaggerClient::CompanyICMSApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $state = 'state_example'; # string | Brazilian State
my $body = WWW::SwaggerClient::Object::CustomIcmsConfByState->new(); # CustomIcmsConfByState | Transaction Message

eval { 
    $api_instance->update_custom_icms_conf_by_state(company_id => $company_id, state => $state, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyICMSApi->update_custom_icms_conf_by_state: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **state** | **string**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

