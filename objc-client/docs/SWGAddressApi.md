# SWGAddressApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZipCode**](SWGAddressApi.md#getzipcode) | **GET** /addresses/{zipcode} | 


# **getZipCode**
```objc
-(NSNumber*) getZipCodeWithZipcode: (NSString*) zipcode
        completionHandler: (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;
```



This operation return address

### Example 
```objc

NSString* zipcode = @"zipcode_example"; // ZIP Code

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance getZipCodeWithZipcode:zipcode
          completionHandler: ^(NSArray<SWGAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->getZipCode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **NSString***| ZIP Code | 

### Return type

[**NSArray<SWGAddress>***](SWGAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

