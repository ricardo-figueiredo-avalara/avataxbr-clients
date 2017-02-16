# SWGGoodsTransactionsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsgoodsPurchasePost**](SWGGoodsTransactionsApi.md#transactionsgoodspurchasepost) | **POST** /transactions?goods-purchase | Transaction Method
[**transactionsgoodsSalesPost**](SWGGoodsTransactionsApi.md#transactionsgoodssalespost) | **POST** /transactions?goods-sales | Transaction Method


# **transactionsgoodsPurchasePost**
```objc
-(NSNumber*) transactionsgoodsPurchasePostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
        completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;
```

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGTransactionForGoodsIn* body = [[SWGTransactionForGoodsIn alloc] init]; // Transaction Message

SWGGoodsTransactionsApi*apiInstance = [[SWGGoodsTransactionsApi alloc] init];

// Transaction Method
[apiInstance transactionsgoodsPurchasePostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGTransactionForGoodsOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGoodsTransactionsApi->transactionsgoodsPurchasePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGTransactionForGoodsIn***](SWGTransactionForGoodsIn*.md)| Transaction Message | 

### Return type

[**SWGTransactionForGoodsOut***](SWGTransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsgoodsSalesPost**
```objc
-(NSNumber*) transactionsgoodsSalesPostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
        completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;
```

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGTransactionForGoodsIn* body = [[SWGTransactionForGoodsIn alloc] init]; // Transaction Message

SWGGoodsTransactionsApi*apiInstance = [[SWGGoodsTransactionsApi alloc] init];

// Transaction Method
[apiInstance transactionsgoodsSalesPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGTransactionForGoodsOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGoodsTransactionsApi->transactionsgoodsSalesPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGTransactionForGoodsIn***](SWGTransactionForGoodsIn*.md)| Transaction Message | 

### Return type

[**SWGTransactionForGoodsOut***](SWGTransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

