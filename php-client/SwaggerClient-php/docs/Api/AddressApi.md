# Swagger\Client\AddressApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZipCode**](AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 


# **getZipCode**
> \Swagger\Client\Model\Address[] getZipCode($zipcode)



This operation return address

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AddressApi();
$zipcode = "zipcode_example"; // string | ZIP Code

try {
    $result = $api_instance->getZipCode($zipcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->getZipCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **string**| ZIP Code |

### Return type

[**\Swagger\Client\Model\Address[]**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

