# ServiceCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationServicePayment**](ServiceCalculationsApi.md#calculationServicePayment) | **POST** /calculations?service-payment | Calculation Method
[**calculationServicePurchase**](ServiceCalculationsApi.md#calculationServicePurchase) | **POST** /calculations?service-purchase | Calculation Method
[**calculationServiceReceipt**](ServiceCalculationsApi.md#calculationServiceReceipt) | **POST** /calculations?service-receipt | Calculation Method
[**calculationServiceSales**](ServiceCalculationsApi.md#calculationServiceSales) | **POST** /calculations?service-sales | Calculation Method
[**convertServiceCalculatioToTransaction**](ServiceCalculationsApi.md#convertServiceCalculatioToTransaction) | **POST** /calculations/service/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**retrieveGoodsTransactions**](ServiceCalculationsApi.md#retrieveGoodsTransactions) | **GET** /calculations/goods/{transactionType} | Retrieve goods transactions
[**retrieveServiceTransactionDocument**](ServiceCalculationsApi.md#retrieveServiceTransactionDocument) | **GET** /calculations/service/{transactionType}/{documentCode} | Retrieve service transactions
[**retrieveServiceTransactions**](ServiceCalculationsApi.md#retrieveServiceTransactions) | **GET** /calculations/service/{transactionType} | Retrieve service transactions


<a name="calculationServicePayment"></a>
# **calculationServicePayment**
> PaymentTransactionOut calculationServicePayment(authorization, body, noPersist)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PaymentTransactionIn body = new PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message
String noPersist = "noPersist_example"; // String | Do not save this calculation
try {
    PaymentTransactionOut result = apiInstance.calculationServicePayment(authorization, body, noPersist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationServicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message |
 **noPersist** | **String**| Do not save this calculation | [optional]

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServicePurchase"></a>
# **calculationServicePurchase**
> PurchaseTransactionOut calculationServicePurchase(authorization, body, noPersist)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PurchaseTransactionIn body = new PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message
String noPersist = "noPersist_example"; // String | Do not save this calculation
try {
    PurchaseTransactionOut result = apiInstance.calculationServicePurchase(authorization, body, noPersist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationServicePurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message |
 **noPersist** | **String**| Do not save this calculation | [optional]

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServiceReceipt"></a>
# **calculationServiceReceipt**
> ReceiptTransactionOut calculationServiceReceipt(authorization, body, noPersist)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
ReceiptTransactionIn body = new ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message
String noPersist = "noPersist_example"; // String | Do not save this calculation
try {
    ReceiptTransactionOut result = apiInstance.calculationServiceReceipt(authorization, body, noPersist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationServiceReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message |
 **noPersist** | **String**| Do not save this calculation | [optional]

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServiceSales"></a>
# **calculationServiceSales**
> SalesTransactionOut calculationServiceSales(authorization, body, noPersist)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
SalesTransactionIn body = new SalesTransactionIn(); // SalesTransactionIn | Transaction Message
String noPersist = "noPersist_example"; // String | Do not save this calculation
try {
    SalesTransactionOut result = apiInstance.calculationServiceSales(authorization, body, noPersist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationServiceSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message |
 **noPersist** | **String**| Do not save this calculation | [optional]

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertServiceCalculatioToTransaction"></a>
# **convertServiceCalculatioToTransaction**
> convertServiceCalculatioToTransaction(authorization, transactionType, documentCode)

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.convertServiceCalculatioToTransaction(authorization, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#convertServiceCalculatioToTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, payment, receipt]
 **documentCode** | **String**| Document Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveGoodsTransactions"></a>
# **retrieveGoodsTransactions**
> List&lt;TransactionForGoodsIn&gt; retrieveGoodsTransactions(authorization, transactionType)

Retrieve goods transactions

Retrieve a list of transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type
try {
    List<TransactionForGoodsIn> result = apiInstance.retrieveGoodsTransactions(authorization, transactionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#retrieveGoodsTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type | [enum: sale, purchase, sales-return, purchase-return, transfer-return, shipping, shipping-return, transfer, receipt-adjustment, transfer-adjustment]

### Return type

[**List&lt;TransactionForGoodsIn&gt;**](TransactionForGoodsIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveServiceTransactionDocument"></a>
# **retrieveServiceTransactionDocument**
> retrieveServiceTransactionDocument(authorization, transactionType, documentCode)

Retrieve service transactions

Retrieve a single transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.retrieveServiceTransactionDocument(authorization, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#retrieveServiceTransactionDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, payment, receipt]
 **documentCode** | **String**| Document Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveServiceTransactions"></a>
# **retrieveServiceTransactions**
> retrieveServiceTransactions(authorization, transactionType)

Retrieve service transactions

Retrieve a list of transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceCalculationsApi;


ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
try {
    apiInstance.retrieveServiceTransactions(authorization, transactionType);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#retrieveServiceTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, payment, receipt]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

