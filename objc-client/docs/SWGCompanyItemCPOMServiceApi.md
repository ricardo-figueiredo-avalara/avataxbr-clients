# SWGCompanyItemCPOMServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeCpomCityCodeGet**](SWGCompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomcitycodeget) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companiesCompanyIdItemsCodeCpomGet**](SWGCompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomget) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**createItemCPOM**](SWGCompanyItemCPOMServiceApi.md#createitemcpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**deleteItemCPOM**](SWGCompanyItemCPOMServiceApi.md#deleteitemcpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**updateItemCPOM**](SWGCompanyItemCPOMServiceApi.md#updateitemcpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **companiesCompanyIdItemsCodeCpomCityCodeGet**
```objc
-(NSNumber*) companiesCompanyIdItemsCodeCpomCityCodeGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    cityCode: (NSNumber*) cityCode
        completionHandler: (void (^)(SWGItemCpom* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSNumber* cityCode = @3.4; // City Code

SWGCompanyItemCPOMServiceApi*apiInstance = [[SWGCompanyItemCPOMServiceApi alloc] init];

[apiInstance companiesCompanyIdItemsCodeCpomCityCodeGetWithCompanyId:companyId
              code:code
              cityCode:cityCode
          completionHandler: ^(SWGItemCpom* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomCityCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **cityCode** | **NSNumber***| City Code | 

### Return type

[**SWGItemCpom***](SWGItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdItemsCodeCpomGet**
```objc
-(NSNumber*) companiesCompanyIdItemsCodeCpomGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
        completionHandler: (void (^)(NSArray<SWGItemCpom>* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)

SWGCompanyItemCPOMServiceApi*apiInstance = [[SWGCompanyItemCPOMServiceApi alloc] init];

[apiInstance companiesCompanyIdItemsCodeCpomGetWithCompanyId:companyId
              code:code
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
          completionHandler: ^(NSArray<SWGItemCpom>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **xPaginationLimit** | **NSNumber***| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **NSNumber***| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **NSString***|  | [optional] 

### Return type

[**NSArray<SWGItemCpom>***](SWGItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createItemCPOM**
```objc
-(NSNumber*) createItemCPOMWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGItemCpom*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
SWGItemCpom* body = [[SWGItemCpom alloc] init]; // Transaction Message

SWGCompanyItemCPOMServiceApi*apiInstance = [[SWGCompanyItemCPOMServiceApi alloc] init];

// Create custom agast for one company
[apiInstance createItemCPOMWithCompanyId:companyId
              code:code
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemCPOMServiceApi->createItemCPOM: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **body** | [**SWGItemCpom***](SWGItemCpom*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteItemCPOM**
```objc
-(NSNumber*) deleteItemCPOMWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    cityCode: (NSNumber*) cityCode
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSNumber* cityCode = @3.4; // City Code

SWGCompanyItemCPOMServiceApi*apiInstance = [[SWGCompanyItemCPOMServiceApi alloc] init];

[apiInstance deleteItemCPOMWithCompanyId:companyId
              code:code
              cityCode:cityCode
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemCPOMServiceApi->deleteItemCPOM: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **cityCode** | **NSNumber***| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateItemCPOM**
```objc
-(NSNumber*) updateItemCPOMWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    cityCode: (NSNumber*) cityCode
    body: (SWGItemCpom*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSNumber* cityCode = @3.4; // City Code
SWGItemCpom* body = [[SWGItemCpom alloc] init]; // Transaction Message

SWGCompanyItemCPOMServiceApi*apiInstance = [[SWGCompanyItemCPOMServiceApi alloc] init];

// Update custom agast for one company
[apiInstance updateItemCPOMWithCompanyId:companyId
              code:code
              cityCode:cityCode
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemCPOMServiceApi->updateItemCPOM: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **cityCode** | **NSNumber***| City Code | 
 **body** | [**SWGItemCpom***](SWGItemCpom*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

