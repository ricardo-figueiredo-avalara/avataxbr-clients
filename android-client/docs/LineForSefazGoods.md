
# LineForSefazGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Integer** | This string is a unique identifier for this line in the transaction | 
**itemCode** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**avalaraGoodsAndServicesType** | **String** | AGAST CODE for itemCode |  [optional]
**numberOfItems** | **Double** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | 
**returnedPercentageAmount** | **Double** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 |  [optional]
**lineUnitPrice** | **Double** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. |  [optional]
**lineAmount** | **Double** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**itemDescription** | **String** | This string captures the description of the item represented by this line, will be used LC 116 | 
**lineTaxedDiscount** | **Double** | Discount conditional, This decimal 13 integers and 0 to 2 decimals |  [optional]
**lineUntaxedDiscount** | **Double** | discount unconditional, This decimal 13 integers and 0 to 2 decimals |  [optional]
**useType** | [**UseTypeEnum**](#UseTypeEnum) | This is a enumeration folowing table | 
**processScenario** | **String** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**cfop** | **Integer** | Fiscal Operation Code of transport service |  [optional]
**hasStockImpact** | **Boolean** | return if this transaction has stock impact for this process or CFOP |  [optional]
**hasFinantialImpact** | **Boolean** | return if this transaction has finantial impact for this process or CFOP |  [optional]
**freightAmount** | **Double** | This decimal 13 integers and 0 to 2 decimals |  [optional]
**insuranceAmount** | **Double** | This decimal 13 integers and 0 to 2 decimals |  [optional]
**otherCostAmount** | **Double** | This decimal 13 integers and 0 to 2 decimals |  [optional]
**indTotType** | **Boolean** | The item value will compose the invoice total value. |  [optional]
**orderNumber** | **String** | order number, information used for B2B control process |  [optional]
**orderItemNumber** | **String** | number of the item from order number, information used for B2B control process |  [optional]
**fciNumber** | **String** | Gloal Unique identifier (Importation form) |  [optional]
**recopiNumber** | **String** | RECOPI number |  [optional]
**infAdProd** | **String** | additional information about product (referenced standard, complementary info, etc) |  [optional]
**vehicle** | [**Vehicle**](Vehicle.md) |  |  [optional]
**medicine** | [**Medicine**](Medicine.md) |  |  [optional]
**weapon** | [**Weapon**](Weapon.md) |  |  [optional]
**fuel** | [**Fuel**](Fuel.md) |  |  [optional]
**entityIsIcmsSubstitute** | **Boolean** | Inform that for this item the Entity referenced is ICMS Substitute |  [optional]
**isTransportIcmsWithheld** | **Boolean** | Inform that this item has ICMS withheld for transport value service. |  [optional]
**icmsTaxRelief** | [**LineForGoodsIcmsTaxRelief**](LineForGoodsIcmsTaxRelief.md) |  |  [optional]
**export** | [**List&lt;LineForGoodsExport&gt;**](LineForGoodsExport.md) | Exportation detail |  [optional]
**di** | [**List&lt;LineForGoodsDi&gt;**](LineForGoodsDi.md) | Import declaration |  [optional]
**calculatedTax** | [**LineForGoodsCalculatedTax**](LineForGoodsCalculatedTax.md) |  |  [optional]
**extend** | [**AgastExtendForSefaz**](AgastExtendForSefaz.md) |  |  [optional]


<a name="UseTypeEnum"></a>
## Enum: UseTypeEnum
Name | Value
---- | -----



