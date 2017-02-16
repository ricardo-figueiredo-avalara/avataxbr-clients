# DetailsCalculatedTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **string** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **string** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **string** | Type of jurisdiction | [optional] 
**tax_type** | **string** | Tax identificator | [optional] 
**rate_type** | **string** | Name of configuration rate | [optional] 
**scenario** | **string** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **double** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **double** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **string** | This string is required if is exempt | [optional] 
**significant_locations** | **string[]** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **string** | This string with type of rule | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


