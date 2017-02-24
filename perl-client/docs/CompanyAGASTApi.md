# WWW::SwaggerClient::CompanyAGASTApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyAGASTApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_agasts_code_get**](CompanyAGASTApi.md#companies_company_id_agasts_code_get) | **GET** /companies/{companyId}/agasts/{code} | 
[**companies_company_id_agasts_get**](CompanyAGASTApi.md#companies_company_id_agasts_get) | **GET** /companies/{companyId}/agasts | 
[**create_custom_agast**](CompanyAGASTApi.md#create_custom_agast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**delete_agast**](CompanyAGASTApi.md#delete_agast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**update_custom_agast**](CompanyAGASTApi.md#update_custom_agast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **companies_company_id_agasts_code_get**
> CustomAgast companies_company_id_agasts_code_get(company_id => $company_id, code => $code, parent => $parent)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyAGASTApi;

my $api_instance = WWW::SwaggerClient::CompanyAGASTApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Agast Code
my $parent = 'parent_example'; # string | Agast parent code, means that this agast is a specialization of parent agast 

eval { 
    my $result = $api_instance->companies_company_id_agasts_code_get(company_id => $company_id, code => $code, parent => $parent);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyAGASTApi->companies_company_id_agasts_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Agast Code | 
 **parent** | **string**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_agasts_get**
> ARRAY[InlineResponse2001] companies_company_id_agasts_get(company_id => $company_id, text => $text, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, agast => $agast, parent => $parent)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyAGASTApi;

my $api_instance = WWW::SwaggerClient::CompanyAGASTApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $text = 'text_example'; # string | Text query
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 
my $agast = 'agast_example'; # string | Custom Agast Code
my $parent = 'parent_example'; # string | Agast Code

eval { 
    my $result = $api_instance->companies_company_id_agasts_get(company_id => $company_id, text => $text, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, agast => $agast, parent => $parent);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyAGASTApi->companies_company_id_agasts_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **text** | **string**| Text query | [optional] 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 
 **parent** | **string**| Agast Code | [optional] 

### Return type

[**ARRAY[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_agast**
> InlineResponse201 create_custom_agast(company_id => $company_id, body => $body, text => $text)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyAGASTApi;

my $api_instance = WWW::SwaggerClient::CompanyAGASTApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::CustomAgast->new(); # CustomAgast | Transaction Message
my $text = 'text_example'; # string | Text query

eval { 
    my $result = $api_instance->create_custom_agast(company_id => $company_id, body => $body, text => $text);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyAGASTApi->create_custom_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **string**| Text query | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_agast**
> delete_agast(company_id => $company_id, code => $code)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyAGASTApi;

my $api_instance = WWW::SwaggerClient::CompanyAGASTApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Agast Code

eval { 
    $api_instance->delete_agast(company_id => $company_id, code => $code);
};
if ($@) {
    warn "Exception when calling CompanyAGASTApi->delete_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_agast**
> update_custom_agast(company_id => $company_id, code => $code, body => $body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyAGASTApi;

my $api_instance = WWW::SwaggerClient::CompanyAGASTApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Agast Code
my $body = WWW::SwaggerClient::Object::CustomAgast->new(); # CustomAgast | Transaction Message

eval { 
    $api_instance->update_custom_agast(company_id => $company_id, code => $code, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyAGASTApi->update_custom_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

