# SWGCompanyFilesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdNfseCertificateDelete**](SWGCompanyFilesApi.md#companiescompanyidnfsecertificatedelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificateGet**](SWGCompanyFilesApi.md#companiescompanyidnfsecertificateget) | **GET** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePost**](SWGCompanyFilesApi.md#companiescompanyidnfsecertificatepost) | **POST** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePut**](SWGCompanyFilesApi.md#companiescompanyidnfsecertificateput) | **PUT** /companies/{companyId}/nfse-certificate | 


# **companiesCompanyIdNfseCertificateDelete**
```objc
-(NSNumber*) companiesCompanyIdNfseCertificateDeleteWithCompanyId: (NSString*) companyId
    companyId2: (NSString*) companyId2
        completionHandler: (void (^)(NSError* error)) handler;
```



Deletes a company file store.  

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* companyId2 = @"companyId_example"; // Company ID

SWGCompanyFilesApi*apiInstance = [[SWGCompanyFilesApi alloc] init];

[apiInstance companiesCompanyIdNfseCertificateDeleteWithCompanyId:companyId
              companyId2:companyId2
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyFilesApi->companiesCompanyIdNfseCertificateDelete: %@", error);
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

# **companiesCompanyIdNfseCertificateGet**
```objc
-(NSNumber*) companiesCompanyIdNfseCertificateGetWithCompanyId: (NSString*) companyId
    companyId2: (NSString*) companyId2
    peek: (NSNumber*) peek
        completionHandler: (void (^)(NSError* error)) handler;
```



Gets an existing NFSe certificate file for this company. 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* companyId2 = @"companyId_example"; // Company ID
NSNumber* peek = @3.4; // Use this parameter to check the existence of the file without downloading it. (optional)

SWGCompanyFilesApi*apiInstance = [[SWGCompanyFilesApi alloc] init];

[apiInstance companiesCompanyIdNfseCertificateGetWithCompanyId:companyId
              companyId2:companyId2
              peek:peek
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCompanyFilesApi->companiesCompanyIdNfseCertificateGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **companyId2** | **NSString***| Company ID | 
 **peek** | **NSNumber***| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdNfseCertificatePost**
```objc
-(NSNumber*) companiesCompanyIdNfseCertificatePostWithCompanyId: (NSString*) companyId
    body: (SWGBody3*) body
        completionHandler: (void (^)(SWGInlineResponse2002* output, NSError* error)) handler;
```



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
SWGBody3* body = [[SWGBody3 alloc] init]; // Content

SWGCompanyFilesApi*apiInstance = [[SWGCompanyFilesApi alloc] init];

[apiInstance companiesCompanyIdNfseCertificatePostWithCompanyId:companyId
              body:body
          completionHandler: ^(SWGInlineResponse2002* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyFilesApi->companiesCompanyIdNfseCertificatePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **body** | [**SWGBody3***](SWGBody3*.md)| Content | 

### Return type

[**SWGInlineResponse2002***](SWGInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companiesCompanyIdNfseCertificatePut**
```objc
-(NSNumber*) companiesCompanyIdNfseCertificatePutWithCompanyId: (NSString*) companyId
    companyId2: (NSString*) companyId2
    body: (SWGBody2*) body
        completionHandler: (void (^)(SWGInlineResponse2002* output, NSError* error)) handler;
```



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example 
```objc

NSString* companyId = @"companyId_example"; // Company ID
NSString* companyId2 = @"companyId_example"; // Company ID
SWGBody2* body = [[SWGBody2 alloc] init]; // Content

SWGCompanyFilesApi*apiInstance = [[SWGCompanyFilesApi alloc] init];

[apiInstance companiesCompanyIdNfseCertificatePutWithCompanyId:companyId
              companyId2:companyId2
              body:body
          completionHandler: ^(SWGInlineResponse2002* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCompanyFilesApi->companiesCompanyIdNfseCertificatePut: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Company ID | 
 **companyId2** | **NSString***| Company ID | 
 **body** | [**SWGBody2***](SWGBody2*.md)| Content | 

### Return type

[**SWGInlineResponse2002***](SWGInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

