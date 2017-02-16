# PurchaseLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **int** | This string is a unique identifier for this line in the transaction | [optional] 
**item_code** | **str** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**number_of_items** | **float** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**line_amount** | **float** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] 
**item_description** | **str** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] 
**line_taxed_discount** | **float** | Conditional discount | [optional] 
**line_untaxed_discount** | **float** | Unconditional discount | [optional] 
**use_type** | **str** | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39;  | [optional] 
**tax_deductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


