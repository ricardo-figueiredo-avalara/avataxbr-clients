# ServiceTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveServiceTransactions**](ServiceTransactionsApi.md#retrieveServiceTransactions) | **GET** /transactions/service/{transactionType} | Retrieve service transactions
[**singleServiceTransaction**](ServiceTransactionsApi.md#singleServiceTransaction) | **GET** /transactions/service/{transactionType}/{documentCode} | Retrieve service transactions
[**transactionServicePayment**](ServiceTransactionsApi.md#transactionServicePayment) | **POST** /transactions?service-payment | Calculation Method
[**transactionServiceReceipt**](ServiceTransactionsApi.md#transactionServiceReceipt) | **POST** /transactions?service-receipt | Calculation Method
[**transactionServiceSales**](ServiceTransactionsApi.md#transactionServiceSales) | **POST** /transactions?service-purchase | Calculation Method
[**transactionServiceStateTransaction**](ServiceTransactionsApi.md#transactionServiceStateTransaction) | **POST** /transactions/service/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactionServicesSales**](ServiceTransactionsApi.md#transactionServicesSales) | **POST** /transactions?service-sales | Calculation Method


<a name="retrieveServiceTransactions"></a>
# **retrieveServiceTransactions**
> retrieveServiceTransactions(authorization, transactionType)

Retrieve service transactions

Retrieve a list of transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
try {
    apiInstance.retrieveServiceTransactions(authorization, transactionType);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#retrieveServiceTransactions");
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

<a name="singleServiceTransaction"></a>
# **singleServiceTransaction**
> singleServiceTransaction(authorization, transactionType, documentCode)

Retrieve service transactions

Retrieve a single transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.singleServiceTransaction(authorization, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#singleServiceTransaction");
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

<a name="transactionServicePayment"></a>
# **transactionServicePayment**
> PaymentTransactionOut transactionServicePayment(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PaymentTransactionIn body = new PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message
try {
    PaymentTransactionOut result = apiInstance.transactionServicePayment(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionServicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message |

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceReceipt"></a>
# **transactionServiceReceipt**
> ReceiptTransactionOut transactionServiceReceipt(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
ReceiptTransactionIn body = new ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message
try {
    ReceiptTransactionOut result = apiInstance.transactionServiceReceipt(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionServiceReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message |

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceSales"></a>
# **transactionServiceSales**
> PurchaseTransactionOut transactionServiceSales(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PurchaseTransactionIn body = new PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message
try {
    PurchaseTransactionOut result = apiInstance.transactionServiceSales(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionServiceSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message |

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceStateTransaction"></a>
# **transactionServiceStateTransaction**
> transactionServiceStateTransaction(authorization, transactionType, documentCode, body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
StateTransition body = new StateTransition(); // StateTransition | Transaction Message
try {
    apiInstance.transactionServiceStateTransaction(authorization, transactionType, documentCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionServiceStateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, payment, receipt]
 **documentCode** | **String**| Document Code |
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServicesSales"></a>
# **transactionServicesSales**
> SalesTransactionOut transactionServicesSales(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
SalesTransactionIn body = new SalesTransactionIn(); // SalesTransactionIn | Transaction Message
try {
    SalesTransactionOut result = apiInstance.transactionServicesSales(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionServicesSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message |

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

