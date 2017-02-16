# Swagger\Client\InvoiceSettingsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceSettings**](InvoiceSettingsApi.md#invoiceSettings) | **GET** /invoices/settings | Invoice Settigns


# **invoiceSettings**
> \Swagger\Client\Model\InlineResponse2004 invoiceSettings()

Invoice Settigns

Get Enviroment Settigns

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceSettingsApi();

try {
    $result = $api_instance->invoiceSettings();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceSettingsApi->invoiceSettings: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\InlineResponse2004**](../Model/InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

