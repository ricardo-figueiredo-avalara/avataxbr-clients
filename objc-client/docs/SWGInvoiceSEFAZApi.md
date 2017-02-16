# SWGInvoiceSEFAZApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesSefazDelete**](SWGInvoiceSEFAZApi.md#invoicessefazdelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoicesSefazKeyDelete**](SWGInvoiceSEFAZApi.md#invoicessefazkeydelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoicesSefazKeyGet**](SWGInvoiceSEFAZApi.md#invoicessefazkeyget) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoicesSefazKeyLookupGet**](SWGInvoiceSEFAZApi.md#invoicessefazkeylookupget) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoicesSefazKeyPut**](SWGInvoiceSEFAZApi.md#invoicessefazkeyput) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoicesSefazPost**](SWGInvoiceSEFAZApi.md#invoicessefazpost) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoicesSefazStatusGet**](SWGInvoiceSEFAZApi.md#invoicessefazstatusget) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **invoicesSefazDelete**
```objc
-(NSNumber*) invoicesSefazDeleteWithAuthorization: (NSString*) authorization
    body: (SWGSefazDisableRangeIn*) body
        completionHandler: (void (^)(SWGSefazInvoiceBasicStatus* output, NSError* error)) handler;
```

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
SWGSefazDisableRangeIn* body = [[SWGSefazDisableRangeIn alloc] init]; // Disable Range e-Invoice

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Disable Range e-Invoice
[apiInstance invoicesSefazDeleteWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGSefazInvoiceBasicStatus* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**SWGSefazDisableRangeIn***](SWGSefazDisableRangeIn*.md)| Disable Range e-Invoice | 

### Return type

[**SWGSefazInvoiceBasicStatus***](SWGSefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazKeyDelete**
```objc
-(NSNumber*) invoicesSefazKeyDeleteWithAuthorization: (NSString*) authorization
    key: (NSString*) key
    body: (SWGSefazItDeleteIn*) body
        completionHandler: (void (^)(SWGSefazInvoiceBasicStatus* output, NSError* error)) handler;
```

Cancel invoice

Cancel the invoice

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key
SWGSefazItDeleteIn* body = [[SWGSefazItDeleteIn alloc] init]; // Cancel Message

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Cancel invoice
[apiInstance invoicesSefazKeyDeleteWithAuthorization:authorization
              key:key
              body:body
          completionHandler: ^(SWGSefazInvoiceBasicStatus* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazKeyDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **key** | **NSString***| Invoice Key | 
 **body** | [**SWGSefazItDeleteIn***](SWGSefazItDeleteIn*.md)| Cancel Message | 

### Return type

[**SWGSefazInvoiceBasicStatus***](SWGSefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazKeyGet**
```objc
-(NSNumber*) invoicesSefazKeyGetWithAuthorization: (NSString*) authorization
    key: (NSString*) key
        completionHandler: (void (^)(SWGSefazItGetOut* output, NSError* error)) handler;
```

Retrieve invoice

Retrieve the invoice

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Retrieve invoice
[apiInstance invoicesSefazKeyGetWithAuthorization:authorization
              key:key
          completionHandler: ^(SWGSefazItGetOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazKeyGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **key** | **NSString***| Invoice Key | 

### Return type

[**SWGSefazItGetOut***](SWGSefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazKeyLookupGet**
```objc
-(NSNumber*) invoicesSefazKeyLookupGetWithAuthorization: (NSString*) authorization
    key: (NSString*) key
        completionHandler: (void (^)(SWGTransactionForSefazGoodsList* output, NSError* error)) handler;
```

Retrieve invoice

Retrieve the invoice

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Retrieve invoice
[apiInstance invoicesSefazKeyLookupGetWithAuthorization:authorization
              key:key
          completionHandler: ^(SWGTransactionForSefazGoodsList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazKeyLookupGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **key** | **NSString***| Invoice Key | 

### Return type

[**SWGTransactionForSefazGoodsList***](SWGTransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazKeyPut**
```objc
-(NSNumber*) invoicesSefazKeyPutWithAuthorization: (NSString*) authorization
    key: (NSString*) key
    body: (SWGSefazItPutIn*) body
        completionHandler: (void (^)(SWGSefazInvoiceBasicStatus* output, NSError* error)) handler;
```

Fix Letter

Fix Letter

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key
SWGSefazItPutIn* body = [[SWGSefazItPutIn alloc] init]; // Fix Message

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Fix Letter
[apiInstance invoicesSefazKeyPutWithAuthorization:authorization
              key:key
              body:body
          completionHandler: ^(SWGSefazInvoiceBasicStatus* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazKeyPut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **key** | **NSString***| Invoice Key | 
 **body** | [**SWGSefazItPutIn***](SWGSefazItPutIn*.md)| Fix Message | 

### Return type

[**SWGSefazInvoiceBasicStatus***](SWGSefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazPost**
```objc
-(NSNumber*) invoicesSefazPostWithAuthorization: (NSString*) authorization
    body: (NSArray<SWGTransactionForSefazGoods>*) body
        completionHandler: (void (^)(SWGSefazPostOut* output, NSError* error)) handler;
```

Send an e-Invoice

Send a invoice to SEFAZ 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSArray<SWGTransactionForSefazGoods>* body = @[[[SWGTransactionForSefazGoods alloc] init]]; // Invoices

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Send an e-Invoice
[apiInstance invoicesSefazPostWithAuthorization:authorization
              body:body
          completionHandler: ^(SWGSefazPostOut* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **body** | [**NSArray&lt;SWGTransactionForSefazGoods&gt;***](SWGTransactionForSefazGoods.md)| Invoices | 

### Return type

[**SWGSefazPostOut***](SWGSefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoicesSefazStatusGet**
```objc
-(NSNumber*) invoicesSefazStatusGetWithAuthorization: (NSString*) authorization
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}

SWGInvoiceSEFAZApi*apiInstance = [[SWGInvoiceSEFAZApi alloc] init];

// Retrieve Status of SEFAZ Server
[apiInstance invoicesSefazStatusGetWithAuthorization:authorization
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSEFAZApi->invoicesSefazStatusGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

