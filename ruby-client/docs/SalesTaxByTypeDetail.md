# SwaggerClient::SalesTaxByTypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **String** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **String** | Type of jurisdiction - &#39;city&#39; - &#39;state&#39; - &#39;country&#39;  | [optional] 
**tax_type** | **String** | Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39;  | [optional] 
**rate_type** | **String** | Name of configuration rate | [optional] 
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **Float** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**subtotal_exempt** | **Float** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] 
**rate** | **Float** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **Float** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **String** | This string is required if is exempt | [optional] 
**significant_locations** | **Array&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **String** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 


