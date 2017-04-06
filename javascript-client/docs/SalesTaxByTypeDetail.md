# AvaTaxBrazil.SalesTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdictionName** | **String** | Jurisdiction used for calctax amount | [optional] 
**jurisdictionType** | **String** | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | [optional] 
**taxType** | **String** | Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39;  | [optional] 
**rateType** | **String** | Name of configuration rate | [optional] 
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotalTaxable** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **Number** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemptionCode** | **String** | This string is required if is exempt | [optional] 
**significantLocations** | **[String]** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**taxRuleType** | **String** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum


* `City` (value: `"City"`)

* `State` (value: `"State"`)

* `Country` (value: `"Country"`)




<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum


* `aproxtribCity` (value: `"aproxtribCity"`)

* `aproxtribFed` (value: `"aproxtribFed"`)

* `pis` (value: `"pis"`)

* `pisRf` (value: `"pisRf"`)

* `cofins` (value: `"cofins"`)

* `cofinsRf` (value: `"cofinsRf"`)

* `csll` (value: `"csll"`)

* `csllRf` (value: `"csllRf"`)

* `irrf` (value: `"irrf"`)

* `inss` (value: `"inss"`)

* `inssRf` (value: `"inssRf"`)

* `iss` (value: `"iss"`)

* `issRf` (value: `"issRf"`)

* `irpj` (value: `"irpj"`)




<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum


* `SELLER` (value: `"SELLER"`)

* `BUYER` (value: `"BUYER"`)

* `TRANSACTION` (value: `"TRANSACTION"`)

* `ITEM` (value: `"ITEM"`)

* `TAX` (value: `"TAX"`)




