# SWGDetailsCalculatedTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **NSString*** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdictionName** | **NSString*** | Jurisdiction used for calctax amount | [optional] 
**jurisdictionType** | **NSString*** | Type of jurisdiction | [optional] 
**taxType** | **NSString*** | Tax identificator | [optional] 
**rateType** | **NSString*** | Name of configuration rate | [optional] 
**scenario** | **NSString*** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotalTaxable** | **NSNumber*** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **NSNumber*** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **NSNumber*** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemptionCode** | **NSString*** | This string is required if is exempt | [optional] 
**significantLocations** | **NSArray&lt;NSString*&gt;*** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**taxRuleType** | **NSString*** | This string with type of rule | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

