
# LegalReasonTaxScope

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | This is the Tax Type to apply legal messages. - &#39;NONE&#39; - &#39;INSS&#39; - &#39;IRRF&#39; - &#39;IRPJ&#39; - &#39;PIS&#39; - &#39;COFINS&#39; - &#39;CSLL&#39; - &#39;IPI&#39; - &#39;ICMS&#39; - &#39;II&#39; - &#39;IOF&#39; - &#39;ISS&#39; - &#39;APROXTOTALTAX&#39;  | 
**specializedTaxType** | [**SpecializedTaxTypeEnum**](#SpecializedTaxTypeEnum) | These are the specific tax types to which a message may be applied - &#39;icms&#39; - &#39;icmsSt&#39; - &#39;icmsStSd&#39; - &#39;icmsPartOwn&#39; - &#39;icmsPartDest&#39; - &#39;icmsDifaFCP&#39; - &#39;icmsDifaDest&#39; - &#39;icmsDifaRemet&#39; - &#39;icmsRf&#39; - &#39;icmsDeson&#39; - &#39;icmsCredsn&#39; - &#39;pis&#39; - &#39;pisSt&#39; - &#39;cofins&#39; - &#39;cofinsSt&#39; - &#39;ipi&#39; - &#39;ipiReturned&#39; - &#39;ii&#39; - &#39;iof&#39;  |  [optional]
**jurisdictionType** | [**JurisdictionTypeEnum**](#JurisdictionTypeEnum) | Types of jurisdiction - &#39;NONE&#39; - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | 
**jurisdictionIbgeCode** | **String** | Code to identify the Jurisdiction |  [optional]


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----


<a name="SpecializedTaxTypeEnum"></a>
## Enum: SpecializedTaxTypeEnum
Name | Value
---- | -----


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----



