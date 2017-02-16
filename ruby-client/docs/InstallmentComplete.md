# SwaggerClient::InstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_number** | **String** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**date** | **DateTime** | installment Due Date | 
**gross_value** | **Float** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**net_value** | **Float** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**withholding_mode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**withholding_pis** | **Float** | calculated PIS-RF tax for this payment | [optional] 
**withholding_cofins** | **Float** | calculated COFINS-RF tax for this payment | [optional] 
**withholding_csll** | **Float** | calculated CSLL-RF tax for this payment | [optional] 


