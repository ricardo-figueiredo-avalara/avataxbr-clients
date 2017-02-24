# SWGCompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdTaxratesGet**](SWGCompanyTaxRatesApi.md#companiescompanyidtaxratesget) | **GET** /companies/{companyId}/taxrates | 
[**companiesCompanyIdTaxratesTaxTypeGet**](SWGCompanyTaxRatesApi.md#companiescompanyidtaxratestaxtypeget) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**createCustomTaxes**](SWGCompanyTaxRatesApi.md#createcustomtaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**deleteCustomTaxes**](SWGCompanyTaxRatesApi.md#deletecustomtaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**updateCustomTaxes**](SWGCompanyTaxRatesApi.md#updatecustomtaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **companiesCompanyIdTaxratesGet**
```objc
-(NSNumber*) companiesCompanyIdTaxratesGetWithCompanyId: (NSString*) companyId
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
        completionHandler: (void (^)(NSArray<SWGCustomTaxTypeRate>* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)

SWGCompanyTaxRatesApi*apiInstance = [[SWGCompanyTaxRatesApi alloc] init];

[apiInstance companiesCompanyIdTaxratesGetWithCompanyId:companyId
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
          completionHandler: ^(NSArray<SWGCustomTaxTypeRate>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyTaxRatesApi->companiesCompanyIdTaxratesGet: %@", error);
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

[**NSArray<SWGCustomTaxTypeRate>***](SWGCustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdTaxratesTaxTypeGet**
```objc
-(NSNumber*) companiesCompanyIdTaxratesTaxTypeGetWithCompanyId: (NSString*) companyId
    taxType: (NSString*) taxType
        completionHandler: (void (^)(SWGCustomTaxTypeRate* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* taxType = @"taxType_example"; // Tax Type

SWGCompanyTaxRatesApi*apiInstance = [[SWGCompanyTaxRatesApi alloc] init];

[apiInstance companiesCompanyIdTaxratesTaxTypeGetWithCompanyId:companyId
              taxType:taxType
          completionHandler: ^(SWGCustomTaxTypeRate* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyTaxRatesApi->companiesCompanyIdTaxratesTaxTypeGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **taxType** | **NSString***| Tax Type | 

### Return type

[**SWGCustomTaxTypeRate***](SWGCustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCustomTaxes**
```objc
-(NSNumber*) createCustomTaxesWithCompanyId: (NSString*) companyId
    body: (SWGCustomTaxTypeRate*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGCustomTaxTypeRate* body = [[SWGCustomTaxTypeRate alloc] init]; // Transaction Message

SWGCompanyTaxRatesApi*apiInstance = [[SWGCompanyTaxRatesApi alloc] init];

// Create custom agast for one company
[apiInstance createCustomTaxesWithCompanyId:companyId
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyTaxRatesApi->createCustomTaxes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGCustomTaxTypeRate***](SWGCustomTaxTypeRate*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCustomTaxes**
```objc
-(NSNumber*) deleteCustomTaxesWithCompanyId: (NSString*) companyId
    taxType: (NSString*) taxType
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* taxType = @"taxType_example"; // Tax Type

SWGCompanyTaxRatesApi*apiInstance = [[SWGCompanyTaxRatesApi alloc] init];

[apiInstance deleteCustomTaxesWithCompanyId:companyId
              taxType:taxType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyTaxRatesApi->deleteCustomTaxes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **taxType** | **NSString***| Tax Type | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCustomTaxes**
```objc
-(NSNumber*) updateCustomTaxesWithCompanyId: (NSString*) companyId
    taxType: (NSString*) taxType
    body: (SWGCustomTaxTypeRate*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* taxType = @"taxType_example"; // Tax Type
SWGCustomTaxTypeRate* body = [[SWGCustomTaxTypeRate alloc] init]; // Transaction Message

SWGCompanyTaxRatesApi*apiInstance = [[SWGCompanyTaxRatesApi alloc] init];

// Update custom agast for one company
[apiInstance updateCustomTaxesWithCompanyId:companyId
              taxType:taxType
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyTaxRatesApi->updateCustomTaxes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **taxType** | **NSString***| Tax Type | 
 **body** | [**SWGCustomTaxTypeRate***](SWGCustomTaxTypeRate*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

