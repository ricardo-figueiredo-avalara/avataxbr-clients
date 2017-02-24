# SWGCompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdAgastsCodeGet**](SWGCompanyAGASTApi.md#companiescompanyidagastscodeget) | **GET** /companies/{companyId}/agasts/{code} | 
[**companiesCompanyIdAgastsGet**](SWGCompanyAGASTApi.md#companiescompanyidagastsget) | **GET** /companies/{companyId}/agasts | 
[**createCustomAgast**](SWGCompanyAGASTApi.md#createcustomagast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**deleteAgast**](SWGCompanyAGASTApi.md#deleteagast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**updateCustomAgast**](SWGCompanyAGASTApi.md#updatecustomagast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **companiesCompanyIdAgastsCodeGet**
```objc
-(NSNumber*) companiesCompanyIdAgastsCodeGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    parent: (NSString*) parent
        completionHandler: (void (^)(SWGCustomAgast* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Agast Code
NSString* parent = @"parent_example"; // Agast parent code, means that this agast is a specialization of parent agast  (optional)

SWGCompanyAGASTApi*apiInstance = [[SWGCompanyAGASTApi alloc] init];

[apiInstance companiesCompanyIdAgastsCodeGetWithCompanyId:companyId
              code:code
              parent:parent
          completionHandler: ^(SWGCustomAgast* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyAGASTApi->companiesCompanyIdAgastsCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Agast Code | 
 **parent** | **NSString***| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**SWGCustomAgast***](SWGCustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdAgastsGet**
```objc
-(NSNumber*) companiesCompanyIdAgastsGetWithCompanyId: (NSString*) companyId
    text: (NSString*) text
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
    agast: (NSString*) agast
    parent: (NSString*) parent
        completionHandler: (void (^)(NSArray<SWGInlineResponse2001>* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* text = @"text_example"; // Text query (optional)
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)
NSString* agast = @"agast_example"; // Custom Agast Code (optional)
NSString* parent = @"parent_example"; // Agast Code (optional)

SWGCompanyAGASTApi*apiInstance = [[SWGCompanyAGASTApi alloc] init];

[apiInstance companiesCompanyIdAgastsGetWithCompanyId:companyId
              text:text
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
              agast:agast
              parent:parent
          completionHandler: ^(NSArray<SWGInlineResponse2001>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyAGASTApi->companiesCompanyIdAgastsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **text** | **NSString***| Text query | [optional] 
 **xPaginationLimit** | **NSNumber***| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **NSNumber***| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **NSString***|  | [optional] 
 **agast** | **NSString***| Custom Agast Code | [optional] 
 **parent** | **NSString***| Agast Code | [optional] 

### Return type

[**NSArray<SWGInlineResponse2001>***](SWGInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCustomAgast**
```objc
-(NSNumber*) createCustomAgastWithCompanyId: (NSString*) companyId
    body: (SWGCustomAgast*) body
    text: (NSString*) text
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGCustomAgast* body = [[SWGCustomAgast alloc] init]; // Transaction Message
NSString* text = @"text_example"; // Text query (optional)

SWGCompanyAGASTApi*apiInstance = [[SWGCompanyAGASTApi alloc] init];

// Create custom agast for one company
[apiInstance createCustomAgastWithCompanyId:companyId
              body:body
              text:text
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyAGASTApi->createCustomAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGCustomAgast***](SWGCustomAgast*.md)| Transaction Message | 
 **text** | **NSString***| Text query | [optional] 

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
-(NSNumber*) deleteAgastWithCompanyId: (NSString*) companyId
    code: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Agast Code

SWGCompanyAGASTApi*apiInstance = [[SWGCompanyAGASTApi alloc] init];

[apiInstance deleteAgastWithCompanyId:companyId
              code:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyAGASTApi->deleteAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCustomAgast**
```objc
-(NSNumber*) updateCustomAgastWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGCustomAgast*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Agast Code
SWGCustomAgast* body = [[SWGCustomAgast alloc] init]; // Transaction Message

SWGCompanyAGASTApi*apiInstance = [[SWGCompanyAGASTApi alloc] init];

// Update custom agast for one company
[apiInstance updateCustomAgastWithCompanyId:companyId
              code:code
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyAGASTApi->updateCustomAgast: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Agast Code | 
 **body** | [**SWGCustomAgast***](SWGCustomAgast*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

