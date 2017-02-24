# ServiceTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**transactionsservicePaymentPost**](ServiceTransactionsApi.md#transactionsservicePaymentPost) | **POST** /transactions?service-payment | Calculation Method
[**transactionsservicePurchasePost**](ServiceTransactionsApi.md#transactionsservicePurchasePost) | **POST** /transactions?service-purchase | Calculation Method
[**transactionsserviceReceiptPost**](ServiceTransactionsApi.md#transactionsserviceReceiptPost) | **POST** /transactions?service-receipt | Calculation Method
[**transactionsserviceSalesPost**](ServiceTransactionsApi.md#transactionsserviceSalesPost) | **POST** /transactions?service-sales | Calculation Method


<a name="transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet"></a>
# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode)

Retrieve transactions

Retrieve a single transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String accountId = "accountId_example"; // String | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **String**| Account ID |
 **companyCode** | **String**| Company Code |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, receipt, payment]
 **documentCode** | **String**| Document Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost"></a>
# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost(authorization, accountId, companyCode, transactionType, documentCode, body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String accountId = "accountId_example"; // String | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
StateTransition body = new StateTransition(); // StateTransition | Transaction Message
try {
    apiInstance.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost(authorization, accountId, companyCode, transactionType, documentCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **String**| Account ID |
 **companyCode** | **String**| Company Code |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, receipt, payment]
 **documentCode** | **String**| Document Code |
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet"></a>
# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType)

Retrieve transactions

Retrieve a list of transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceTransactionsApi;


ServiceTransactionsApi apiInstance = new ServiceTransactionsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String accountId = "accountId_example"; // String | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
try {
    apiInstance.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **String**| Account ID |
 **companyCode** | **String**| Company Code |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, receipt, payment]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionsservicePaymentPost"></a>
# **transactionsservicePaymentPost**
> PaymentTransactionOut transactionsservicePaymentPost(authorization, body)

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
    PaymentTransactionOut result = apiInstance.transactionsservicePaymentPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsservicePaymentPost");
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

<a name="transactionsservicePurchasePost"></a>
# **transactionsservicePurchasePost**
> PurchaseTransactionOut transactionsservicePurchasePost(authorization, body)

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
    PurchaseTransactionOut result = apiInstance.transactionsservicePurchasePost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsservicePurchasePost");
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

<a name="transactionsserviceReceiptPost"></a>
# **transactionsserviceReceiptPost**
> ReceiptTransactionOut transactionsserviceReceiptPost(authorization, body)

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
    ReceiptTransactionOut result = apiInstance.transactionsserviceReceiptPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsserviceReceiptPost");
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

<a name="transactionsserviceSalesPost"></a>
# **transactionsserviceSalesPost**
> SalesTransactionOut transactionsserviceSalesPost(authorization, body)

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
    SalesTransactionOut result = apiInstance.transactionsserviceSalesPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTransactionsApi#transactionsserviceSalesPost");
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

