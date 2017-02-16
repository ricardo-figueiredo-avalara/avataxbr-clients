# IO.Swagger.Model.InstallmentComplete
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentNumber** | **string** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**Date** | **DateTime?** | installment Due Date | 
**GrossValue** | **double?** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**NetValue** | **double?** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**WithholdingMode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**WithholdingPIS** | **double?** | calculated PIS-RF tax for this payment | [optional] 
**WithholdingCOFINS** | **double?** | calculated COFINS-RF tax for this payment | [optional] 
**WithholdingCSLL** | **double?** | calculated CSLL-RF tax for this payment | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

