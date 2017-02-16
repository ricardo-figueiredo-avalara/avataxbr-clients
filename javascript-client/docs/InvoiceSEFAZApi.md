# Br16Api.InvoiceSEFAZApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesSefazDelete**](InvoiceSEFAZApi.md#invoicesSefazDelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoicesSefazKeyDelete**](InvoiceSEFAZApi.md#invoicesSefazKeyDelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoicesSefazKeyGet**](InvoiceSEFAZApi.md#invoicesSefazKeyGet) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoicesSefazKeyLookupGet**](InvoiceSEFAZApi.md#invoicesSefazKeyLookupGet) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoicesSefazKeyPut**](InvoiceSEFAZApi.md#invoicesSefazKeyPut) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoicesSefazPost**](InvoiceSEFAZApi.md#invoicesSefazPost) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoicesSefazStatusGet**](InvoiceSEFAZApi.md#invoicesSefazStatusGet) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


<a name="invoicesSefazDelete"></a>
# **invoicesSefazDelete**
> SefazInvoiceBasicStatus invoicesSefazDelete(authorization, body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new Br16Api.SefazDisableRangeIn(); // SefazDisableRangeIn | Disable Range e-Invoice


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazDelete(authorization, body, callback);
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

<a name="invoicesSefazKeyDelete"></a>
# **invoicesSefazKeyDelete**
> SefazInvoiceBasicStatus invoicesSefazKeyDelete(authorization, keybody)

Cancel invoice

Cancel the invoice

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key

var body = new Br16Api.SefazItDeleteIn(); // SefazItDeleteIn | Cancel Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazKeyDelete(authorization, keybody, callback);
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

<a name="invoicesSefazKeyGet"></a>
# **invoicesSefazKeyGet**
> SefazItGetOut invoicesSefazKeyGet(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazKeyGet(authorization, key, callback);
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

<a name="invoicesSefazKeyLookupGet"></a>
# **invoicesSefazKeyLookupGet**
> TransactionForSefazGoodsList invoicesSefazKeyLookupGet(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazKeyLookupGet(authorization, key, callback);
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

<a name="invoicesSefazKeyPut"></a>
# **invoicesSefazKeyPut**
> SefazInvoiceBasicStatus invoicesSefazKeyPut(authorization, keybody)

Fix Letter

Fix Letter

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key

var body = new Br16Api.SefazItPutIn(); // SefazItPutIn | Fix Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazKeyPut(authorization, keybody, callback);
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

<a name="invoicesSefazPost"></a>
# **invoicesSefazPost**
> SefazPostOut invoicesSefazPost(authorization, body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = [new Br16Api.TransactionForSefazGoods()]; // [TransactionForSefazGoods] | Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazPost(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**[TransactionForSefazGoods]**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoicesSefazStatusGet"></a>
# **invoicesSefazStatusGet**
> &#39;String&#39; invoicesSefazStatusGet(authorization, )

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceSEFAZApi();

var authorization = "authorization_example"; // String | Bearer {auth}


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoicesSefazStatusGet(authorization, , callback);
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

