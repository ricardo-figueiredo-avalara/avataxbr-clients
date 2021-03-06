# AddressApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZipCode**](AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 


<a name="getZipCode"></a>
# **getZipCode**
> List&lt;Address&gt; getZipCode(authorization, zipcode)



This operation return address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressApi;


AddressApi apiInstance = new AddressApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String zipcode = "zipcode_example"; // String | ZIP Code
try {
    List<Address> result = apiInstance.getZipCode(authorization, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#getZipCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **zipcode** | **String**| ZIP Code |

### Return type

[**List&lt;Address&gt;**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

