# InvoiceSEFAZApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
SefazDisableRangeIn body = new SefazDisableRangeIn(); // SefazDisableRangeIn | Disable Range e-Invoice
try {
    SefazInvoiceBasicStatus result = apiInstance.invoicesSefazDelete(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazDelete");
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

<a name="invoicesSefazKeyDelete"></a>
# **invoicesSefazKeyDelete**
> SefazInvoiceBasicStatus invoicesSefazKeyDelete(authorization, key, body)

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
    SefazInvoiceBasicStatus result = apiInstance.invoicesSefazKeyDelete(authorization, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazKeyDelete");
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

<a name="invoicesSefazKeyGet"></a>
# **invoicesSefazKeyGet**
> SefazItGetOut invoicesSefazKeyGet(authorization, key)

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
    SefazItGetOut result = apiInstance.invoicesSefazKeyGet(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazKeyGet");
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

<a name="invoicesSefazKeyLookupGet"></a>
# **invoicesSefazKeyLookupGet**
> TransactionForSefazGoodsList invoicesSefazKeyLookupGet(authorization, key)

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
    TransactionForSefazGoodsList result = apiInstance.invoicesSefazKeyLookupGet(authorization, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazKeyLookupGet");
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

<a name="invoicesSefazKeyPut"></a>
# **invoicesSefazKeyPut**
> SefazInvoiceBasicStatus invoicesSefazKeyPut(authorization, key, body)

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
    SefazInvoiceBasicStatus result = apiInstance.invoicesSefazKeyPut(authorization, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazKeyPut");
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

<a name="invoicesSefazPost"></a>
# **invoicesSefazPost**
> SefazPostOut invoicesSefazPost(authorization, body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceSEFAZApi;


InvoiceSEFAZApi apiInstance = new InvoiceSEFAZApi();
String authorization = "authorization_example"; // String | Bearer {auth}
List<TransactionForSefazGoods> body = Arrays.asList(new TransactionForSefazGoods()); // List<TransactionForSefazGoods> | Invoices
try {
    SefazPostOut result = apiInstance.invoicesSefazPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**List&lt;TransactionForSefazGoods&gt;**](TransactionForSefazGoods.md)| Invoices |

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoicesSefazStatusGet"></a>
# **invoicesSefazStatusGet**
> String invoicesSefazStatusGet(authorization)

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
    String result = apiInstance.invoicesSefazStatusGet(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSEFAZApi#invoicesSefazStatusGet");
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

