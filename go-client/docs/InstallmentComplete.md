# InstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentNumber** | **string** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | [default to null]
**Date** | [**time.Time**](time.Time.md) | installment Due Date | [default to null]
**GrossValue** | **float64** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | [default to null]
**NetValue** | **float64** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] [default to null]
**WithholdingMode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] [default to null]
**WithholdingPIS** | **float64** | calculated PIS-RF tax for this payment | [optional] [default to null]
**WithholdingCOFINS** | **float64** | calculated COFINS-RF tax for this payment | [optional] [default to null]
**WithholdingCSLL** | **float64** | calculated CSLL-RF tax for this payment | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


