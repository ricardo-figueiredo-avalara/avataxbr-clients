# Swagger\Client\TaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIbptConf**](TaxConfIBPTApi.md#createIbptConf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**deleteIbptConf**](TaxConfIBPTApi.md#deleteIbptConf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**getIbptConf**](TaxConfIBPTApi.md#getIbptConf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**getIbptConfList**](TaxConfIBPTApi.md#getIbptConfList) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**updateIbptConf**](TaxConfIBPTApi.md#updateIbptConf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


# **createIbptConf**
> \Swagger\Client\Model\InlineResponse201 createIbptConf($taxconfprocess)

create a new Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfIBPTApi();
$taxconfprocess = new \Swagger\Client\Model\IbptConf(); // \Swagger\Client\Model\IbptConf | The pet JSON you want to post

try {
    $result = $api_instance->createIbptConf($taxconfprocess);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfIBPTApi->createIbptConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**\Swagger\Client\Model\IbptConf**](../Model/\Swagger\Client\Model\IbptConf.md)| The pet JSON you want to post |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteIbptConf**
> deleteIbptConf($code)

disable a IBPT.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfIBPTApi();
$code = "code_example"; // string | IBPT Code

try {
    $api_instance->deleteIbptConf($code);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfIBPTApi->deleteIbptConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIbptConf**
> \Swagger\Client\Model\IbptConf getIbptConf($code)

get IBPT information.

This operation return Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfIBPTApi();
$code = "code_example"; // string | IBPT Code

try {
    $result = $api_instance->getIbptConf($code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfIBPTApi->getIbptConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code |

### Return type

[**\Swagger\Client\Model\IbptConf**](../Model/IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIbptConfList**
> \Swagger\Client\Model\IbptConf[] getIbptConfList($account_id, $date, $inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfIBPTApi();
$account_id = "account_id_example"; // string | filter the configuration by accountID, if not informed, only the standard configuration will be returned
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inactive versions too

try {
    $result = $api_instance->getIbptConfList($account_id, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfIBPTApi->getIbptConfList: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\IbptConf[]**](../Model/IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateIbptConf**
> updateIbptConf($code, $taxconfprocess)

update a Process Type configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfIBPTApi();
$code = "code_example"; // string | IBPT Code
$taxconfprocess = new \Swagger\Client\Model\IbptConf(); // \Swagger\Client\Model\IbptConf | The pet JSON you want to post

try {
    $api_instance->updateIbptConf($code, $taxconfprocess);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfIBPTApi->updateIbptConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code |
 **taxconfprocess** | [**\Swagger\Client\Model\IbptConf**](../Model/\Swagger\Client\Model\IbptConf.md)| The pet JSON you want to post |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

