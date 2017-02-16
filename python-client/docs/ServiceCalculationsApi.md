# swagger_client.ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculations_account_account_id_company_company_code_transaction_type_document_code_get**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculations_account_account_id_company_company_code_transaction_type_get**](ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservice_payment_post**](ServiceCalculationsApi.md#calculationsservice_payment_post) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservice_purchase_post**](ServiceCalculationsApi.md#calculationsservice_purchase_post) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsservice_receipt_post**](ServiceCalculationsApi.md#calculationsservice_receipt_post) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsservice_sales_post**](ServiceCalculationsApi.md#calculationsservice_sales_post) | **POST** /calculations?service-sales | Calculation Method


# **calculations_account_account_id_company_company_code_transaction_type_document_code_get**
> calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code)

Retrieve transactions

Retrieve a single transaction

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)
document_code = 'document_code_example' # str | Document Code

try: 
    # Retrieve transactions
    api_instance.calculations_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **str**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**
> calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization, account_id, company_code, transaction_type, document_code)

Promote a calculation to transaction

Promote a calculation to transaction

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)
document_code = 'document_code_example' # str | Document Code

try: 
    # Promote a calculation to transaction
    api_instance.calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post(authorization, account_id, company_code, transaction_type, document_code)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **str**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculations_account_account_id_company_company_code_transaction_type_get**
> calculations_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)

try: 
    # Retrieve transactions
    api_instance.calculations_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculations_account_account_id_company_company_code_transaction_type_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsservice_payment_post**
> PaymentTransactionOut calculationsservice_payment_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.PaymentTransactionIn() # PaymentTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsservice_payment_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculationsservice_payment_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsservice_purchase_post**
> PurchaseTransactionOut calculationsservice_purchase_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.PurchaseTransactionIn() # PurchaseTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsservice_purchase_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculationsservice_purchase_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsservice_receipt_post**
> ReceiptTransactionOut calculationsservice_receipt_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.ReceiptTransactionIn() # ReceiptTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsservice_receipt_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculationsservice_receipt_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsservice_sales_post**
> SalesTransactionOut calculationsservice_sales_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.SalesTransactionIn() # SalesTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsservice_sales_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceCalculationsApi->calculationsservice_sales_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

