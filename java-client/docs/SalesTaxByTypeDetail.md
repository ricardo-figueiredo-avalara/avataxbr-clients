
# SalesTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller |  [optional]
**jurisdictionName** | **String** | Jurisdiction used for calctax amount |  [optional]
**jurisdictionType** | [**JurisdictionTypeEnum**](#JurisdictionTypeEnum) | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39;  |  [optional]
**rateType** | **String** | Name of configuration rate |  [optional]
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. |  [optional]
**subtotalTaxable** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base |  [optional]
**rate** | **Double** | This decimal captures the tax rate for this tax.3.00 (3%) |  [optional]
**tax** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax |  [optional]
**exemptionCode** | **String** | This string is required if is exempt |  [optional]
**significantLocations** | **List&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address |  [optional]
**taxRuleType** | [**TaxRuleTypeEnum**](#TaxRuleTypeEnum) | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  |  [optional]


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----
CITY | &quot;City&quot;
STATE | &quot;State&quot;
COUNTRY | &quot;Country&quot;


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
APROXTRIBCITY | &quot;aproxtribCity&quot;
APROXTRIBFED | &quot;aproxtribFed&quot;
PIS | &quot;pis&quot;
PISRF | &quot;pisRf&quot;
COFINS | &quot;cofins&quot;
COFINSRF | &quot;cofinsRf&quot;
CSLL | &quot;csll&quot;
CSLLRF | &quot;csllRf&quot;
IRRF | &quot;irrf&quot;
INSS | &quot;inss&quot;
INSSRF | &quot;inssRf&quot;
ISS | &quot;iss&quot;
ISSRF | &quot;issRf&quot;
IRPJ | &quot;irpj&quot;


<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum
Name | Value
---- | -----
SELLER | &quot;SELLER&quot;
BUYER | &quot;BUYER&quot;
TRANSACTION | &quot;TRANSACTION&quot;
ITEM | &quot;ITEM&quot;
TAX | &quot;TAX&quot;



