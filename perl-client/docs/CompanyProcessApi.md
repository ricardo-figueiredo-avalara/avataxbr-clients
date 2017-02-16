# WWW::SwaggerClient::CompanyProcessApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyProcessApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_process_code_get**](CompanyProcessApi.md#companies_company_id_process_code_get) | **GET** /companies/{companyId}/process/{code} | 
[**companies_company_id_process_get**](CompanyProcessApi.md#companies_company_id_process_get) | **GET** /companies/{companyId}/process | 
[**create_custom_process_scenario**](CompanyProcessApi.md#create_custom_process_scenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**delete_custom_process_scenario**](CompanyProcessApi.md#delete_custom_process_scenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**update_custom_process_scenario**](CompanyProcessApi.md#update_custom_process_scenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


# **companies_company_id_process_code_get**
> CustomProcessScenario companies_company_id_process_code_get(company_id => $company_id, code => $code)



This operation return custom process configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyProcessApi;

my $api_instance = WWW::SwaggerClient::CompanyProcessApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Process Code

eval { 
    my $result = $api_instance->companies_company_id_process_code_get(company_id => $company_id, code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyProcessApi->companies_company_id_process_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_process_get**
> ARRAY[CustomProcessScenario] companies_company_id_process_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort)



This operation return custom process configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyProcessApi;

my $api_instance = WWW::SwaggerClient::CompanyProcessApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 

eval { 
    my $result = $api_instance->companies_company_id_process_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyProcessApi->companies_company_id_process_get: $@\n";
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

[**ARRAY[CustomProcessScenario]**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_process_scenario**
> InlineResponse201 create_custom_process_scenario(company_id => $company_id, body => $body)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyProcessApi;

my $api_instance = WWW::SwaggerClient::CompanyProcessApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::CustomProcessScenario->new(); # CustomProcessScenario | Transaction Message

eval { 
    my $result = $api_instance->create_custom_process_scenario(company_id => $company_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyProcessApi->create_custom_process_scenario: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_process_scenario**
> delete_custom_process_scenario(company_id => $company_id, code => $code)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyProcessApi;

my $api_instance = WWW::SwaggerClient::CompanyProcessApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Process Code

eval { 
    $api_instance->delete_custom_process_scenario(company_id => $company_id, code => $code);
};
if ($@) {
    warn "Exception when calling CompanyProcessApi->delete_custom_process_scenario: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_process_scenario**
> update_custom_process_scenario(company_id => $company_id, code => $code, body => $body)

Update custom agast for one company

This method operation update a custom process for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyProcessApi;

my $api_instance = WWW::SwaggerClient::CompanyProcessApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Process Code
my $body = WWW::SwaggerClient::Object::CustomProcessScenario->new(); # CustomProcessScenario | Transaction Message

eval { 
    $api_instance->update_custom_process_scenario(company_id => $company_id, code => $code, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyProcessApi->update_custom_process_scenario: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

