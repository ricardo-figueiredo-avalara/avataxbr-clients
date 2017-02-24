# Swagger\Client\TaxConfICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIcmsconfstate**](TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**deleteIcmsConf**](TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**getIcmsConfByState**](TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**getIcmsList**](TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**getIcmsList_0**](TaxConfICMSApi.md#getIcmsList_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**updateIcmsconfstate**](TaxConfICMSApi.md#updateIcmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **createIcmsconfstate**
> \Swagger\Client\Model\InlineResponse201 createIcmsconfstate($state, $icms_conf_state)

create a new ICMS Configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$state = "state_example"; // string | Brazilian State
$icms_conf_state = new \Swagger\Client\Model\IcmsConfByState(); // \Swagger\Client\Model\IcmsConfByState | The pet JSON you want to post

try {
    $result = $api_instance->createIcmsconfstate($state, $icms_conf_state);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->createIcmsconfstate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **icms_conf_state** | [**\Swagger\Client\Model\IcmsConfByState**](../Model/\Swagger\Client\Model\IcmsConfByState.md)| The pet JSON you want to post |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteIcmsConf**
> deleteIcmsConf($state, $code)

disable a ICMS by State.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$state = "state_example"; // string | Brazilian State
$code = "code_example"; // string | ICMS Code

try {
    $api_instance->deleteIcmsConf($state, $code);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->deleteIcmsConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **code** | **string**| ICMS Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIcmsConfByState**
> \Swagger\Client\Model\IcmsConfByState[] getIcmsConfByState($state, $code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$state = "state_example"; // string | Brazilian State
$code = "code_example"; // string | ICMS Code

try {
    $result = $api_instance->getIcmsConfByState($state, $code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->getIcmsConfByState: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **code** | **string**| ICMS Code |

### Return type

[**\Swagger\Client\Model\IcmsConfByState[]**](../Model/IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIcmsList**
> \Swagger\Client\Model\IcmsConfByState[] getIcmsList($state, $suffixcode, $date, $inactive)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$state = "state_example"; // string | Brazilian State
$suffixcode = "suffixcode_example"; // string | Identify this ICMS
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inactive versions too

try {
    $result = $api_instance->getIcmsList($state, $suffixcode, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->getIcmsList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **suffixcode** | **string**| Identify this ICMS | [optional]
 **date** | **\DateTime**| When informed return valid version configuration for this date | [optional]
 **inactive** | **bool**| return the inactive versions too | [optional]

### Return type

[**\Swagger\Client\Model\IcmsConfByState[]**](../Model/IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIcmsList_0**
> \Swagger\Client\Model\IcmsConfByState[] getIcmsList_0($text, $state)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$text = "text_example"; // string | Search for codes
$state = "state_example"; // string | Filter for states

try {
    $result = $api_instance->getIcmsList_0($text, $state);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->getIcmsList_0: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Search for codes |
 **state** | **string**| Filter for states | [optional]

### Return type

[**\Swagger\Client\Model\IcmsConfByState[]**](../Model/IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateIcmsconfstate**
> updateIcmsconfstate($state, $code, $icms_conf_state)

update a IcmsConf State,

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfICMSApi();
$state = "state_example"; // string | Brazilian State
$code = "code_example"; // string | ICMS Code
$icms_conf_state = new \Swagger\Client\Model\IcmsConfByState(); // \Swagger\Client\Model\IcmsConfByState | The pet JSON you want to post

try {
    $api_instance->updateIcmsconfstate($state, $code, $icms_conf_state);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfICMSApi->updateIcmsconfstate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **code** | **string**| ICMS Code |
 **icms_conf_state** | [**\Swagger\Client\Model\IcmsConfByState**](../Model/\Swagger\Client\Model\IcmsConfByState.md)| The pet JSON you want to post |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

