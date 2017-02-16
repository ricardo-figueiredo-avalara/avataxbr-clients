# SWGInvoiceNFCeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesNfceKeyGet**](SWGInvoiceNFCeDANFEApi.md#invoicesnfcekeyget) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


# **invoicesNfceKeyGet**
```objc
-(NSNumber*) invoicesNfceKeyGetWithAuthorization: (NSString*) authorization
    key: (NSString*) key
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Bearer {auth}
NSString* key = @"key_example"; // Invoice Key

SWGInvoiceNFCeDANFEApi*apiInstance = [[SWGInvoiceNFCeDANFEApi alloc] init];

// NFCe Danfe Print
[apiInstance invoicesNfceKeyGetWithAuthorization:authorization
              key:key
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceNFCeDANFEApi->invoicesNfceKeyGet: %@", error);
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

