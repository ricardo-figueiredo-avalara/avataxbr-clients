# SWGCalculatedTaxSummaryForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfLines** | **NSNumber*** | Count of lines | [optional] 
**taxedDiscount** | **NSNumber*** | sum of all line taxed discounts | [optional] 
**untaxedDiscount** | **NSNumber*** | sum of all line untaxed discounts | [optional] 
**subtotal** | **NSNumber*** | sum of all line lineAmount attribute | [optional] 
**totalTax** | **NSNumber*** | sum of all line tax attribute | [optional] 
**grandTotal** | **NSNumber*** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute | [optional] 
**taxByType** | [**SWGCalculatedTaxSummaryForGoodsTaxByType***](SWGCalculatedTaxSummaryForGoodsTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


