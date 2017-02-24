# swagger_client.TaxConfCFOPApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cfop**](TaxConfCFOPApi.md#create_cfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**delete_cfop**](TaxConfCFOPApi.md#delete_cfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**get_cfop**](TaxConfCFOPApi.md#get_cfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**get_cfop_list**](TaxConfCFOPApi.md#get_cfop_list) | **GET** /taxconf/cfop | retrive list of CFOP.
[**update_cfop**](TaxConfCFOPApi.md#update_cfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


# **create_cfop**
> InlineResponse201 create_cfop(body)

create a new CFOP configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfCFOPApi()
body = swagger_client.CfopConf() # CfopConf | The pet JSON you want to post

try: 
    # create a new CFOP configuration
    api_response = api_instance.create_cfop(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfCFOPApi->create_cfop: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_cfop**
> delete_cfop(code)

disable a CFOP.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfCFOPApi()
code = 'code_example' # str | CFOP Code

try: 
    # disable a CFOP.
    api_instance.delete_cfop(code)
except ApiException as e:
    print("Exception when calling TaxConfCFOPApi->delete_cfop: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| CFOP Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cfop**
> CfopConf get_cfop(code)

get CFOP information.

This operation return CFOP configuration 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfCFOPApi()
code = 'code_example' # str | CFOP Code

try: 
    # get CFOP information.
    api_response = api_instance.get_cfop(code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfCFOPApi->get_cfop: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cfop_list**
> list[CfopConf] get_cfop_list(suffixcode=suffixcode, date=date, inactive=inactive)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfCFOPApi()
suffixcode = 'suffixcode_example' # str | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date  (optional)
inactive = true # bool | return the inactive versions too  (optional)

try: 
    # retrive list of CFOP.
    api_response = api_instance.get_cfop_list(suffixcode=suffixcode, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfCFOPApi->get_cfop_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **str**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**list[CfopConf]**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_cfop**
> update_cfop(code, taxconfcfop)

update a CFOP configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfCFOPApi()
code = 'code_example' # str | CFOP Code
taxconfcfop = swagger_client.CfopConf() # CfopConf | The pet JSON you want to post

try: 
    # update a CFOP configuration
    api_instance.update_cfop(code, taxconfcfop)
except ApiException as e:
    print("Exception when calling TaxConfCFOPApi->update_cfop: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

