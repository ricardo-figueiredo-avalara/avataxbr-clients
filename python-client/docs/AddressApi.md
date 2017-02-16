# swagger_client.AddressApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_zip_code**](AddressApi.md#get_zip_code) | **GET** /addresses/{zipcode} | 


# **get_zip_code**
> list[Address] get_zip_code(zipcode)



This operation return address

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AddressApi()
zipcode = 'zipcode_example' # str | ZIP Code

try: 
    api_response = api_instance.get_zip_code(zipcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->get_zip_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **str**| ZIP Code | 

### Return type

[**list[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

