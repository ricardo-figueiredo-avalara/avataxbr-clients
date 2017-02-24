# swagger_client.CompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_taxrates_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_get) | **GET** /companies/{companyId}/taxrates | 
[**companies_company_id_taxrates_tax_type_get**](CompanyTaxRatesApi.md#companies_company_id_taxrates_tax_type_get) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**create_custom_taxes**](CompanyTaxRatesApi.md#create_custom_taxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**delete_custom_taxes**](CompanyTaxRatesApi.md#delete_custom_taxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**update_custom_taxes**](CompanyTaxRatesApi.md#update_custom_taxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **companies_company_id_taxrates_get**
> list[CustomTaxTypeRate] companies_company_id_taxrates_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyTaxRatesApi()
company_id = 'company_id_example' # str | Company ID
x_pagination_limit = 10 # int | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
x_pagination_current_page = 1 # int | The current page. Defaults to 1. (optional) (default to 1)
x_pagination_sort = 'x_pagination_sort_example' # str |  (optional)

try: 
    api_response = api_instance.companies_company_id_taxrates_get(company_id, x_pagination_limit=x_pagination_limit, x_pagination_current_page=x_pagination_current_page, x_pagination_sort=x_pagination_sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **x_pagination_limit** | **int**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **x_pagination_current_page** | **int**| The current page. Defaults to 1. | [optional] [default to 1]
 **x_pagination_sort** | **str**|  | [optional] 

### Return type

[**list[CustomTaxTypeRate]**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_taxrates_tax_type_get**
> CustomTaxTypeRate companies_company_id_taxrates_tax_type_get(company_id, tax_type)



This operation return custom agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyTaxRatesApi()
company_id = 'company_id_example' # str | Company ID
tax_type = 'tax_type_example' # str | Tax Type

try: 
    api_response = api_instance.companies_company_id_taxrates_tax_type_get(company_id, tax_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyTaxRatesApi->companies_company_id_taxrates_tax_type_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **tax_type** | **str**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_taxes**
> InlineResponse201 create_custom_taxes(company_id, body)

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
api_instance = swagger_client.CompanyTaxRatesApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.CustomTaxTypeRate() # CustomTaxTypeRate | Transaction Message

try: 
    # Create custom agast for one company
    api_response = api_instance.create_custom_taxes(company_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyTaxRatesApi->create_custom_taxes: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_custom_taxes**
> delete_custom_taxes(company_id, tax_type)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyTaxRatesApi()
company_id = 'company_id_example' # str | Company ID
tax_type = 'tax_type_example' # str | Tax Type

try: 
    api_instance.delete_custom_taxes(company_id, tax_type)
except ApiException as e:
    print("Exception when calling CompanyTaxRatesApi->delete_custom_taxes: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **tax_type** | **str**| Tax Type | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_custom_taxes**
> update_custom_taxes(company_id, tax_type, body)

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
api_instance = swagger_client.CompanyTaxRatesApi()
company_id = 'company_id_example' # str | Company ID
tax_type = 'tax_type_example' # str | Tax Type
body = swagger_client.CustomTaxTypeRate() # CustomTaxTypeRate | Transaction Message

try: 
    # Update custom agast for one company
    api_instance.update_custom_taxes(company_id, tax_type, body)
except ApiException as e:
    print("Exception when calling CompanyTaxRatesApi->update_custom_taxes: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **tax_type** | **str**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

