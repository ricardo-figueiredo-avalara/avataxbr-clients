# swagger_client.InvoiceContingencyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_drop_contingency**](InvoiceContingencyApi.md#invoice_drop_contingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoice_set_contingency**](InvoiceContingencyApi.md#invoice_set_contingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoice_verify_contingency**](InvoiceContingencyApi.md#invoice_verify_contingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **invoice_drop_contingency**
> invoice_drop_contingency(state)

Invoice Drop Contingency per State

Drop State in Contingency

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceContingencyApi()
state = 'state_example' # str | Brazilian State

try: 
    # Invoice Drop Contingency per State
    api_instance.invoice_drop_contingency(state)
except ApiException as e:
    print("Exception when calling InvoiceContingencyApi->invoice_drop_contingency: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_set_contingency**
> invoice_set_contingency(state, body)

Invoice Set Contingency per State

Set State in Contingency

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceContingencyApi()
state = 'state_example' # str | Brazilian State
body = swagger_client.Body4() # Body4 | Set Contingency

try: 
    # Invoice Set Contingency per State
    api_instance.invoice_set_contingency(state, body)
except ApiException as e:
    print("Exception when calling InvoiceContingencyApi->invoice_set_contingency: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **body** | [**Body4**](Body4.md)| Set Contingency | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_verify_contingency**
> InlineResponse2003 invoice_verify_contingency(state)

Invoice Verify Contingency per State

Check if State was in Contingency

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceContingencyApi()
state = 'state_example' # str | Brazilian State

try: 
    # Invoice Verify Contingency per State
    api_response = api_instance.invoice_verify_contingency(state)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceContingencyApi->invoice_verify_contingency: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

