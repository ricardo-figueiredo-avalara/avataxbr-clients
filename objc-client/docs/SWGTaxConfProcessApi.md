# SWGTaxConfProcessApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcess**](SWGTaxConfProcessApi.md#createprocess) | **POST** /taxconf/process | create a new Process Type configuration
[**deleteProcess**](SWGTaxConfProcessApi.md#deleteprocess) | **DELETE** /taxconf/process/{code} | disable a Process.
[**getProcess**](SWGTaxConfProcessApi.md#getprocess) | **GET** /taxconf/process/{code} | get Process information.
[**getProcessList**](SWGTaxConfProcessApi.md#getprocesslist) | **GET** /taxconf/process | retrive list of Process.
[**updateProcess**](SWGTaxConfProcessApi.md#updateprocess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


# **createProcess**
```objc
-(NSNumber*) createProcessWithTaxconfprocess: (SWGProcessScenario*) taxconfprocess
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

create a new Process Type configuration

### Example 
```objc

SWGProcessScenario* taxconfprocess = [[SWGProcessScenario alloc] init]; // The pet JSON you want to post

SWGTaxConfProcessApi*apiInstance = [[SWGTaxConfProcessApi alloc] init];

// create a new Process Type configuration
[apiInstance createProcessWithTaxconfprocess:taxconfprocess
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfProcessApi->createProcess: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**SWGProcessScenario***](SWGProcessScenario*.md)| The pet JSON you want to post | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProcess**
```objc
-(NSNumber*) deleteProcessWithCode: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```

disable a Process.

### Example 
```objc

NSString* code = @"code_example"; // Process Code

SWGTaxConfProcessApi*apiInstance = [[SWGTaxConfProcessApi alloc] init];

// disable a Process.
[apiInstance deleteProcessWithCode:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfProcessApi->deleteProcess: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProcess**
```objc
-(NSNumber*) getProcessWithCode: (NSString*) code
        completionHandler: (void (^)(SWGProcessScenario* output, NSError* error)) handler;
```

get Process information.

This operation return Process Type configuration 

### Example 
```objc

NSString* code = @"code_example"; // Process Code

SWGTaxConfProcessApi*apiInstance = [[SWGTaxConfProcessApi alloc] init];

// get Process information.
[apiInstance getProcessWithCode:code
          completionHandler: ^(SWGProcessScenario* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfProcessApi->getProcess: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Process Code | 

### Return type

[**SWGProcessScenario***](SWGProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProcessList**
```objc
-(NSNumber*) getProcessListWithAccountId: (NSString*) accountId
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGProcessScenario>* output, NSError* error)) handler;
```

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example 
```objc

NSString* accountId = @"accountId_example"; // filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date  (optional)
NSNumber* inactive = @true; // return the inactive versions too  (optional)

SWGTaxConfProcessApi*apiInstance = [[SWGTaxConfProcessApi alloc] init];

// retrive list of Process.
[apiInstance getProcessListWithAccountId:accountId
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGProcessScenario>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfProcessApi->getProcessList: %@", error);
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

[**NSArray<SWGProcessScenario>***](SWGProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateProcess**
```objc
-(NSNumber*) updateProcessWithCode: (NSString*) code
    taxconfprocess: (SWGProcessScenario*) taxconfprocess
        completionHandler: (void (^)(NSError* error)) handler;
```

update a Process Type configuration

### Example 
```objc

NSString* code = @"code_example"; // Process Code
SWGProcessScenario* taxconfprocess = [[SWGProcessScenario alloc] init]; // The pet JSON you want to post

SWGTaxConfProcessApi*apiInstance = [[SWGTaxConfProcessApi alloc] init];

// update a Process Type configuration
[apiInstance updateProcessWithCode:code
              taxconfprocess:taxconfprocess
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfProcessApi->updateProcess: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| Process Code | 
 **taxconfprocess** | [**SWGProcessScenario***](SWGProcessScenario*.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

