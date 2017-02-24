# Swagger\Client\InvoiceNFCeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesNfceKeyGet**](InvoiceNFCeDANFEApi.md#invoicesNfceKeyGet) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


# **invoicesNfceKeyGet**
> \SplFileObject invoicesNfceKeyGet($authorization, $key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceNFCeDANFEApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key

try {
    $result = $api_instance->invoicesNfceKeyGet($authorization, $key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceNFCeDANFEApi->invoicesNfceKeyGet: ', $e->getMessage(), PHP_EOL;
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

