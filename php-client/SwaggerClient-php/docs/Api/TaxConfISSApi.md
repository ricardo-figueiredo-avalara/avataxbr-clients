# Swagger\Client\TaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssConfByCity**](TaxConfISSApi.md#createIssConfByCity) | **POST** /taxconf/iss | create a new ISS Configuration
[**deleteIssConf**](TaxConfISSApi.md#deleteIssConf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**getIssConfByCity**](TaxConfISSApi.md#getIssConfByCity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**getIssList**](TaxConfISSApi.md#getIssList) | **GET** /taxconf/iss | retrive list of ISS
[**updateIssConfByCity**](TaxConfISSApi.md#updateIssConfByCity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **createIssConfByCity**
> \Swagger\Client\Model\InlineResponse201 createIssConfByCity($iss_conf_by_city)

create a new ISS Configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfISSApi();
$iss_conf_by_city = new \Swagger\Client\Model\IssConfByCity(); // \Swagger\Client\Model\IssConfByCity | The pet JSON you want to post

try {
    $result = $api_instance->createIssConfByCity($iss_conf_by_city);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfISSApi->createIssConfByCity: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iss_conf_by_city** | [**\Swagger\Client\Model\IssConfByCity**](../Model/\Swagger\Client\Model\IssConfByCity.md)| The pet JSON you want to post |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteIssConf**
> deleteIssConf($city_code)

disable a ISS by City Code.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfISSApi();
$city_code = 3.4; // float | City Code

try {
    $api_instance->deleteIssConf($city_code);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfISSApi->deleteIssConf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIssConfByCity**
> \Swagger\Client\Model\IssConfByCity[] getIssConfByCity($city_code, $code, $date, $inactive)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfISSApi();
$city_code = 3.4; // float | City Code
$code = "code_example"; // string | Identificator of this configuration, it is unique for account or standard namedspace
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inctives versions too

try {
    $result = $api_instance->getIssConfByCity($city_code, $code, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfISSApi->getIssConfByCity: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code |
 **code** | **string**| Identificator of this configuration, it is unique for account or standard namedspace | [optional]
 **date** | **\DateTime**| When informed return valid version configuration for this date | [optional]
 **inactive** | **bool**| return the inctives versions too | [optional]

### Return type

[**\Swagger\Client\Model\IssConfByCity[]**](../Model/IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIssList**
> \Swagger\Client\Model\IssConfByCity[] getIssList($suffixcode, $date, $inactive)

retrive list of ISS

This operation return ISS configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfISSApi();
$suffixcode = "suffixcode_example"; // string | Identify this ISS
$date = new \DateTime(); // \DateTime | When informed return valid version configuration for this date
$inactive = true; // bool | return the inactive versions too

try {
    $result = $api_instance->getIssList($suffixcode, $date, $inactive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfISSApi->getIssList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this ISS | [optional]
 **date** | **\DateTime**| When informed return valid version configuration for this date | [optional]
 **inactive** | **bool**| return the inactive versions too | [optional]

### Return type

[**\Swagger\Client\Model\IssConfByCity[]**](../Model/IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateIssConfByCity**
> updateIssConfByCity($city_code, $iss_conf_by_city)

update a ISS by City Code.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\TaxConfISSApi();
$city_code = 3.4; // float | City Code
$iss_conf_by_city = new \Swagger\Client\Model\IssConfByCity(); // \Swagger\Client\Model\IssConfByCity | The pet JSON you want to post

try {
    $api_instance->updateIssConfByCity($city_code, $iss_conf_by_city);
} catch (Exception $e) {
    echo 'Exception when calling TaxConfISSApi->updateIssConfByCity: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code |
 **iss_conf_by_city** | [**\Swagger\Client\Model\IssConfByCity**](../Model/\Swagger\Client\Model\IssConfByCity.md)| The pet JSON you want to post |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

