# Swagger\Client\CompanyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesGet**](CompanyApi.md#companiesGet) | **GET** /companies | Retrieve Companies by account
[**createCompany**](CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
[**infoCompany**](CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


# **companiesGet**
> \Swagger\Client\Model\Company[] companiesGet()

Retrieve Companies by account

Retrieve list companies of one account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();

try {
    $result = $api_instance->companiesGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->companiesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Company[]**](../Model/Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCompany**
> \Swagger\Client\Model\Company createCompany($body)

Create company and your data configuration

This method operation create a company for a account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();
$body = new \Swagger\Client\Model\Company(); // \Swagger\Client\Model\Company | Transaction Message

try {
    $result = $api_instance->createCompany($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->createCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Company**](../Model/\Swagger\Client\Model\Company.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\Company**](../Model/Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountCompany**
> deleteAccountCompany($account_id, $company_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();
$account_id = "account_id_example"; // string | Account ID
$company_id = "company_id_example"; // string | Company ID

try {
    $api_instance->deleteAccountCompany($account_id, $company_id);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->deleteAccountCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| Account ID |
 **company_id** | **string**| Company ID |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCompany**
> deleteCompany($company_id, $company_id2)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();
$company_id = "company_id_example"; // string | Company ID
$company_id2 = "company_id_example"; // string | Company ID

try {
    $api_instance->deleteCompany($company_id, $company_id2);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->deleteCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **company_id2** | **string**| Company ID |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **infoCompany**
> \Swagger\Client\Model\Company infoCompany($company_id)

Get company information and your data configuration

This method operation get a company for a account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();
$company_id = "company_id_example"; // string | Company ID

try {
    $result = $api_instance->infoCompany($company_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->infoCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |

### Return type

[**\Swagger\Client\Model\Company**](../Model/Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCompany**
> updateCompany($company_id, $body)

Update company information and your data configuration

This method operation create a company for a account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\Company(); // \Swagger\Client\Model\Company | Transaction Message

try {
    $api_instance->updateCompany($company_id, $body);
} catch (Exception $e) {
    echo 'Exception when calling CompanyApi->updateCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\Company**](../Model/\Swagger\Client\Model\Company.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

