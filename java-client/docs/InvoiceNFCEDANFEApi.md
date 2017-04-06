# InvoiceNFCEDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfcePrint**](InvoiceNFCEDANFEApi.md#nfcePrint) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


<a name="nfcePrint"></a>
# **nfcePrint**
> File nfcePrint(authorization, key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceNFCEDANFEApi;


InvoiceNFCEDANFEApi apiInstance = new InvoiceNFCEDANFEApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    File result = apiInstance.nfcePrint(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceNFCEDANFEApi#nfcePrint");
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

