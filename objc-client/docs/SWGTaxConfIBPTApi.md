# SWGTaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIbptConf**](SWGTaxConfIBPTApi.md#createibptconf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**deleteIbptConf**](SWGTaxConfIBPTApi.md#deleteibptconf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**getIbptConf**](SWGTaxConfIBPTApi.md#getibptconf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**getIbptConfList**](SWGTaxConfIBPTApi.md#getibptconflist) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**updateIbptConf**](SWGTaxConfIBPTApi.md#updateibptconf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


# **createIbptConf**
```objc
-(NSNumber*) createIbptConfWithTaxconfprocess: (SWGIbptConf*) taxconfprocess
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

create a new Process Type configuration

### Example 
```objc

SWGIbptConf* taxconfprocess = [[SWGIbptConf alloc] init]; // The pet JSON you want to post

SWGTaxConfIBPTApi*apiInstance = [[SWGTaxConfIBPTApi alloc] init];

// create a new Process Type configuration
[apiInstance createIbptConfWithTaxconfprocess:taxconfprocess
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfIBPTApi->createIbptConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**SWGIbptConf***](SWGIbptConf*.md)| The pet JSON you want to post | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteIbptConf**
```objc
-(NSNumber*) deleteIbptConfWithCode: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```

disable a IBPT.

### Example 
```objc

NSString* code = @"code_example"; // IBPT Code

SWGTaxConfIBPTApi*apiInstance = [[SWGTaxConfIBPTApi alloc] init];

// disable a IBPT.
[apiInstance deleteIbptConfWithCode:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfIBPTApi->deleteIbptConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| IBPT Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIbptConf**
```objc
-(NSNumber*) getIbptConfWithCode: (NSString*) code
        completionHandler: (void (^)(SWGIbptConf* output, NSError* error)) handler;
```

get IBPT information.

This operation return Process Type configuration 

### Example 
```objc

NSString* code = @"code_example"; // IBPT Code

SWGTaxConfIBPTApi*apiInstance = [[SWGTaxConfIBPTApi alloc] init];

// get IBPT information.
[apiInstance getIbptConfWithCode:code
          completionHandler: ^(SWGIbptConf* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfIBPTApi->getIbptConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| IBPT Code | 

### Return type

[**SWGIbptConf***](SWGIbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIbptConfList**
```objc
-(NSNumber*) getIbptConfListWithAccountId: (NSString*) accountId
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGIbptConf>* output, NSError* error)) handler;
```

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example 
```objc

NSString* accountId = @"accountId_example"; // filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date  (optional)
NSNumber* inactive = @true; // return the inactive versions too  (optional)

SWGTaxConfIBPTApi*apiInstance = [[SWGTaxConfIBPTApi alloc] init];

// retrive list of IBPT.
[apiInstance getIbptConfListWithAccountId:accountId
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGIbptConf>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfIBPTApi->getIbptConfList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **NSString***| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **NSDate***| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **NSNumber***| return the inactive versions too  | [optional] 

### Return type

[**NSArray<SWGIbptConf>***](SWGIbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateIbptConf**
```objc
-(NSNumber*) updateIbptConfWithCode: (NSString*) code
    taxconfprocess: (SWGIbptConf*) taxconfprocess
        completionHandler: (void (^)(NSError* error)) handler;
```

update a Process Type configuration

### Example 
```objc

NSString* code = @"code_example"; // IBPT Code
SWGIbptConf* taxconfprocess = [[SWGIbptConf alloc] init]; // The pet JSON you want to post

SWGTaxConfIBPTApi*apiInstance = [[SWGTaxConfIBPTApi alloc] init];

// update a Process Type configuration
[apiInstance updateIbptConfWithCode:code
              taxconfprocess:taxconfprocess
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfIBPTApi->updateIbptConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| IBPT Code | 
 **taxconfprocess** | [**SWGIbptConf***](SWGIbptConf*.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

