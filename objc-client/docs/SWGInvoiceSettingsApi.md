# SWGInvoiceSettingsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceSettings**](SWGInvoiceSettingsApi.md#invoicesettings) | **GET** /invoices/settings | Invoice Settigns


# **invoiceSettings**
```objc
-(NSNumber*) invoiceSettingsWithCompletionHandler: 
        (void (^)(SWGInlineResponse2004* output, NSError* error)) handler;
```

Invoice Settigns

Get Enviroment Settigns

### Example 
```objc


SWGInvoiceSettingsApi*apiInstance = [[SWGInvoiceSettingsApi alloc] init];

// Invoice Settigns
[apiInstance invoiceSettingsWithCompletionHandler: 
          ^(SWGInlineResponse2004* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGInvoiceSettingsApi->invoiceSettings: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGInlineResponse2004***](SWGInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

