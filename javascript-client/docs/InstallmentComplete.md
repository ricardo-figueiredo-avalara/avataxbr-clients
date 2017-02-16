# Br16Api.InstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentNumber** | **String** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**_date** | **Date** | installment Due Date | 
**grossValue** | **Number** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**netValue** | **Number** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**withholdingMode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**withholdingPIS** | **Number** | calculated PIS-RF tax for this payment | [optional] 
**withholdingCOFINS** | **Number** | calculated COFINS-RF tax for this payment | [optional] 
**withholdingCSLL** | **Number** | calculated CSLL-RF tax for this payment | [optional] 


