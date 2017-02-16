# PurchaseLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **int** | This string is a unique identifier for this line in the transaction | [optional] 
**item_code** | **string** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**number_of_items** | **double** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**line_amount** | **double** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] 
**item_description** | **string** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] 
**line_taxed_discount** | **double** | Conditional discount | [optional] 
**line_untaxed_discount** | **double** | Unconditional discount | [optional] 
**use_type** | **string** | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39; | [optional] 
**tax_deductions** | [**\Swagger\Client\Model\SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  | [optional] 
**avalara_goods_and_services_type** | **string** | AGAST CODE for itemCode | [optional] 
**line_net_value** | **double** | This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding. | [optional] 
**calculated_tax** | [**\Swagger\Client\Model\PurchaseCalculatedTax**](PurchaseCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


