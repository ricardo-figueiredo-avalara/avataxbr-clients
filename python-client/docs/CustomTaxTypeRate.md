# CustomTaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_type** | [**TaxType**](TaxType.md) |  | 
**tax_model** | **str** | Tax can be calculated by rate or by quantity | 
**rate** | **float** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srv_amount** | **float** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantity_unid_base** | **str** |  | [optional] 
**specialization_type** | **str** |  | [optional] 
**exemption_reason_code** | **str** | UUID Reference to an item in the LegalReason store.  | [optional] 
**custom_exemption_reason_description** | **str** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  | [optional] 
**company_id** | **str** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


