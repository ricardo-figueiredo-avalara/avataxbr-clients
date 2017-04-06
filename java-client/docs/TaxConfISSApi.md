# TaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssConfByCity**](TaxConfISSApi.md#createIssConfByCity) | **POST** /taxconf/iss | create a new ISS Configuration
[**deleteIssConf**](TaxConfISSApi.md#deleteIssConf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**getIssConfByCity**](TaxConfISSApi.md#getIssConfByCity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**getIssList**](TaxConfISSApi.md#getIssList) | **GET** /taxconf/iss | retrive list of ISS
[**updateIssConfByCity**](TaxConfISSApi.md#updateIssConfByCity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


<a name="createIssConfByCity"></a>
# **createIssConfByCity**
> InlineResponse201 createIssConfByCity(authorization, issConfByCity)

create a new ISS Configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfISSApi;


TaxConfISSApi apiInstance = new TaxConfISSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
IssConfByCity issConfByCity = new IssConfByCity(); // IssConfByCity | The pet JSON you want to post
try {
    InlineResponse201 result = apiInstance.createIssConfByCity(authorization, issConfByCity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfISSApi#createIssConfByCity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIssConf"></a>
# **deleteIssConf**
> deleteIssConf(authorization, cityCode)

disable a ISS by City Code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfISSApi;


TaxConfISSApi apiInstance = new TaxConfISSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
try {
    apiInstance.deleteIssConf(authorization, cityCode);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfISSApi#deleteIssConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **cityCode** | **BigDecimal**| City Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIssConfByCity"></a>
# **getIssConfByCity**
> List&lt;IssConfByCity&gt; getIssConfByCity(authorization, cityCode, code, date, inactive)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfISSApi;


TaxConfISSApi apiInstance = new TaxConfISSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
String code = "code_example"; // String | Identificator of this configuration, it is unique for account or standard namedspace 
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date 
Boolean inactive = true; // Boolean | return the inctives versions too 
try {
    List<IssConfByCity> result = apiInstance.getIssConfByCity(authorization, cityCode, code, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfISSApi#getIssConfByCity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **cityCode** | **BigDecimal**| City Code |
 **code** | **String**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional]
 **date** | **LocalDate**| When informed return valid version configuration for this date  | [optional]
 **inactive** | **Boolean**| return the inctives versions too  | [optional]

### Return type

[**List&lt;IssConfByCity&gt;**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIssList"></a>
# **getIssList**
> List&lt;IssConfByCity&gt; getIssList(authorization, suffixcode, date, inactive)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfISSApi;


TaxConfISSApi apiInstance = new TaxConfISSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String suffixcode = "suffixcode_example"; // String | Identify this ISS 
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date 
Boolean inactive = true; // Boolean | return the inactive versions too 
try {
    List<IssConfByCity> result = apiInstance.getIssList(authorization, suffixcode, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfISSApi#getIssList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **suffixcode** | **String**| Identify this ISS  | [optional]
 **date** | **LocalDate**| When informed return valid version configuration for this date  | [optional]
 **inactive** | **Boolean**| return the inactive versions too  | [optional]

### Return type

[**List&lt;IssConfByCity&gt;**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIssConfByCity"></a>
# **updateIssConfByCity**
> updateIssConfByCity(authorization, cityCode, issConfByCity)

update a ISS by City Code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfISSApi;


TaxConfISSApi apiInstance = new TaxConfISSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
IssConfByCity issConfByCity = new IssConfByCity(); // IssConfByCity | The pet JSON you want to post
try {
    apiInstance.updateIssConfByCity(authorization, cityCode, issConfByCity);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfISSApi#updateIssConfByCity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **cityCode** | **BigDecimal**| City Code |
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

