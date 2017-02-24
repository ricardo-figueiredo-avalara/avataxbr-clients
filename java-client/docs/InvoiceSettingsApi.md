# InvoiceSettingsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceSettings**](InvoiceSettingsApi.md#invoiceSettings) | **GET** /invoices/settings | Invoice Settigns


<a name="invoiceSettings"></a>
# **invoiceSettings**
> InlineResponse2004 invoiceSettings()

Invoice Settigns

Get Enviroment Settigns

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSettingsApi;


InvoiceSettingsApi apiInstance = new InvoiceSettingsApi();
try {
    InlineResponse2004 result = apiInstance.invoiceSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSettingsApi#invoiceSettings");
    e.printStackTrace();
}
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

