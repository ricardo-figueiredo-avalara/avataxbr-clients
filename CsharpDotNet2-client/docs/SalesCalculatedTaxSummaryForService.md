# IO.Swagger.Model.SalesCalculatedTaxSummaryForService
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberOfLines** | **int?** | Count of lines | [optional] [default to null]
**Subtotal** | **double?** | sum of all line tax attribute | [optional] [default to null]
**TotalTax** | **double?** | sum of all line lineAmount attribute | [optional] [default to null]
**GrandTotal** | **double?** | sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute | [optional] [default to null]
**TaxByType** | [**SalesCalculatedTaxSummaryForServiceTaxByType**](SalesCalculatedTaxSummaryForServiceTaxByType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

