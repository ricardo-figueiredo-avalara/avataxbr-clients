# SWGInstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentNumber** | **NSString*** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**date** | **NSDate*** | installment Due Date | 
**grossValue** | **NSNumber*** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**netValue** | **NSNumber*** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**withholdingMode** | [**SWGWithholdingMode***](SWGWithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**withholdingPIS** | **NSNumber*** | calculated PIS-RF tax for this payment | [optional] 
**withholdingCOFINS** | **NSNumber*** | calculated COFINS-RF tax for this payment | [optional] 
**withholdingCSLL** | **NSNumber*** | calculated CSLL-RF tax for this payment | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


