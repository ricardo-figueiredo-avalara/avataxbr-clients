# Swagger\Client\GoodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoodsPurchasePost**](GoodsCalculationsApi.md#calculationsgoodsPurchasePost) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoodsSalesPost**](GoodsCalculationsApi.md#calculationsgoodsSalesPost) | **POST** /calculations?goods-sales | Calculation Method


# **calculationsgoodsPurchasePost**
> \Swagger\Client\Model\TransactionForGoodsOut calculationsgoodsPurchasePost($authorization, $body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\GoodsCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\TransactionForGoodsIn(); // \Swagger\Client\Model\TransactionForGoodsIn | Transaction Message

try {
    $result = $api_instance->calculationsgoodsPurchasePost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoodsCalculationsApi->calculationsgoodsPurchasePost: ', $e->getMessage(), PHP_EOL;
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

# **calculationsgoodsSalesPost**
> \Swagger\Client\Model\TransactionForGoodsOut calculationsgoodsSalesPost($authorization, $body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\GoodsCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\TransactionForGoodsIn(); // \Swagger\Client\Model\TransactionForGoodsIn | Transaction Message

try {
    $result = $api_instance->calculationsgoodsSalesPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoodsCalculationsApi->calculationsgoodsSalesPost: ', $e->getMessage(), PHP_EOL;
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

