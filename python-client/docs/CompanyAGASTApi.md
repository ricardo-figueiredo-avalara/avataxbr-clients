# swagger_client.CompanyAGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_agasts_code_get**](CompanyAGASTApi.md#companies_company_id_agasts_code_get) | **GET** /companies/{companyId}/agasts/{code} | 
[**companies_company_id_agasts_get**](CompanyAGASTApi.md#companies_company_id_agasts_get) | **GET** /companies/{companyId}/agasts | 
[**create_custom_agast**](CompanyAGASTApi.md#create_custom_agast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**delete_agast**](CompanyAGASTApi.md#delete_agast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**update_custom_agast**](CompanyAGASTApi.md#update_custom_agast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **companies_company_id_agasts_code_get**
> CustomAgast companies_company_id_agasts_code_get(company_id, code, parent=parent)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyAGASTApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Agast Code
parent = 'parent_example' # str | Agast parent code, means that this agast is a specialization of parent agast  (optional)

try: 
    api_response = api_instance.companies_company_id_agasts_code_get(company_id, code, parent=parent)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyAGASTApi->companies_company_id_agasts_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Agast Code | 
 **parent** | **str**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_agasts_get**
> list[InlineResponse2001] companies_company_id_agasts_get(company_id, text=text, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, agast=agast, parent=parent)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyAGASTApi()
company_id = 'company_id_example' # str | Company ID
text = 'text_example' # str | Text query (optional)
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)
agast = 'agast_example' # str | Custom Agast Code (optional)
parent = 'parent_example' # str | Agast Code (optional)

try: 
    api_response = api_instance.companies_company_id_agasts_get(company_id, text=text, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort, agast=agast, parent=parent)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyAGASTApi->companies_company_id_agasts_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **text** | **str**| Text query | [optional] 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 
 **agast** | **str**| Custom Agast Code | [optional] 
 **parent** | **str**| Agast Code | [optional] 

### Return type

[**list[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_agast**
> InlineResponse201 create_custom_agast(company_id, body, text=text)

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
api_instance = swagger_client.CompanyAGASTApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.CustomAgast() # CustomAgast | Transaction Message
text = 'text_example' # str | Text query (optional)

try: 
    # Create custom agast for one company
    api_response = api_instance.create_custom_agast(company_id, body, text=text)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyAGASTApi->create_custom_agast: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **str**| Text query | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_agast**
> delete_agast(company_id, code)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyAGASTApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Agast Code

try: 
    api_instance.delete_agast(company_id, code)
except ApiException as e:
    print("Exception when calling CompanyAGASTApi->delete_agast: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_agast**
> update_custom_agast(company_id, code, body)

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
api_instance = swagger_client.CompanyAGASTApi()
company_id = 'company_id_example' # str | Company ID
code = 'code_example' # str | Agast Code
body = swagger_client.CustomAgast() # CustomAgast | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_custom_agast(company_id, code, body)
except ApiException as e:
    print("Exception when calling CompanyAGASTApi->update_custom_agast: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **code** | **str**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

