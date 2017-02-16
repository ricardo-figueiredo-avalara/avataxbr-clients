# InvoiceNFCeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesNfceKeyGet**](InvoiceNFCeDANFEApi.md#invoicesNfceKeyGet) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


<a name="invoicesNfceKeyGet"></a>
# **invoicesNfceKeyGet**
> File invoicesNfceKeyGet(authorization, key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoiceNFCeDANFEApi;

InvoiceNFCeDANFEApi apiInstance = new InvoiceNFCeDANFEApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    File result = apiInstance.invoicesNfceKeyGet(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceNFCeDANFEApi#invoicesNfceKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **key** | **String**| Invoice Key |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

