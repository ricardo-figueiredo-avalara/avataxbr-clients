# WWW::SwaggerClient::CompanyItemCPOMServiceApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyItemCPOMServiceApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_cpom_city_code_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_city_code_get) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companies_company_id_items_code_cpom_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_get) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**create_item_cpom**](CompanyItemCPOMServiceApi.md#create_item_cpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**delete_item_cpom**](CompanyItemCPOMServiceApi.md#delete_item_cpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**update_item_cpom**](CompanyItemCPOMServiceApi.md#update_item_cpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **companies_company_id_items_code_cpom_city_code_get**
> ItemCpom companies_company_id_items_code_cpom_city_code_get(company_id => $company_id, code => $code, city_code => $city_code)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemCPOMServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $city_code = 3.4; # Number | City Code

eval { 
    my $result = $api_instance->companies_company_id_items_code_cpom_city_code_get(company_id => $company_id, code => $code, city_code => $city_code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_city_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **city_code** | **Number**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_items_code_cpom_get**
> ARRAY[ItemCpom] companies_company_id_items_code_cpom_get(company_id => $company_id, code => $code, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemCPOMServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 

eval { 
    my $result = $api_instance->companies_company_id_items_code_cpom_get(company_id => $company_id, code => $code, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional] 

### Return type

[**ARRAY[ItemCpom]**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item_cpom**
> InlineResponse201 create_item_cpom(company_id => $company_id, code => $code, body => $body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemCPOMServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $body = WWW::SwaggerClient::Object::ItemCpom->new(); # ItemCpom | Transaction Message

eval { 
    my $result = $api_instance->create_item_cpom(company_id => $company_id, code => $code, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemCPOMServiceApi->create_item_cpom: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item_cpom**
> delete_item_cpom(company_id => $company_id, code => $code, city_code => $city_code)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemCPOMServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $city_code = 3.4; # Number | City Code

eval { 
    $api_instance->delete_item_cpom(company_id => $company_id, code => $code, city_code => $city_code);
};
if ($@) {
    warn "Exception when calling CompanyItemCPOMServiceApi->delete_item_cpom: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **city_code** | **Number**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item_cpom**
> update_item_cpom(company_id => $company_id, code => $code, city_code => $city_code, body => $body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemCPOMServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $city_code = 3.4; # Number | City Code
my $body = WWW::SwaggerClient::Object::ItemCpom->new(); # ItemCpom | Transaction Message

eval { 
    $api_instance->update_item_cpom(company_id => $company_id, code => $code, city_code => $city_code, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyItemCPOMServiceApi->update_item_cpom: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **city_code** | **Number**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

