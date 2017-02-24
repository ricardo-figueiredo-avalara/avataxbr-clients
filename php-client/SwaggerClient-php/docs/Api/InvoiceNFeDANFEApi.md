# Swagger\Client\InvoiceNFeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfePrint**](InvoiceNFeDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


# **nfePrint**
> \SplFileObject nfePrint($authorization, $key)

Retrieve Danfe

Retrieve the Danfe

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceNFeDANFEApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key

try {
    $result = $api_instance->nfePrint($authorization, $key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceNFeDANFEApi->nfePrint: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **key** | **string**| Invoice Key |

### Return type

[**\SplFileObject**](../Model/\SplFileObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

