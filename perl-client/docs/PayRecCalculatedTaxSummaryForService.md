# WWW::SwaggerClient::Object::PayRecCalculatedTaxSummaryForService

## Load the model package
```perl
use WWW::SwaggerClient::Object::PayRecCalculatedTaxSummaryForService;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_of_lines** | **int** | Count of lines | [optional] 
**subtotal** | **double** | Sum of grossvalues | [optional] 
**total_tax** | **double** | Sum of all withholding values | [optional] 
**grand_total** | **double** | Sum all NetValues | [optional] 
**pcc_withholding_modes** | [**ARRAY[PccWithholdingMode]**](PccWithholdingMode.md) |  | [optional] 
**tax_by_type** | [**PayRecCalculatedTaxSummaryForServiceTaxByType**](PayRecCalculatedTaxSummaryForServiceTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


