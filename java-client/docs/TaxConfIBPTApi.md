# TaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIbptConf**](TaxConfIBPTApi.md#createIbptConf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**deleteIbptConf**](TaxConfIBPTApi.md#deleteIbptConf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**getIbptConf**](TaxConfIBPTApi.md#getIbptConf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**getIbptConfList**](TaxConfIBPTApi.md#getIbptConfList) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**updateIbptConf**](TaxConfIBPTApi.md#updateIbptConf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


<a name="createIbptConf"></a>
# **createIbptConf**
> InlineResponse201 createIbptConf(taxconfprocess)

create a new Process Type configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
IbptConf taxconfprocess = new IbptConf(); // IbptConf | The pet JSON you want to post
try {
    InlineResponse201 result = apiInstance.createIbptConf(taxconfprocess);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#createIbptConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIbptConf"></a>
# **deleteIbptConf**
> deleteIbptConf(code)

disable a IBPT.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String code = "code_example"; // String | IBPT Code
try {
    apiInstance.deleteIbptConf(code);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#deleteIbptConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIbptConf"></a>
# **getIbptConf**
> IbptConf getIbptConf(code)

get IBPT information.

This operation return Process Type configuration 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String code = "code_example"; // String | IBPT Code
try {
    IbptConf result = apiInstance.getIbptConf(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#getIbptConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code |

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIbptConfList"></a>
# **getIbptConfList**
> List&lt;IbptConf&gt; getIbptConfList(accountId, date, inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String accountId = "accountId_example"; // String | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date 
Boolean inactive = true; // Boolean | return the inactive versions too 
try {
    List<IbptConf> result = apiInstance.getIbptConfList(accountId, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#getIbptConfList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional]
 **date** | **LocalDate**| When informed return valid version configuration for this date  | [optional]
 **inactive** | **Boolean**| return the inactive versions too  | [optional]

### Return type

[**List&lt;IbptConf&gt;**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIbptConf"></a>
# **updateIbptConf**
> updateIbptConf(code, taxconfprocess)

update a Process Type configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String code = "code_example"; // String | IBPT Code
IbptConf taxconfprocess = new IbptConf(); // IbptConf | The pet JSON you want to post
try {
    apiInstance.updateIbptConf(code, taxconfprocess);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#updateIbptConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code |
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

