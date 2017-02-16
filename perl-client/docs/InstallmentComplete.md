# WWW::SwaggerClient::Object::InstallmentComplete

## Load the model package
```perl
use WWW::SwaggerClient::Object::InstallmentComplete;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_number** | **string** | DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction | 
**date** | **DateTime** | installment Due Date | 
**gross_value** | **double** | Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) | 
**net_value** | **double** | net amount due for this installment, grossValue - ∑ (withhold amounts) | [optional] 
**withholding_mode** | [**WithholdingMode**](WithholdingMode.md) | Inform if this payment is subject to Pis, Cofins or CSLL | [optional] 
**withholding_pis** | **double** | calculated PIS-RF tax for this payment | [optional] 
**withholding_cofins** | **double** | calculated COFINS-RF tax for this payment | [optional] 
**withholding_csll** | **double** | calculated CSLL-RF tax for this payment | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


