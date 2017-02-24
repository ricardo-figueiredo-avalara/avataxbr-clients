# swagger_client.InvoiceSEFAZApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_sefaz_delete**](InvoiceSEFAZApi.md#invoices_sefaz_delete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoices_sefaz_key_delete**](InvoiceSEFAZApi.md#invoices_sefaz_key_delete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoices_sefaz_key_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_get) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoices_sefaz_key_lookup_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_lookup_get) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoices_sefaz_key_put**](InvoiceSEFAZApi.md#invoices_sefaz_key_put) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoices_sefaz_post**](InvoiceSEFAZApi.md#invoices_sefaz_post) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoices_sefaz_status_get**](InvoiceSEFAZApi.md#invoices_sefaz_status_get) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **invoices_sefaz_delete**
> SefazInvoiceBasicStatus invoices_sefaz_delete(authorization, body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.SefazDisableRangeIn() # SefazDisableRangeIn | Disable Range e-Invoice

try: 
    # Disable Range e-Invoice
    api_response = api_instance.invoices_sefaz_delete(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**SefazDisableRangeIn**](SefazDisableRangeIn.md)| Disable Range e-Invoice | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_delete**
> SefazInvoiceBasicStatus invoices_sefaz_key_delete(authorization, key, body)

Cancel invoice

Cancel the invoice

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key
body = swagger_client.SefazItDeleteIn() # SefazItDeleteIn | Cancel Message

try: 
    # Cancel invoice
    api_response = api_instance.invoices_sefaz_key_delete(authorization, key, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **key** | **str**| Invoice Key | 
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_get**
> SefazItGetOut invoices_sefaz_key_get(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key

try: 
    # Retrieve invoice
    api_response = api_instance.invoices_sefaz_key_get(authorization, key)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **key** | **str**| Invoice Key | 

### Return type

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_lookup_get**
> TransactionForSefazGoodsList invoices_sefaz_key_lookup_get(authorization, key)

Retrieve invoice

Retrieve the invoice

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key

try: 
    # Retrieve invoice
    api_response = api_instance.invoices_sefaz_key_lookup_get(authorization, key)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_lookup_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **key** | **str**| Invoice Key | 

### Return type

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_put**
> SefazInvoiceBasicStatus invoices_sefaz_key_put(authorization, key, body)

Fix Letter

Fix Letter

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
key = 'key_example' # str | Invoice Key
body = swagger_client.SefazItPutIn() # SefazItPutIn | Fix Message

try: 
    # Fix Letter
    api_response = api_instance.invoices_sefaz_key_put(authorization, key, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **key** | **str**| Invoice Key | 
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_post**
> SefazPostOut invoices_sefaz_post(authorization, body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = [swagger_client.TransactionForSefazGoods()] # list[TransactionForSefazGoods] | Invoices

try: 
    # Send an e-Invoice
    api_response = api_instance.invoices_sefaz_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**list[TransactionForSefazGoods]**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_status_get**
> str invoices_sefaz_status_get(authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceSEFAZApi()
authorization = 'authorization_example' # str | Bearer {auth}

try: 
    # Retrieve Status of SEFAZ Server
    api_response = api_instance.invoices_sefaz_status_get(authorization)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceSEFAZApi->invoices_sefaz_status_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

