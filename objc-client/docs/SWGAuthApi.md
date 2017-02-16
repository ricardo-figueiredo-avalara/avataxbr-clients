# SWGAuthApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](SWGAuthApi.md#authpost) | **POST** /auth | authorization


# **authPost**
```objc
-(NSNumber*) authPostWithAuthorization: (NSString*) authorization
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Authorization: Basic VGVzdDoxMjM= 

SWGAuthApi*apiInstance = [[SWGAuthApi alloc] init];

// authorization
[apiInstance authPostWithAuthorization:authorization
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAuthApi->authPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Authorization: Basic VGVzdDoxMjM&#x3D;  | 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

