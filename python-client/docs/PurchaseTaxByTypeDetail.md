# PurchaseTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **str** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **str** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **str** | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  | [optional] 
**tax_type** | **str** | Tax identificator - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inssAr&#39; - &#39;inssRf&#39; - &#39;issRf&#39;  | [optional] 
**rate_type** | **str** | Name of configuration rate | [optional] 
**scenario** | **str** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **float** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**subtotal_exempt** | **float** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] 
**rate** | **float** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **float** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **str** | This string is required if is exempt | [optional] 
**significant_locations** | **list[str]** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **str** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


