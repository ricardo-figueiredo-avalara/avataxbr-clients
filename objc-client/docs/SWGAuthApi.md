# SWGAuthApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](SWGAuthApi.md#authpost) | **POST** /auth | authorization
[**v2AuthPost**](SWGAuthApi.md#v2authpost) | **POST** /v2/auth | authorization


# **authPost**
```objc
-(NSNumber*) authPostWithAuthorization: (NSString*) authorization
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 

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
 **authorization** | **NSString***| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v2AuthPost**
```objc
-(NSNumber*) v2AuthPostWithAuthorization: (NSString*) authorization
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example 
```objc

NSString* authorization = @"authorization_example"; // Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 

SWGAuthApi*apiInstance = [[SWGAuthApi alloc] init];

// authorization
[apiInstance v2AuthPostWithAuthorization:authorization
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAuthApi->v2AuthPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

