# GooodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveGoodsTransactionDocument**](GooodsCalculationsApi.md#retrieveGoodsTransactionDocument) | **GET** /calculations/goods/{transactionType}/{documentCode} | Retrieve goods transactions


<a name="retrieveGoodsTransactionDocument"></a>
# **retrieveGoodsTransactionDocument**
> TransactionForGoodsIn retrieveGoodsTransactionDocument(authorization, transactionType, documentCode)

Retrieve goods transactions

Retrieve a single transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GooodsCalculationsApi;


GooodsCalculationsApi apiInstance = new GooodsCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type
String documentCode = "documentCode_example"; // String | Document Code
try {
    TransactionForGoodsIn result = apiInstance.retrieveGoodsTransactionDocument(authorization, transactionType, documentCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GooodsCalculationsApi#retrieveGoodsTransactionDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type | [enum: sale, purchase, sales-return, purchase-return, transfer-return, shipping, shipping-return, transfer, receipt-adjustment, transfer-adjustment]
 **documentCode** | **String**| Document Code |

### Return type

[**TransactionForGoodsIn**](TransactionForGoodsIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

