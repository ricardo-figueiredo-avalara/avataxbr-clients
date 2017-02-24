# SalesTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LocationType** | **string** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] [default to null]
**JurisdictionName** | **string** | Jurisdiction used for calctax amount | [optional] [default to null]
**JurisdictionType** | **string** | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | [optional] [default to null]
**TaxType** | **string** | Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39;  | [optional] [default to null]
**RateType** | **string** | Name of configuration rate | [optional] [default to null]
**Scenario** | **string** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] [default to null]
**SubtotalTaxable** | **float64** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] [default to null]
**SubtotalExempt** | **float64** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] [default to null]
**Rate** | **float64** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] [default to null]
**Tax** | **float64** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] [default to null]
**ExemptionCode** | **string** | This string is required if is exempt | [optional] [default to null]
**SignificantLocations** | **[]string** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] [default to null]
**TaxRuleType** | **string** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


