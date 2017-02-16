# IO.Swagger.Model.PurchaseLinesOut
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineCode** | **int?** | This string is a unique identifier for this line in the transaction | [optional] 
**ItemCode** | **string** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**NumberOfItems** | **double?** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**LineAmount** | **double?** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] 
**ItemDescription** | **string** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] 
**LineTaxedDiscount** | **double?** | Conditional discount | [optional] 
**LineUntaxedDiscount** | **double?** | Unconditional discount | [optional] 
**UseType** | **string** | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39;  | [optional] 
**TaxDeductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  | [optional] 
**AvalaraGoodsAndServicesType** | **string** | AGAST CODE for itemCode | [optional] 
**LineNetValue** | **double?** | This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding. | [optional] 
**CalculatedTax** | [**PurchaseCalculatedTax**](PurchaseCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

