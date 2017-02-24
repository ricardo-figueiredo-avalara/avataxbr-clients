# Swagger\Client\InvoiceSEFAZApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesSefazDelete**](InvoiceSEFAZApi.md#invoicesSefazDelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoicesSefazKeyDelete**](InvoiceSEFAZApi.md#invoicesSefazKeyDelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoicesSefazKeyGet**](InvoiceSEFAZApi.md#invoicesSefazKeyGet) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoicesSefazKeyLookupGet**](InvoiceSEFAZApi.md#invoicesSefazKeyLookupGet) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoicesSefazKeyPut**](InvoiceSEFAZApi.md#invoicesSefazKeyPut) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoicesSefazPost**](InvoiceSEFAZApi.md#invoicesSefazPost) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoicesSefazStatusGet**](InvoiceSEFAZApi.md#invoicesSefazStatusGet) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **invoicesSefazDelete**
> \Swagger\Client\Model\SefazInvoiceBasicStatus invoicesSefazDelete($authorization, $body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\SefazDisableRangeIn(); // \Swagger\Client\Model\SefazDisableRangeIn | Disable Range e-Invoice

try {
    $result = $api_instance->invoicesSefazDelete($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\SefazDisableRangeIn**](../Model/\Swagger\Client\Model\SefazDisableRangeIn.md)| Disable Range e-Invoice |

### Return type

[**\Swagger\Client\Model\SefazInvoiceBasicStatus**](../Model/SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazKeyDelete**
> \Swagger\Client\Model\SefazInvoiceBasicStatus invoicesSefazKeyDelete($authorization, $key, $body)

Cancel invoice

Cancel the invoice

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key
$body = new \Swagger\Client\Model\SefazItDeleteIn(); // \Swagger\Client\Model\SefazItDeleteIn | Cancel Message

try {
    $result = $api_instance->invoicesSefazKeyDelete($authorization, $key, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazKeyDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **key** | **string**| Invoice Key |
 **body** | [**\Swagger\Client\Model\SefazItDeleteIn**](../Model/\Swagger\Client\Model\SefazItDeleteIn.md)| Cancel Message |

### Return type

[**\Swagger\Client\Model\SefazInvoiceBasicStatus**](../Model/SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazKeyGet**
> \Swagger\Client\Model\SefazItGetOut invoicesSefazKeyGet($authorization, $key)

Retrieve invoice

Retrieve the invoice

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key

try {
    $result = $api_instance->invoicesSefazKeyGet($authorization, $key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazKeyGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **key** | **string**| Invoice Key |

### Return type

[**\Swagger\Client\Model\SefazItGetOut**](../Model/SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazKeyLookupGet**
> \Swagger\Client\Model\TransactionForSefazGoodsList invoicesSefazKeyLookupGet($authorization, $key)

Retrieve invoice

Retrieve the invoice

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key

try {
    $result = $api_instance->invoicesSefazKeyLookupGet($authorization, $key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazKeyLookupGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **key** | **string**| Invoice Key |

### Return type

[**\Swagger\Client\Model\TransactionForSefazGoodsList**](../Model/TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazKeyPut**
> \Swagger\Client\Model\SefazInvoiceBasicStatus invoicesSefazKeyPut($authorization, $key, $body)

Fix Letter

Fix Letter

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$key = "key_example"; // string | Invoice Key
$body = new \Swagger\Client\Model\SefazItPutIn(); // \Swagger\Client\Model\SefazItPutIn | Fix Message

try {
    $result = $api_instance->invoicesSefazKeyPut($authorization, $key, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazKeyPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **key** | **string**| Invoice Key |
 **body** | [**\Swagger\Client\Model\SefazItPutIn**](../Model/\Swagger\Client\Model\SefazItPutIn.md)| Fix Message |

### Return type

[**\Swagger\Client\Model\SefazInvoiceBasicStatus**](../Model/SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazPost**
> \Swagger\Client\Model\SefazPostOut invoicesSefazPost($authorization, $body)

Send an e-Invoice

Send a invoice to SEFAZ

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = array(new TransactionForSefazGoods()); // \Swagger\Client\Model\TransactionForSefazGoods[] | Invoices

try {
    $result = $api_instance->invoicesSefazPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\TransactionForSefazGoods[]**](../Model/TransactionForSefazGoods.md)| Invoices |

### Return type

[**\Swagger\Client\Model\SefazPostOut**](../Model/SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoicesSefazStatusGet**
> string invoicesSefazStatusGet($authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSEFAZApi();
$authorization = "authorization_example"; // string | Bearer {auth}

try {
    $result = $api_instance->invoicesSefazStatusGet($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSEFAZApi->invoicesSefazStatusGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

