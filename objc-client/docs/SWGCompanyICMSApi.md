# SWGCompanyICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdIcmsGet**](SWGCompanyICMSApi.md#companiescompanyidicmsget) | **GET** /companies/{companyId}/icms | 
[**companiesCompanyIdIcmsStateGet**](SWGCompanyICMSApi.md#companiescompanyidicmsstateget) | **GET** /companies/{companyId}/icms/{state} | 
[**createICMS**](SWGCompanyICMSApi.md#createicms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**deleteCustomIcmsConfByState**](SWGCompanyICMSApi.md#deletecustomicmsconfbystate) | **DELETE** /companies/{companyId}/icms/{state} | 
[**updateCustomIcmsConfByState**](SWGCompanyICMSApi.md#updatecustomicmsconfbystate) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **companiesCompanyIdIcmsGet**
```objc
-(NSNumber*) companiesCompanyIdIcmsGetWithCompanyId: (NSString*) companyId
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
        completionHandler: (void (^)(NSArray<SWGCustomIcmsConfByState>* output, NSError* error)) handler;
```



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)

SWGCompanyICMSApi*apiInstance = [[SWGCompanyICMSApi alloc] init];

[apiInstance companiesCompanyIdIcmsGetWithCompanyId:companyId
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
          completionHandler: ^(NSArray<SWGCustomIcmsConfByState>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyICMSApi->companiesCompanyIdIcmsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **xPaginationLimit** | **NSNumber***| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **NSNumber***| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **NSString***|  | [optional] 

### Return type

[**NSArray<SWGCustomIcmsConfByState>***](SWGCustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdIcmsStateGet**
```objc
-(NSNumber*) companiesCompanyIdIcmsStateGetWithCompanyId: (NSString*) companyId
    state: (NSString*) state
        completionHandler: (void (^)(SWGCustomIcmsConfByState* output, NSError* error)) handler;
```



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* state = @"state_example"; // Brazilian State

SWGCompanyICMSApi*apiInstance = [[SWGCompanyICMSApi alloc] init];

[apiInstance companiesCompanyIdIcmsStateGetWithCompanyId:companyId
              state:state
          completionHandler: ^(SWGCustomIcmsConfByState* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyICMSApi->companiesCompanyIdIcmsStateGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **state** | **NSString***| Brazilian State | 

### Return type

[**SWGCustomIcmsConfByState***](SWGCustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createICMS**
```objc
-(NSNumber*) createICMSWithCompanyId: (NSString*) companyId
    body: (SWGCustomIcmsConfByState*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGCustomIcmsConfByState* body = [[SWGCustomIcmsConfByState alloc] init]; // Transaction Message

SWGCompanyICMSApi*apiInstance = [[SWGCompanyICMSApi alloc] init];

// Create custom ICMS tax for one company
[apiInstance createICMSWithCompanyId:companyId
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyICMSApi->createICMS: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGCustomIcmsConfByState***](SWGCustomIcmsConfByState*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCustomIcmsConfByState**
```objc
-(NSNumber*) deleteCustomIcmsConfByStateWithCompanyId: (NSString*) companyId
    state: (NSString*) state
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* state = @"state_example"; // Brazilian State

SWGCompanyICMSApi*apiInstance = [[SWGCompanyICMSApi alloc] init];

[apiInstance deleteCustomIcmsConfByStateWithCompanyId:companyId
              state:state
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyICMSApi->deleteCustomIcmsConfByState: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **state** | **NSString***| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCustomIcmsConfByState**
```objc
-(NSNumber*) updateCustomIcmsConfByStateWithCompanyId: (NSString*) companyId
    state: (NSString*) state
    body: (SWGCustomIcmsConfByState*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* state = @"state_example"; // Brazilian State
SWGCustomIcmsConfByState* body = [[SWGCustomIcmsConfByState alloc] init]; // Transaction Message

SWGCompanyICMSApi*apiInstance = [[SWGCompanyICMSApi alloc] init];

// Update custom agast for one company
[apiInstance updateCustomIcmsConfByStateWithCompanyId:companyId
              state:state
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyICMSApi->updateCustomIcmsConfByState: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **state** | **NSString***| Brazilian State | 
 **body** | [**SWGCustomIcmsConfByState***](SWGCustomIcmsConfByState*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

