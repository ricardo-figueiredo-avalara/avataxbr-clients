# swagger_client.TaxConfICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_icmsconfstate**](TaxConfICMSApi.md#create_icmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**delete_icms_conf**](TaxConfICMSApi.md#delete_icms_conf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**get_icms_conf_by_state**](TaxConfICMSApi.md#get_icms_conf_by_state) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**get_icms_list**](TaxConfICMSApi.md#get_icms_list) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**get_icms_list_0**](TaxConfICMSApi.md#get_icms_list_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**update_icmsconfstate**](TaxConfICMSApi.md#update_icmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **create_icmsconfstate**
> InlineResponse201 create_icmsconfstate(state, icms_conf_state)

create a new ICMS Configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
state = 'state_example' # str | Brazilian State
icms_conf_state = swagger_client.IcmsConfByState() # IcmsConfByState | The pet JSON you want to post

try: 
    # create a new ICMS Configuration
    api_response = api_instance.create_icmsconfstate(state, icms_conf_state)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->create_icmsconfstate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_icms_conf**
> delete_icms_conf(state, code)

disable a ICMS by State.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
state = 'state_example' # str | Brazilian State
code = 'code_example' # str | ICMS Code

try: 
    # disable a ICMS by State.
    api_instance.delete_icms_conf(state, code)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->delete_icms_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **code** | **str**| ICMS Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_conf_by_state**
> list[IcmsConfByState] get_icms_conf_by_state(state, code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
state = 'state_example' # str | Brazilian State
code = 'code_example' # str | ICMS Code

try: 
    # get ICMS information by State.
    api_response = api_instance.get_icms_conf_by_state(state, code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->get_icms_conf_by_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **code** | **str**| ICMS Code | 

### Return type

[**list[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_list**
> list[IcmsConfByState] get_icms_list(state, suffixcode=suffixcode, date=date, inactive=inactive)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
state = 'state_example' # str | Brazilian State
suffixcode = 'suffixcode_example' # str | Identify this ICMS (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date (optional)
inactive = true # bool | return the inactive versions too (optional)

try: 
    # retrive list of ICMS.
    api_response = api_instance.get_icms_list(state, suffixcode=suffixcode, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->get_icms_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **suffixcode** | **str**| Identify this ICMS | [optional] 
 **date** | **date**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **bool**| return the inactive versions too | [optional] 

### Return type

[**list[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_list_0**
> list[IcmsConfByState] get_icms_list_0(text, state=state)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
text = 'text_example' # str | Search for codes
state = 'state_example' # str | Filter for states (optional)

try: 
    # retrive list of ICMS.
    api_response = api_instance.get_icms_list_0(text, state=state)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->get_icms_list_0: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **str**| Search for codes | 
 **state** | **str**| Filter for states | [optional] 

### Return type

[**list[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_icmsconfstate**
> update_icmsconfstate(state, code, icms_conf_state)

update a IcmsConf State,

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfICMSApi()
state = 'state_example' # str | Brazilian State
code = 'code_example' # str | ICMS Code
icms_conf_state = swagger_client.IcmsConfByState() # IcmsConfByState | The pet JSON you want to post

try: 
    # update a IcmsConf State,
    api_instance.update_icmsconfstate(state, code, icms_conf_state)
except ApiException as e:
    print("Exception when calling TaxConfICMSApi->update_icmsconfstate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Brazilian State | 
 **code** | **str**| ICMS Code | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

