# SWGTaxConfICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIcmsconfstate**](SWGTaxConfICMSApi.md#createicmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**deleteIcmsConf**](SWGTaxConfICMSApi.md#deleteicmsconf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**getIcmsConfByState**](SWGTaxConfICMSApi.md#geticmsconfbystate) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**getIcmsList**](SWGTaxConfICMSApi.md#geticmslist) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**getIcmsList_0**](SWGTaxConfICMSApi.md#geticmslist_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**updateIcmsconfstate**](SWGTaxConfICMSApi.md#updateicmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **createIcmsconfstate**
```objc
-(NSNumber*) createIcmsconfstateWithState: (NSString*) state
    icmsConfState: (SWGIcmsConfByState*) icmsConfState
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

create a new ICMS Configuration

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
SWGIcmsConfByState* icmsConfState = [[SWGIcmsConfByState alloc] init]; // The pet JSON you want to post

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// create a new ICMS Configuration
[apiInstance createIcmsconfstateWithState:state
              icmsConfState:icmsConfState
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->createIcmsconfstate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **icmsConfState** | [**SWGIcmsConfByState***](SWGIcmsConfByState*.md)| The pet JSON you want to post | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteIcmsConf**
```objc
-(NSNumber*) deleteIcmsConfWithState: (NSString*) state
    code: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```

disable a ICMS by State.

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
NSString* code = @"code_example"; // ICMS Code

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// disable a ICMS by State.
[apiInstance deleteIcmsConfWithState:state
              code:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->deleteIcmsConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **code** | **NSString***| ICMS Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIcmsConfByState**
```objc
-(NSNumber*) getIcmsConfByStateWithState: (NSString*) state
    code: (NSString*) code
        completionHandler: (void (^)(NSArray<SWGIcmsConfByState>* output, NSError* error)) handler;
```

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
NSString* code = @"code_example"; // ICMS Code

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// get ICMS information by State.
[apiInstance getIcmsConfByStateWithState:state
              code:code
          completionHandler: ^(NSArray<SWGIcmsConfByState>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->getIcmsConfByState: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **code** | **NSString***| ICMS Code | 

### Return type

[**NSArray<SWGIcmsConfByState>***](SWGIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIcmsList**
```objc
-(NSNumber*) getIcmsListWithState: (NSString*) state
    suffixcode: (NSString*) suffixcode
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGIcmsConfByState>* output, NSError* error)) handler;
```

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
NSString* suffixcode = @"suffixcode_example"; // Identify this ICMS (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date (optional)
NSNumber* inactive = @true; // return the inactive versions too (optional)

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// retrive list of ICMS.
[apiInstance getIcmsListWithState:state
              suffixcode:suffixcode
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGIcmsConfByState>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->getIcmsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **suffixcode** | **NSString***| Identify this ICMS | [optional] 
 **date** | **NSDate***| When informed return valid version configuration for this date | [optional] 
 **inactive** | **NSNumber***| return the inactive versions too | [optional] 

### Return type

[**NSArray<SWGIcmsConfByState>***](SWGIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIcmsList_0**
```objc
-(NSNumber*) getIcmsList_1WithText: (NSString*) text
    state: (NSString*) state
        completionHandler: (void (^)(NSArray<SWGIcmsConfByState>* output, NSError* error)) handler;
```

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```objc

NSString* text = @"text_example"; // Search for codes
NSString* state = @"state_example"; // Filter for states (optional)

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// retrive list of ICMS.
[apiInstance getIcmsList_1WithText:text
              state:state
          completionHandler: ^(NSArray<SWGIcmsConfByState>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->getIcmsList_0: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **NSString***| Search for codes | 
 **state** | **NSString***| Filter for states | [optional] 

### Return type

[**NSArray<SWGIcmsConfByState>***](SWGIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateIcmsconfstate**
```objc
-(NSNumber*) updateIcmsconfstateWithState: (NSString*) state
    code: (NSString*) code
    icmsConfState: (SWGIcmsConfByState*) icmsConfState
        completionHandler: (void (^)(NSError* error)) handler;
```

update a IcmsConf State,

### Example 
```objc

NSString* state = @"state_example"; // Brazilian State
NSString* code = @"code_example"; // ICMS Code
SWGIcmsConfByState* icmsConfState = [[SWGIcmsConfByState alloc] init]; // The pet JSON you want to post

SWGTaxConfICMSApi*apiInstance = [[SWGTaxConfICMSApi alloc] init];

// update a IcmsConf State,
[apiInstance updateIcmsconfstateWithState:state
              code:code
              icmsConfState:icmsConfState
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfICMSApi->updateIcmsconfstate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **NSString***| Brazilian State | 
 **code** | **NSString***| ICMS Code | 
 **icmsConfState** | [**SWGIcmsConfByState***](SWGIcmsConfByState*.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

