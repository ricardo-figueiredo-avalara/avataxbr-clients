# SWGLegalReasonApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReason_**](SWGLegalReasonApi.md#createreason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**deleteReason_**](SWGLegalReasonApi.md#deletereason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**getReason_**](SWGLegalReasonApi.md#getreason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**listReason**](SWGLegalReasonApi.md#listreason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**updateReason_**](SWGLegalReasonApi.md#updatereason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


# **createReason_**
```objc
-(NSNumber*) createReason_WithBody: (SWGLegalReason*) body
        completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;
```

Create Legal Reason.

### Example 
```objc

SWGLegalReason* body = [[SWGLegalReason alloc] init]; // 

SWGLegalReasonApi*apiInstance = [[SWGLegalReasonApi alloc] init];

// Create Legal Reason.
[apiInstance createReason_WithBody:body
          completionHandler: ^(SWGInlineResponse201* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLegalReasonApi->createReason_: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGLegalReason***](SWGLegalReason*.md)|  | 

### Return type

[**SWGInlineResponse201***](SWGInlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteReason_**
```objc
-(NSNumber*) deleteReason_WithUuid: (NSString*) uuid
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete a Legal Reason entry.

### Example 
```objc

NSString* uuid = @"uuid_example"; // 

SWGLegalReasonApi*apiInstance = [[SWGLegalReasonApi alloc] init];

// Delete a Legal Reason entry.
[apiInstance deleteReason_WithUuid:uuid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGLegalReasonApi->deleteReason_: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getReason_**
```objc
-(NSNumber*) getReason_WithUuid: (NSString*) uuid
        completionHandler: (void (^)(SWGProcessScenario* output, NSError* error)) handler;
```

Get single Legal Reason.

### Example 
```objc

NSString* uuid = @"uuid_example"; // 

SWGLegalReasonApi*apiInstance = [[SWGLegalReasonApi alloc] init];

// Get single Legal Reason.
[apiInstance getReason_WithUuid:uuid
          completionHandler: ^(SWGProcessScenario* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLegalReasonApi->getReason_: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **NSString***|  | 

### Return type

[**SWGProcessScenario***](SWGProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listReason**
```objc
-(NSNumber*) listReasonWithCompanyId: (NSString*) companyId
        completionHandler: (void (^)(NSArray<SWGLegalReason>* output, NSError* error)) handler;
```

List Legal Reasons.

### Example 
```objc

NSString* companyId = @"companyId_example"; // Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries.  (optional)

SWGLegalReasonApi*apiInstance = [[SWGLegalReasonApi alloc] init];

// List Legal Reasons.
[apiInstance listReasonWithCompanyId:companyId
          completionHandler: ^(NSArray<SWGLegalReason>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLegalReasonApi->listReason: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **NSString***| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**NSArray<SWGLegalReason>***](SWGLegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateReason_**
```objc
-(NSNumber*) updateReason_WithBody: (SWGLegalReason*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Update Legal Reason.

### Example 
```objc

SWGLegalReason* body = [[SWGLegalReason alloc] init]; // 

SWGLegalReasonApi*apiInstance = [[SWGLegalReasonApi alloc] init];

// Update Legal Reason.
[apiInstance updateReason_WithBody:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGLegalReasonApi->updateReason_: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGLegalReason***](SWGLegalReason*.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

