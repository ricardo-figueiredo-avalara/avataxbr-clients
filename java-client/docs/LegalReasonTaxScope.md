
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
NONE | &quot;NONE&quot;
INSS | &quot;INSS&quot;
IRRF | &quot;IRRF&quot;
IRPJ | &quot;IRPJ&quot;
PIS | &quot;PIS&quot;
COFINS | &quot;COFINS&quot;
CSLL | &quot;CSLL&quot;
IPI | &quot;IPI&quot;
ICMS | &quot;ICMS&quot;
II | &quot;II&quot;
IOF | &quot;IOF&quot;
ISS | &quot;ISS&quot;
APROXTOTALTAX | &quot;APROXTOTALTAX&quot;


<a name="SpecializedTaxTypeEnum"></a>
## Enum: SpecializedTaxTypeEnum
Name | Value
---- | -----
ICMS | &quot;icms&quot;
ICMSST | &quot;icmsSt&quot;
ICMSSTSD | &quot;icmsStSd&quot;
ICMSPARTOWN | &quot;icmsPartOwn&quot;
ICMSPARTDEST | &quot;icmsPartDest&quot;
ICMSDIFAFCP | &quot;icmsDifaFCP&quot;
ICMSDIFADEST | &quot;icmsDifaDest&quot;
ICMSDIFAREMET | &quot;icmsDifaRemet&quot;
ICMSRF | &quot;icmsRf&quot;
ICMSDESON | &quot;icmsDeson&quot;
ICMSCREDSN | &quot;icmsCredsn&quot;
PIS | &quot;pis&quot;
PISST | &quot;pisSt&quot;
COFINS | &quot;cofins&quot;
COFINSST | &quot;cofinsSt&quot;
IPI | &quot;ipi&quot;
IPIRETURNED | &quot;ipiReturned&quot;
II | &quot;ii&quot;
IOF | &quot;iof&quot;


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
CITY | &quot;City&quot;
STATE | &quot;State&quot;
COUNTRY | &quot;Country&quot;



