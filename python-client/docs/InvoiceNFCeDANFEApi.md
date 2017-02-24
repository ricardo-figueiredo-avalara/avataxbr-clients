# swagger_client.InvoiceNFCeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_nfce_key_get**](InvoiceNFCeDANFEApi.md#invoices_nfce_key_get) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


# **invoices_nfce_key_get**
> file invoices_nfce_key_get(authorization, key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceNFCeDANFEApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key

try: 
    # NFCe Danfe Print
    api_response = api_instance.invoices_nfce_key_get(authorization, key)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceNFCeDANFEApi->invoices_nfce_key_get: %s\n" % e)
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

