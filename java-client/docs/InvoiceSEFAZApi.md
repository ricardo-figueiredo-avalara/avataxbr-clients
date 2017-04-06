# InvoiceSEFAZApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
SefazItDeleteIn body = new SefazItDeleteIn(); // SefazItDeleteIn | Cancel Message
try {
    SefazInvoiceBasicStatus result = apiInstance.cancelInvoice(authorization, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#cancelInvoice");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
SefazDisableRangeIn body = new SefazDisableRangeIn(); // SefazDisableRangeIn | Disable Range e-Invoice
try {
    SefazInvoiceBasicStatus result = apiInstance.disableRange(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#disableRange");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
SefazItPutIn body = new SefazItPutIn(); // SefazItPutIn | Fix Message
try {
    SefazInvoiceBasicStatus result = apiInstance.fixLetter(authorization, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#fixLetter");
    e.printStackTrace();
}
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
> SefazItGetOut retrieveInvoice(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    SefazItGetOut result = apiInstance.retrieveInvoice(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#retrieveInvoice");
    e.printStackTrace();
}
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
> TransactionForSefazGoodsList retrieveInvoiceLookup(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String key = "key_example"; // String | Invoice Key
try {
    TransactionForSefazGoodsList result = apiInstance.retrieveInvoiceLookup(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#retrieveInvoiceLookup");
    e.printStackTrace();
}
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
> String retrieveStatus(authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
try {
    String result = apiInstance.retrieveStatus(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#retrieveStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |

### Return type

**String**

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
TransactionForSefazGoodsList body = new TransactionForSefazGoodsList(); // TransactionForSefazGoodsList | Invoices
try {
    SefazPostOut result = apiInstance.sendInvoice(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#sendInvoice");
    e.printStackTrace();
}
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

