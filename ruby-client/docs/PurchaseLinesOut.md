# SwaggerClient::PurchaseLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **Integer** | This string is a unique identifier for this line in the transaction | [optional] 
**item_code** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**number_of_items** | **Float** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**line_amount** | **Float** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] 
**item_description** | **String** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] 
**line_taxed_discount** | **Float** | Conditional discount | [optional] 
**line_untaxed_discount** | **Float** | Unconditional discount | [optional] 
**use_type** | **String** | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39;  | [optional] 
**tax_deductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  | [optional] 
**avalara_goods_and_services_type** | **String** | AGAST CODE for itemCode | [optional] 
**line_net_value** | **Float** | This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding. | [optional] 
**calculated_tax** | [**PurchaseCalculatedTax**](PurchaseCalculatedTax.md) |  | [optional] 


