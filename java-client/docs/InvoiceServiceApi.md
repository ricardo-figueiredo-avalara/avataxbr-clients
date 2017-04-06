# InvoiceServiceApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceServiceApi;


InvoiceServiceApi apiInstance = new InvoiceServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
AbrasfItDeleteIn body = new AbrasfItDeleteIn(); // AbrasfItDeleteIn | Cancel Message
try {
    apiInstance.cancelInvoiceService(authorization, key, body);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceServiceApi#cancelInvoiceService");
    e.printStackTrace();
}
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
> AbrasfItGetOut retrieveInvoiceService(authorization, key)

Retrieve e-Invoice Service

Retrieve the invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceServiceApi;


InvoiceServiceApi apiInstance = new InvoiceServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    AbrasfItGetOut result = apiInstance.retrieveInvoiceService(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceServiceApi#retrieveInvoiceService");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceServiceApi;


InvoiceServiceApi apiInstance = new InvoiceServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
TransactionForAbrasfList body = new TransactionForAbrasfList(); // TransactionForAbrasfList | Invoices
try {
    AbrasfPostOut result = apiInstance.sendInvoiceService(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceServiceApi#sendInvoiceService");
    e.printStackTrace();
}
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

