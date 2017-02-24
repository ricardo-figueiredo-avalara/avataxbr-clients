# WWW::SwaggerClient::CompanyItemServiceApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyItemServiceApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemServiceApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codeservice_get**](CompanyItemServiceApi.md#companies_company_id_items_codeservice_get) | **GET** /companies/{companyId}/items/{code}?service | 
[**companies_company_id_itemsservice_get**](CompanyItemServiceApi.md#companies_company_id_itemsservice_get) | **GET** /companies/{companyId}/items?service | 
[**create_item_service**](CompanyItemServiceApi.md#create_item_service) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**delete_item_service**](CompanyItemServiceApi.md#delete_item_service) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**update_item_service**](CompanyItemServiceApi.md#update_item_service) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **companies_company_id_items_code_change_code_put**
> companies_company_id_items_code_change_code_put(company_id => $company_id, code => $code, body => $body, goods => $goods, service => $service)



Change the code of a given item. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $body = WWW::SwaggerClient::Object::Body1->new(); # Body1 | Requisition
my $goods = 'goods_example'; # string | Provide to apply to goods items.
my $service = 'service_example'; # string | Provide to apply to service items.

eval { 
    $api_instance->companies_company_id_items_code_change_code_put(company_id => $company_id, code => $code, body => $body, goods => $goods, service => $service);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->companies_company_id_items_code_change_code_put: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**Body1**](Body1.md)| Requisition | 
 **goods** | **string**| Provide to apply to goods items. | [optional] 
 **service** | **string**| Provide to apply to service items. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_items_codeservice_get**
> ItemSimple companies_company_id_items_codeservice_get(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, agast => $agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $agast = 'agast_example'; # string | Custom Agast Code

eval { 
    my $result = $api_instance->companies_company_id_items_codeservice_get(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, agast => $agast);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->companies_company_id_items_codeservice_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_itemsservice_get**
> ARRAY[ItemSimple] companies_company_id_itemsservice_get(company_id => $company_id, avalara_product_type => $avalara_product_type, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, code => $code, agast => $agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 
my $code = 'code_example'; # string | Item Code
my $agast = 'agast_example'; # string | Custom Agast Code

eval { 
    my $result = $api_instance->companies_company_id_itemsservice_get(company_id => $company_id, avalara_product_type => $avalara_product_type, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, code => $code, agast => $agast);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->companies_company_id_itemsservice_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ARRAY[ItemSimple]**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item_service**
> InlineResponse201 create_item_service(company_id => $company_id, body => $body, avalara_product_type => $avalara_product_type)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::ItemSimple->new(); # ItemSimple | Transaction Message
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type

eval { 
    my $result = $api_instance->create_item_service(company_id => $company_id, body => $body, avalara_product_type => $avalara_product_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->create_item_service: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item_service**
> delete_item_service(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type

eval { 
    $api_instance->delete_item_service(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->delete_item_service: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item_service**
> update_item_service(company_id => $company_id, code => $code, body => $body, avalara_product_type => $avalara_product_type)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemServiceApi;

my $api_instance = WWW::SwaggerClient::CompanyItemServiceApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $body = WWW::SwaggerClient::Object::ItemSimple->new(); # ItemSimple | Transaction Message
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type

eval { 
    $api_instance->update_item_service(company_id => $company_id, code => $code, body => $body, avalara_product_type => $avalara_product_type);
};
if ($@) {
    warn "Exception when calling CompanyItemServiceApi->update_item_service: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

