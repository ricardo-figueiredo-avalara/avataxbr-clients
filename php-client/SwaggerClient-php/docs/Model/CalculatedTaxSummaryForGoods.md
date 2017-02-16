# CalculatedTaxSummaryForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_of_lines** | **int** | Count of lines | [optional] 
**taxed_discount** | **double** | sum of all line taxed discounts | [optional] 
**untaxed_discount** | **double** | sum of all line untaxed discounts | [optional] 
**subtotal** | **double** | sum of all line lineAmount attribute | [optional] 
**total_tax** | **double** | sum of all line tax attribute | [optional] 
**grand_total** | **double** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute | [optional] 
**tax_by_type** | [**\Swagger\Client\Model\CalculatedTaxSummaryForGoodsTaxByType**](CalculatedTaxSummaryForGoodsTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


