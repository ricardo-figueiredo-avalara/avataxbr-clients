# swagger_client.CompanyICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_icms_get**](CompanyICMSApi.md#companies_company_id_icms_get) | **GET** /companies/{companyId}/icms | 
[**companies_company_id_icms_state_get**](CompanyICMSApi.md#companies_company_id_icms_state_get) | **GET** /companies/{companyId}/icms/{state} | 
[**create_icms**](CompanyICMSApi.md#create_icms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**delete_custom_icms_conf_by_state**](CompanyICMSApi.md#delete_custom_icms_conf_by_state) | **DELETE** /companies/{companyId}/icms/{state} | 
[**update_custom_icms_conf_by_state**](CompanyICMSApi.md#update_custom_icms_conf_by_state) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **companies_company_id_icms_get**
> list[CustomIcmsConfByState] companies_company_id_icms_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyICMSApi()
company_id = 'company_id_example' # str | Company ID
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)

try: 
    api_response = api_instance.companies_company_id_icms_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyICMSApi->companies_company_id_icms_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 

### Return type

[**list[CustomIcmsConfByState]**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_icms_state_get**
> CustomIcmsConfByState companies_company_id_icms_state_get(company_id, state)



This operation return custom ICMS configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyICMSApi()
company_id = 'company_id_example' # str | Company ID
state = 'state_example' # str | Brazilian State

try: 
    api_response = api_instance.companies_company_id_icms_state_get(company_id, state)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyICMSApi->companies_company_id_icms_state_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **state** | **str**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_icms**
> InlineResponse201 create_icms(company_id, body)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyICMSApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.CustomIcmsConfByState() # CustomIcmsConfByState | Transaction Message

try: 
    # Create custom ICMS tax for one company
    api_response = api_instance.create_icms(company_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyICMSApi->create_icms: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_icms_conf_by_state**
> delete_custom_icms_conf_by_state(company_id, state)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyICMSApi()
company_id = 'company_id_example' # str | Company ID
state = 'state_example' # str | Brazilian State

try: 
    api_instance.delete_custom_icms_conf_by_state(company_id, state)
except ApiException as e:
    print("Exception when calling CompanyICMSApi->delete_custom_icms_conf_by_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **state** | **str**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_icms_conf_by_state**
> update_custom_icms_conf_by_state(company_id, state, body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyICMSApi()
company_id = 'company_id_example' # str | Company ID
state = 'state_example' # str | Brazilian State
body = swagger_client.CustomIcmsConfByState() # CustomIcmsConfByState | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_custom_icms_conf_by_state(company_id, state, body)
except ApiException as e:
    print("Exception when calling CompanyICMSApi->update_custom_icms_conf_by_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **state** | **str**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

