
# TaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**TaxType**](TaxType.md) |  | 
**taxModel** | [**TaxModelEnum**](#TaxModelEnum) | Tax can be calculated by rate or by quantity | 
**rate** | **Double** | Specific tax rate ex 3.5 (3.5%) |  [optional]
**srvAmount** | **Double** | Specific tax rate ex 3.5 (3.5%) |  [optional]
**quantityUnidBase** | **String** |  |  [optional]
**specializationType** | [**SpecializationTypeEnum**](#SpecializationTypeEnum) |  |  [optional]
**exemptionReasonCode** | **String** | UUID Reference to an item in the LegalReason store.  |  [optional]
**customExemptionReasonDescription** | **String** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  |  [optional]
**withholding** | [**TaxTypeRateWithholding**](TaxTypeRateWithholding.md) |  |  [optional]


<a name="TaxModelEnum"></a>
## Enum: TaxModelEnum
Name | Value
---- | -----
RATE | &quot;rate&quot;
SRF | &quot;srf&quot;


<a name="SpecializationTypeEnum"></a>
## Enum: SpecializationTypeEnum
Name | Value
---- | -----
BASIC | &quot;basic&quot;
MONOPHASE | &quot;monophase&quot;
TAXSUBSTITUTION | &quot;taxSubstitution&quot;



