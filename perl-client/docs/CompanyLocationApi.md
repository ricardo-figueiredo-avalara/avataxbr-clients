# WWW::SwaggerClient::CompanyLocationApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyLocationApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_locations_code_get**](CompanyLocationApi.md#companies_company_id_locations_code_get) | **GET** /companies/{companyId}/locations/{code} | 
[**companies_company_id_locations_get**](CompanyLocationApi.md#companies_company_id_locations_get) | **GET** /companies/{companyId}/locations | 
[**create_location**](CompanyLocationApi.md#create_location) | **POST** /companies/{companyId}/locations | Create new location for company
[**delete_location**](CompanyLocationApi.md#delete_location) | **DELETE** /companies/{companyId}/locations/{code} | 
[**update_location**](CompanyLocationApi.md#update_location) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


# **companies_company_id_locations_code_get**
> Location companies_company_id_locations_code_get(company_id => $company_id, code => $code)



This operation return location 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyLocationApi;

my $api_instance = WWW::SwaggerClient::CompanyLocationApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Location Code

eval { 
    my $result = $api_instance->companies_company_id_locations_code_get(company_id => $company_id, code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyLocationApi->companies_company_id_locations_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_locations_get**
> ARRAY[Location] companies_company_id_locations_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort)



This operation return all locations 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyLocationApi;

my $api_instance = WWW::SwaggerClient::CompanyLocationApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 

eval { 
    my $result = $api_instance->companies_company_id_locations_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyLocationApi->companies_company_id_locations_get: $@\n";
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

[**ARRAY[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_location**
> InlineResponse201 create_location(company_id => $company_id, body => $body)

Create new location for company

This method operation create a new location for company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyLocationApi;

my $api_instance = WWW::SwaggerClient::CompanyLocationApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::Location->new(); # Location | Transaction Message

eval { 
    my $result = $api_instance->create_location(company_id => $company_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyLocationApi->create_location: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_location**
> delete_location(company_id => $company_id, code => $code)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyLocationApi;

my $api_instance = WWW::SwaggerClient::CompanyLocationApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Location Code

eval { 
    $api_instance->delete_location(company_id => $company_id, code => $code);
};
if ($@) {
    warn "Exception when calling CompanyLocationApi->delete_location: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_location**
> update_location(company_id => $company_id, code => $code, body => $body)

Update location for company

This method operation update a location for company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyLocationApi;

my $api_instance = WWW::SwaggerClient::CompanyLocationApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Location Code
my $body = WWW::SwaggerClient::Object::Location->new(); # Location | Transaction Message

eval { 
    $api_instance->update_location(company_id => $company_id, code => $code, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyLocationApi->update_location: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

