# IO.Swagger.Model.CalculatedTaxSummaryForGoods
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberOfLines** | **int?** | Count of lines | [optional] 
**TaxedDiscount** | **double?** | sum of all line taxed discounts | [optional] 
**UntaxedDiscount** | **double?** | sum of all line untaxed discounts | [optional] 
**Subtotal** | **double?** | sum of all line lineAmount attribute | [optional] 
**TotalTax** | **double?** | sum of all line tax attribute | [optional] 
**GrandTotal** | **double?** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute | [optional] 
**TaxByType** | [**CalculatedTaxSummaryForGoodsTaxByType**](CalculatedTaxSummaryForGoodsTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

