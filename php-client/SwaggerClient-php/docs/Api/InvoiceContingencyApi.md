# Swagger\Client\InvoiceContingencyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceDropContingency**](InvoiceContingencyApi.md#invoiceDropContingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoiceSetContingency**](InvoiceContingencyApi.md#invoiceSetContingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoiceVerifyContingency**](InvoiceContingencyApi.md#invoiceVerifyContingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **invoiceDropContingency**
> invoiceDropContingency($state)

Invoice Drop Contingency per State

Drop State in Contingency

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceContingencyApi();
$state = "state_example"; // string | Brazilian State

try {
    $api_instance->invoiceDropContingency($state);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceContingencyApi->invoiceDropContingency: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoiceSetContingency**
> invoiceSetContingency($state, $body)

Invoice Set Contingency per State

Set State in Contingency

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceContingencyApi();
$state = "state_example"; // string | Brazilian State
$body = new \Swagger\Client\Model\Body4(); // \Swagger\Client\Model\Body4 | Set Contingency

try {
    $api_instance->invoiceSetContingency($state, $body);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceContingencyApi->invoiceSetContingency: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |
 **body** | [**\Swagger\Client\Model\Body4**](../Model/\Swagger\Client\Model\Body4.md)| Set Contingency |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoiceVerifyContingency**
> \Swagger\Client\Model\InlineResponse2003 invoiceVerifyContingency($state)

Invoice Verify Contingency per State

Check if State was in Contingency

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceContingencyApi();
$state = "state_example"; // string | Brazilian State

try {
    $result = $api_instance->invoiceVerifyContingency($state);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceContingencyApi->invoiceVerifyContingency: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State |

### Return type

[**\Swagger\Client\Model\InlineResponse2003**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

