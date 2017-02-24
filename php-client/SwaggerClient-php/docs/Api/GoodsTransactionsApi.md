# Swagger\Client\GoodsTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsgoodsPurchasePost**](GoodsTransactionsApi.md#transactionsgoodsPurchasePost) | **POST** /transactions?goods-purchase | Transaction Method
[**transactionsgoodsSalesPost**](GoodsTransactionsApi.md#transactionsgoodsSalesPost) | **POST** /transactions?goods-sales | Transaction Method


# **transactionsgoodsPurchasePost**
> \Swagger\Client\Model\TransactionForGoodsOut transactionsgoodsPurchasePost($authorization, $body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\GoodsTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\TransactionForGoodsIn(); // \Swagger\Client\Model\TransactionForGoodsIn | Transaction Message

try {
    $result = $api_instance->transactionsgoodsPurchasePost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoodsTransactionsApi->transactionsgoodsPurchasePost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\TransactionForGoodsIn**](../Model/\Swagger\Client\Model\TransactionForGoodsIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\TransactionForGoodsOut**](../Model/TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsgoodsSalesPost**
> \Swagger\Client\Model\TransactionForGoodsOut transactionsgoodsSalesPost($authorization, $body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\GoodsTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\TransactionForGoodsIn(); // \Swagger\Client\Model\TransactionForGoodsIn | Transaction Message

try {
    $result = $api_instance->transactionsgoodsSalesPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoodsTransactionsApi->transactionsgoodsSalesPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\TransactionForGoodsIn**](../Model/\Swagger\Client\Model\TransactionForGoodsIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\TransactionForGoodsOut**](../Model/TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

