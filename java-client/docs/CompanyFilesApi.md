# CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCompanyServiceCertificate**](CompanyFilesApi.md#deleteCompanyServiceCertificate) | **DELETE** /companies/{companyId}/certificate | 
[**getCompanyServiceCertificate**](CompanyFilesApi.md#getCompanyServiceCertificate) | **GET** /companies/{companyId}/certificate | 
[**postCompanyServiceCertificate**](CompanyFilesApi.md#postCompanyServiceCertificate) | **POST** /companies/{companyId}/certificate | 
[**updateCompanyServiceCertificate**](CompanyFilesApi.md#updateCompanyServiceCertificate) | **PUT** /companies/{companyId}/certificate | 


<a name="deleteCompanyServiceCertificate"></a>
# **deleteCompanyServiceCertificate**
> deleteCompanyServiceCertificate(authorization, companyId, companyId2)



Deletes a company file store. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFilesApi;


CompanyFilesApi apiInstance = new CompanyFilesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
try {
    apiInstance.deleteCompanyServiceCertificate(authorization, companyId, companyId2);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#deleteCompanyServiceCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyServiceCertificate"></a>
# **getCompanyServiceCertificate**
> getCompanyServiceCertificate(authorization, companyId, companyId2, peek)



Gets an existing certificate file for this company. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFilesApi;


CompanyFilesApi apiInstance = new CompanyFilesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
BigDecimal peek = new BigDecimal(); // BigDecimal | Use this parameter to check the existence of the file without downloading it.
try {
    apiInstance.getCompanyServiceCertificate(authorization, companyId, companyId2, peek);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#getCompanyServiceCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |
 **peek** | **BigDecimal**| Use this parameter to check the existence of the file without downloading it. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="postCompanyServiceCertificate"></a>
# **postCompanyServiceCertificate**
> InlineResponse2002 postCompanyServiceCertificate(authorization, companyId, body)



If it still not exists, uploads a new Certificate file for this company. Send the file as a base64 string. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFilesApi;


CompanyFilesApi apiInstance = new CompanyFilesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Body3 body = new Body3(); // Body3 | Content
try {
    InlineResponse2002 result = apiInstance.postCompanyServiceCertificate(authorization, companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#postCompanyServiceCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**Body3**](Body3.md)| Content |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompanyServiceCertificate"></a>
# **updateCompanyServiceCertificate**
> InlineResponse2002 updateCompanyServiceCertificate(authorization, companyId, companyId2, body)



Updates an existing certificate file for this company. Send the file as a base64 string. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFilesApi;


CompanyFilesApi apiInstance = new CompanyFilesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
Body2 body = new Body2(); // Body2 | Content
try {
    InlineResponse2002 result = apiInstance.updateCompanyServiceCertificate(authorization, companyId, companyId2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#updateCompanyServiceCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |
 **body** | [**Body2**](Body2.md)| Content |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

