# IO.Swagger.Model.PurchaseCalculatedTaxSummaryForService
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberOfLines** | **int?** | Count of lines | [optional] 
**Subtotal** | **double?** | sum of all line tax attribute | [optional] 
**TotalTax** | **double?** | sum of all line lineAmount attribute | [optional] 
**GrandTotal** | **double?** | sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute | [optional] 
**TaxByType** | [**PurchaseCalculatedTaxSummaryForServiceTaxByType**](PurchaseCalculatedTaxSummaryForServiceTaxByType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

