# Swagger\Client\TaxConfCFOPApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCfop**](TaxConfCFOPApi.md#createCfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**deleteCfop**](TaxConfCFOPApi.md#deleteCfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**getCfop**](TaxConfCFOPApi.md#getCfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**getCfopList**](TaxConfCFOPApi.md#getCfopList) | **GET** /taxconf/cfop | retrive list of CFOP.
[**updateCfop**](TaxConfCFOPApi.md#updateCfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


# **createCfop**
> \Swagger\Client\Model\InlineResponse201 createCfop($body)

create a new CFOP configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfCFOPApi();
$body = new \Swagger\Client\Model\CfopConf(); // \Swagger\Client\Model\CfopConf | The pet JSON you want to post

try {
    $result = $api_instance->createCfop($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfCFOPApi->createCfop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\CfopConf**](../Model/\Swagger\Client\Model\CfopConf.md)| The pet JSON you want to post |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCfop**
> deleteCfop($code)

disable a CFOP.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfCFOPApi();
$code = "code_example"; // string | CFOP Code

try {
    $api_instance->deleteCfop($code);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfCFOPApi->deleteCfop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCfop**
> \Swagger\Client\Model\CfopConf getCfop($code)

get CFOP information.

This operation return CFOP configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfCFOPApi();
$code = "code_example"; // string | CFOP Code

try {
    $result = $api_instance->getCfop($code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfCFOPApi->getCfop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code |

### Return type

[**\Swagger\Client\Model\CfopConf**](../Model/CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCfopList**
> \Swagger\Client\Model\CfopConf[] getCfopList($suffixcode, $date, $inactive)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfCFOPApi();
$suffixcode = "suffixcode_example"; // string | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inactive versions too

try {
    $result = $api_instance->getCfopList($suffixcode, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfCFOPApi->getCfopList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type | [optional]
 **date** | **\DateTime**| When informed return valid version configuration for this date | [optional]
 **inactive** | **bool**| return the inactive versions too | [optional]

### Return type

[**\Swagger\Client\Model\CfopConf[]**](../Model/CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCfop**
> updateCfop($code, $taxconfcfop)

update a CFOP configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfCFOPApi();
$code = "code_example"; // string | CFOP Code
$taxconfcfop = new \Swagger\Client\Model\CfopConf(); // \Swagger\Client\Model\CfopConf | The pet JSON you want to post

try {
    $api_instance->updateCfop($code, $taxconfcfop);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfCFOPApi->updateCfop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code |
 **taxconfcfop** | [**\Swagger\Client\Model\CfopConf**](../Model/\Swagger\Client\Model\CfopConf.md)| The pet JSON you want to post |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

