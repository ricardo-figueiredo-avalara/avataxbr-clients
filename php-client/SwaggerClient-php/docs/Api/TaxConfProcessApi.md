# Swagger\Client\TaxConfProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcess**](TaxConfProcessApi.md#createProcess) | **POST** /taxconf/process | create a new Process Type configuration
[**deleteProcess**](TaxConfProcessApi.md#deleteProcess) | **DELETE** /taxconf/process/{code} | disable a Process.
[**getProcess**](TaxConfProcessApi.md#getProcess) | **GET** /taxconf/process/{code} | get Process information.
[**getProcessList**](TaxConfProcessApi.md#getProcessList) | **GET** /taxconf/process | retrive list of Process.
[**updateProcess**](TaxConfProcessApi.md#updateProcess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


# **createProcess**
> \Swagger\Client\Model\InlineResponse201 createProcess($taxconfprocess)

create a new Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfProcessApi();
$taxconfprocess = new \Swagger\Client\Model\ProcessScenario(); // \Swagger\Client\Model\ProcessScenario | The pet JSON you want to post

try {
    $result = $api_instance->createProcess($taxconfprocess);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfProcessApi->createProcess: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**\Swagger\Client\Model\ProcessScenario**](../Model/\Swagger\Client\Model\ProcessScenario.md)| The pet JSON you want to post |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteProcess**
> deleteProcess($code)

disable a Process.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfProcessApi();
$code = "code_example"; // string | Process Code

try {
    $api_instance->deleteProcess($code);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfProcessApi->deleteProcess: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProcess**
> \Swagger\Client\Model\ProcessScenario getProcess($code)

get Process information.

This operation return Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfProcessApi();
$code = "code_example"; // string | Process Code

try {
    $result = $api_instance->getProcess($code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfProcessApi->getProcess: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code |

### Return type

[**\Swagger\Client\Model\ProcessScenario**](../Model/ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProcessList**
> \Swagger\Client\Model\ProcessScenario[] getProcessList($account_id, $date, $inactive)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfProcessApi();
$account_id = "account_id_example"; // string | filter the configuration by accountID, if not informed, only the standard configuration will be returned
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inactive versions too

try {
    $result = $api_instance->getProcessList($account_id, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfProcessApi->getProcessList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned | [optional]
 **date** | **\DateTime**| When informed return valid version configuration for this date | [optional]
 **inactive** | **bool**| return the inactive versions too | [optional]

### Return type

[**\Swagger\Client\Model\ProcessScenario[]**](../Model/ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateProcess**
> updateProcess($code, $taxconfprocess)

update a Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfProcessApi();
$code = "code_example"; // string | Process Code
$taxconfprocess = new \Swagger\Client\Model\ProcessScenario(); // \Swagger\Client\Model\ProcessScenario | The pet JSON you want to post

try {
    $api_instance->updateProcess($code, $taxconfprocess);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfProcessApi->updateProcess: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code |
 **taxconfprocess** | [**\Swagger\Client\Model\ProcessScenario**](../Model/\Swagger\Client\Model\ProcessScenario.md)| The pet JSON you want to post |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

