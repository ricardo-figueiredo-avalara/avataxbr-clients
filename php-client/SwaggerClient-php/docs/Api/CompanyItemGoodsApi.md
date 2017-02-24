# Swagger\Client\CompanyItemGoodsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](CompanyItemGoodsApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodegoodsGet**](CompanyItemGoodsApi.md#companiesCompanyIdItemsCodegoodsGet) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companiesCompanyIdItemsgoodsGet**](CompanyItemGoodsApi.md#companiesCompanyIdItemsgoodsGet) | **GET** /companies/{companyId}/items?goods | 
[**createItem**](CompanyItemGoodsApi.md#createItem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**deleteItem**](CompanyItemGoodsApi.md#deleteItem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**updateItem**](CompanyItemGoodsApi.md#updateItem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


# **companiesCompanyIdItemsCodeChangeCodePut**
> companiesCompanyIdItemsCodeChangeCodePut($company_id, $code, $body, $goods, $service)



Change the code of a given item.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$body = new \Swagger\Client\Model\Body1(); // \Swagger\Client\Model\Body1 | Requisition
$goods = "goods_example"; // string | Provide to apply to goods items.
$service = "service_example"; // string | Provide to apply to service items.

try {
    $api_instance->companiesCompanyIdItemsCodeChangeCodePut($company_id, $code, $body, $goods, $service);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodeChangeCodePut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **body** | [**\Swagger\Client\Model\Body1**](../Model/\Swagger\Client\Model\Body1.md)| Requisition |
 **goods** | **string**| Provide to apply to goods items. | [optional]
 **service** | **string**| Provide to apply to service items. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdItemsCodegoodsGet**
> \Swagger\Client\Model\ItemGoods companiesCompanyIdItemsCodegoodsGet($company_id, $code, $avalara_product_type, $agast)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$avalara_product_type = "goods"; // string | Avalara Product Type
$agast = "agast_example"; // string | Custom Agast Code

try {
    $result = $api_instance->companiesCompanyIdItemsCodegoodsGet($company_id, $code, $avalara_product_type, $agast);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodegoodsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **agast** | **string**| Custom Agast Code | [optional]

### Return type

[**\Swagger\Client\Model\ItemGoods**](../Model/ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdItemsgoodsGet**
> \Swagger\Client\Model\ItemGoods[] companiesCompanyIdItemsgoodsGet($company_id, $avalara_product_type, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $code, $agast)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$avalara_product_type = "goods"; // string | Avalara Product Type
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 
$code = "code_example"; // string | Item Code
$agast = "agast_example"; // string | Custom Agast Code

try {
    $result = $api_instance->companiesCompanyIdItemsgoodsGet($company_id, $avalara_product_type, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $code, $agast);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->companiesCompanyIdItemsgoodsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional]
 **code** | **string**| Item Code | [optional]
 **agast** | **string**| Custom Agast Code | [optional]

### Return type

[**\Swagger\Client\Model\ItemGoods[]**](../Model/ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createItem**
> \Swagger\Client\Model\InlineResponse201 createItem($company_id, $avalara_product_type, $body)

Create custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$avalara_product_type = "goods"; // string | Avalara Product Type
$body = new \Swagger\Client\Model\ItemGoods(); // \Swagger\Client\Model\ItemGoods | Transaction Message

try {
    $result = $api_instance->createItem($company_id, $avalara_product_type, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->createItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **body** | [**\Swagger\Client\Model\ItemGoods**](../Model/\Swagger\Client\Model\ItemGoods.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteItem**
> deleteItem($company_id, $code, $avalara_product_type)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$avalara_product_type = "goods"; // string | Avalara Product Type

try {
    $api_instance->deleteItem($company_id, $code, $avalara_product_type);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->deleteItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateItem**
> updateItem($company_id, $code, $avalara_product_type, $body)

Update custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemGoodsApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$avalara_product_type = "goods"; // string | Avalara Product Type
$body = new \Swagger\Client\Model\ItemGoods(); // \Swagger\Client\Model\ItemGoods | Transaction Message

try {
    $api_instance->updateItem($company_id, $code, $avalara_product_type, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemGoodsApi->updateItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **avalara_product_type** | **string**| Avalara Product Type | [default to goods]
 **body** | [**\Swagger\Client\Model\ItemGoods**](../Model/\Swagger\Client\Model\ItemGoods.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

