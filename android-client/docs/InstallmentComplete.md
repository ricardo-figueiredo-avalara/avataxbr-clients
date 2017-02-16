
# InstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentNumber** | **String** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**date** | [**Date**](Date.md) | installment Due Date | 
**grossValue** | **Double** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**netValue** | **Double** | net amount due for this installment, grossValue - ∑ (withhold amounts) |  [optional]
**withholdingMode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL |  [optional]
**withholdingPIS** | **Double** | calculated PIS-RF tax for this payment |  [optional]
**withholdingCOFINS** | **Double** | calculated COFINS-RF tax for this payment |  [optional]
**withholdingCSLL** | **Double** | calculated CSLL-RF tax for this payment |  [optional]



