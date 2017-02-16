# WWW::SwaggerClient::Object::PurchaseTaxByTypeDetail

## Load the model package
```perl
use WWW::SwaggerClient::Object::PurchaseTaxByTypeDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_type** | **string** | This string captures the applicable location type. Location used for calc. Buyer or Seller | [optional] 
**jurisdiction_name** | **string** | Jurisdiction used for calctax amount | [optional] 
**jurisdiction_type** | **string** | Type of jurisdiction - &#39;city&#39; - &#39;state&#39; - &#39;country&#39;  | [optional] 
**tax_type** | **string** | Tax identificator - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inssAr&#39; - &#39;inssRf&#39; - &#39;issRf&#39;  | [optional] 
**rate_type** | **string** | Name of configuration rate | [optional] 
**scenario** | **string** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. | [optional] 
**subtotal_taxable** | **double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base | [optional] 
**subtotal_exempt** | **double** | This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. | [optional] 
**rate** | **double** | This decimal captures the tax rate for this tax.3.00 (3%) | [optional] 
**tax** | **double** | This decimal captures how much of the lineAmount was taxable by this tax | [optional] 
**exemption_code** | **string** | This string is required if is exempt | [optional] 
**significant_locations** | **ARRAY[string]** | This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address | [optional] 
**tax_rule_type** | **string** | This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39;  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


