# AvaTaxBrazil.InvoiceContingencyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceDropContingency**](InvoiceContingencyApi.md#invoiceDropContingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoiceSetContingency**](InvoiceContingencyApi.md#invoiceSetContingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoiceVerifyContingency**](InvoiceContingencyApi.md#invoiceVerifyContingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


<a name="invoiceDropContingency"></a>
# **invoiceDropContingency**
> invoiceDropContingency(state, )

Invoice Drop Contingency per State

Drop State in Contingency

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceContingencyApi();

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.invoiceDropContingency(state, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoiceSetContingency"></a>
# **invoiceSetContingency**
> invoiceSetContingency(state, body)

Invoice Set Contingency per State

Set State in Contingency

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceContingencyApi();

var state = "state_example"; // String | Brazilian State

var body = new AvaTaxBrazil.Body4(); // Body4 | Set Contingency


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.invoiceSetContingency(state, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **body** | [**Body4**](Body4.md)| Set Contingency | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoiceVerifyContingency"></a>
# **invoiceVerifyContingency**
> InlineResponse2003 invoiceVerifyContingency(state, )

Invoice Verify Contingency per State

Check if State was in Contingency

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceContingencyApi();

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.invoiceVerifyContingency(state, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

