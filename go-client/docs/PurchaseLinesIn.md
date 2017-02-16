# PurchaseLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineCode** | **int32** | This string is a unique identifier for this line in the transaction | [optional] [default to null]
**ItemCode** | **string** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | [default to null]
**NumberOfItems** | **float64** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**LineAmount** | **float64** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] [default to null]
**ItemDescription** | **string** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] [default to null]
**LineTaxedDiscount** | **float64** | Conditional discount | [optional] [default to null]
**LineUntaxedDiscount** | **float64** | Unconditional discount | [optional] [default to null]
**UseType** | **string** | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39;  | [optional] [default to null]
**TaxDeductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOut_taxDeductions.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


