# Swagger\Client\CompanyFilesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdNfseCertificateDelete**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateDelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificateGet**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateGet) | **GET** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePost**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePost) | **POST** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePut**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePut) | **PUT** /companies/{companyId}/nfse-certificate | 


# **companiesCompanyIdNfseCertificateDelete**
> companiesCompanyIdNfseCertificateDelete($company_id, $company_id2)



Deletes a company file store.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyFilesApi();
$company_id = "company_id_example"; // string | Company ID
$company_id2 = "company_id_example"; // string | Company ID

try {
    $api_instance->companiesCompanyIdNfseCertificateDelete($company_id, $company_id2);
} catch (Exception $e) {
    echo 'Exception when calling CompanyFilesApi->companiesCompanyIdNfseCertificateDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **company_id2** | **string**| Company ID |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdNfseCertificateGet**
> companiesCompanyIdNfseCertificateGet($company_id, $company_id2, $peek)



Gets an existing NFSe certificate file for this company.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyFilesApi();
$company_id = "company_id_example"; // string | Company ID
$company_id2 = "company_id_example"; // string | Company ID
$peek = 3.4; // float | Use this parameter to check the existence of the file without downloading it.

try {
    $api_instance->companiesCompanyIdNfseCertificateGet($company_id, $company_id2, $peek);
} catch (Exception $e) {
    echo 'Exception when calling CompanyFilesApi->companiesCompanyIdNfseCertificateGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **company_id2** | **string**| Company ID |
 **peek** | **float**| Use this parameter to check the existence of the file without downloading it. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdNfseCertificatePost**
> \Swagger\Client\Model\InlineResponse2002 companiesCompanyIdNfseCertificatePost($company_id, $body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyFilesApi();
$company_id = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\Body3(); // \Swagger\Client\Model\Body3 | Content

try {
    $result = $api_instance->companiesCompanyIdNfseCertificatePost($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\Body3**](../Model/\Swagger\Client\Model\Body3.md)| Content |

### Return type

[**\Swagger\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **companiesCompanyIdNfseCertificatePut**
> \Swagger\Client\Model\InlineResponse2002 companiesCompanyIdNfseCertificatePut($company_id, $company_id2, $body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CompanyFilesApi();
$company_id = "company_id_example"; // string | Company ID
$company_id2 = "company_id_example"; // string | Company ID
$body = new \Swagger\Client\Model\Body2(); // \Swagger\Client\Model\Body2 | Content

try {
    $result = $api_instance->companiesCompanyIdNfseCertificatePut($company_id, $company_id2, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company ID |
 **company_id2** | **string**| Company ID |
 **body** | [**\Swagger\Client\Model\Body2**](../Model/\Swagger\Client\Model\Body2.md)| Content |

### Return type

[**\Swagger\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

