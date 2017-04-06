# CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
[**getCompaniesList**](CompanyApi.md#getCompaniesList) | **GET** /companies | Retrieve Companies by account
[**infoCompany**](CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


<a name="createCompany"></a>
# **createCompany**
> Company createCompany(authorization, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
Company body = new Company(); // Company | Transaction Message
try {
    Company result = apiInstance.createCompany(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#createCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**Company**](Company.md)| Transaction Message |

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountCompany"></a>
# **deleteAccountCompany**
> deleteAccountCompany(authorization, accountId, companyId)



Delete relation Account x company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
UUID companyId = new UUID(); // UUID | Company ID
try {
    apiInstance.deleteAccountCompany(authorization, accountId, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#deleteAccountCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |
 **companyId** | **UUID**| Company ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompany"></a>
# **deleteCompany**
> deleteCompany(authorization, companyId, companyId2)



Delete Company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
try {
    apiInstance.deleteCompany(authorization, companyId, companyId2);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#deleteCompany");
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

<a name="getCompaniesList"></a>
# **getCompaniesList**
> List&lt;Company&gt; getCompaniesList(authorization)

Retrieve Companies by account

Retrieve list companies of one account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
try {
    List<Company> result = apiInstance.getCompaniesList(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompaniesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |

### Return type

[**List&lt;Company&gt;**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoCompany"></a>
# **infoCompany**
> Company infoCompany(authorization, companyId)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
try {
    Company result = apiInstance.infoCompany(authorization, companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#infoCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> updateCompany(authorization, companyId, body)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Company body = new Company(); // Company | Transaction Message
try {
    apiInstance.updateCompany(authorization, companyId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#updateCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**Company**](Company.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

