# SWGTaxConfCFOPApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCfop**](SWGTaxConfCFOPApi.md#createcfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**deleteCfop**](SWGTaxConfCFOPApi.md#deletecfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**getCfop**](SWGTaxConfCFOPApi.md#getcfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**getCfopList**](SWGTaxConfCFOPApi.md#getcfoplist) | **GET** /taxconf/cfop | retrive list of CFOP.
[**updateCfop**](SWGTaxConfCFOPApi.md#updatecfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


# **createCfop**
```objc
-(NSNumber*) createCfopWithBody: (SWGCfopConf*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

create a new CFOP configuration

### Example 
```objc

SWGCfopConf* body = [[SWGCfopConf alloc] init]; // The pet JSON you want to post

SWGTaxConfCFOPApi*apiInstance = [[SWGTaxConfCFOPApi alloc] init];

// create a new CFOP configuration
[apiInstance createCfopWithBody:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfCFOPApi->createCfop: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCfopConf***](SWGCfopConf*.md)| The pet JSON you want to post | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCfop**
```objc
-(NSNumber*) deleteCfopWithCode: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```

disable a CFOP.

### Example 
```objc

NSString* code = @"code_example"; // CFOP Code

SWGTaxConfCFOPApi*apiInstance = [[SWGTaxConfCFOPApi alloc] init];

// disable a CFOP.
[apiInstance deleteCfopWithCode:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfCFOPApi->deleteCfop: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| CFOP Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCfop**
```objc
-(NSNumber*) getCfopWithCode: (NSString*) code
        completionHandler: (void (^)(SWGCfopConf* output, NSError* error)) handler;
```

get CFOP information.

This operation return CFOP configuration 

### Example 
```objc

NSString* code = @"code_example"; // CFOP Code

SWGTaxConfCFOPApi*apiInstance = [[SWGTaxConfCFOPApi alloc] init];

// get CFOP information.
[apiInstance getCfopWithCode:code
          completionHandler: ^(SWGCfopConf* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfCFOPApi->getCfop: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| CFOP Code | 

### Return type

[**SWGCfopConf***](SWGCfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCfopList**
```objc
-(NSNumber*) getCfopListWithSuffixcode: (NSString*) suffixcode
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGCfopConf>* output, NSError* error)) handler;
```

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example 
```objc

NSString* suffixcode = @"suffixcode_example"; // Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date  (optional)
NSNumber* inactive = @true; // return the inactive versions too  (optional)

SWGTaxConfCFOPApi*apiInstance = [[SWGTaxConfCFOPApi alloc] init];

// retrive list of CFOP.
[apiInstance getCfopListWithSuffixcode:suffixcode
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGCfopConf>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfCFOPApi->getCfopList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **NSString***| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **NSDate***| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **NSNumber***| return the inactive versions too  | [optional] 

### Return type

[**NSArray<SWGCfopConf>***](SWGCfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCfop**
```objc
-(NSNumber*) updateCfopWithCode: (NSString*) code
    taxconfcfop: (SWGCfopConf*) taxconfcfop
        completionHandler: (void (^)(NSError* error)) handler;
```

update a CFOP configuration

### Example 
```objc

NSString* code = @"code_example"; // CFOP Code
SWGCfopConf* taxconfcfop = [[SWGCfopConf alloc] init]; // The pet JSON you want to post

SWGTaxConfCFOPApi*apiInstance = [[SWGTaxConfCFOPApi alloc] init];

// update a CFOP configuration
[apiInstance updateCfopWithCode:code
              taxconfcfop:taxconfcfop
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfCFOPApi->updateCfop: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***| CFOP Code | 
 **taxconfcfop** | [**SWGCfopConf***](SWGCfopConf*.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

