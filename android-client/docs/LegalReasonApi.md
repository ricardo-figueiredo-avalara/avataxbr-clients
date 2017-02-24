# LegalReasonApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReason_**](LegalReasonApi.md#createReason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**deleteReason_**](LegalReasonApi.md#deleteReason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**getReason_**](LegalReasonApi.md#getReason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**listReason**](LegalReasonApi.md#listReason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**updateReason_**](LegalReasonApi.md#updateReason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


<a name="createReason_"></a>
# **createReason_**
> InlineResponse201 createReason_(body)

Create Legal Reason.

### Example
```java
// Import classes:
//import io.swagger.client.api.LegalReasonApi;

LegalReasonApi apiInstance = new LegalReasonApi();
LegalReason body = new LegalReason(); // LegalReason | 
try {
    InlineResponse201 result = apiInstance.createReason_(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalReasonApi#createReason_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReason_"></a>
# **deleteReason_**
> deleteReason_(uuid)

Delete a Legal Reason entry.

### Example
```java
// Import classes:
//import io.swagger.client.api.LegalReasonApi;

LegalReasonApi apiInstance = new LegalReasonApi();
String uuid = "uuid_example"; // String | 
try {
    apiInstance.deleteReason_(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalReasonApi#deleteReason_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReason_"></a>
# **getReason_**
> ProcessScenario getReason_(uuid)

Get single Legal Reason.

### Example
```java
// Import classes:
//import io.swagger.client.api.LegalReasonApi;

LegalReasonApi apiInstance = new LegalReasonApi();
String uuid = "uuid_example"; // String | 
try {
    ProcessScenario result = apiInstance.getReason_(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalReasonApi#getReason_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listReason"></a>
# **listReason**
> List&lt;LegalReason&gt; listReason(companyId)

List Legal Reasons.

### Example
```java
// Import classes:
//import io.swagger.client.api.LegalReasonApi;

LegalReasonApi apiInstance = new LegalReasonApi();
String companyId = "companyId_example"; // String | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries. 
try {
    List<LegalReason> result = apiInstance.listReason(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalReasonApi#listReason");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional]

### Return type

[**List&lt;LegalReason&gt;**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReason_"></a>
# **updateReason_**
> updateReason_(body)

Update Legal Reason.

### Example
```java
// Import classes:
//import io.swagger.client.api.LegalReasonApi;

LegalReasonApi apiInstance = new LegalReasonApi();
LegalReason body = new LegalReason(); // LegalReason | 
try {
    apiInstance.updateReason_(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalReasonApi#updateReason_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

