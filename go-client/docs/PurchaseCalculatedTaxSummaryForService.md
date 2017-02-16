# PurchaseCalculatedTaxSummaryForService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberOfLines** | **int32** | Count of lines | [optional] [default to null]
**Subtotal** | **float64** | sum of all line tax attribute | [optional] [default to null]
**TotalTax** | **float64** | sum of all line lineAmount attribute | [optional] [default to null]
**GrandTotal** | **float64** | sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute | [optional] [default to null]
**TaxByType** | [**PurchaseCalculatedTaxSummaryForServiceTaxByType**](PurchaseCalculatedTaxSummaryForService_taxByType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


