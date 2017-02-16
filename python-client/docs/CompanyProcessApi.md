# swagger_client.CompanyProcessApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_process_code_get**](CompanyProcessApi.md#companies_company_id_process_code_get) | **GET** /companies/{companyId}/process/{code} | 
[**companies_company_id_process_get**](CompanyProcessApi.md#companies_company_id_process_get) | **GET** /companies/{companyId}/process | 
[**create_custom_process_scenario**](CompanyProcessApi.md#create_custom_process_scenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**delete_custom_process_scenario**](CompanyProcessApi.md#delete_custom_process_scenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**update_custom_process_scenario**](CompanyProcessApi.md#update_custom_process_scenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


# **companies_company_id_process_code_get**
> CustomProcessScenario companies_company_id_process_code_get(company_id, code)



This operation return custom process configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyProcessApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Process Code

try: 
    api_response = api_instance.companies_company_id_process_code_get(company_id, code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyProcessApi->companies_company_id_process_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_process_get**
> list[CustomProcessScenario] companies_company_id_process_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)



This operation return custom process configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyProcessApi()
company_id = 'company_id_example' # str | Company ID
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)

try: 
    api_response = api_instance.companies_company_id_process_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyProcessApi->companies_company_id_process_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 

### Return type

[**list[CustomProcessScenario]**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_process_scenario**
> InlineResponse201 create_custom_process_scenario(company_id, body)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyProcessApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.CustomProcessScenario() # CustomProcessScenario | Transaction Message

try: 
    # Create custom process tax for one company
    api_response = api_instance.create_custom_process_scenario(company_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyProcessApi->create_custom_process_scenario: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_process_scenario**
> delete_custom_process_scenario(company_id, code)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyProcessApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Process Code

try: 
    api_instance.delete_custom_process_scenario(company_id, code)
except ApiException as e:
    print("Exception when calling CompanyProcessApi->delete_custom_process_scenario: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_process_scenario**
> update_custom_process_scenario(company_id, code, body)

Update custom agast for one company

This method operation update a custom process for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyProcessApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Process Code
body = swagger_client.CustomProcessScenario() # CustomProcessScenario | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_custom_process_scenario(company_id, code, body)
except ApiException as e:
    print("Exception when calling CompanyProcessApi->update_custom_process_scenario: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

