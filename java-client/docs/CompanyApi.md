# CompanyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesGet**](CompanyApi.md#companiesGet) | **GET** /companies | Retrieve Companies by account
[**createCompany**](CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
[**infoCompany**](CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


<a name="companiesGet"></a>
# **companiesGet**
> List&lt;Company&gt; companiesGet()

Retrieve Companies by account

Retrieve list companies of one account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
try {
    List<Company> result = apiInstance.companiesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companiesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Company&gt;**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompany"></a>
# **createCompany**
> Company createCompany(body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Company body = new Company(); // Company | Transaction Message
try {
    Company result = apiInstance.createCompany(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#createCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> deleteAccountCompany(accountId, companyId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String accountId = "accountId_example"; // String | Account ID
String companyId = "companyId_example"; // String | Company ID
try {
    apiInstance.deleteAccountCompany(accountId, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#deleteAccountCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID |
 **companyId** | **String**| Company ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompany"></a>
# **deleteCompany**
> deleteCompany(companyId, companyId2)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String companyId = "companyId_example"; // String | Company ID
String companyId2 = "companyId_example"; // String | Company ID
try {
    apiInstance.deleteCompany(companyId, companyId2);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#deleteCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **companyId2** | **String**| Company ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoCompany"></a>
# **infoCompany**
> Company infoCompany(companyId)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String companyId = "companyId_example"; // String | Company ID
try {
    Company result = apiInstance.infoCompany(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#infoCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> updateCompany(companyId, body)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String companyId = "companyId_example"; // String | Company ID
Company body = new Company(); // Company | Transaction Message
try {
    apiInstance.updateCompany(companyId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#updateCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **body** | [**Company**](Company.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

