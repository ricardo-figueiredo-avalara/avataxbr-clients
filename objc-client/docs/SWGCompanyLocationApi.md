# SWGCompanyLocationApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdLocationsCodeGet**](SWGCompanyLocationApi.md#companiescompanyidlocationscodeget) | **GET** /companies/{companyId}/locations/{code} | 
[**companiesCompanyIdLocationsGet**](SWGCompanyLocationApi.md#companiescompanyidlocationsget) | **GET** /companies/{companyId}/locations | 
[**createLocation**](SWGCompanyLocationApi.md#createlocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](SWGCompanyLocationApi.md#deletelocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**updateLocation**](SWGCompanyLocationApi.md#updatelocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


# **companiesCompanyIdLocationsCodeGet**
```objc
-(NSNumber*) companiesCompanyIdLocationsCodeGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
        completionHandler: (void (^)(SWGLocation* output, NSError* error)) handler;
```



This operation return location 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Location Code

SWGCompanyLocationApi*apiInstance = [[SWGCompanyLocationApi alloc] init];

[apiInstance companiesCompanyIdLocationsCodeGetWithCompanyId:companyId
              code:code
          completionHandler: ^(SWGLocation* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyLocationApi->companiesCompanyIdLocationsCodeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Location Code | 

### Return type

[**SWGLocation***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdLocationsGet**
```objc
-(NSNumber*) companiesCompanyIdLocationsGetWithCompanyId: (NSString*) companyId
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```



This operation return all locations 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)

SWGCompanyLocationApi*apiInstance = [[SWGCompanyLocationApi alloc] init];

[apiInstance companiesCompanyIdLocationsGetWithCompanyId:companyId
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyLocationApi->companiesCompanyIdLocationsGet: %@", error);
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

[**NSArray<SWGLocation>***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createLocation**
```objc
-(NSNumber*) createLocationWithCompanyId: (NSString*) companyId
    body: (SWGLocation*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create new location for company

This method operation create a new location for company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGLocation* body = [[SWGLocation alloc] init]; // Transaction Message

SWGCompanyLocationApi*apiInstance = [[SWGCompanyLocationApi alloc] init];

// Create new location for company
[apiInstance createLocationWithCompanyId:companyId
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyLocationApi->createLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGLocation***](SWGLocation*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteLocation**
```objc
-(NSNumber*) deleteLocationWithCompanyId: (NSString*) companyId
    code: (NSString*) code
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Location Code

SWGCompanyLocationApi*apiInstance = [[SWGCompanyLocationApi alloc] init];

[apiInstance deleteLocationWithCompanyId:companyId
              code:code
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyLocationApi->deleteLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Location Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateLocation**
```objc
-(NSNumber*) updateLocationWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGLocation*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update location for company

This method operation update a location for company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Location Code
SWGLocation* body = [[SWGLocation alloc] init]; // Transaction Message

SWGCompanyLocationApi*apiInstance = [[SWGCompanyLocationApi alloc] init];

// Update location for company
[apiInstance updateLocationWithCompanyId:companyId
              code:code
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyLocationApi->updateLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Location Code | 
 **body** | [**SWGLocation***](SWGLocation*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

