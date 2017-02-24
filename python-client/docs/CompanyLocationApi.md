# swagger_client.CompanyLocationApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_locations_code_get**](CompanyLocationApi.md#companies_company_id_locations_code_get) | **GET** /companies/{companyId}/locations/{code} | 
[**companies_company_id_locations_get**](CompanyLocationApi.md#companies_company_id_locations_get) | **GET** /companies/{companyId}/locations | 
[**create_location**](CompanyLocationApi.md#create_location) | **POST** /companies/{companyId}/locations | Create new location for company
[**delete_location**](CompanyLocationApi.md#delete_location) | **DELETE** /companies/{companyId}/locations/{code} | 
[**update_location**](CompanyLocationApi.md#update_location) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


# **companies_company_id_locations_code_get**
> Location companies_company_id_locations_code_get(company_id, code)



This operation return location 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyLocationApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Location Code

try: 
    api_response = api_instance.companies_company_id_locations_code_get(company_id, code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyLocationApi->companies_company_id_locations_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_locations_get**
> list[Location] companies_company_id_locations_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)



This operation return all locations 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyLocationApi()
company_id = 'company_id_example' # str | Company ID
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)

try: 
    api_response = api_instance.companies_company_id_locations_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyLocationApi->companies_company_id_locations_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 

### Return type

[**list[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_location**
> InlineResponse201 create_location(company_id, body)

Create new location for company

This method operation create a new location for company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyLocationApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.Location() # Location | Transaction Message

try: 
    # Create new location for company
    api_response = api_instance.create_location(company_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyLocationApi->create_location: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_location**
> delete_location(company_id, code)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyLocationApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Location Code

try: 
    api_instance.delete_location(company_id, code)
except ApiException as e:
    print("Exception when calling CompanyLocationApi->delete_location: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Location Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_location**
> update_location(company_id, code, body)

Update location for company

This method operation update a location for company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyLocationApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Location Code
body = swagger_client.Location() # Location | Transaction Message

try: 
    # Update location for company
    api_instance.update_location(company_id, code, body)
except ApiException as e:
    print("Exception when calling CompanyLocationApi->update_location: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

