# Swagger\Client\CompanyLocationApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdLocationsCodeGet**](CompanyLocationApi.md#companiesCompanyIdLocationsCodeGet) | **GET** /companies/{companyId}/locations/{code} | 
[**companiesCompanyIdLocationsGet**](CompanyLocationApi.md#companiesCompanyIdLocationsGet) | **GET** /companies/{companyId}/locations | 
[**createLocation**](CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**updateLocation**](CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


# **companiesCompanyIdLocationsCodeGet**
> \Swagger\Client\Model\Location companiesCompanyIdLocationsCodeGet($company_id, $code)



This operation return location

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyLocationApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Location Code

try {
    $result = $api_instance->companiesCompanyIdLocationsCodeGet($company_id, $code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyLocationApi->companiesCompanyIdLocationsCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Location Code |

### Return type

[**\Swagger\Client\Model\Location**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdLocationsGet**
> \Swagger\Client\Model\Location[] companiesCompanyIdLocationsGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort)



This operation return all locations

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyLocationApi();
$company_id = "company_id_example"; // string | Company ID
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 

try {
    $result = $api_instance->companiesCompanyIdLocationsGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyLocationApi->companiesCompanyIdLocationsGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\Location[]**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createLocation**
> \Swagger\Client\Model\InlineResponse201 createLocation($company_id, $body)

Create new location for company

This method operation create a new location for company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyLocationApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\Location(); // \Swagger\Client\Model\Location | Transaction Message

try {
    $result = $api_instance->createLocation($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyLocationApi->createLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\Location**](../Model/\Swagger\Client\Model\Location.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteLocation**
> deleteLocation($company_id, $code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyLocationApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Location Code

try {
    $api_instance->deleteLocation($company_id, $code);
} catch (Exception $e) {
    echo 'Exception when calling CompanyLocationApi->deleteLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Location Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateLocation**
> updateLocation($company_id, $code, $body)

Update location for company

This method operation update a location for company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyLocationApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Location Code
$body = new \Swagger\Client\Model\Location(); // \Swagger\Client\Model\Location | Transaction Message

try {
    $api_instance->updateLocation($company_id, $code, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyLocationApi->updateLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Location Code |
 **body** | [**\Swagger\Client\Model\Location**](../Model/\Swagger\Client\Model\Location.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

