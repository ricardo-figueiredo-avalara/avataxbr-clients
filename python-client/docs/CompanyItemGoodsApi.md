# swagger_client.CompanyItemGoodsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_items_code_change_code_put**](CompanyItemGoodsApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companies_company_id_items_codegoods_get**](CompanyItemGoodsApi.md#companies_company_id_items_codegoods_get) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companies_company_id_itemsgoods_get**](CompanyItemGoodsApi.md#companies_company_id_itemsgoods_get) | **GET** /companies/{companyId}/items?goods | 
[**create_item**](CompanyItemGoodsApi.md#create_item) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**delete_item**](CompanyItemGoodsApi.md#delete_item) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**update_item**](CompanyItemGoodsApi.md#update_item) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


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
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
body = swagger_client.Body1() # Body1 | Requisition
goods = 'goods_example' # str | Provide to apply to goods items. (optional)
service = 'service_example' # str | Provide to apply to service items. (optional)

try: 
    api_instance.companies_company_id_items_code_change_code_put(company_id, code, body, goods=goods, service=service)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->companies_company_id_items_code_change_code_put: %s\n" % e)
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

# **companies_company_id_items_codegoods_get**
> ItemGoods companies_company_id_items_codegoods_get(company_id, code, avalara_product_type, agast=agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
avalara_product_type = 'goods' # str | Avalara Product Type (default to goods)
agast = 'agast_example' # str | Custom Agast Code (optional)

try: 
    api_response = api_instance.companies_company_id_items_codegoods_get(company_id, code, avalara_product_type, agast=agast)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->companies_company_id_items_codegoods_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **avalara_product_type** | **str**| Avalara Product Type | [default to goods]
 **agast** | **str**| Custom Agast Code | [optional] 

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_itemsgoods_get**
> list[ItemGoods] companies_company_id_itemsgoods_get(company_id, avalara_product_type, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, code=code, agast=agast)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
avalara_product_type = 'goods' # str | Avalara Product Type (default to goods)
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)
code = 'code_example' # str | Item Code (optional)
agast = 'agast_example' # str | Custom Agast Code (optional)

try: 
    api_response = api_instance.companies_company_id_itemsgoods_get(company_id, avalara_product_type, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, code=code, agast=agast)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->companies_company_id_itemsgoods_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **avalara_product_type** | **str**| Avalara Product Type | [default to goods]
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 
 **code** | **str**| Item Code | [optional] 
 **agast** | **str**| Custom Agast Code | [optional] 

### Return type

[**list[ItemGoods]**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_item**
> InlineResponse201 create_item(company_id, avalara_product_type, body)

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
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
avalara_product_type = 'goods' # str | Avalara Product Type (default to goods)
body = swagger_client.ItemGoods() # ItemGoods | Transaction Message

try: 
    # Create custom agast for one company
    api_response = api_instance.create_item(company_id, avalara_product_type, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->create_item: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **avalara_product_type** | **str**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item**
> delete_item(company_id, code, avalara_product_type)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
avalara_product_type = 'goods' # str | Avalara Product Type (default to goods)

try: 
    api_instance.delete_item(company_id, code, avalara_product_type)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->delete_item: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **avalara_product_type** | **str**| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_item**
> update_item(company_id, code, avalara_product_type, body)

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
api_instance = swagger_client.CompanyItemGoodsApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Item Code
avalara_product_type = 'goods' # str | Avalara Product Type (default to goods)
body = swagger_client.ItemGoods() # ItemGoods | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_item(company_id, code, avalara_product_type, body)
except ApiException as e:
    print("Exception when calling CompanyItemGoodsApi->update_item: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Item Code | 
 **avalara_product_type** | **str**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

