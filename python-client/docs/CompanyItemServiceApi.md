# swagger_client.CompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemServiceApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codeservice_get**](CompanyItemServiceApi.md#companies_company_id_items_codeservice_get) | **GET** /companies/{companyId}/items/{code}?service | 
[**companies_company_id_itemsservice_get**](CompanyItemServiceApi.md#companies_company_id_itemsservice_get) | **GET** /companies/{companyId}/items?service | 
[**create_item_service**](CompanyItemServiceApi.md#create_item_service) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**delete_item_service**](CompanyItemServiceApi.md#delete_item_service) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**update_item_service**](CompanyItemServiceApi.md#update_item_service) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **companies_company_id_items_code_change_code_put**
> companies_company_id_items_code_change_code_put(company_id, code, body, goods=goods, service=service)



Change the code of a given item. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
body = swagger_client.Body1() # Body1 | Requisition
goods = 'goods_example' # str | Provide to apply to goods items. (optional)
service = 'service_example' # str | Provide to apply to service items. (optional)

try: 
    api_instance.companies_company_id_items_code_change_code_put(company_id, code, body, goods=goods, service=service)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->companies_company_id_items_code_change_code_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **body** | [**Body1**](Body1.md)| Requisition | 
 **goods** | **str**| Provide to apply to goods items. | [optional] 
 **service** | **str**| Provide to apply to service items. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_items_codeservice_get**
> ItemSimple companies_company_id_items_codeservice_get(company_id, code, avalara_product_type=avalara_product_type, agast=agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
avalara_product_type = 'service' # str | Avalara Product Type (optional) (default to service)
agast = 'agast_example' # str | Custom Agast Code (optional)

try: 
    api_response = api_instance.companies_company_id_items_codeservice_get(company_id, code, avalara_product_type=avalara_product_type, agast=agast)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->companies_company_id_items_codeservice_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **avalara_product_type** | **str**| Avalara Product Type | [optional] [default to service]
 **agast** | **str**| Custom Agast Code | [optional] 

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_itemsservice_get**
> list[ItemSimple] companies_company_id_itemsservice_get(company_id, avalara_product_type=avalara_product_type, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, code=code, agast=agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
avalara_product_type = 'service' # str | Avalara Product Type (optional) (default to service)
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)
code = 'code_example' # str | Item Code (optional)
agast = 'agast_example' # str | Custom Agast Code (optional)

try: 
    api_response = api_instance.companies_company_id_itemsservice_get(company_id, avalara_product_type=avalara_product_type, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, code=code, agast=agast)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->companies_company_id_itemsservice_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **avalara_product_type** | **str**| Avalara Product Type | [optional] [default to service]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 
 **code** | **str**| Item Code | [optional] 
 **agast** | **str**| Custom Agast Code | [optional] 

### Return type

[**list[ItemSimple]**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item_service**
> InlineResponse201 create_item_service(company_id, body, avalara_product_type=avalara_product_type)

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
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.ItemSimple() # ItemSimple | Transaction Message
avalara_product_type = 'service' # str | Avalara Product Type (optional) (default to service)

try: 
    # Create custom agast for one company
    api_response = api_instance.create_item_service(company_id, body, avalara_product_type=avalara_product_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->create_item_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **str**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item_service**
> delete_item_service(company_id, code, avalara_product_type=avalara_product_type)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
avalara_product_type = 'service' # str | Avalara Product Type (optional) (default to service)

try: 
    api_instance.delete_item_service(company_id, code, avalara_product_type=avalara_product_type)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->delete_item_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **avalara_product_type** | **str**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item_service**
> update_item_service(company_id, code, body, avalara_product_type=avalara_product_type)

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
api_instance = swagger_client.CompanyItemServiceApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
body = swagger_client.ItemSimple() # ItemSimple | Transaction Message
avalara_product_type = 'service' # str | Avalara Product Type (optional) (default to service)

try: 
    # Update custom agast for one company
    api_instance.update_item_service(company_id, code, body, avalara_product_type=avalara_product_type)
except ApiException as e:
    print("Exception when calling CompanyItemServiceApi->update_item_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalara_product_type** | **str**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

