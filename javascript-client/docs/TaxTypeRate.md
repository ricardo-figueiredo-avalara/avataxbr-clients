# Br16Api.TaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**TaxType**](TaxType.md) |  | 
**taxModel** | **String** | Tax can be calculated by rate or by quantity | 
**rate** | **Number** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srvAmount** | **Number** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantityUnidBase** | **String** |  | [optional] 
**specializationType** | **String** |  | [optional] 
**exemptionReasonCode** | **String** | UUID Reference to an item in the LegalReason store.  | [optional] 
**customExemptionReasonDescription** | **String** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  | [optional] 


<a name="TaxModelEnum"></a>
## Enum: TaxModelEnum


* `rate` (value: `"rate"`)

* `srf` (value: `"srf"`)




<a name="SpecializationTypeEnum"></a>
## Enum: SpecializationTypeEnum


* `basic` (value: `"basic"`)

* `monophase` (value: `"monophase"`)

* `taxSubstitution` (value: `"taxSubstitution"`)




