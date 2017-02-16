# SWGCompanyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesGet**](SWGCompanyApi.md#companiesget) | **GET** /companies | Retrieve Companies by account
[**createCompany**](SWGCompanyApi.md#createcompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](SWGCompanyApi.md#deleteaccountcompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](SWGCompanyApi.md#deletecompany) | **DELETE** /companies/{companyId} | 
[**infoCompany**](SWGCompanyApi.md#infocompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](SWGCompanyApi.md#updatecompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


# **companiesGet**
```objc
-(NSNumber*) companiesGetWithCompletionHandler: 
        (void (^)(NSArray<SWGCompany>* output, NSError* error)) handler;
```

Retrieve Companies by account

Retrieve list companies of one account

### Example 
```objc


SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

// Retrieve Companies by account
[apiInstance companiesGetWithCompletionHandler: 
          ^(NSArray<SWGCompany>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->companiesGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<SWGCompany>***](SWGCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCompany**
```objc
-(NSNumber*) createCompanyWithBody: (SWGCompany*) body
        completionHandler: (void (^)(SWGCompany* output, NSError* error)) handler;
```

Create company and your data configuration

This method operation create a company for a account 

### Example 
```objc

SWGCompany* body = [[SWGCompany alloc] init]; // Transaction Message

SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

// Create company and your data configuration
[apiInstance createCompanyWithBody:body
          completionHandler: ^(SWGCompany* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->createCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCompany***](SWGCompany*.md)| Transaction Message | 

### Return type

[**SWGCompany***](SWGCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAccountCompany**
```objc
-(NSNumber*) deleteAccountCompanyWithAccountId: (NSString*) accountId
    companyId: (NSString*) companyId
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* accountId = @"accountId_example"; // Account ID
NSString* companyId = @"companyId_example"; // Company ID

SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

[apiInstance deleteAccountCompanyWithAccountId:accountId
              companyId:companyId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->deleteAccountCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **NSString***| Account ID | 
 **companyId** | **NSString***| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCompany**
```objc
-(NSNumber*) deleteCompanyWithCompanyId: (NSString*) companyId
    companyId2: (NSString*) companyId2
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* companyId2 = @"companyId_example"; // Company ID

SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

[apiInstance deleteCompanyWithCompanyId:companyId
              companyId2:companyId2
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->deleteCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **companyId2** | **NSString***| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **infoCompany**
```objc
-(NSNumber*) infoCompanyWithCompanyId: (NSString*) companyId
        completionHandler: (void (^)(SWGCompany* output, NSError* error)) handler;
```

Get company information and your data configuration

This method operation get a company for a account 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID

SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

// Get company information and your data configuration
[apiInstance infoCompanyWithCompanyId:companyId
          completionHandler: ^(SWGCompany* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->infoCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 

### Return type

[**SWGCompany***](SWGCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCompany**
```objc
-(NSNumber*) updateCompanyWithCompanyId: (NSString*) companyId
    body: (SWGCompany*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update company information and your data configuration

This method operation create a company for a account 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGCompany* body = [[SWGCompany alloc] init]; // Transaction Message

SWGCompanyApi*apiInstance = [[SWGCompanyApi alloc] init];

// Update company information and your data configuration
[apiInstance updateCompanyWithCompanyId:companyId
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyApi->updateCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGCompany***](SWGCompany*.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

