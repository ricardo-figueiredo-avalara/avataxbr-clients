# AvaTaxBrazil.DetailsCalculatedTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdictionName** | **String** | Jurisdiction used for calctax amount | [optional] 
**jurisdictionType** | **String** | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | [optional] 
**taxType** | **String** | Tax identificator | [optional] 
**rateType** | **String** | Name of configuration rate | [optional] 
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotalTaxable** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **Number** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemptionCode** | **String** | This string is required if is exempt | [optional] 
**significantLocations** | **[String]** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**taxRuleType** | **String** | This string with type of rule | [optional] 


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum


* `City` (value: `"City"`)

* `State` (value: `"State"`)

* `Country` (value: `"Country"`)




<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum


* `icms` (value: `"icms"`)

* `icmsSt` (value: `"icmsSt"`)

* `icmsStSd` (value: `"icmsStSd"`)

* `icmsPartOwn` (value: `"icmsPartOwn"`)

* `icmsPartDest` (value: `"icmsPartDest"`)

* `icmsDifaFCP` (value: `"icmsDifaFCP"`)

* `icmsDifaDest` (value: `"icmsDifaDest"`)

* `icmsDifaRemet` (value: `"icmsDifaRemet"`)

* `icmsRf` (value: `"icmsRf"`)

* `icmsDeson` (value: `"icmsDeson"`)

* `icmsCredsn` (value: `"icmsCredsn"`)

* `pis` (value: `"pis"`)

* `pisSt` (value: `"pisSt"`)

* `cofins` (value: `"cofins"`)

* `cofinsSt` (value: `"cofinsSt"`)

* `ipi` (value: `"ipi"`)

* `ipiReturned` (value: `"ipiReturned"`)

* `ii` (value: `"ii"`)

* `iof` (value: `"iof"`)

* `aproxtribState` (value: `"aproxtribState"`)

* `aproxtribFed` (value: `"aproxtribFed"`)

* `aproxtrib` (value: `"aproxtrib"`)




<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum


* `SELLER` (value: `"SELLER"`)

* `BUYER` (value: `"BUYER"`)

* `TRANSACTION` (value: `"TRANSACTION"`)

* `ITEM` (value: `"ITEM"`)

* `TAX` (value: `"TAX"`)




