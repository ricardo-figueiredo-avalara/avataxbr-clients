# WWW::SwaggerClient::Object::CustomTaxTypeRate

## Load the model package
```perl
use WWW::SwaggerClient::Object::CustomTaxTypeRate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_type** | [**TaxType**](TaxType.md) |  | 
**tax_model** | **string** | Tax can be calculated by rate or by quantity | 
**rate** | **double** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srv_amount** | **double** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantity_unid_base** | **string** |  | [optional] 
**specialization_type** | **string** |  | [optional] 
**exemption_reason_code** | **string** | UUID Reference to an item in the LegalReason store.  | [optional] 
**custom_exemption_reason_description** | **string** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  | [optional] 
**company_id** | [**UUID**](UUID.md) | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


