# DetailsCalculatedTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **str** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **str** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **str** | Type of jurisdiction | [optional] 
**tax_type** | **str** | Tax identificator | [optional] 
**rate_type** | **str** | Name of configuration rate | [optional] 
**scenario** | **str** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **float** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **float** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **float** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **str** | This string is required if is exempt | [optional] 
**significant_locations** | **list[str]** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **str** | This string with type of rule | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

