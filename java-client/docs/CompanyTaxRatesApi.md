# CompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomTaxes**](CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**deleteCustomTaxes**](CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**getCompanyCustomTax**](CompanyTaxRatesApi.md#getCompanyCustomTax) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**getCompanyTaxRatesList**](CompanyTaxRatesApi.md#getCompanyTaxRatesList) | **GET** /companies/{companyId}/taxrates | 
[**updateCustomTaxes**](CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


<a name="createCustomTaxes"></a>
# **createCustomTaxes**
> InlineResponse201 createCustomTaxes(authorization, companyId, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyTaxRatesApi;


CompanyTaxRatesApi apiInstance = new CompanyTaxRatesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
CustomTaxTypeRate body = new CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message
try {
    InlineResponse201 result = apiInstance.createCustomTaxes(authorization, companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyTaxRatesApi#createCustomTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomTaxes"></a>
# **deleteCustomTaxes**
> deleteCustomTaxes(authorization, companyId, taxType)



Delete Custom Tax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyTaxRatesApi;


CompanyTaxRatesApi apiInstance = new CompanyTaxRatesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String taxType = "taxType_example"; // String | Tax Type
try {
    apiInstance.deleteCustomTaxes(authorization, companyId, taxType);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyTaxRatesApi#deleteCustomTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **taxType** | **String**| Tax Type | [enum: inss, inss-rf, irrf, pis, pis-rf, cofins, cofins-rf, csll, csll-rf, irpj, iss, iss-rf, ipi]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCustomTax"></a>
# **getCompanyCustomTax**
> CustomTaxTypeRate getCompanyCustomTax(authorization, companyId, taxType)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyTaxRatesApi;


CompanyTaxRatesApi apiInstance = new CompanyTaxRatesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String taxType = "taxType_example"; // String | Tax Type
try {
    CustomTaxTypeRate result = apiInstance.getCompanyCustomTax(authorization, companyId, taxType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyTaxRatesApi#getCompanyCustomTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **taxType** | **String**| Tax Type | [enum: inss, inss-rf, irrf, pis, pis-rf, cofins, cofins-rf, csll, csll-rf, irpj, iss, iss-rf, ipi]

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyTaxRatesList"></a>
# **getCompanyTaxRatesList**
> List&lt;CustomTaxTypeRate&gt; getCompanyTaxRatesList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyTaxRatesApi;


CompanyTaxRatesApi apiInstance = new CompanyTaxRatesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<CustomTaxTypeRate> result = apiInstance.getCompanyTaxRatesList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyTaxRatesApi#getCompanyTaxRatesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]

### Return type

[**List&lt;CustomTaxTypeRate&gt;**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomTaxes"></a>
# **updateCustomTaxes**
> updateCustomTaxes(authorization, companyId, taxType, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyTaxRatesApi;


CompanyTaxRatesApi apiInstance = new CompanyTaxRatesApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String taxType = "taxType_example"; // String | Tax Type
CustomTaxTypeRate body = new CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message
try {
    apiInstance.updateCustomTaxes(authorization, companyId, taxType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyTaxRatesApi#updateCustomTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **taxType** | **String**| Tax Type | [enum: inss, inss-rf, irrf, pis, pis-rf, cofins, cofins-rf, csll, csll-rf, irpj, iss, iss-rf, ipi]
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

