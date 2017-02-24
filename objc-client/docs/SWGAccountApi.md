# SWGAccountApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountIdCompaniesGet**](SWGAccountApi.md#accountsaccountidcompaniesget) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**createAccountCompany**](SWGAccountApi.md#createaccountcompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


# **accountsAccountIdCompaniesGet**
```objc
-(NSNumber*) accountsAccountIdCompaniesGetWithAccountId: (NSString*) accountId
        completionHandler: (void (^)(NSArray<SWGAccountCompany>* output, NSError* error)) handler;
```

Retrieve Companies by account

Retrieve list companies of one account

### Example 
```objc

NSString* accountId = @"accountId_example"; // Account ID

SWGAccountApi*apiInstance = [[SWGAccountApi alloc] init];

// Retrieve Companies by account
[apiInstance accountsAccountIdCompaniesGetWithAccountId:accountId
          completionHandler: ^(NSArray<SWGAccountCompany>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountApi->accountsAccountIdCompaniesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **NSString***| Account ID | 

### Return type

[**NSArray<SWGAccountCompany>***](SWGAccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAccountCompany**
```objc
-(NSNumber*) createAccountCompanyWithAccountId: (NSString*) accountId
    body: (SWGBody*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create company and your data configuration

This method operation create a company for a account 

### Example 
```objc

NSString* accountId = @"accountId_example"; // Account ID
SWGBody* body = [[SWGBody alloc] init]; // Company Code

SWGAccountApi*apiInstance = [[SWGAccountApi alloc] init];

// Create company and your data configuration
[apiInstance createAccountCompanyWithAccountId:accountId
              body:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountApi->createAccountCompany: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **NSString***| Account ID | 
 **body** | [**SWGBody***](SWGBody*.md)| Company Code | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

