
# DetailsCalculatedTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller |  [optional]
**jurisdictionName** | **String** | Jurisdiction used for calctax amount |  [optional]
**jurisdictionType** | [**JurisdictionTypeEnum**](#JurisdictionTypeEnum) | Type of jurisdiction |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax identificator |  [optional]
**rateType** | **String** | Name of configuration rate |  [optional]
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. |  [optional]
**subtotalTaxable** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base |  [optional]
**rate** | **Double** | This decimal captures the tax rate for this tax.3.00 (3%) |  [optional]
**tax** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax |  [optional]
**exemptionCode** | **String** | This string is required if is exempt |  [optional]
**significantLocations** | **List&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address |  [optional]
**taxRuleType** | [**TaxRuleTypeEnum**](#TaxRuleTypeEnum) | This string with type of rule |  [optional]


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----
CITY | &quot;city&quot;
STATE | &quot;state&quot;
COUNTRY | &quot;country&quot;


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
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
APROXTRIBSTATE | &quot;aproxtribState&quot;
APROXTRIBFED | &quot;aproxtribFed&quot;
APROXTRIB | &quot;aproxtrib&quot;


<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum
Name | Value
---- | -----
SELLER | &quot;SELLER&quot;
BUYER | &quot;BUYER&quot;
TRANSACTION | &quot;TRANSACTION&quot;
ITEM | &quot;ITEM&quot;
TAX | &quot;TAX&quot;



