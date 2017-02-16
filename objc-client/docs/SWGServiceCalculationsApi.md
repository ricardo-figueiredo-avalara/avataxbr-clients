# SWGServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](SWGServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](SWGServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodetransactionspost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](SWGServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservicePaymentPost**](SWGServiceCalculationsApi.md#calculationsservicepaymentpost) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservicePurchasePost**](SWGServiceCalculationsApi.md#calculationsservicepurchasepost) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsserviceReceiptPost**](SWGServiceCalculationsApi.md#calculationsservicereceiptpost) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsserviceSalesPost**](SWGServiceCalculationsApi.md#calculationsservicesalespost) | **POST** /calculations?service-sales | Calculation Method


# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
```objc
-(NSNumber*) calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetWithAuthorization: (NSString*) authorization
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

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Retrieve transactions
[apiInstance calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGetWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
              documentCode:documentCode
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: %@", error);
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

# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
```objc
-(NSNumber*) calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPostWithAuthorization: (NSString*) authorization
    accountId: (NSString*) accountId
    companyCode: (NSString*) companyCode
    transactionType: (NSString*) transactionType
    documentCode: (NSString*) documentCode
        completionHandler: (void (^)(NSError* error)) handler;
```

Promote a calculation to transaction

Promote a calculation to transaction

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* accountId = @"accountId_example"; // Account ID
NSString* companyCode = @"companyCode_example"; // Company Code
NSString* transactionType = @"transactionType_example"; // Transaction Type (sale, purchase, receipts or payment)
NSString* documentCode = @"documentCode_example"; // Document Code

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Promote a calculation to transaction
[apiInstance calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPostWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
              documentCode:documentCode
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost: %@", error);
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

# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
```objc
-(NSNumber*) calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGetWithAuthorization: (NSString*) authorization
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

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Retrieve transactions
[apiInstance calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGetWithAuthorization:authorization
              accountId:accountId
              companyCode:companyCode
              transactionType:transactionType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: %@", error);
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

# **calculationsservicePaymentPost**
```objc
-(NSNumber*) calculationsservicePaymentPostWithAuthorization: (NSString*) authorization
    body: (SWGPaymentTransactionIn*) body
        completionHandler: (void (^)(SWGPaymentTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGPaymentTransactionIn* body = [[SWGPaymentTransactionIn alloc] init]; // Transaction Message

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsservicePaymentPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGPaymentTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsservicePaymentPost: %@", error);
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

# **calculationsservicePurchasePost**
```objc
-(NSNumber*) calculationsservicePurchasePostWithAuthorization: (NSString*) authorization
    body: (SWGPurchaseTransactionIn*) body
        completionHandler: (void (^)(SWGPurchaseTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGPurchaseTransactionIn* body = [[SWGPurchaseTransactionIn alloc] init]; // Transaction Message

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsservicePurchasePostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGPurchaseTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsservicePurchasePost: %@", error);
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

# **calculationsserviceReceiptPost**
```objc
-(NSNumber*) calculationsserviceReceiptPostWithAuthorization: (NSString*) authorization
    body: (SWGReceiptTransactionIn*) body
        completionHandler: (void (^)(SWGReceiptTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGReceiptTransactionIn* body = [[SWGReceiptTransactionIn alloc] init]; // Transaction Message

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsserviceReceiptPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGReceiptTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsserviceReceiptPost: %@", error);
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

# **calculationsserviceSalesPost**
```objc
-(NSNumber*) calculationsserviceSalesPostWithAuthorization: (NSString*) authorization
    body: (SWGSalesTransactionIn*) body
        completionHandler: (void (^)(SWGSalesTransactionOut* output, NSError* error)) handler;
```

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGSalesTransactionIn* body = [[SWGSalesTransactionIn alloc] init]; // Transaction Message

SWGServiceCalculationsApi*apiInstance = [[SWGServiceCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsserviceSalesPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGSalesTransactionOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGServiceCalculationsApi->calculationsserviceSalesPost: %@", error);
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

