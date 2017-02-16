# InvoiceContingencyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceDropContingency**](InvoiceContingencyApi.md#invoiceDropContingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoiceSetContingency**](InvoiceContingencyApi.md#invoiceSetContingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoiceVerifyContingency**](InvoiceContingencyApi.md#invoiceVerifyContingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


<a name="invoiceDropContingency"></a>
# **invoiceDropContingency**
> invoiceDropContingency(state)

Invoice Drop Contingency per State

Drop State in Contingency

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoiceContingencyApi;

InvoiceContingencyApi apiInstance = new InvoiceContingencyApi();
String state = "state_example"; // String | Brazilian State
try {
    apiInstance.invoiceDropContingency(state);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceContingencyApi#invoiceDropContingency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]

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
```java
// Import classes:
//import io.swagger.client.api.InvoiceContingencyApi;

InvoiceContingencyApi apiInstance = new InvoiceContingencyApi();
String state = "state_example"; // String | Brazilian State
Body4 body = new Body4(); // Body4 | Set Contingency
try {
    apiInstance.invoiceSetContingency(state, body);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceContingencyApi#invoiceSetContingency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
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
> InlineResponse2003 invoiceVerifyContingency(state)

Invoice Verify Contingency per State

Check if State was in Contingency

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoiceContingencyApi;

InvoiceContingencyApi apiInstance = new InvoiceContingencyApi();
String state = "state_example"; // String | Brazilian State
try {
    InlineResponse2003 result = apiInstance.invoiceVerifyContingency(state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceContingencyApi#invoiceVerifyContingency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

