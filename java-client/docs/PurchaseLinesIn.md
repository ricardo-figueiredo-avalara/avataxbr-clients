
# PurchaseLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Integer** | This string is a unique identifier for this line in the transaction |  [optional]
**itemCode** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**numberOfItems** | **Double** | This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 |  [optional]
**lineAmount** | **Double** | This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems). |  [optional]
**itemDescription** | **String** | This string captures the description of the item represented by this line, will be used LC 116 |  [optional]
**lineTaxedDiscount** | **Double** | Conditional discount |  [optional]
**lineUntaxedDiscount** | **Double** | Unconditional discount |  [optional]
**useType** | [**UseTypeEnum**](#UseTypeEnum) | Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39;  |  [optional]
**taxDeductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  |  [optional]


<a name="UseTypeEnum"></a>
## Enum: UseTypeEnum
Name | Value
---- | -----
RESALE | &quot;resale&quot;
PRODUCTION | &quot;production&quot;
USE_OR_CONSUMPTION | &quot;use or consumption&quot;
FIXED_ASSETS | &quot;fixed assets&quot;



