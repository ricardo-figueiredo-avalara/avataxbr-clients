# Swagger\Client\CompanyItemCPOMServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeCpomCityCodeGet**](CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomCityCodeGet) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companiesCompanyIdItemsCodeCpomGet**](CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomGet) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**createItemCPOM**](CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**deleteItemCPOM**](CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**updateItemCPOM**](CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **companiesCompanyIdItemsCodeCpomCityCodeGet**
> \Swagger\Client\Model\ItemCpom companiesCompanyIdItemsCodeCpomCityCodeGet($company_id, $code, $city_code)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemCPOMServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$city_code = 3.4; // float | City Code

try {
    $result = $api_instance->companiesCompanyIdItemsCodeCpomCityCodeGet($company_id, $code, $city_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomCityCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **city_code** | **float**| City Code |

### Return type

[**\Swagger\Client\Model\ItemCpom**](../Model/ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdItemsCodeCpomGet**
> \Swagger\Client\Model\ItemCpom[] companiesCompanyIdItemsCodeCpomGet($company_id, $code, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemCPOMServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 

try {
    $result = $api_instance->companiesCompanyIdItemsCodeCpomGet($company_id, $code, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\ItemCpom[]**](../Model/ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createItemCPOM**
> \Swagger\Client\Model\InlineResponse201 createItemCPOM($company_id, $code, $body)

Create custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemCPOMServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$body = new \Swagger\Client\Model\ItemCpom(); // \Swagger\Client\Model\ItemCpom | Transaction Message

try {
    $result = $api_instance->createItemCPOM($company_id, $code, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemCPOMServiceApi->createItemCPOM: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **body** | [**\Swagger\Client\Model\ItemCpom**](../Model/\Swagger\Client\Model\ItemCpom.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteItemCPOM**
> deleteItemCPOM($company_id, $code, $city_code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemCPOMServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$city_code = 3.4; // float | City Code

try {
    $api_instance->deleteItemCPOM($company_id, $code, $city_code);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemCPOMServiceApi->deleteItemCPOM: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **city_code** | **float**| City Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateItemCPOM**
> updateItemCPOM($company_id, $code, $city_code, $body)

Update custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyItemCPOMServiceApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Item Code
$city_code = 3.4; // float | City Code
$body = new \Swagger\Client\Model\ItemCpom(); // \Swagger\Client\Model\ItemCpom | Transaction Message

try {
    $api_instance->updateItemCPOM($company_id, $code, $city_code, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyItemCPOMServiceApi->updateItemCPOM: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Item Code |
 **city_code** | **float**| City Code |
 **body** | [**\Swagger\Client\Model\ItemCpom**](../Model/\Swagger\Client\Model\ItemCpom.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

