# swagger_client.TaxConfIBPTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_ibpt_conf**](TaxConfIBPTApi.md#create_ibpt_conf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**delete_ibpt_conf**](TaxConfIBPTApi.md#delete_ibpt_conf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**get_ibpt_conf**](TaxConfIBPTApi.md#get_ibpt_conf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**get_ibpt_conf_list**](TaxConfIBPTApi.md#get_ibpt_conf_list) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**update_ibpt_conf**](TaxConfIBPTApi.md#update_ibpt_conf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


# **create_ibpt_conf**
> InlineResponse201 create_ibpt_conf(taxconfprocess)

create a new Process Type configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfIBPTApi()
taxconfprocess = swagger_client.IbptConf() # IbptConf | The pet JSON you want to post

try: 
    # create a new Process Type configuration
    api_response = api_instance.create_ibpt_conf(taxconfprocess)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfIBPTApi->create_ibpt_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_ibpt_conf**
> delete_ibpt_conf(code)

disable a IBPT.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfIBPTApi()
code = 'code_example' # str | IBPT Code

try: 
    # disable a IBPT.
    api_instance.delete_ibpt_conf(code)
except ApiException as e:
    print("Exception when calling TaxConfIBPTApi->delete_ibpt_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| IBPT Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ibpt_conf**
> IbptConf get_ibpt_conf(code)

get IBPT information.

This operation return Process Type configuration 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfIBPTApi()
code = 'code_example' # str | IBPT Code

try: 
    # get IBPT information.
    api_response = api_instance.get_ibpt_conf(code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfIBPTApi->get_ibpt_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ibpt_conf_list**
> list[IbptConf] get_ibpt_conf_list(account_id=account_id, date=date, inactive=inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfIBPTApi()
account_id = 'account_id_example' # str | filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date  (optional)
inactive = true # bool | return the inactive versions too  (optional)

try: 
    # retrive list of IBPT.
    api_response = api_instance.get_ibpt_conf_list(account_id=account_id, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfIBPTApi->get_ibpt_conf_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**list[IbptConf]**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ibpt_conf**
> update_ibpt_conf(code, taxconfprocess)

update a Process Type configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfIBPTApi()
code = 'code_example' # str | IBPT Code
taxconfprocess = swagger_client.IbptConf() # IbptConf | The pet JSON you want to post

try: 
    # update a Process Type configuration
    api_instance.update_ibpt_conf(code, taxconfprocess)
except ApiException as e:
    print("Exception when calling TaxConfIBPTApi->update_ibpt_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

