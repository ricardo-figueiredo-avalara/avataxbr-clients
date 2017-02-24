# SWGCompanyItemGoodsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](SWGCompanyItemGoodsApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodegoodsGet**](SWGCompanyItemGoodsApi.md#companiescompanyiditemscodegoodsget) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companiesCompanyIdItemsgoodsGet**](SWGCompanyItemGoodsApi.md#companiescompanyiditemsgoodsget) | **GET** /companies/{companyId}/items?goods | 
[**createItem**](SWGCompanyItemGoodsApi.md#createitem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**deleteItem**](SWGCompanyItemGoodsApi.md#deleteitem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**updateItem**](SWGCompanyItemGoodsApi.md#updateitem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


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

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

[apiInstance companiesCompanyIdItemsCodeChangeCodePutWithCompanyId:companyId
              code:code
              body:body
              goods:goods
              service:service
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->companiesCompanyIdItemsCodeChangeCodePut: %@", error);
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

# **companiesCompanyIdItemsCodegoodsGet**
```objc
-(NSNumber*) companiesCompanyIdItemsCodegoodsGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    agast: (NSString*) agast
        completionHandler: (void (^)(SWGItemGoods* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSString* avalaraProductType = @"goods"; // Avalara Product Type (default to goods)
NSString* agast = @"agast_example"; // Custom Agast Code (optional)

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

[apiInstance companiesCompanyIdItemsCodegoodsGetWithCompanyId:companyId
              code:code
              avalaraProductType:avalaraProductType
              agast:agast
          completionHandler: ^(SWGItemGoods* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->companiesCompanyIdItemsCodegoodsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [default to goods]
 **agast** | **NSString***| Custom Agast Code | [optional] 

### Return type

[**SWGItemGoods***](SWGItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdItemsgoodsGet**
```objc
-(NSNumber*) companiesCompanyIdItemsgoodsGetWithCompanyId: (NSString*) companyId
    avalaraProductType: (NSString*) avalaraProductType
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
    code: (NSString*) code
    agast: (NSString*) agast
        completionHandler: (void (^)(NSArray<SWGItemGoods>* output, NSError* error)) handler;
```



This operation return custom agast configurations that match with parameters queries 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* avalaraProductType = @"goods"; // Avalara Product Type (default to goods)
NSNumber* xPaginationLimit = @10; // The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
NSNumber* xPaginationCurrentPage = @1; // The current page. Defaults to 1. (optional) (default to 1)
NSString* xPaginationSort = @"xPaginationSort_example"; //  (optional)
NSString* code = @"code_example"; // Item Code (optional)
NSString* agast = @"agast_example"; // Custom Agast Code (optional)

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

[apiInstance companiesCompanyIdItemsgoodsGetWithCompanyId:companyId
              avalaraProductType:avalaraProductType
              xPaginationLimit:xPaginationLimit
              xPaginationCurrentPage:xPaginationCurrentPage
              xPaginationSort:xPaginationSort
              code:code
              agast:agast
          completionHandler: ^(NSArray<SWGItemGoods>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->companiesCompanyIdItemsgoodsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [default to goods]
 **xPaginationLimit** | **NSNumber***| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **NSNumber***| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **NSString***|  | [optional] 
 **code** | **NSString***| Item Code | [optional] 
 **agast** | **NSString***| Custom Agast Code | [optional] 

### Return type

[**NSArray<SWGItemGoods>***](SWGItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createItem**
```objc
-(NSNumber*) createItemWithCompanyId: (NSString*) companyId
    avalaraProductType: (NSString*) avalaraProductType
    body: (SWGItemGoods*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* avalaraProductType = @"goods"; // Avalara Product Type (default to goods)
SWGItemGoods* body = [[SWGItemGoods alloc] init]; // Transaction Message

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

// Create custom agast for one company
[apiInstance createItemWithCompanyId:companyId
              avalaraProductType:avalaraProductType
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->createItem: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [default to goods]
 **body** | [**SWGItemGoods***](SWGItemGoods*.md)| Transaction Message | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteItem**
```objc
-(NSNumber*) deleteItemWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSString* avalaraProductType = @"goods"; // Avalara Product Type (default to goods)

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

[apiInstance deleteItemWithCompanyId:companyId
              code:code
              avalaraProductType:avalaraProductType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->deleteItem: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateItem**
```objc
-(NSNumber*) updateItemWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    body: (SWGItemGoods*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* code = @"code_example"; // Item Code
NSString* avalaraProductType = @"goods"; // Avalara Product Type (default to goods)
SWGItemGoods* body = [[SWGItemGoods alloc] init]; // Transaction Message

SWGCompanyItemGoodsApi*apiInstance = [[SWGCompanyItemGoodsApi alloc] init];

// Update custom agast for one company
[apiInstance updateItemWithCompanyId:companyId
              code:code
              avalaraProductType:avalaraProductType
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyItemGoodsApi->updateItem: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **code** | **NSString***| Item Code | 
 **avalaraProductType** | **NSString***| Avalara Product Type | [default to goods]
 **body** | [**SWGItemGoods***](SWGItemGoods*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

