# SWGSalesTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **NSString*** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdictionName** | **NSString*** | Jurisdiction used for calctax amount | [optional] 
**jurisdictionType** | **NSString*** | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | [optional] 
**taxType** | **NSString*** | Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39;  | [optional] 
**rateType** | **NSString*** | Name of configuration rate | [optional] 
**scenario** | **NSString*** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotalTaxable** | **NSNumber*** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**subtotalExempt** | **NSNumber*** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] 
**rate** | **NSNumber*** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **NSNumber*** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemptionCode** | **NSString*** | This string is required if is exempt | [optional] 
**significantLocations** | **NSArray&lt;NSString*&gt;*** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**taxRuleType** | **NSString*** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


