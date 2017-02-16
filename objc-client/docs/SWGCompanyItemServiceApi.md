# SWGCompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](SWGCompanyItemServiceApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodeserviceGet**](SWGCompanyItemServiceApi.md#companiescompanyiditemscodeserviceget) | **GET** /companies/{companyId}/items/{code}?service | 
[**companiesCompanyIdItemsserviceGet**](SWGCompanyItemServiceApi.md#companiescompanyiditemsserviceget) | **GET** /companies/{companyId}/items?service | 
[**createItemService**](SWGCompanyItemServiceApi.md#createitemservice) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**deleteItemService**](SWGCompanyItemServiceApi.md#deleteitemservice) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**updateItemService**](SWGCompanyItemServiceApi.md#updateitemservice) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **companiesCompanyIdItemsCodeChangeCodePut**
```objc
-(NSNumber*) companiesCompanyIdItemsCodeChangeCodePutWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGBody1*) body
    goods: (NSString*) goods
    service: (NSString*) service
        completionHandler: (void (^)(NSError* error)) handler;
```



Change the code of a given item. 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
SWGBody1* body = [[SWGBody1 alloc] init]; // Requisition
NSString* goods = @"goods_example"; // Provide to apply to goods items. (optional)
NSString* service = @"service_example"; // Provide to apply to service items. (optional)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

[apiInstance companiesCompanyIdItemsCodeChangeCodePutWithCompanyId:companyId
              code:code
              body:body
              goods:goods
              service:service
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->companiesCompanyIdItemsCodeChangeCodePut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **body** | [**SWGBody1***](SWGBody1*.md)| Requisition | 
 **goods** | **NSString***| Provide to apply to goods items. | [optional] 
 **service** | **NSString***| Provide to apply to service items. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdItemsCodeserviceGet**
```objc
-(NSNumber*) companiesCompanyIdItemsCodeserviceGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    agast: (NSString*) agast
        completionHandler: (void (^)(SWGItemSimple* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSString* avalaraProductType = @"service"; // Avalara Product Type (optional) (default to service)
NSString* agast = @"agast_example"; // Custom Agast Code (optional)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

[apiInstance companiesCompanyIdItemsCodeserviceGetWithCompanyId:companyId
              code:code
              avalaraProductType:avalaraProductType
              agast:agast
          completionHandler: ^(SWGItemSimple* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->companiesCompanyIdItemsCodeserviceGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [optional] [default to service]
 **agast** | **NSString***| Custom Agast Code | [optional] 

### Return type

[**SWGItemSimple***](SWGItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdItemsserviceGet**
```objc
-(NSNumber*) companiesCompanyIdItemsserviceGetWithCompanyId: (NSString*) companyId
    avalaraProductType: (NSString*) avalaraProductType
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
    code: (NSString*) code
    agast: (NSString*) agast
        completionHandler: (void (^)(NSArray<SWGItemSimple>* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* avalaraProductType = @"service"; // Avalara Product Type (optional) (default to service)
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)
NSString* code = @"code_example"; // Item Code (optional)
NSString* agast = @"agast_example"; // Custom Agast Code (optional)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

[apiInstance companiesCompanyIdItemsserviceGetWithCompanyId:companyId
              avalaraProductType:avalaraProductType
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
              code:code
              agast:agast
          completionHandler: ^(NSArray<SWGItemSimple>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->companiesCompanyIdItemsserviceGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [optional] [default to service]
 **xPaginationLimit** | **NSNumber***| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **NSNumber***| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **NSString***|  | [optional] 
 **code** | **NSString***| Item Code | [optional] 
 **agast** | **NSString***| Custom Agast Code | [optional] 

### Return type

[**NSArray<SWGItemSimple>***](SWGItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createItemService**
```objc
-(NSNumber*) createItemServiceWithCompanyId: (NSString*) companyId
    body: (SWGItemSimple*) body
    avalaraProductType: (NSString*) avalaraProductType
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGItemSimple* body = [[SWGItemSimple alloc] init]; // Transaction Message
NSString* avalaraProductType = @"service"; // Avalara Product Type (optional) (default to service)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

// Create custom agast for one company
[apiInstance createItemServiceWithCompanyId:companyId
              body:body
              avalaraProductType:avalaraProductType
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->createItemService: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGItemSimple***](SWGItemSimple*.md)| Transaction Message | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [optional] [default to service]

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteItemService**
```objc
-(NSNumber*) deleteItemServiceWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSString* avalaraProductType = @"service"; // Avalara Product Type (optional) (default to service)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

[apiInstance deleteItemServiceWithCompanyId:companyId
              code:code
              avalaraProductType:avalaraProductType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->deleteItemService: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateItemService**
```objc
-(NSNumber*) updateItemServiceWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGItemSimple*) body
    avalaraProductType: (NSString*) avalaraProductType
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
SWGItemSimple* body = [[SWGItemSimple alloc] init]; // Transaction Message
NSString* avalaraProductType = @"service"; // Avalara Product Type (optional) (default to service)

SWGCompanyItemServiceApi*apiInstance = [[SWGCompanyItemServiceApi alloc] init];

// Update custom agast for one company
[apiInstance updateItemServiceWithCompanyId:companyId
              code:code
              body:body
              avalaraProductType:avalaraProductType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemServiceApi->updateItemService: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **body** | [**SWGItemSimple***](SWGItemSimple*.md)| Transaction Message | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

