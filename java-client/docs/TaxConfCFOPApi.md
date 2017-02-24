# TaxConfCFOPApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCfop**](TaxConfCFOPApi.md#createCfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**deleteCfop**](TaxConfCFOPApi.md#deleteCfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**getCfop**](TaxConfCFOPApi.md#getCfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**getCfopList**](TaxConfCFOPApi.md#getCfopList) | **GET** /taxconf/cfop | retrive list of CFOP.
[**updateCfop**](TaxConfCFOPApi.md#updateCfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


<a name="createCfop"></a>
# **createCfop**
> InlineResponse201 createCfop(body)

create a new CFOP configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfCFOPApi;


TaxConfCFOPApi apiInstance = new TaxConfCFOPApi();
CfopConf body = new CfopConf(); // CfopConf | The pet JSON you want to post
try {
    InlineResponse201 result = apiInstance.createCfop(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfCFOPApi#createCfop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCfop"></a>
# **deleteCfop**
> deleteCfop(code)

disable a CFOP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfCFOPApi;


TaxConfCFOPApi apiInstance = new TaxConfCFOPApi();
String code = "code_example"; // String | CFOP Code
try {
    apiInstance.deleteCfop(code);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfCFOPApi#deleteCfop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCfop"></a>
# **getCfop**
> CfopConf getCfop(code)

get CFOP information.

This operation return CFOP configuration 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfCFOPApi;


TaxConfCFOPApi apiInstance = new TaxConfCFOPApi();
String code = "code_example"; // String | CFOP Code
try {
    CfopConf result = apiInstance.getCfop(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfCFOPApi#getCfop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code |

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCfopList"></a>
# **getCfopList**
> List&lt;CfopConf&gt; getCfopList(suffixcode, date, inactive)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfCFOPApi;


TaxConfCFOPApi apiInstance = new TaxConfCFOPApi();
String suffixcode = "suffixcode_example"; // String | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type 
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date 
Boolean inactive = true; // Boolean | return the inactive versions too 
try {
    List<CfopConf> result = apiInstance.getCfopList(suffixcode, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfCFOPApi#getCfopList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **String**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional]
 **date** | **LocalDate**| When informed return valid version configuration for this date  | [optional]
 **inactive** | **Boolean**| return the inactive versions too  | [optional]

### Return type

[**List&lt;CfopConf&gt;**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCfop"></a>
# **updateCfop**
> updateCfop(code, taxconfcfop)

update a CFOP configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfCFOPApi;


TaxConfCFOPApi apiInstance = new TaxConfCFOPApi();
String code = "code_example"; // String | CFOP Code
CfopConf taxconfcfop = new CfopConf(); // CfopConf | The pet JSON you want to post
try {
    apiInstance.updateCfop(code, taxconfcfop);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfCFOPApi#updateCfop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| CFOP Code |
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

