# swagger_client.CompanyItemCPOMServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_cpom_city_code_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_city_code_get) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companies_company_id_items_code_cpom_get**](CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_get) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**create_item_cpom**](CompanyItemCPOMServiceApi.md#create_item_cpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**delete_item_cpom**](CompanyItemCPOMServiceApi.md#delete_item_cpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**update_item_cpom**](CompanyItemCPOMServiceApi.md#update_item_cpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **companies_company_id_items_code_cpom_city_code_get**
> ItemCpom companies_company_id_items_code_cpom_city_code_get(company_id, code, city_code)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemCPOMServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
city_code = 3.4 # float | City Code

try: 
    api_response = api_instance.companies_company_id_items_code_cpom_city_code_get(company_id, code, city_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_city_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **city_code** | **float**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_items_code_cpom_get**
> list[ItemCpom] companies_company_id_items_code_cpom_get(company_id, code, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemCPOMServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)

try: 
    api_response = api_instance.companies_company_id_items_code_cpom_get(company_id, code, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemCPOMServiceApi->companies_company_id_items_code_cpom_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 

### Return type

[**list[ItemCpom]**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item_cpom**
> InlineResponse201 create_item_cpom(company_id, code, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemCPOMServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
body = swagger_client.ItemCpom() # ItemCpom | Transaction Message

try: 
    # Create custom agast for one company
    api_response = api_instance.create_item_cpom(company_id, code, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemCPOMServiceApi->create_item_cpom: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item_cpom**
> delete_item_cpom(company_id, code, city_code)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemCPOMServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
city_code = 3.4 # float | City Code

try: 
    api_instance.delete_item_cpom(company_id, code, city_code)
except ApiException as e:
    print("Exception when calling CompanyItemCPOMServiceApi->delete_item_cpom: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **city_code** | **float**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item_cpom**
> update_item_cpom(company_id, code, city_code, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemCPOMServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
city_code = 3.4 # float | City Code
body = swagger_client.ItemCpom() # ItemCpom | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_item_cpom(company_id, code, city_code, body)
except ApiException as e:
    print("Exception when calling CompanyItemCPOMServiceApi->update_item_cpom: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **city_code** | **float**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

