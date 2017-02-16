# GoodsTransactionsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsgoodsPurchasePost**](GoodsTransactionsApi.md#transactionsgoodsPurchasePost) | **POST** /transactions?goods-purchase | Transaction Method
[**transactionsgoodsSalesPost**](GoodsTransactionsApi.md#transactionsgoodsSalesPost) | **POST** /transactions?goods-sales | Transaction Method


<a name="transactionsgoodsPurchasePost"></a>
# **transactionsgoodsPurchasePost**
> TransactionForGoodsOut transactionsgoodsPurchasePost(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```java
// Import classes:
//import io.swagger.client.api.GoodsTransactionsApi;

GoodsTransactionsApi apiInstance = new GoodsTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
TransactionForGoodsIn body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message
try {
    TransactionForGoodsOut result = apiInstance.transactionsgoodsPurchasePost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoodsTransactionsApi#transactionsgoodsPurchasePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message |

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionsgoodsSalesPost"></a>
# **transactionsgoodsSalesPost**
> TransactionForGoodsOut transactionsgoodsSalesPost(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```java
// Import classes:
//import io.swagger.client.api.GoodsTransactionsApi;

GoodsTransactionsApi apiInstance = new GoodsTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
TransactionForGoodsIn body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message
try {
    TransactionForGoodsOut result = apiInstance.transactionsgoodsSalesPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoodsTransactionsApi#transactionsgoodsSalesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message |

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

