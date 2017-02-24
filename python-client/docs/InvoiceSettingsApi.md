# swagger_client.InvoiceSettingsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_settings**](InvoiceSettingsApi.md#invoice_settings) | **GET** /invoices/settings | Invoice Settigns


# **invoice_settings**
> InlineResponse2004 invoice_settings()

Invoice Settigns

Get Enviroment Settigns

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSettingsApi()

try: 
    # Invoice Settigns
    api_response = api_instance.invoice_settings()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSettingsApi->invoice_settings: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

