# Br16Api.PurchaseTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdictionName** | **String** | Jurisdiction used for calctax amount | [optional] 
**jurisdictionType** | **String** | Type of jurisdiction - &#39;city&#39; - &#39;state&#39; - &#39;country&#39;  | [optional] 
**taxType** | **String** | Tax identificator - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inssAr&#39; - &#39;inssRf&#39; - &#39;issRf&#39;  | [optional] 
**rateType** | **String** | Name of configuration rate | [optional] 
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotalTaxable** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**subtotalExempt** | **Number** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] 
**rate** | **Number** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **Number** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemptionCode** | **String** | This string is required if is exempt | [optional] 
**significantLocations** | **[String]** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**taxRuleType** | **String** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum


* `city` (value: `"city"`)

* `state` (value: `"state"`)

* `country` (value: `"country"`)




<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum


* `pis` (value: `"pis"`)

* `pisRf` (value: `"pisRf"`)

* `cofins` (value: `"cofins"`)

* `cofinsRf` (value: `"cofinsRf"`)

* `csll` (value: `"csll"`)

* `csllRf` (value: `"csllRf"`)

* `irrf` (value: `"irrf"`)

* `inssAr` (value: `"inssAr"`)

* `inssRf` (value: `"inssRf"`)

* `issRf` (value: `"issRf"`)




<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum


* `SELLER` (value: `"SELLER"`)

* `BUYER` (value: `"BUYER"`)

* `TRANSACTION` (value: `"TRANSACTION"`)

* `ITEM` (value: `"ITEM"`)

* `TAX` (value: `"TAX"`)



