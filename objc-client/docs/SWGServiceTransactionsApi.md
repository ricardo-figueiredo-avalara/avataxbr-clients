# SWGServiceTransactionsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](SWGServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](SWGServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodestatetransitionspost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](SWGServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**transactionsservicePaymentPost**](SWGServiceTransactionsApi.md#transactionsservicepaymentpost) | **POST** /transactions?service-payment | Calculation Method
[**transactionsservicePurchasePost**](SWGServiceTransactionsApi.md#transactionsservicepurchasepost) | **POST** /transactions?service-purchase | Calculation Method
[**transactionsserviceReceiptPost**](SWGServiceTransactionsApi.md#transactionsservicereceiptpost) | **POST** /transactions?service-receipt | Calculation Method
[**transactionsserviceSalesPost**](SWGServiceTransactionsApi.md#transactionsservicesalespost) | **POST** /transactions?service-sales | Calculation Method


# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
```objc
-(NSNumber*) transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetWithAuthorization: (NSString*) authorization
    accountId: (NSString*) accountId
    companyCode: (NSString*) companyCode
    transactionType: (NSString*) transactionType
    documentCode: (NSString*) documentCode
        completionHandler: (void (^)(NSError* error)) handler;
```

Retrieve transactions

Retrieve a single transaction

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* accountId = @"accountId_example"; // Account ID
NSString* companyCode = @"companyCode_example"; // Company Code
NSString* transactionType = @"transactionType_example"; // Transaction Type (sale, purchase, receipts or payment)
NSString* documentCode = @"documentCode_example"; // Document Code

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Retrieve transactions
[apiInstance transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
              documentCode:documentCode
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **accountId** | **NSString***| Account ID | 
 **companyCode** | **NSString***| Company Code | 
 **transactionType** | **NSString***| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **NSString***| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**
```objc
-(NSNumber*) transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPostWithAuthorization: (NSString*) authorization
    accountId: (NSString*) accountId
    companyCode: (NSString*) companyCode
    transactionType: (NSString*) transactionType
    documentCode: (NSString*) documentCode
    body: (SWGStateTransition*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* accountId = @"accountId_example"; // Account ID
NSString* companyCode = @"companyCode_example"; // Company Code
NSString* transactionType = @"transactionType_example"; // Transaction Type (sale, purchase, receipts or payment)
NSString* documentCode = @"documentCode_example"; // Document Code
SWGStateTransition* body = [[SWGStateTransition alloc] init]; // Transaction Message

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Transaction State Transition
[apiInstance transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPostWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
              documentCode:documentCode
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **accountId** | **NSString***| Account ID | 
 **companyCode** | **NSString***| Company Code | 
 **transactionType** | **NSString***| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **NSString***| Document Code | 
 **body** | [**SWGStateTransition***](SWGStateTransition*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
```objc
-(NSNumber*) transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGetWithAuthorization: (NSString*) authorization
    accountId: (NSString*) accountId
    companyCode: (NSString*) companyCode
    transactionType: (NSString*) transactionType
        completionHandler: (void (^)(NSError* error)) handler;
```

Retrieve transactions

Retrieve a list of transactions

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* accountId = @"accountId_example"; // Account ID
NSString* companyCode = @"companyCode_example"; // Company Code
NSString* transactionType = @"transactionType_example"; // Transaction Type (sale, purchase, receipts or payment)

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Retrieve transactions
[apiInstance transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGetWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **accountId** | **NSString***| Account ID | 
 **companyCode** | **NSString***| Company Code | 
 **transactionType** | **NSString***| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservicePaymentPost**
```objc
-(NSNumber*) transactionsservicePaymentPostWithAuthorization: (NSString*) authorization
    body: (SWGPaymentTransactionIn*) body
        completionHandler: (void (^)(SWGPaymentTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGPaymentTransactionIn* body = [[SWGPaymentTransactionIn alloc] init]; // Transaction Message

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Calculation Method
[apiInstance transactionsservicePaymentPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGPaymentTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsservicePaymentPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGPaymentTransactionIn***](SWGPaymentTransactionIn*.md)| Transaction Message | 

### Return type

[**SWGPaymentTransactionOut***](SWGPaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservicePurchasePost**
```objc
-(NSNumber*) transactionsservicePurchasePostWithAuthorization: (NSString*) authorization
    body: (SWGPurchaseTransactionIn*) body
        completionHandler: (void (^)(SWGPurchaseTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGPurchaseTransactionIn* body = [[SWGPurchaseTransactionIn alloc] init]; // Transaction Message

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Calculation Method
[apiInstance transactionsservicePurchasePostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGPurchaseTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsservicePurchasePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGPurchaseTransactionIn***](SWGPurchaseTransactionIn*.md)| Transaction Message | 

### Return type

[**SWGPurchaseTransactionOut***](SWGPurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsserviceReceiptPost**
```objc
-(NSNumber*) transactionsserviceReceiptPostWithAuthorization: (NSString*) authorization
    body: (SWGReceiptTransactionIn*) body
        completionHandler: (void (^)(SWGReceiptTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGReceiptTransactionIn* body = [[SWGReceiptTransactionIn alloc] init]; // Transaction Message

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Calculation Method
[apiInstance transactionsserviceReceiptPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGReceiptTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsserviceReceiptPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGReceiptTransactionIn***](SWGReceiptTransactionIn*.md)| Transaction Message | 

### Return type

[**SWGReceiptTransactionOut***](SWGReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsserviceSalesPost**
```objc
-(NSNumber*) transactionsserviceSalesPostWithAuthorization: (NSString*) authorization
    body: (SWGSalesTransactionIn*) body
        completionHandler: (void (^)(SWGSalesTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGSalesTransactionIn* body = [[SWGSalesTransactionIn alloc] init]; // Transaction Message

SWGServiceTransactionsApi*apiInstance = [[SWGServiceTransactionsApi alloc] init];

// Calculation Method
[apiInstance transactionsserviceSalesPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGSalesTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceTransactionsApi->transactionsserviceSalesPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGSalesTransactionIn***](SWGSalesTransactionIn*.md)| Transaction Message | 

### Return type

[**SWGSalesTransactionOut***](SWGSalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

