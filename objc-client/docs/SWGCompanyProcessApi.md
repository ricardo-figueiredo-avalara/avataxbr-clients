# SWGCompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdProcessCodeGet**](SWGCompanyProcessApi.md#companiescompanyidprocesscodeget) | **GET** /companies/{companyId}/process/{code} | 
[**companiesCompanyIdProcessGet**](SWGCompanyProcessApi.md#companiescompanyidprocessget) | **GET** /companies/{companyId}/process | 
[**createCustomProcessScenario**](SWGCompanyProcessApi.md#createcustomprocessscenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**deleteCustomProcessScenario**](SWGCompanyProcessApi.md#deletecustomprocessscenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**updateCustomProcessScenario**](SWGCompanyProcessApi.md#updatecustomprocessscenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


# **companiesCompanyIdProcessCodeGet**
```objc
-(NSNumber*) companiesCompanyIdProcessCodeGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
        completionHandler: (void (^)(SWGCustomProcessScenario* output, NSError* error)) handler;
```



This operation return custom process configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Process Code

SWGCompanyProcessApi*apiInstance = [[SWGCompanyProcessApi alloc] init];

[apiInstance companiesCompanyIdProcessCodeGetWithCompanyId:companyId
              code:code
          completionHandler: ^(SWGCustomProcessScenario* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyProcessApi->companiesCompanyIdProcessCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Process Code | 

### Return type

[**SWGCustomProcessScenario***](SWGCustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdProcessGet**
```objc
-(NSNumber*) companiesCompanyIdProcessGetWithCompanyId: (NSString*) companyId
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
        completionHandler: (void (^)(NSArray<SWGCustomProcessScenario>* output, NSError* error)) handler;
```



This operation return custom process configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)

SWGCompanyProcessApi*apiInstance = [[SWGCompanyProcessApi alloc] init];

[apiInstance companiesCompanyIdProcessGetWithCompanyId:companyId
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
          completionHandler: ^(NSArray<SWGCustomProcessScenario>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyProcessApi->companiesCompanyIdProcessGet: %@", error);
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

[**NSArray<SWGCustomProcessScenario>***](SWGCustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCustomProcessScenario**
```objc
-(NSNumber*) createCustomProcessScenarioWithCompanyId: (NSString*) companyId
    body: (SWGCustomProcessScenario*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGCustomProcessScenario* body = [[SWGCustomProcessScenario alloc] init]; // Transaction Message

SWGCompanyProcessApi*apiInstance = [[SWGCompanyProcessApi alloc] init];

// Create custom process tax for one company
[apiInstance createCustomProcessScenarioWithCompanyId:companyId
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyProcessApi->createCustomProcessScenario: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGCustomProcessScenario***](SWGCustomProcessScenario*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCustomProcessScenario**
```objc
-(NSNumber*) deleteCustomProcessScenarioWithCompanyId: (NSString*) companyId
    code: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Process Code

SWGCompanyProcessApi*apiInstance = [[SWGCompanyProcessApi alloc] init];

[apiInstance deleteCustomProcessScenarioWithCompanyId:companyId
              code:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyProcessApi->deleteCustomProcessScenario: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCustomProcessScenario**
```objc
-(NSNumber*) updateCustomProcessScenarioWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGCustomProcessScenario*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation update a custom process for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Process Code
SWGCustomProcessScenario* body = [[SWGCustomProcessScenario alloc] init]; // Transaction Message

SWGCompanyProcessApi*apiInstance = [[SWGCompanyProcessApi alloc] init];

// Update custom agast for one company
[apiInstance updateCustomProcessScenarioWithCompanyId:companyId
              code:code
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyProcessApi->updateCustomProcessScenario: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Process Code | 
 **body** | [**SWGCustomProcessScenario***](SWGCustomProcessScenario*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

