# Swagger\Client\CompanyICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdIcmsGet**](CompanyICMSApi.md#companiesCompanyIdIcmsGet) | **GET** /companies/{companyId}/icms | 
[**companiesCompanyIdIcmsStateGet**](CompanyICMSApi.md#companiesCompanyIdIcmsStateGet) | **GET** /companies/{companyId}/icms/{state} | 
[**createICMS**](CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**deleteCustomIcmsConfByState**](CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
[**updateCustomIcmsConfByState**](CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **companiesCompanyIdIcmsGet**
> \Swagger\Client\Model\CustomIcmsConfByState[] companiesCompanyIdIcmsGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort)



This operation return custom ICMS configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyICMSApi();
$company_id = "company_id_example"; // string | Company ID
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 

try {
    $result = $api_instance->companiesCompanyIdIcmsGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyICMSApi->companiesCompanyIdIcmsGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\CustomIcmsConfByState[]**](../Model/CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdIcmsStateGet**
> \Swagger\Client\Model\CustomIcmsConfByState companiesCompanyIdIcmsStateGet($company_id, $state)



This operation return custom ICMS configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyICMSApi();
$company_id = "company_id_example"; // string | Company ID
$state = "state_example"; // string | Brazilian State

try {
    $result = $api_instance->companiesCompanyIdIcmsStateGet($company_id, $state);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyICMSApi->companiesCompanyIdIcmsStateGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **state** | **string**| Brazilian State |

### Return type

[**\Swagger\Client\Model\CustomIcmsConfByState**](../Model/CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createICMS**
> \Swagger\Client\Model\InlineResponse201 createICMS($company_id, $body)

Create custom ICMS tax for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyICMSApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\CustomIcmsConfByState(); // \Swagger\Client\Model\CustomIcmsConfByState | Transaction Message

try {
    $result = $api_instance->createICMS($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyICMSApi->createICMS: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\CustomIcmsConfByState**](../Model/\Swagger\Client\Model\CustomIcmsConfByState.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCustomIcmsConfByState**
> deleteCustomIcmsConfByState($company_id, $state)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyICMSApi();
$company_id = "company_id_example"; // string | Company ID
$state = "state_example"; // string | Brazilian State

try {
    $api_instance->deleteCustomIcmsConfByState($company_id, $state);
} catch (Exception $e) {
    echo 'Exception when calling CompanyICMSApi->deleteCustomIcmsConfByState: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **state** | **string**| Brazilian State |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCustomIcmsConfByState**
> updateCustomIcmsConfByState($company_id, $state, $body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyICMSApi();
$company_id = "company_id_example"; // string | Company ID
$state = "state_example"; // string | Brazilian State
$body = new \Swagger\Client\Model\CustomIcmsConfByState(); // \Swagger\Client\Model\CustomIcmsConfByState | Transaction Message

try {
    $api_instance->updateCustomIcmsConfByState($company_id, $state, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyICMSApi->updateCustomIcmsConfByState: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **state** | **string**| Brazilian State |
 **body** | [**\Swagger\Client\Model\CustomIcmsConfByState**](../Model/\Swagger\Client\Model\CustomIcmsConfByState.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

