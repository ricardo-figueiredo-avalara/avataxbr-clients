# Swagger\Client\CompanyItemServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](CompanyItemServiceApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodeserviceGet**](CompanyItemServiceApi.md#companiesCompanyIdItemsCodeserviceGet) | **GET** /companies/{companyId}/items/{code}?service | 
[**companiesCompanyIdItemsserviceGet**](CompanyItemServiceApi.md#companiesCompanyIdItemsserviceGet) | **GET** /companies/{companyId}/items?service | 
[**createItemService**](CompanyItemServiceApi.md#createItemService) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**deleteItemService**](CompanyItemServiceApi.md#deleteItemService) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**updateItemService**](CompanyItemServiceApi.md#updateItemService) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **companiesCompanyIdItemsCodeChangeCodePut**
> companiesCompanyIdItemsCodeChangeCodePut($company_id, $code, $body, $goods, $service)



Change the code of a given item.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$body = new \Swagger\Client\Model\Body1(); // \Swagger\Client\Model\Body1 | Requisition
$goods = "goods_example"; // string | Provide to apply to goods items.
$service = "service_example"; // string | Provide to apply to service items.

try {
    $api_instance->companiesCompanyIdItemsCodeChangeCodePut($company_id, $code, $body, $goods, $service);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeChangeCodePut: ', $e->getMessage(), PHP_EOL;
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

# **companiesCompanyIdItemsCodeserviceGet**
> \Swagger\Client\Model\ItemSimple companiesCompanyIdItemsCodeserviceGet($company_id, $code, $avalara_product_type, $agast)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$avalara_product_type = "service"; // string | Avalara Product Type
$agast = "agast_example"; // string | Custom Agast Code

try {
    $result = $api_instance->companiesCompanyIdItemsCodeserviceGet($company_id, $code, $avalara_product_type, $agast);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeserviceGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]
 **agast** | **string**| Custom Agast Code | [optional]

### Return type

[**\Swagger\Client\Model\ItemSimple**](../Model/ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdItemsserviceGet**
> \Swagger\Client\Model\ItemSimple[] companiesCompanyIdItemsserviceGet($company_id, $avalara_product_type, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $code, $agast)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$avalara_product_type = "service"; // string | Avalara Product Type
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 
$code = "code_example"; // string | Item Code
$agast = "agast_example"; // string | Custom Agast Code

try {
    $result = $api_instance->companiesCompanyIdItemsserviceGet($company_id, $avalara_product_type, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $code, $agast);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->companiesCompanyIdItemsserviceGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional]
 **code** | **string**| Item Code | [optional]
 **agast** | **string**| Custom Agast Code | [optional]

### Return type

[**\Swagger\Client\Model\ItemSimple[]**](../Model/ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createItemService**
> \Swagger\Client\Model\InlineResponse201 createItemService($company_id, $body, $avalara_product_type)

Create custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\ItemSimple(); // \Swagger\Client\Model\ItemSimple | Transaction Message
$avalara_product_type = "service"; // string | Avalara Product Type

try {
    $result = $api_instance->createItemService($company_id, $body, $avalara_product_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->createItemService: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\ItemSimple**](../Model/\Swagger\Client\Model\ItemSimple.md)| Transaction Message |
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteItemService**
> deleteItemService($company_id, $code, $avalara_product_type)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$avalara_product_type = "service"; // string | Avalara Product Type

try {
    $api_instance->deleteItemService($company_id, $code, $avalara_product_type);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->deleteItemService: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateItemService**
> updateItemService($company_id, $code, $body, $avalara_product_type)

Update custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$body = new \Swagger\Client\Model\ItemSimple(); // \Swagger\Client\Model\ItemSimple | Transaction Message
$avalara_product_type = "service"; // string | Avalara Product Type

try {
    $api_instance->updateItemService($company_id, $code, $body, $avalara_product_type);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemServiceApi->updateItemService: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **body** | [**\Swagger\Client\Model\ItemSimple**](../Model/\Swagger\Client\Model\ItemSimple.md)| Transaction Message |
 **avalara_product_type** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

