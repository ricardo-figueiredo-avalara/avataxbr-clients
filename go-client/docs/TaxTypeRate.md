# TaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaxType** | [**TaxType**](TaxType.md) |  | [default to null]
**TaxModel** | **string** | Tax can be calculated by rate or by quantity | [default to null]
**Rate** | **float64** | Specific tax rate ex 3.5 (3.5%) | [optional] [default to null]
**SrvAmount** | **float64** | Specific tax rate ex 3.5 (3.5%) | [optional] [default to null]
**QuantityUnidBase** | **string** |  | [optional] [default to null]
**SpecializationType** | **string** |  | [optional] [default to null]
**ExemptionReasonCode** | **string** | UUID Reference to an item in the LegalReason store.  | [optional] [default to null]
**CustomExemptionReasonDescription** | **string** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] [default to null]
**Withholding** | [**TaxTypeRateWithholding**](TaxTypeRate_withholding.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


