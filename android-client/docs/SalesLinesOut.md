
# SalesLinesOut

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
**taxDeductions** | [**SalesLinesOutTaxDeductions**](SalesLinesOutTaxDeductions.md) |  |  [optional]
**avalaraGoodsAndServicesType** | **String** | AGAST CODE for itemCode |  [optional]
**lineNetValue** | **Double** | This decimal captures the total cost of this line. In its simplest form lineNetValue &#x3D; (lineAmount - discountTaxable - sum of whithholdings). |  [optional]
**cst** | [**CstEnum**](#CstEnum) | - &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE  |  [optional]
**cstRf** | [**CstRfEnum**](#CstRfEnum) | - &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE  |  [optional]
**calculatedTax** | [**SalesCalculatedTax**](SalesCalculatedTax.md) |  |  [optional]


<a name="CstEnum"></a>
## Enum: CstEnum
Name | Value
---- | -----


<a name="CstRfEnum"></a>
## Enum: CstRfEnum
Name | Value
---- | -----


