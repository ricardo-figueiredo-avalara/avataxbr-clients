# Swagger\Client\CompanyAGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdAgastsCodeGet**](CompanyAGASTApi.md#companiesCompanyIdAgastsCodeGet) | **GET** /companies/{companyId}/agasts/{code} | 
[**companiesCompanyIdAgastsGet**](CompanyAGASTApi.md#companiesCompanyIdAgastsGet) | **GET** /companies/{companyId}/agasts | 
[**createCustomAgast**](CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**deleteAgast**](CompanyAGASTApi.md#deleteAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**updateCustomAgast**](CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **companiesCompanyIdAgastsCodeGet**
> \Swagger\Client\Model\CustomAgast companiesCompanyIdAgastsCodeGet($company_id, $code, $parent)



This operation return custom agast configurations that match with parameters queries - Alannes.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyAGASTApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Agast Code
$parent = "parent_example"; // string | Agast parent code, means that this agast is a specialization of parent agast

try {
    $result = $api_instance->companiesCompanyIdAgastsCodeGet($company_id, $code, $parent);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyAGASTApi->companiesCompanyIdAgastsCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Agast Code |
 **parent** | **string**| Agast parent code, means that this agast is a specialization of parent agast | [optional]

### Return type

[**\Swagger\Client\Model\CustomAgast**](../Model/CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdAgastsGet**
> \Swagger\Client\Model\InlineResponse2001[] companiesCompanyIdAgastsGet($company_id, $text, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $agast, $parent)



This operation return custom agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyAGASTApi();
$company_id = "company_id_example"; // string | Company ID
$text = "text_example"; // string | Text query
$x_pagination_limit = 10; // int | The per page limit. Currently set to 10 but subject to change at any time (max 100).
$x_pagination_current_page = 1; // int | The current page. Defaults to 1.
$x_pagination_sort = "x_pagination_sort_example"; // string | 
$agast = "agast_example"; // string | Custom Agast Code
$parent = "parent_example"; // string | Agast Code

try {
    $result = $api_instance->companiesCompanyIdAgastsGet($company_id, $text, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $agast, $parent);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyAGASTApi->companiesCompanyIdAgastsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **text** | **string**| Text query | [optional]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **string**|  | [optional]
 **agast** | **string**| Custom Agast Code | [optional]
 **parent** | **string**| Agast Code | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse2001[]**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCustomAgast**
> \Swagger\Client\Model\InlineResponse201 createCustomAgast($company_id, $body, $text)

Create custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyAGASTApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\CustomAgast(); // \Swagger\Client\Model\CustomAgast | Transaction Message
$text = "text_example"; // string | Text query

try {
    $result = $api_instance->createCustomAgast($company_id, $body, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyAGASTApi->createCustomAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\CustomAgast**](../Model/\Swagger\Client\Model\CustomAgast.md)| Transaction Message |
 **text** | **string**| Text query | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAgast**
> deleteAgast($company_id, $code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyAGASTApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Agast Code

try {
    $api_instance->deleteAgast($company_id, $code);
} catch (Exception $e) {
    echo 'Exception when calling CompanyAGASTApi->deleteAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Agast Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCustomAgast**
> updateCustomAgast($company_id, $code, $body)

Update custom agast for one company

This method operation create a custom agast for one company

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyAGASTApi();
$company_id = "company_id_example"; // string | Company ID
$code = "code_example"; // string | Agast Code
$body = new \Swagger\Client\Model\CustomAgast(); // \Swagger\Client\Model\CustomAgast | Transaction Message

try {
    $api_instance->updateCustomAgast($company_id, $code, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyAGASTApi->updateCustomAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **code** | **string**| Agast Code |
 **body** | [**\Swagger\Client\Model\CustomAgast**](../Model/\Swagger\Client\Model\CustomAgast.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

