# InvoiceNFEDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfePrint**](InvoiceNFEDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


<a name="nfePrint"></a>
# **nfePrint**
> File nfePrint(authorization, key)

Retrieve Danfe

Retrieve the Danfe 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceNFEDANFEApi;


InvoiceNFEDANFEApi apiInstance = new InvoiceNFEDANFEApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    File result = apiInstance.nfePrint(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceNFEDANFEApi#nfePrint");
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

