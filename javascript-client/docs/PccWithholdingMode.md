# Br16Api.PccWithholdingMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) | [optional] 
**totalTax** | **Number** | this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf | [optional] 
**pisRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**cofinsRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**csllRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 


<a name="TypeEnum"></a>
## Enum: TypeEnum


* `CSRF` (value: `"CSRF"`)

* `individual` (value: `"individual"`)




