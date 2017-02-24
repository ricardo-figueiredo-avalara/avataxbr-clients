# SWGInvoiceContingencyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceDropContingency**](SWGInvoiceContingencyApi.md#invoicedropcontingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoiceSetContingency**](SWGInvoiceContingencyApi.md#invoicesetcontingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoiceVerifyContingency**](SWGInvoiceContingencyApi.md#invoiceverifycontingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **invoiceDropContingency**
```objc
-(NSNumber*) invoiceDropContingencyWithState: (NSString*) state
        completionHandler: (void (^)(NSError* error)) handler;
```

Invoice Drop Contingency per State

Drop State in Contingency

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State

SWGInvoiceContingencyApi*apiInstance = [[SWGInvoiceContingencyApi alloc] init];

// Invoice Drop Contingency per State
[apiInstance invoiceDropContingencyWithState:state
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceContingencyApi->invoiceDropContingency: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoiceSetContingency**
```objc
-(NSNumber*) invoiceSetContingencyWithState: (NSString*) state
    body: (SWGBody4*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Invoice Set Contingency per State

Set State in Contingency

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
SWGBody4* body = [[SWGBody4 alloc] init]; // Set Contingency

SWGInvoiceContingencyApi*apiInstance = [[SWGInvoiceContingencyApi alloc] init];

// Invoice Set Contingency per State
[apiInstance invoiceSetContingencyWithState:state
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceContingencyApi->invoiceSetContingency: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **body** | [**SWGBody4***](SWGBody4*.md)| Set Contingency | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoiceVerifyContingency**
```objc
-(NSNumber*) invoiceVerifyContingencyWithState: (NSString*) state
        completionHandler: (void (^)(SWGInlineResponse2003* output, NSError* error)) handler;
```

Invoice Verify Contingency per State

Check if State was in Contingency

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State

SWGInvoiceContingencyApi*apiInstance = [[SWGInvoiceContingencyApi alloc] init];

// Invoice Verify Contingency per State
[apiInstance invoiceVerifyContingencyWithState:state
          completionHandler: ^(SWGInlineResponse2003* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceContingencyApi->invoiceVerifyContingency: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 

### Return type

[**SWGInlineResponse2003***](SWGInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

