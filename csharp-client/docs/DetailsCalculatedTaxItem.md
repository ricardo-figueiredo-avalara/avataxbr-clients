# IO.Swagger.Model.DetailsCalculatedTaxItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LocationType** | **string** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**JurisdictionName** | **string** | Jurisdiction used for calctax amount | [optional] 
**JurisdictionType** | **string** | Type of jurisdiction | [optional] 
**TaxType** | **string** | Tax identificator | [optional] 
**RateType** | **string** | Name of configuration rate | [optional] 
**Scenario** | **string** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**SubtotalTaxable** | **double?** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**Rate** | **double?** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**Tax** | **double?** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**ExemptionCode** | **string** | This string is required if is exempt | [optional] 
**SignificantLocations** | **List&lt;string&gt;** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**TaxRuleType** | **string** | This string with type of rule | [optional] 
**Source** | **int?** |  | [optional] 
**CstB** | **string** |  | [optional] 
**ModBC** | **string** |  | [optional] 
**Cst** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

