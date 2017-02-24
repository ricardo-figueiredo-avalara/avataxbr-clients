# Swagger\Client\CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdProcessCodeGet**](CompanyProcessApi.md#companiesCompanyIdProcessCodeGet) | **GET** /companies/{companyId}/process/{code} | 
[**companiesCompanyIdProcessGet**](CompanyProcessApi.md#companiesCompanyIdProcessGet) | **GET** /companies/{companyId}/process | 
[**createCustomProcessScenario**](CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**deleteCustomProcessScenario**](CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**updateCustomProcessScenario**](CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


# **companiesCompanyIdProcessCodeGet**
> \Swagger\Client\Model\CustomProcessScenario companiesCompanyIdProcessCodeGet($company_id, $code)



This operation return custom process configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyProcessApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Process Code

try {
    $result = $api_instance->companiesCompanyIdProcessCodeGet($company_id, $code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyProcessApi->companiesCompanyIdProcessCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Process Code |

### Return type

[**\Swagger\Client\Model\CustomProcessScenario**](../Model/CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdProcessGet**
> \Swagger\Client\Model\CustomProcessScenario[] companiesCompanyIdProcessGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort)



This operation return custom process configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyProcessApi();
$company_id = "company_id_example"; // string | Company ID
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 

try {
    $result = $api_instance->companiesCompanyIdProcessGet($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyProcessApi->companiesCompanyIdProcessGet: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\CustomProcessScenario[]**](../Model/CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCustomProcessScenario**
> \Swagger\Client\Model\InlineResponse201 createCustomProcessScenario($company_id, $body)

Create custom process tax for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyProcessApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\CustomProcessScenario(); // \Swagger\Client\Model\CustomProcessScenario | Transaction Message

try {
    $result = $api_instance->createCustomProcessScenario($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyProcessApi->createCustomProcessScenario: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\CustomProcessScenario**](../Model/\Swagger\Client\Model\CustomProcessScenario.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCustomProcessScenario**
> deleteCustomProcessScenario($company_id, $code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyProcessApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Process Code

try {
    $api_instance->deleteCustomProcessScenario($company_id, $code);
} catch (Exception $e) {
    echo 'Exception when calling CompanyProcessApi->deleteCustomProcessScenario: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Process Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCustomProcessScenario**
> updateCustomProcessScenario($company_id, $code, $body)

Update custom agast for one company

This method operation update a custom process for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyProcessApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Process Code
$body = new \Swagger\Client\Model\CustomProcessScenario(); // \Swagger\Client\Model\CustomProcessScenario | Transaction Message

try {
    $api_instance->updateCustomProcessScenario($company_id, $code, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyProcessApi->updateCustomProcessScenario: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Process Code |
 **body** | [**\Swagger\Client\Model\CustomProcessScenario**](../Model/\Swagger\Client\Model\CustomProcessScenario.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

