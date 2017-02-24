# swagger_client.TaxConfProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_process**](TaxConfProcessApi.md#create_process) | **POST** /taxconf/process | create a new Process Type configuration
[**delete_process**](TaxConfProcessApi.md#delete_process) | **DELETE** /taxconf/process/{code} | disable a Process.
[**get_process**](TaxConfProcessApi.md#get_process) | **GET** /taxconf/process/{code} | get Process information.
[**get_process_list**](TaxConfProcessApi.md#get_process_list) | **GET** /taxconf/process | retrive list of Process.
[**update_process**](TaxConfProcessApi.md#update_process) | **PUT** /taxconf/process/{code} | update a Process Type configuration


# **create_process**
> InlineResponse201 create_process(taxconfprocess)

create a new Process Type configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfProcessApi()
taxconfprocess = swagger_client.ProcessScenario() # ProcessScenario | The pet JSON you want to post

try: 
    # create a new Process Type configuration
    api_response = api_instance.create_process(taxconfprocess)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfProcessApi->create_process: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_process**
> delete_process(code)

disable a Process.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfProcessApi()
code = 'code_example' # str | Process Code

try: 
    # disable a Process.
    api_instance.delete_process(code)
except ApiException as e:
    print("Exception when calling TaxConfProcessApi->delete_process: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process**
> ProcessScenario get_process(code)

get Process information.

This operation return Process Type configuration 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfProcessApi()
code = 'code_example' # str | Process Code

try: 
    # get Process information.
    api_response = api_instance.get_process(code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfProcessApi->get_process: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process_list**
> list[ProcessScenario] get_process_list(account_id=account_id, date=date, inactive=inactive)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfProcessApi()
account_id = 'account_id_example' # str | filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date  (optional)
inactive = true # bool | return the inactive versions too  (optional)

try: 
    # retrive list of Process.
    api_response = api_instance.get_process_list(account_id=account_id, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfProcessApi->get_process_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**list[ProcessScenario]**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_process**
> update_process(code, taxconfprocess)

update a Process Type configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfProcessApi()
code = 'code_example' # str | Process Code
taxconfprocess = swagger_client.ProcessScenario() # ProcessScenario | The pet JSON you want to post

try: 
    # update a Process Type configuration
    api_instance.update_process(code, taxconfprocess)
except ApiException as e:
    print("Exception when calling TaxConfProcessApi->update_process: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

