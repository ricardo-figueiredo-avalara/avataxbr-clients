# WWW::SwaggerClient::Object::PurchaseCalculatedTaxSummaryForService

## Load the model package
```perl
use WWW::SwaggerClient::Object::PurchaseCalculatedTaxSummaryForService;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_of_lines** | **int** | Count of lines | [optional] 
**subtotal** | **double** | sum of all line tax attribute | [optional] 
**total_tax** | **double** | sum of all line lineAmount attribute | [optional] 
**grand_total** | **double** | sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute | [optional] 
**tax_by_type** | [**PurchaseCalculatedTaxSummaryForServiceTaxByType**](PurchaseCalculatedTaxSummaryForServiceTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


