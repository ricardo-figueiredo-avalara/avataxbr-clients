# AccountApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountCompany**](AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
[**getCompaniesList**](AccountApi.md#getCompaniesList) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account


<a name="createAccountCompany"></a>
# **createAccountCompany**
> InlineResponse201 createAccountCompany(authorization, accountId, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
Body body = new Body(); // Body | Company Code
try {
    InlineResponse201 result = apiInstance.createAccountCompany(authorization, accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createAccountCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |
 **body** | [**Body**](Body.md)| Company Code |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompaniesList"></a>
# **getCompaniesList**
> List&lt;AccountCompany&gt; getCompaniesList(authorization, accountId)

Retrieve Companies by account

Retrieve list companies of one account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID accountId = new UUID(); // UUID | Account ID
try {
    List<AccountCompany> result = apiInstance.getCompaniesList(authorization, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getCompaniesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **accountId** | **UUID**| Account ID |

### Return type

[**List&lt;AccountCompany&gt;**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

