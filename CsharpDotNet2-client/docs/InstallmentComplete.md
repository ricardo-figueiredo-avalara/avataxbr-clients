# IO.Swagger.Model.InstallmentComplete
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentNumber** | **string** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | [default to null]
**Date** | **DateTime?** | installment Due Date | [default to null]
**GrossValue** | **double?** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | [default to null]
**NetValue** | **double?** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] [default to null]
**WithholdingMode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] [default to null]
**WithholdingPIS** | **double?** | calculated PIS-RF tax for this payment | [optional] [default to null]
**WithholdingCOFINS** | **double?** | calculated COFINS-RF tax for this payment | [optional] [default to null]
**WithholdingCSLL** | **double?** | calculated CSLL-RF tax for this payment | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

