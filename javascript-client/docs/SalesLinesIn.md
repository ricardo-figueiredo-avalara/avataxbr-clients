# Br16Api.SalesLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Number** | This string is a unique identifier for this line in the transaction | [optional] 
**itemCode** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**numberOfItems** | **Number** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [optional] [default to 1.0]
**lineAmount** | **Number** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). | [optional] 
**itemDescription** | **String** | This string captures the description of the item represented by this line, will be used LC 116 | [optional] 
**lineTaxedDiscount** | **Number** | Conditional discount | [optional] 
**lineUntaxedDiscount** | **Number** | Unconditional discount | [optional] 
**taxDeductions** | [**SalesLinesInTaxDeductions**](SalesLinesInTaxDeductions.md) |  | [optional] 


