# SWGInvoiceNFeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfePrint**](SWGInvoiceNFeDANFEApi.md#nfeprint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


# **nfePrint**
```objc
-(NSNumber*) nfePrintWithAuthorization: (NSString*) authorization
    key: (NSString*) key
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Retrieve Danfe

Retrieve the Danfe 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key

SWGInvoiceNFeDANFEApi*apiInstance = [[SWGInvoiceNFeDANFEApi alloc] init];

// Retrieve Danfe
[apiInstance nfePrintWithAuthorization:authorization
              key:key
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceNFeDANFEApi->nfePrint: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Bearer {auth} | 
 **key** | **NSString***| Invoice Key | 

### Return type

**NSURL***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

