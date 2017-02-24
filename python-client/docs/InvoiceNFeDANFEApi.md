# swagger_client.InvoiceNFeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfe_print**](InvoiceNFeDANFEApi.md#nfe_print) | **GET** /invoices/nfe/{key} | Retrieve Danfe


# **nfe_print**
> file nfe_print(authorization, key)

Retrieve Danfe

Retrieve the Danfe 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceNFeDANFEApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key

try: 
    # Retrieve Danfe
    api_response = api_instance.nfe_print(authorization, key)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceNFeDANFEApi->nfe_print: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **key** | **str**| Invoice Key | 

### Return type

[**file**](file.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

