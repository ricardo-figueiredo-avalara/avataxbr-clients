# SWGAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agastsCodeGet**](SWGAGASTApi.md#agastscodeget) | **GET** /agasts/{code} | 
[**createAgast**](SWGAGASTApi.md#createagast) | **POST** /agasts | Create agast
[**deleteAgast**](SWGAGASTApi.md#deleteagast) | **DELETE** /agasts/{code} | 
[**getAgastList**](SWGAGASTApi.md#getagastlist) | **GET** /agasts | 
[**updateAgast**](SWGAGASTApi.md#updateagast) | **PUT** /agasts/{code} | Update agast


# **agastsCodeGet**
```objc
-(NSNumber*) agastsCodeGetWithCode: (NSString*) code
        completionHandler: (void (^)(SWGAgast* output, NSError* error)) handler;
```



This operation return agast configurations that match with parameters queries 

### Example 
```objc

NSString* code = @"code_example"; // Agast Code

SWGAGASTApi*apiInstance = [[SWGAGASTApi alloc] init];

[apiInstance agastsCodeGetWithCode:code
          completionHandler: ^(SWGAgast* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAGASTApi->agastsCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Agast Code | 

### Return type

[**SWGAgast***](SWGAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAgast**
```objc
-(NSNumber*) createAgastWithBody: (SWGAgast*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create agast

This method operation create a AGAST 

### Example 
```objc

SWGAgast* body = [[SWGAgast alloc] init]; // Transaction Message

SWGAGASTApi*apiInstance = [[SWGAGASTApi alloc] init];

// Create agast
[apiInstance createAgastWithBody:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAGASTApi->createAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGAgast***](SWGAgast*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAgast**
```objc
-(NSNumber*) deleteAgastWithCode: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* code = @"code_example"; // Agast Code

SWGAGASTApi*apiInstance = [[SWGAGASTApi alloc] init];

[apiInstance deleteAgastWithCode:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAGASTApi->deleteAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgastList**
```objc
-(NSNumber*) getAgastListWithText: (NSString*) text
        completionHandler: (void (^)(NSArray<SWGInlineResponse2001>* output, NSError* error)) handler;
```



This operation return agast configurations that match with parameters queries 

### Example 
```objc

NSString* text = @"text_example"; // Text query (optional)

SWGAGASTApi*apiInstance = [[SWGAGASTApi alloc] init];

[apiInstance getAgastListWithText:text
          completionHandler: ^(NSArray<SWGInlineResponse2001>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAGASTApi->getAgastList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **NSString***| Text query | [optional] 

### Return type

[**NSArray<SWGInlineResponse2001>***](SWGInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAgast**
```objc
-(NSNumber*) updateAgastWithCode: (NSString*) code
    body: (SWGAgast*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update agast

This method operation create a agast 

### Example 
```objc

NSString* code = @"code_example"; // Agast Code
SWGAgast* body = [[SWGAgast alloc] init]; // Transaction Message

SWGAGASTApi*apiInstance = [[SWGAGASTApi alloc] init];

// Update agast
[apiInstance updateAgastWithCode:code
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAGASTApi->updateAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Agast Code | 
 **body** | [**SWGAgast***](SWGAgast*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

