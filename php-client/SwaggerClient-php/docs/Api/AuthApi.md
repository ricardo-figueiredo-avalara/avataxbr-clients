# Swagger\Client\AuthApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | authorization
[**v2AuthPost**](AuthApi.md#v2AuthPost) | **POST** /v2/auth | authorization


# **authPost**
> \Swagger\Client\Model\InlineResponse200 authPost($authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthApi();
$authorization = "authorization_example"; // string | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded.

try {
    $result = $api_instance->authPost($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->authPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. |

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v2AuthPost**
> \Swagger\Client\Model\InlineResponse200 v2AuthPost($authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthApi();
$authorization = "authorization_example"; // string | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded.

try {
    $result = $api_instance->v2AuthPost($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->v2AuthPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. |

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

