# SWGTaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssConfByCity**](SWGTaxConfISSApi.md#createissconfbycity) | **POST** /taxconf/iss | create a new ISS Configuration
[**deleteIssConf**](SWGTaxConfISSApi.md#deleteissconf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**getIssConfByCity**](SWGTaxConfISSApi.md#getissconfbycity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**getIssList**](SWGTaxConfISSApi.md#getisslist) | **GET** /taxconf/iss | retrive list of ISS
[**updateIssConfByCity**](SWGTaxConfISSApi.md#updateissconfbycity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **createIssConfByCity**
```objc
-(NSNumber*) createIssConfByCityWithIssConfByCity: (SWGIssConfByCity*) issConfByCity
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

create a new ISS Configuration

### Example 
```objc

SWGIssConfByCity* issConfByCity = [[SWGIssConfByCity alloc] init]; // The pet JSON you want to post

SWGTaxConfISSApi*apiInstance = [[SWGTaxConfISSApi alloc] init];

// create a new ISS Configuration
[apiInstance createIssConfByCityWithIssConfByCity:issConfByCity
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfISSApi->createIssConfByCity: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issConfByCity** | [**SWGIssConfByCity***](SWGIssConfByCity*.md)| The pet JSON you want to post | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteIssConf**
```objc
-(NSNumber*) deleteIssConfWithCityCode: (NSNumber*) cityCode
        completionHandler: (void (^)(NSError* error)) handler;
```

disable a ISS by City Code.

### Example 
```objc

NSNumber* cityCode = @3.4; // City Code

SWGTaxConfISSApi*apiInstance = [[SWGTaxConfISSApi alloc] init];

// disable a ISS by City Code.
[apiInstance deleteIssConfWithCityCode:cityCode
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfISSApi->deleteIssConf: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **NSNumber***| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIssConfByCity**
```objc
-(NSNumber*) getIssConfByCityWithCityCode: (NSNumber*) cityCode
    code: (NSString*) code
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGIssConfByCity>* output, NSError* error)) handler;
```

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example 
```objc

NSNumber* cityCode = @3.4; // City Code
NSString* code = @"code_example"; // Identificator of this configuration, it is unique for account or standard namedspace  (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date  (optional)
NSNumber* inactive = @true; // return the inctives versions too  (optional)

SWGTaxConfISSApi*apiInstance = [[SWGTaxConfISSApi alloc] init];

// get ISS information by City Code.
[apiInstance getIssConfByCityWithCityCode:cityCode
              code:code
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGIssConfByCity>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfISSApi->getIssConfByCity: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **NSNumber***| City Code | 
 **code** | **NSString***| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **NSDate***| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **NSNumber***| return the inctives versions too  | [optional] 

### Return type

[**NSArray<SWGIssConfByCity>***](SWGIssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIssList**
```objc
-(NSNumber*) getIssListWithSuffixcode: (NSString*) suffixcode
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
        completionHandler: (void (^)(NSArray<SWGIssConfByCity>* output, NSError* error)) handler;
```

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example 
```objc

NSString* suffixcode = @"suffixcode_example"; // Identify this ISS  (optional)
NSDate* date = @"2013-10-20"; // When informed return valid version configuration for this date  (optional)
NSNumber* inactive = @true; // return the inactive versions too  (optional)

SWGTaxConfISSApi*apiInstance = [[SWGTaxConfISSApi alloc] init];

// retrive list of ISS
[apiInstance getIssListWithSuffixcode:suffixcode
              date:date
              inactive:inactive
          completionHandler: ^(NSArray<SWGIssConfByCity>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfISSApi->getIssList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **NSString***| Identify this ISS  | [optional] 
 **date** | **NSDate***| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **NSNumber***| return the inactive versions too  | [optional] 

### Return type

[**NSArray<SWGIssConfByCity>***](SWGIssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateIssConfByCity**
```objc
-(NSNumber*) updateIssConfByCityWithCityCode: (NSNumber*) cityCode
    issConfByCity: (SWGIssConfByCity*) issConfByCity
        completionHandler: (void (^)(NSError* error)) handler;
```

update a ISS by City Code.

### Example 
```objc

NSNumber* cityCode = @3.4; // City Code
SWGIssConfByCity* issConfByCity = [[SWGIssConfByCity alloc] init]; // The pet JSON you want to post

SWGTaxConfISSApi*apiInstance = [[SWGTaxConfISSApi alloc] init];

// update a ISS by City Code.
[apiInstance updateIssConfByCityWithCityCode:cityCode
              issConfByCity:issConfByCity
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTaxConfISSApi->updateIssConfByCity: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **NSNumber***| City Code | 
 **issConfByCity** | [**SWGIssConfByCity***](SWGIssConfByCity*.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

