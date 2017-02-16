# IO.Swagger.Model.TaxTypeRate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaxType** | [**TaxType**](TaxType.md) |  | 
**TaxModel** | **string** | Tax can be calculated by rate or by quantity | 
**Rate** | **double?** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**SrvAmount** | **double?** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**QuantityUnidBase** | **string** |  | [optional] 
**SpecializationType** | **string** |  | [optional] 
**ExemptionReasonCode** | **string** | UUID Reference to an item in the LegalReason store.  | [optional] 
**CustomExemptionReasonDescription** | **string** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**Withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

