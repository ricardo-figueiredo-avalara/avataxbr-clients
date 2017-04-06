# AvaTaxBrazil.InvoiceSEFAZApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelInvoice**](InvoiceSEFAZApi.md#cancelInvoice) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**disableRange**](InvoiceSEFAZApi.md#disableRange) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**fixLetter**](InvoiceSEFAZApi.md#fixLetter) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**retrieveInvoice**](InvoiceSEFAZApi.md#retrieveInvoice) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**retrieveInvoiceLookup**](InvoiceSEFAZApi.md#retrieveInvoiceLookup) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**retrieveStatus**](InvoiceSEFAZApi.md#retrieveStatus) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
[**sendInvoice**](InvoiceSEFAZApi.md#sendInvoice) | **POST** /invoices/sefaz | Send an e-Invoice


<a name="cancelInvoice"></a>
# **cancelInvoice**
> SefazInvoiceBasicStatus cancelInvoice(authorization, key, body)

Cancel invoice

Cancel the invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key

var body = new AvaTaxBrazil.SefazItDeleteIn(); // SefazItDeleteIn | Cancel Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cancelInvoice(authorization, key, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableRange"></a>
# **disableRange**
> SefazInvoiceBasicStatus disableRange(authorization, body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.SefazDisableRangeIn(); // SefazDisableRangeIn | Disable Range e-Invoice


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.disableRange(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**SefazDisableRangeIn**](SefazDisableRangeIn.md)| Disable Range e-Invoice | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fixLetter"></a>
# **fixLetter**
> SefazInvoiceBasicStatus fixLetter(authorization, key, body)

Fix Letter

Fix Letter

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key

var body = new AvaTaxBrazil.SefazItPutIn(); // SefazItPutIn | Fix Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.fixLetter(authorization, key, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveInvoice"></a>
# **retrieveInvoice**
> SefazItGetOut retrieveInvoice(authorization, key, )

Retrieve invoice

Retrieve the invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveInvoice(authorization, key, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveInvoiceLookup"></a>
# **retrieveInvoiceLookup**
> TransactionForSefazGoodsList retrieveInvoiceLookup(authorization, key, )

Retrieve invoice

Retrieve the invoice

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveInvoiceLookup(authorization, key, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveStatus"></a>
# **retrieveStatus**
> &#39;String&#39; retrieveStatus(authorization, )

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveStatus(authorization, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendInvoice"></a>
# **sendInvoice**
> SefazPostOut sendInvoice(authorization, body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.TransactionForSefazGoodsList(); // TransactionForSefazGoodsList | Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sendInvoice(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

