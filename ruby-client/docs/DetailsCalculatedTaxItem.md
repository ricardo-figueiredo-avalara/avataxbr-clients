# SwaggerClient::DetailsCalculatedTaxItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **String** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **String** | Type of jurisdiction | [optional] 
**tax_type** | **String** | Tax identificator | [optional] 
**rate_type** | **String** | Name of configuration rate | [optional] 
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **Float** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**rate** | **Float** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **Float** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **String** | This string is required if is exempt | [optional] 
**significant_locations** | **Array&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **String** | This string with type of rule | [optional] 
**source** | **Integer** |  | [optional] 
**cst_b** | **String** |  | [optional] 
**mod_bc** | **String** |  | [optional] 
**cst** | **String** |  | [optional] 


