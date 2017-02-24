
# DetailsCalculatedTaxItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller |  [optional]
**jurisdictionName** | **String** | Jurisdiction used for calctax amount |  [optional]
**jurisdictionType** | [**JurisdictionTypeEnum**](#JurisdictionTypeEnum) | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax identificator |  [optional]
**rateType** | **String** | Name of configuration rate |  [optional]
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. |  [optional]
**subtotalTaxable** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base |  [optional]
**rate** | **Double** | This decimal captures the tax rate for this tax.3.00 (3%) |  [optional]
**tax** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax |  [optional]
**exemptionCode** | **String** | This string is required if is exempt |  [optional]
**significantLocations** | **List&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address |  [optional]
**taxRuleType** | [**TaxRuleTypeEnum**](#TaxRuleTypeEnum) | This string with type of rule |  [optional]
**source** | **Integer** |  |  [optional]
**cstB** | **String** |  |  [optional]
**modBC** | **String** |  |  [optional]
**cst** | **String** |  |  [optional]


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----


<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum
Name | Value
---- | -----



