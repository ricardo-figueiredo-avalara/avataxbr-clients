# AvaTaxBrazil.TaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**TaxType**](TaxType.md) |  | 
**taxModel** | **String** | Tax can be calculated by rate or by quantity | 
**rate** | **Number** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srvAmount** | **Number** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantityUnidBase** | **String** |  | [optional] 
**specializationType** | **String** |  | [optional] 


<a name="TaxModelEnum"></a>
## Enum: TaxModelEnum


* `rate` (value: `"rate"`)

* `srf` (value: `"srf"`)




<a name="SpecializationTypeEnum"></a>
## Enum: SpecializationTypeEnum


* `basic` (value: `"basic"`)

* `monophase` (value: `"monophase"`)

* `taxSubstitution` (value: `"taxSubstitution"`)




