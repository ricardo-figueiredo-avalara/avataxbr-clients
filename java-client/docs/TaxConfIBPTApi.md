# TaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIbptFromCSV**](TaxConfIBPTApi.md#createIbptFromCSV) | **POST** /taxconf/ibpt/{state} | create a new Process Type configuration
[**deleteIbptFromState**](TaxConfIBPTApi.md#deleteIbptFromState) | **DELETE** /taxconf/ibpt/{state} | disable a IBPT.


<a name="createIbptFromCSV"></a>
# **createIbptFromCSV**
> InlineResponse201 createIbptFromCSV(authorization, state, csvIBPT)

create a new Process Type configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
CsvIbptList csvIBPT = new CsvIbptList(); // CsvIbptList | CSV file
try {
    InlineResponse201 result = apiInstance.createIbptFromCSV(authorization, state, csvIBPT);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#createIbptFromCSV");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **csvIBPT** | [**CsvIbptList**](CsvIbptList.md)| CSV file |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIbptFromState"></a>
# **deleteIbptFromState**
> deleteIbptFromState(authorization, state)

disable a IBPT.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfIBPTApi;


TaxConfIBPTApi apiInstance = new TaxConfIBPTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String state = "state_example"; // String | Brazilian State
try {
    apiInstance.deleteIbptFromState(authorization, state);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfIBPTApi#deleteIbptFromState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

