# GoodsTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionGoodsPurchase**](GoodsTransactionsApi.md#transactionGoodsPurchase) | **POST** /transactions?goods | Transaction Method


<a name="transactionGoodsPurchase"></a>
# **transactionGoodsPurchase**
> TransactionForGoodsOut transactionGoodsPurchase(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GoodsTransactionsApi;


GoodsTransactionsApi apiInstance = new GoodsTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
TransactionForGoodsIn body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message
try {
    TransactionForGoodsOut result = apiInstance.transactionGoodsPurchase(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoodsTransactionsApi#transactionGoodsPurchase");
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

