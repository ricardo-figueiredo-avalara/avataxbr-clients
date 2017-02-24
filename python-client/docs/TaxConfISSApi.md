# swagger_client.TaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_iss_conf_by_city**](TaxConfISSApi.md#create_iss_conf_by_city) | **POST** /taxconf/iss | create a new ISS Configuration
[**delete_iss_conf**](TaxConfISSApi.md#delete_iss_conf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**get_iss_conf_by_city**](TaxConfISSApi.md#get_iss_conf_by_city) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**get_iss_list**](TaxConfISSApi.md#get_iss_list) | **GET** /taxconf/iss | retrive list of ISS
[**update_iss_conf_by_city**](TaxConfISSApi.md#update_iss_conf_by_city) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **create_iss_conf_by_city**
> InlineResponse201 create_iss_conf_by_city(iss_conf_by_city)

create a new ISS Configuration

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfISSApi()
iss_conf_by_city = swagger_client.IssConfByCity() # IssConfByCity | The pet JSON you want to post

try: 
    # create a new ISS Configuration
    api_response = api_instance.create_iss_conf_by_city(iss_conf_by_city)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfISSApi->create_iss_conf_by_city: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_iss_conf**
> delete_iss_conf(city_code)

disable a ISS by City Code.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfISSApi()
city_code = 3.4 # float | City Code

try: 
    # disable a ISS by City Code.
    api_instance.delete_iss_conf(city_code)
except ApiException as e:
    print("Exception when calling TaxConfISSApi->delete_iss_conf: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_iss_conf_by_city**
> list[IssConfByCity] get_iss_conf_by_city(city_code, code=code, date=date, inactive=inactive)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfISSApi()
city_code = 3.4 # float | City Code
code = 'code_example' # str | Identificator of this configuration, it is unique for account or standard namedspace  (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date  (optional)
inactive = true # bool | return the inctives versions too  (optional)

try: 
    # get ISS information by City Code.
    api_response = api_instance.get_iss_conf_by_city(city_code, code=code, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfISSApi->get_iss_conf_by_city: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code | 
 **code** | **str**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inctives versions too  | [optional] 

### Return type

[**list[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_iss_list**
> list[IssConfByCity] get_iss_list(suffixcode=suffixcode, date=date, inactive=inactive)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfISSApi()
suffixcode = 'suffixcode_example' # str | Identify this ISS  (optional)
date = '2013-10-20' # date | When informed return valid version configuration for this date  (optional)
inactive = true # bool | return the inactive versions too  (optional)

try: 
    # retrive list of ISS
    api_response = api_instance.get_iss_list(suffixcode=suffixcode, date=date, inactive=inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaxConfISSApi->get_iss_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **str**| Identify this ISS  | [optional] 
 **date** | **date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**list[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_iss_conf_by_city**
> update_iss_conf_by_city(city_code, iss_conf_by_city)

update a ISS by City Code.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.TaxConfISSApi()
city_code = 3.4 # float | City Code
iss_conf_by_city = swagger_client.IssConfByCity() # IssConfByCity | The pet JSON you want to post

try: 
    # update a ISS by City Code.
    api_instance.update_iss_conf_by_city(city_code, iss_conf_by_city)
except ApiException as e:
    print("Exception when calling TaxConfISSApi->update_iss_conf_by_city: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **float**| City Code | 
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

