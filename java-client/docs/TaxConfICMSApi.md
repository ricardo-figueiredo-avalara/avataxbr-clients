# TaxConfICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIcmsconfstate**](TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**deleteIcmsConf**](TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**getIcmsConfByState**](TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**getIcmsList**](TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**getIcmsListSearch**](TaxConfICMSApi.md#getIcmsListSearch) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**updateIcmsconfstate**](TaxConfICMSApi.md#updateIcmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


<a name="createIcmsconfstate"></a>
# **createIcmsconfstate**
> InlineResponse201 createIcmsconfstate(authorization, state, icmsConfState)

create a new ICMS Configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
IcmsConfByState icmsConfState = new IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post
try {
    InlineResponse201 result = apiInstance.createIcmsconfstate(authorization, state, icmsConfState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#createIcmsconfstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIcmsConf"></a>
# **deleteIcmsConf**
> deleteIcmsConf(authorization, state, code)

disable a ICMS by State.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
String code = "code_example"; // String | ICMS Code
try {
    apiInstance.deleteIcmsConf(authorization, state, code);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#deleteIcmsConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **code** | **String**| ICMS Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsConfByState"></a>
# **getIcmsConfByState**
> List&lt;IcmsConfByState&gt; getIcmsConfByState(authorization, state, code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
String code = "code_example"; // String | ICMS Code
try {
    List<IcmsConfByState> result = apiInstance.getIcmsConfByState(authorization, state, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#getIcmsConfByState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **code** | **String**| ICMS Code |

### Return type

[**List&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsList"></a>
# **getIcmsList**
> List&lt;IcmsConfByState&gt; getIcmsList(authorization, state, suffixcode, date, inactive)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
String suffixcode = "suffixcode_example"; // String | Identify this ICMS
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date
Boolean inactive = true; // Boolean | return the inactive versions too
try {
    List<IcmsConfByState> result = apiInstance.getIcmsList(authorization, state, suffixcode, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#getIcmsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **suffixcode** | **String**| Identify this ICMS | [optional]
 **date** | **LocalDate**| When informed return valid version configuration for this date | [optional]
 **inactive** | **Boolean**| return the inactive versions too | [optional]

### Return type

[**List&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsListSearch"></a>
# **getIcmsListSearch**
> List&lt;IcmsConfByState&gt; getIcmsListSearch(authorization, text, state)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String text = "text_example"; // String | Search for codes
String state = "state_example"; // String | Filter for states
try {
    List<IcmsConfByState> result = apiInstance.getIcmsListSearch(authorization, text, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#getIcmsListSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **text** | **String**| Search for codes |
 **state** | **String**| Filter for states | [optional]

### Return type

[**List&lt;IcmsConfByState&gt;**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIcmsconfstate"></a>
# **updateIcmsconfstate**
> updateIcmsconfstate(authorization, state, code, icmsConfState)

update a IcmsConf State,

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfICMSApi;


TaxConfICMSApi apiInstance = new TaxConfICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
String code = "code_example"; // String | ICMS Code
IcmsConfByState icmsConfState = new IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post
try {
    apiInstance.updateIcmsconfstate(authorization, state, code, icmsConfState);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfICMSApi#updateIcmsconfstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **code** | **String**| ICMS Code |
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

