# WWW::SwaggerClient::CompanyTaxRatesApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyTaxRatesApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_taxrates_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_get) | **GET** /companies/{companyId}/taxrates | 
[**companies_company_id_taxrates_tax_type_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_tax_type_get) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**create_custom_taxes**](CompanyTaxRatesApi.md#create_custom_taxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**delete_custom_taxes**](CompanyTaxRatesApi.md#delete_custom_taxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**update_custom_taxes**](CompanyTaxRatesApi.md#update_custom_taxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **companies_company_id_taxrates_get**
> ARRAY[CustomTaxTypeRate] companies_company_id_taxrates_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyTaxRatesApi;

my $api_instance = WWW::SwaggerClient::CompanyTaxRatesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 

eval { 
    my $result = $api_instance->companies_company_id_taxrates_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_get: $@\n";
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

[**ARRAY[CustomTaxTypeRate]**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_taxrates_tax_type_get**
> CustomTaxTypeRate companies_company_id_taxrates_tax_type_get(company_id => $company_id, tax_type => $tax_type)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyTaxRatesApi;

my $api_instance = WWW::SwaggerClient::CompanyTaxRatesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $tax_type = 'tax_type_example'; # string | Tax Type

eval { 
    my $result = $api_instance->companies_company_id_taxrates_tax_type_get(company_id => $company_id, tax_type => $tax_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_tax_type_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **tax_type** | **string**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_taxes**
> InlineResponse201 create_custom_taxes(company_id => $company_id, body => $body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyTaxRatesApi;

my $api_instance = WWW::SwaggerClient::CompanyTaxRatesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::CustomTaxTypeRate->new(); # CustomTaxTypeRate | Transaction Message

eval { 
    my $result = $api_instance->create_custom_taxes(company_id => $company_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyTaxRatesApi->create_custom_taxes: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_taxes**
> delete_custom_taxes(company_id => $company_id, tax_type => $tax_type)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyTaxRatesApi;

my $api_instance = WWW::SwaggerClient::CompanyTaxRatesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $tax_type = 'tax_type_example'; # string | Tax Type

eval { 
    $api_instance->delete_custom_taxes(company_id => $company_id, tax_type => $tax_type);
};
if ($@) {
    warn "Exception when calling CompanyTaxRatesApi->delete_custom_taxes: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **tax_type** | **string**| Tax Type | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_taxes**
> update_custom_taxes(company_id => $company_id, tax_type => $tax_type, body => $body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyTaxRatesApi;

my $api_instance = WWW::SwaggerClient::CompanyTaxRatesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $tax_type = 'tax_type_example'; # string | Tax Type
my $body = WWW::SwaggerClient::Object::CustomTaxTypeRate->new(); # CustomTaxTypeRate | Transaction Message

eval { 
    $api_instance->update_custom_taxes(company_id => $company_id, tax_type => $tax_type, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyTaxRatesApi->update_custom_taxes: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **tax_type** | **string**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

