# InstallmentComplete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_number** | **str** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**date** | **datetime** | installment Due Date | 
**gross_value** | **float** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**net_value** | **float** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**withholding_mode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**withholding_pis** | **float** | calculated PIS-RF tax for this payment | [optional] 
**withholding_cofins** | **float** | calculated COFINS-RF tax for this payment | [optional] 
**withholding_csll** | **float** | calculated CSLL-RF tax for this payment | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


