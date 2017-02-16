# Swagger\Client\CompanyTaxRatesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdTaxratesGet**](CompanyTaxRatesApi.md#companiesCompanyIdTaxratesGet) | **GET** /companies/{companyId}/taxrates | 
[**companiesCompanyIdTaxratesTaxTypeGet**](CompanyTaxRatesApi.md#companiesCompanyIdTaxratesTaxTypeGet) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**createCustomTaxes**](CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**deleteCustomTaxes**](CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**updateCustomTaxes**](CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **companiesCompanyIdTaxratesGet**
> \Swagger\Client\Model\CustomTaxTypeRate[] companiesCompanyIdTaxratesGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyTaxRatesApi();
$company_id = "company_id_example"; // string | Company ID
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 

try {
    $result = $api_instance->companiesCompanyIdTaxratesGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyTaxRatesApi->companiesCompanyIdTaxratesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\CustomTaxTypeRate[]**](../Model/CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdTaxratesTaxTypeGet**
> \Swagger\Client\Model\CustomTaxTypeRate companiesCompanyIdTaxratesTaxTypeGet($company_id, $tax_type)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyTaxRatesApi();
$company_id = "company_id_example"; // string | Company ID
$tax_type = "tax_type_example"; // string | Tax Type

try {
    $result = $api_instance->companiesCompanyIdTaxratesTaxTypeGet($company_id, $tax_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyTaxRatesApi->companiesCompanyIdTaxratesTaxTypeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **tax_type** | **string**| Tax Type |

### Return type

[**\Swagger\Client\Model\CustomTaxTypeRate**](../Model/CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCustomTaxes**
> \Swagger\Client\Model\InlineResponse201 createCustomTaxes($company_id, $body)

Create custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyTaxRatesApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\CustomTaxTypeRate(); // \Swagger\Client\Model\CustomTaxTypeRate | Transaction Message

try {
    $result = $api_instance->createCustomTaxes($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyTaxRatesApi->createCustomTaxes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\CustomTaxTypeRate**](../Model/\Swagger\Client\Model\CustomTaxTypeRate.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCustomTaxes**
> deleteCustomTaxes($company_id, $tax_type)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyTaxRatesApi();
$company_id = "company_id_example"; // string | Company ID
$tax_type = "tax_type_example"; // string | Tax Type

try {
    $api_instance->deleteCustomTaxes($company_id, $tax_type);
} catch (Exception $e) {
    echo 'Exception when calling CompanyTaxRatesApi->deleteCustomTaxes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **tax_type** | **string**| Tax Type |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCustomTaxes**
> updateCustomTaxes($company_id, $tax_type, $body)

Update custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyTaxRatesApi();
$company_id = "company_id_example"; // string | Company ID
$tax_type = "tax_type_example"; // string | Tax Type
$body = new \Swagger\Client\Model\CustomTaxTypeRate(); // \Swagger\Client\Model\CustomTaxTypeRate | Transaction Message

try {
    $api_instance->updateCustomTaxes($company_id, $tax_type, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyTaxRatesApi->updateCustomTaxes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **tax_type** | **string**| Tax Type |
 **body** | [**\Swagger\Client\Model\CustomTaxTypeRate**](../Model/\Swagger\Client\Model\CustomTaxTypeRate.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

