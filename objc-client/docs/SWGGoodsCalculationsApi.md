# SWGGoodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoodsPurchasePost**](SWGGoodsCalculationsApi.md#calculationsgoodspurchasepost) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoodsSalesPost**](SWGGoodsCalculationsApi.md#calculationsgoodssalespost) | **POST** /calculations?goods-sales | Calculation Method


# **calculationsgoodsPurchasePost**
```objc
-(NSNumber*) calculationsgoodsPurchasePostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
        completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;
```

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGTransactionForGoodsIn* body = [[SWGTransactionForGoodsIn alloc] init]; // Transaction Message

SWGGoodsCalculationsApi*apiInstance = [[SWGGoodsCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsgoodsPurchasePostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGTransactionForGoodsOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGoodsCalculationsApi->calculationsgoodsPurchasePost: %@", error);
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

# **calculationsgoodsSalesPost**
```objc
-(NSNumber*) calculationsgoodsSalesPostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
        completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;
```

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGTransactionForGoodsIn* body = [[SWGTransactionForGoodsIn alloc] init]; // Transaction Message

SWGGoodsCalculationsApi*apiInstance = [[SWGGoodsCalculationsApi alloc] init];

// Calculation Method
[apiInstance calculationsgoodsSalesPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGTransactionForGoodsOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGGoodsCalculationsApi->calculationsgoodsSalesPost: %@", error);
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

