# swagger_client.CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_get**](CompanyApi.md#companies_get) | **GET** /companies | Retrieve Companies by account
[**create_company**](CompanyApi.md#create_company) | **POST** /companies | Create company and your data configuration
[**delete_account_company**](CompanyApi.md#delete_account_company) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**delete_company**](CompanyApi.md#delete_company) | **DELETE** /companies/{companyId} | 
[**info_company**](CompanyApi.md#info_company) | **GET** /companies/{companyId} | Get company information and your data configuration
[**update_company**](CompanyApi.md#update_company) | **PUT** /companies/{companyId} | Update company information and your data configuration


# **companies_get**
> list[Company] companies_get()

Retrieve Companies by account

Retrieve list companies of one account

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()

try: 
    # Retrieve Companies by account
    api_response = api_instance.companies_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyApi->companies_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Company]**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_company**
> Company create_company(body)

Create company and your data configuration

This method operation create a company for a account 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()
body = swagger_client.Company() # Company | Transaction Message

try: 
    # Create company and your data configuration
    api_response = api_instance.create_company(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyApi->create_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_company**
> delete_account_company(account_id, company_id)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()
account_id = 'account_id_example' # str | Account ID
company_id = 'company_id_example' # str | Company ID

try: 
    api_instance.delete_account_company(account_id, company_id)
except ApiException as e:
    print("Exception when calling CompanyApi->delete_account_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| Account ID | 
 **company_id** | **str**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_company**
> delete_company(company_id, company_id2)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()
company_id = 'company_id_example' # str | Company ID
company_id2 = 'company_id_example' # str | Company ID

try: 
    api_instance.delete_company(company_id, company_id2)
except ApiException as e:
    print("Exception when calling CompanyApi->delete_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **company_id2** | **str**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **info_company**
> Company info_company(company_id)

Get company information and your data configuration

This method operation get a company for a account 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()
company_id = 'company_id_example' # str | Company ID

try: 
    # Get company information and your data configuration
    api_response = api_instance.info_company(company_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyApi->info_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_company**
> update_company(company_id, body)

Update company information and your data configuration

This method operation create a company for a account 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.Company() # Company | Transaction Message

try: 
    # Update company information and your data configuration
    api_instance.update_company(company_id, body)
except ApiException as e:
    print("Exception when calling CompanyApi->update_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

