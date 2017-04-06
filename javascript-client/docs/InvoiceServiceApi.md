# AvaTaxBrazil.InvoiceServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelInvoiceService**](InvoiceServiceApi.md#cancelInvoiceService) | **DELETE** /invoices/service/{key} | Cancel e-Invoice Service
[**retrieveInvoiceService**](InvoiceServiceApi.md#retrieveInvoiceService) | **GET** /invoices/service/{key} | Retrieve e-Invoice Service
[**sendInvoiceService**](InvoiceServiceApi.md#sendInvoiceService) | **POST** /invoices/service | Send an e-Invoice Service


<a name="cancelInvoiceService"></a>
# **cancelInvoiceService**
> cancelInvoiceService(authorization, key, body)

Cancel e-Invoice Service

Cancel the invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key

var body = new AvaTaxBrazil.AbrasfItDeleteIn(); // AbrasfItDeleteIn | Cancel Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.cancelInvoiceService(authorization, key, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 
 **body** | [**AbrasfItDeleteIn**](AbrasfItDeleteIn.md)| Cancel Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveInvoiceService"></a>
# **retrieveInvoiceService**
> AbrasfItGetOut retrieveInvoiceService(authorization, key, )

Retrieve e-Invoice Service

Retrieve the invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveInvoiceService(authorization, key, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

[**AbrasfItGetOut**](AbrasfItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendInvoiceService"></a>
# **sendInvoiceService**
> AbrasfPostOut sendInvoiceService(authorization, body)

Send an e-Invoice Service

Send a invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.TransactionForAbrasfList(); // TransactionForAbrasfList | Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sendInvoiceService(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForAbrasfList**](TransactionForAbrasfList.md)| Invoices | 

### Return type

[**AbrasfPostOut**](AbrasfPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

