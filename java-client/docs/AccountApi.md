# AccountApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountIdCompaniesGet**](AccountApi.md#accountsAccountIdCompaniesGet) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**createAccountCompany**](AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


<a name="accountsAccountIdCompaniesGet"></a>
# **accountsAccountIdCompaniesGet**
> List&lt;AccountCompany&gt; accountsAccountIdCompaniesGet(accountId)

Retrieve Companies by account

Retrieve list companies of one account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | Account ID
try {
    List<AccountCompany> result = apiInstance.accountsAccountIdCompaniesGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountsAccountIdCompaniesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID |

### Return type

[**List&lt;AccountCompany&gt;**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAccountCompany"></a>
# **createAccountCompany**
> InlineResponse201 createAccountCompany(accountId, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | Account ID
Body body = new Body(); // Body | Company Code
try {
    InlineResponse201 result = apiInstance.createAccountCompany(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createAccountCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID |
 **body** | [**Body**](Body.md)| Company Code |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

