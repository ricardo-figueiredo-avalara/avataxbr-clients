# AvaTaxBrazil.LegalReasonTaxScope

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | **String** | This is the Tax Type to apply legal messages. - &#39;NONE&#39; - &#39;INSS&#39; - &#39;IRRF&#39; - &#39;IRPJ&#39; - &#39;PIS&#39; - &#39;COFINS&#39; - &#39;CSLL&#39; - &#39;IPI&#39; - &#39;ICMS&#39; - &#39;II&#39; - &#39;IOF&#39; - &#39;ISS&#39; - &#39;APROXTOTALTAX&#39;  | 
**specializedTaxType** | **String** | These are the specific tax types to which a message may be applied - &#39;icms&#39; - &#39;icmsSt&#39; - &#39;icmsStSd&#39; - &#39;icmsPartOwn&#39; - &#39;icmsPartDest&#39; - &#39;icmsDifaFCP&#39; - &#39;icmsDifaDest&#39; - &#39;icmsDifaRemet&#39; - &#39;icmsRf&#39; - &#39;icmsDeson&#39; - &#39;icmsCredsn&#39; - &#39;pis&#39; - &#39;pisSt&#39; - &#39;cofins&#39; - &#39;cofinsSt&#39; - &#39;ipi&#39; - &#39;ipiReturned&#39; - &#39;ii&#39; - &#39;iof&#39;  | [optional] 
**jurisdictionType** | **String** | Types of jurisdiction - &#39;NONE&#39; - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | 
**jurisdictionIbgeCode** | **String** | Code to identify the Jurisdiction | [optional] 


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum


* `NONE` (value: `"NONE"`)

* `INSS` (value: `"INSS"`)

* `IRRF` (value: `"IRRF"`)

* `IRPJ` (value: `"IRPJ"`)

* `PIS` (value: `"PIS"`)

* `COFINS` (value: `"COFINS"`)

* `CSLL` (value: `"CSLL"`)

* `IPI` (value: `"IPI"`)

* `ICMS` (value: `"ICMS"`)

* `II` (value: `"II"`)

* `IOF` (value: `"IOF"`)

* `ISS` (value: `"ISS"`)

* `APROXTOTALTAX` (value: `"APROXTOTALTAX"`)




<a name="SpecializedTaxTypeEnum"></a>
## Enum: SpecializedTaxTypeEnum


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




<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum


* `NONE` (value: `"NONE"`)

* `City` (value: `"City"`)

* `State` (value: `"State"`)

* `Country` (value: `"Country"`)




