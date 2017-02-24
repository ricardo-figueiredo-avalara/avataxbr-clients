# AvaTaxBrazil.LineForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Number** | This string is a unique identifier for this line in the transaction | 
**itemCode** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**avalaraGoodsAndServicesType** | **String** | AGAST CODE for itemCode | [optional] 
**numberOfItems** | **Number** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to 1.0]
**returnedPercentageAmount** | **Number** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] 
**lineUnitPrice** | **Number** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] 
**lineAmount** | **Number** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**itemDescription** | **String** | This string captures the description of the item represented by this line, will be used LC 116 | 
**lineTaxedDiscount** | **Number** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**lineUntaxedDiscount** | **Number** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**useType** | **String** | This is a enumeration folowing table | 
**processScenario** | **String** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**cfop** | **Number** | Fiscal Operation Code of transport service | [optional] 
**hasStockImpact** | **Boolean** | return if this transaction has stock impact for this process or CFOP | [optional] 
**hasFinantialImpact** | **Boolean** | return if this transaction has finantial impact for this process or CFOP | [optional] 
**freightAmount** | **Number** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**insuranceAmount** | **Number** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**otherCostAmount** | **Number** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**indTotType** | **Boolean** | The item value will compose the invoice total value. | [optional] [default to true]
**orderNumber** | **String** | order number, information used for B2B control process | [optional] 
**orderItemNumber** | **String** | number of the item from order number, information used for B2B control process | [optional] 
**fciNumber** | **String** | Gloal Unique identifier (Importation form) | [optional] 
**recopiNumber** | **String** | RECOPI number | [optional] 
**infAdProd** | **String** | additional information about product (referenced standard, complementary info, etc) | [optional] 
**vehicle** | [**Vehicle**](Vehicle.md) |  | [optional] 
**medicine** | [**Medicine**](Medicine.md) |  | [optional] 
**weapon** | [**Weapon**](Weapon.md) |  | [optional] 
**fuel** | [**Fuel**](Fuel.md) |  | [optional] 
**entityIsIcmsSubstitute** | **Boolean** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] 
**isTransportIcmsWithheld** | **Boolean** | Inform that this item has ICMS withheld for transport value service. | [optional] 
**icmsTaxRelief** | [**LineForGoodsIcmsTaxRelief**](LineForGoodsIcmsTaxRelief.md) |  | [optional] 
**_export** | [**[LineForGoodsExport]**](LineForGoodsExport.md) | Exportation detail | [optional] 
**di** | [**[LineForGoodsDi]**](LineForGoodsDi.md) | Import declaration | [optional] 
**calculatedTax** | [**LineForGoodsCalculatedTax**](LineForGoodsCalculatedTax.md) |  | [optional] 


<a name="UseTypeEnum"></a>
## Enum: UseTypeEnum


* `use or consumption` (value: `"use or consumption"`)

* `resale` (value: `"resale"`)

* `agricultural production` (value: `"agricultural production"`)

* `production` (value: `"production"`)

* `use or consumption on business establishment` (value: `"use or consumption on business establishment"`)

* `use or consumption on transporter service establishment` (value: `"use or consumption on transporter service establishment"`)

* `use or consumption on communication service establishment` (value: `"use or consumption on communication service establishment"`)

* `use or consumption on demand by contract` (value: `"use or consumption on demand by contract"`)

* `use or consumption on energy supplier establishment` (value: `"use or consumption on energy supplier establishment"`)

* `use or consumption of fuel transaction type exportation` (value: `"use or consumption of fuel transaction type exportation"`)

* `fixed assets` (value: `"fixed assets"`)

* `resale export` (value: `"resale export"`)

* `resale icms exempt` (value: `"resale icms exempt"`)

* `resale buyer under the same icmsSt tax rule` (value: `"resale buyer under the same icmsSt tax rule"`)

* `transport of goods that don&#39;t need invoice (nf)` (value: `"transport of goods that don't need invoice (nf)"`)




