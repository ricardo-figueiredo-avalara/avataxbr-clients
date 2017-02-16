# Br16Api.SalesLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avalaraGoodsAndServicesType** | **String** | AGAST CODE for itemCode | [optional] 
**lineNetValue** | **Number** | This decimal captures the total cost of this line. In its simplest form lineNetValue &#x3D; (lineAmount - discountTaxable - sum of whithholdings). | [optional] 
**cst** | **String** | - &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE  | [optional] 
**cstRf** | **String** | - &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE  | [optional] 
**taxDeductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  | [optional] 
**calculatedTax** | [**SalesCalculatedTax**](SalesCalculatedTax.md) |  | [optional] 


<a name="CstEnum"></a>
## Enum: CstEnum


* `01` (value: `"01"`)

* `02` (value: `"02"`)

* `03` (value: `"03"`)

* `04` (value: `"04"`)

* `05` (value: `"05"`)

* `21` (value: `"21"`)

* `22` (value: `"22"`)

* `23` (value: `"23"`)

* `24` (value: `"24"`)

* `25` (value: `"25"`)

* `40` (value: `"40"`)




<a name="CstRfEnum"></a>
## Enum: CstRfEnum


* `61` (value: `"61"`)

* `62` (value: `"62"`)

* `63` (value: `"63"`)

* `64` (value: `"64"`)

* `65` (value: `"65"`)

* `66` (value: `"66"`)

* `67` (value: `"67"`)

* `68` (value: `"68"`)

* `69` (value: `"69"`)

* `70` (value: `"70"`)

* `71` (value: `"71"`)

* `72` (value: `"72"`)




