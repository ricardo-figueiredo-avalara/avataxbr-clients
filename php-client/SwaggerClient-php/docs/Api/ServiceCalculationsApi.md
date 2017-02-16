# Swagger\Client\ServiceCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservicePaymentPost**](ServiceCalculationsApi.md#calculationsservicePaymentPost) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservicePurchasePost**](ServiceCalculationsApi.md#calculationsservicePurchasePost) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsserviceReceiptPost**](ServiceCalculationsApi.md#calculationsserviceReceiptPost) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsserviceSalesPost**](ServiceCalculationsApi.md#calculationsserviceSalesPost) | **POST** /calculations?service-sales | Calculation Method


# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet($authorization, $account_id, $company_code, $transaction_type, $document_code)

Retrieve transactions

Retrieve a single transaction

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)
$document_code = "document_code_example"; // string | Document Code

try {
    $api_instance->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet($authorization, $account_id, $company_code, $transaction_type, $document_code);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |
 **document_code** | **string**| Document Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost($authorization, $account_id, $company_code, $transaction_type, $document_code)

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)
$document_code = "document_code_example"; // string | Document Code

try {
    $api_instance->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost($authorization, $account_id, $company_code, $transaction_type, $document_code);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |
 **document_code** | **string**| Document Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet($authorization, $account_id, $company_code, $transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)

try {
    $api_instance->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet($authorization, $account_id, $company_code, $transaction_type);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsservicePaymentPost**
> \Swagger\Client\Model\PaymentTransactionOut calculationsservicePaymentPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\PaymentTransactionIn(); // \Swagger\Client\Model\PaymentTransactionIn | Transaction Message

try {
    $result = $api_instance->calculationsservicePaymentPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsservicePaymentPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\PaymentTransactionIn**](../Model/\Swagger\Client\Model\PaymentTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\PaymentTransactionOut**](../Model/PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsservicePurchasePost**
> \Swagger\Client\Model\PurchaseTransactionOut calculationsservicePurchasePost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\PurchaseTransactionIn(); // \Swagger\Client\Model\PurchaseTransactionIn | Transaction Message

try {
    $result = $api_instance->calculationsservicePurchasePost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsservicePurchasePost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\PurchaseTransactionIn**](../Model/\Swagger\Client\Model\PurchaseTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\PurchaseTransactionOut**](../Model/PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsserviceReceiptPost**
> \Swagger\Client\Model\ReceiptTransactionOut calculationsserviceReceiptPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\ReceiptTransactionIn(); // \Swagger\Client\Model\ReceiptTransactionIn | Transaction Message

try {
    $result = $api_instance->calculationsserviceReceiptPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsserviceReceiptPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\ReceiptTransactionIn**](../Model/\Swagger\Client\Model\ReceiptTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\ReceiptTransactionOut**](../Model/ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **calculationsserviceSalesPost**
> \Swagger\Client\Model\SalesTransactionOut calculationsserviceSalesPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceCalculationsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\SalesTransactionIn(); // \Swagger\Client\Model\SalesTransactionIn | Transaction Message

try {
    $result = $api_instance->calculationsserviceSalesPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceCalculationsApi->calculationsserviceSalesPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\SalesTransactionIn**](../Model/\Swagger\Client\Model\SalesTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\SalesTransactionOut**](../Model/SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

