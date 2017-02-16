# SwaggerClient::TaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_type** | [**TaxType**](TaxType.md) |  | 
**tax_model** | **String** | Tax can be calculated by rate or by quantity | 
**rate** | **Float** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srv_amount** | **Float** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantity_unid_base** | **String** |  | [optional] 
**specialization_type** | **String** |  | [optional] 
**exemption_reason_code** | **String** | UUID Reference to an item in the LegalReason store.  | [optional] 
**custom_exemption_reason_description** | **String** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  | [optional] 


