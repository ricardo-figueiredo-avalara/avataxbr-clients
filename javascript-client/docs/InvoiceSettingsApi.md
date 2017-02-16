# Br16Api.InvoiceSettingsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceSettings**](InvoiceSettingsApi.md#invoiceSettings) | **GET** /invoices/settings | Invoice Settigns


<a name="invoiceSettings"></a>
# **invoiceSettings**
> InlineResponse2004 invoiceSettings()

Invoice Settigns

Get Enviroment Settigns

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSettingsApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoiceSettings(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

