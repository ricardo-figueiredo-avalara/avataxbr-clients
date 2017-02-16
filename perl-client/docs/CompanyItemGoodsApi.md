# WWW::SwaggerClient::CompanyItemGoodsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyItemGoodsApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemGoodsApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codegoods_get**](CompanyItemGoodsApi.md#companies_company_id_items_codegoods_get) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companies_company_id_itemsgoods_get**](CompanyItemGoodsApi.md#companies_company_id_itemsgoods_get) | **GET** /companies/{companyId}/items?goods | 
[**create_item**](CompanyItemGoodsApi.md#create_item) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**delete_item**](CompanyItemGoodsApi.md#delete_item) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**update_item**](CompanyItemGoodsApi.md#update_item) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


# **companies_company_id_items_code_change_code_put**
> companies_company_id_items_code_change_code_put(company_id => $company_id, code => $code, body => $body, goods => $goods, service => $service)



Change the code of a given item. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $body = WWW::SwaggerClient::Object::Body1->new(); # Body1 | Requisition
my $goods = 'goods_example'; # string | Provide to apply to goods items.
my $service = 'service_example'; # string | Provide to apply to service items.

eval { 
    $api_instance->companies_company_id_items_code_change_code_put(company_id => $company_id, code => $code, body => $body, goods => $goods, service => $service);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->companies_company_id_items_code_change_code_put: $@\n";
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

# **companies_company_id_items_codegoods_get**
> ItemGoods companies_company_id_items_codegoods_get(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, agast => $agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $agast = 'agast_example'; # string | Custom Agast Code

eval { 
    my $result = $api_instance->companies_company_id_items_codegoods_get(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, agast => $agast);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->companies_company_id_items_codegoods_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_itemsgoods_get**
> ARRAY[ItemGoods] companies_company_id_itemsgoods_get(company_id => $company_id, avalara_product_type => $avalara_product_type, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, code => $code, agast => $agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $x_pagination_limit = 56; # int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
my $x_pagination_current_page = 56; # int | The current page. Defaults to 1.
my $x_pagination_sort = 'x_pagination_sort_example'; # string | 
my $code = 'code_example'; # string | Item Code
my $agast = 'agast_example'; # string | Custom Agast Code

eval { 
    my $result = $api_instance->companies_company_id_itemsgoods_get(company_id => $company_id, avalara_product_type => $avalara_product_type, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, code => $code, agast => $agast);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->companies_company_id_itemsgoods_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ARRAY[ItemGoods]**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item**
> InlineResponse201 create_item(company_id => $company_id, avalara_product_type => $avalara_product_type, body => $body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $body = WWW::SwaggerClient::Object::ItemGoods->new(); # ItemGoods | Transaction Message

eval { 
    my $result = $api_instance->create_item(company_id => $company_id, avalara_product_type => $avalara_product_type, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->create_item: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item**
> delete_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type

eval { 
    $api_instance->delete_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->delete_item: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item**
> update_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, body => $body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyItemGoodsApi;

my $api_instance = WWW::SwaggerClient::CompanyItemGoodsApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $code = 'code_example'; # string | Item Code
my $avalara_product_type = 'avalara_product_type_example'; # string | Avalara Product Type
my $body = WWW::SwaggerClient::Object::ItemGoods->new(); # ItemGoods | Transaction Message

eval { 
    $api_instance->update_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, body => $body);
};
if ($@) {
    warn "Exception when calling CompanyItemGoodsApi->update_item: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **code** | **string**| Item Code | 
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

