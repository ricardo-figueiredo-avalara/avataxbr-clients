# TaxConfProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcess**](TaxConfProcessApi.md#createProcess) | **POST** /taxconf/process | create a new Process Type configuration
[**deleteProcess**](TaxConfProcessApi.md#deleteProcess) | **DELETE** /taxconf/process/{code} | disable a Process.
[**getProcess**](TaxConfProcessApi.md#getProcess) | **GET** /taxconf/process/{code} | get Process information.
[**getProcessList**](TaxConfProcessApi.md#getProcessList) | **GET** /taxconf/process | retrive list of Process.
[**updateProcess**](TaxConfProcessApi.md#updateProcess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


<a name="createProcess"></a>
# **createProcess**
> InlineResponse201 createProcess(taxconfprocess)

create a new Process Type configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfProcessApi;


TaxConfProcessApi apiInstance = new TaxConfProcessApi();
ProcessScenario taxconfprocess = new ProcessScenario(); // ProcessScenario | The pet JSON you want to post
try {
    InlineResponse201 result = apiInstance.createProcess(taxconfprocess);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfProcessApi#createProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcess"></a>
# **deleteProcess**
> deleteProcess(code)

disable a Process.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfProcessApi;


TaxConfProcessApi apiInstance = new TaxConfProcessApi();
String code = "code_example"; // String | Process Code
try {
    apiInstance.deleteProcess(code);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfProcessApi#deleteProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcess"></a>
# **getProcess**
> ProcessScenario getProcess(code)

get Process information.

This operation return Process Type configuration 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfProcessApi;


TaxConfProcessApi apiInstance = new TaxConfProcessApi();
String code = "code_example"; // String | Process Code
try {
    ProcessScenario result = apiInstance.getProcess(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfProcessApi#getProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code |

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessList"></a>
# **getProcessList**
> List&lt;ProcessScenario&gt; getProcessList(accountId, date, inactive)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfProcessApi;


TaxConfProcessApi apiInstance = new TaxConfProcessApi();
String accountId = "accountId_example"; // String | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
LocalDate date = new LocalDate(); // LocalDate | When informed return valid version configuration for this date 
Boolean inactive = true; // Boolean | return the inactive versions too 
try {
    List<ProcessScenario> result = apiInstance.getProcessList(accountId, date, inactive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfProcessApi#getProcessList");
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

[**List&lt;ProcessScenario&gt;**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcess"></a>
# **updateProcess**
> updateProcess(code, taxconfprocess)

update a Process Type configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxConfProcessApi;


TaxConfProcessApi apiInstance = new TaxConfProcessApi();
String code = "code_example"; // String | Process Code
ProcessScenario taxconfprocess = new ProcessScenario(); // ProcessScenario | The pet JSON you want to post
try {
    apiInstance.updateProcess(code, taxconfprocess);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxConfProcessApi#updateProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Process Code |
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

