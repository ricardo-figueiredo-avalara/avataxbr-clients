# Swagger\Client\AccountApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountIdCompaniesGet**](AccountApi.md#accountsAccountIdCompaniesGet) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**createAccountCompany**](AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


# **accountsAccountIdCompaniesGet**
> \Swagger\Client\Model\AccountCompany[] accountsAccountIdCompaniesGet($account_id)

Retrieve Companies by account

Retrieve list companies of one account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountApi();
$account_id = "account_id_example"; // string | Account ID

try {
    $result = $api_instance->accountsAccountIdCompaniesGet($account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->accountsAccountIdCompaniesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| Account ID |

### Return type

[**\Swagger\Client\Model\AccountCompany[]**](../Model/AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountCompany**
> \Swagger\Client\Model\InlineResponse201 createAccountCompany($account_id, $body)

Create company and your data configuration

This method operation create a company for a account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountApi();
$account_id = "account_id_example"; // string | Account ID
$body = new \Swagger\Client\Model\Body(); // \Swagger\Client\Model\Body | Company Code

try {
    $result = $api_instance->createAccountCompany($account_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->createAccountCompany: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| Account ID |
 **body** | [**\Swagger\Client\Model\Body**](../Model/\Swagger\Client\Model\Body.md)| Company Code |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

