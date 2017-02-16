# ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservicePaymentPost**](ServiceCalculationsApi.md#calculationsservicePaymentPost) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservicePurchasePost**](ServiceCalculationsApi.md#calculationsservicePurchasePost) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsserviceReceiptPost**](ServiceCalculationsApi.md#calculationsserviceReceiptPost) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsserviceSalesPost**](ServiceCalculationsApi.md#calculationsserviceSalesPost) | **POST** /calculations?service-sales | Calculation Method


<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode)

Retrieve transactions

Retrieve a single transaction

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |
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

<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode)

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
String documentCode = "documentCode_example"; // String | Document Code
try {
    apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |
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

<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType)

Retrieve transactions

Retrieve a list of transactions

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
String companyCode = "companyCode_example"; // String | Company Code
String transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)
try {
    apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |
 **companyCode** | **String**| Company Code |
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | [enum: sale, purchase, receipt, payment]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationsservicePaymentPost"></a>
# **calculationsservicePaymentPost**
> PaymentTransactionOut calculationsservicePaymentPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PaymentTransactionIn body = new PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message
try {
    PaymentTransactionOut result = apiInstance.calculationsservicePaymentPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsservicePaymentPost");
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

<a name="calculationsservicePurchasePost"></a>
# **calculationsservicePurchasePost**
> PurchaseTransactionOut calculationsservicePurchasePost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
PurchaseTransactionIn body = new PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message
try {
    PurchaseTransactionOut result = apiInstance.calculationsservicePurchasePost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsservicePurchasePost");
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

<a name="calculationsserviceReceiptPost"></a>
# **calculationsserviceReceiptPost**
> ReceiptTransactionOut calculationsserviceReceiptPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
ReceiptTransactionIn body = new ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message
try {
    ReceiptTransactionOut result = apiInstance.calculationsserviceReceiptPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsserviceReceiptPost");
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

<a name="calculationsserviceSalesPost"></a>
# **calculationsserviceSalesPost**
> SalesTransactionOut calculationsserviceSalesPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.api.ServiceCalculationsApi;

ServiceCalculationsApi apiInstance = new ServiceCalculationsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
SalesTransactionIn body = new SalesTransactionIn(); // SalesTransactionIn | Transaction Message
try {
    SalesTransactionOut result = apiInstance.calculationsserviceSalesPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceCalculationsApi#calculationsserviceSalesPost");
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
