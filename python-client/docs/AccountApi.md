# swagger_client.AccountApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accounts_account_id_companies_get**](AccountApi.md#accounts_account_id_companies_get) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**create_account_company**](AccountApi.md#create_account_company) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


# **accounts_account_id_companies_get**
> list[AccountCompany] accounts_account_id_companies_get(account_id)

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
api_instance = swagger_client.AccountApi()
account_id = 'account_id_example' # str | Account ID

try: 
    # Retrieve Companies by account
    api_response = api_instance.accounts_account_id_companies_get(account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->accounts_account_id_companies_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| Account ID | 

### Return type

[**list[AccountCompany]**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_company**
> InlineResponse201 create_account_company(account_id, body)

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
api_instance = swagger_client.AccountApi()
account_id = 'account_id_example' # str | Account ID
body = swagger_client.Body() # Body | Company Code

try: 
    # Create company and your data configuration
    api_response = api_instance.create_account_company(account_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->create_account_company: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

