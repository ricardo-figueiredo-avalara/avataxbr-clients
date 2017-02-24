# Swagger\Client\AGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agastsCodeGet**](AGASTApi.md#agastsCodeGet) | **GET** /agasts/{code} | 
[**createAgast**](AGASTApi.md#createAgast) | **POST** /agasts | Create agast
[**deleteAgast**](AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | 
[**getAgastList**](AGASTApi.md#getAgastList) | **GET** /agasts | 
[**updateAgast**](AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast


# **agastsCodeGet**
> \Swagger\Client\Model\Agast agastsCodeGet($code)



This operation return agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AGASTApi();
$code = "code_example"; // string | Agast Code

try {
    $result = $api_instance->agastsCodeGet($code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AGASTApi->agastsCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code |

### Return type

[**\Swagger\Client\Model\Agast**](../Model/Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAgast**
> \Swagger\Client\Model\InlineResponse201 createAgast($body)

Create agast

This method operation create a AGAST

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AGASTApi();
$body = new \Swagger\Client\Model\Agast(); // \Swagger\Client\Model\Agast | Transaction Message

try {
    $result = $api_instance->createAgast($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AGASTApi->createAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Agast**](../Model/\Swagger\Client\Model\Agast.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAgast**
> deleteAgast($code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AGASTApi();
$code = "code_example"; // string | Agast Code

try {
    $api_instance->deleteAgast($code);
} catch (Exception $e) {
    echo 'Exception when calling AGASTApi->deleteAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAgastList**
> \Swagger\Client\Model\InlineResponse2001[] getAgastList($text)



This operation return agast configurations that match with parameters queries

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AGASTApi();
$text = "text_example"; // string | Text query

try {
    $result = $api_instance->getAgastList($text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AGASTApi->getAgastList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Text query | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse2001[]**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAgast**
> updateAgast($code, $body)

Update agast

This method operation create a agast

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AGASTApi();
$code = "code_example"; // string | Agast Code
$body = new \Swagger\Client\Model\Agast(); // \Swagger\Client\Model\Agast | Transaction Message

try {
    $api_instance->updateAgast($code, $body);
} catch (Exception $e) {
    echo 'Exception when calling AGASTApi->updateAgast: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code |
 **body** | [**\Swagger\Client\Model\Agast**](../Model/\Swagger\Client\Model\Agast.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

