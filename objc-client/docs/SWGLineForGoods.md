# SWGLineForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **NSNumber*** | This string is a unique identifier for this line in the transaction | 
**itemCode** | **NSString*** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**avalaraGoodsAndServicesType** | **NSString*** | AGAST CODE for itemCode | [optional] 
**numberOfItems** | **NSNumber*** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to @1.0]
**returnedPercentageAmount** | **NSNumber*** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] 
**lineUnitPrice** | **NSNumber*** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] 
**lineAmount** | **NSNumber*** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**itemDescription** | **NSString*** | This string captures the description of the item represented by this line, will be used LC 116 | 
**lineTaxedDiscount** | **NSNumber*** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**lineUntaxedDiscount** | **NSNumber*** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**useType** | **NSString*** | This is a enumeration folowing table | 
**processScenario** | **NSString*** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**cfop** | **NSNumber*** | Fiscal Operation Code of transport service | [optional] 
**hasStockImpact** | **NSNumber*** | return if this transaction has stock impact for this process or CFOP | [optional] 
**hasFinantialImpact** | **NSNumber*** | return if this transaction has finantial impact for this process or CFOP | [optional] 
**freightAmount** | **NSNumber*** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**insuranceAmount** | **NSNumber*** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**otherCostAmount** | **NSNumber*** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**indTotType** | **NSNumber*** | The item value will compose the invoice total value. | [optional] [default to @1]
**orderNumber** | **NSString*** | order number, information used for B2B control process | [optional] 
**orderItemNumber** | **NSString*** | number of the item from order number, information used for B2B control process | [optional] 
**fciNumber** | **NSString*** | Gloal Unique identifier (Importation form) | [optional] 
**recopiNumber** | **NSString*** | RECOPI number | [optional] 
**infAdProd** | **NSString*** | additional information about product (referenced standard, complementary info, etc) | [optional] 
**vehicle** | [**SWGVehicle***](SWGVehicle.md) |  | [optional] 
**medicine** | [**SWGMedicine***](SWGMedicine.md) |  | [optional] 
**weapon** | [**SWGWeapon***](SWGWeapon.md) |  | [optional] 
**fuel** | [**SWGFuel***](SWGFuel.md) |  | [optional] 
**entityIsIcmsSubstitute** | **NSNumber*** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] 
**isTransportIcmsWithheld** | **NSNumber*** | Inform that this item has ICMS withheld for transport value service. | [optional] 
**icmsTaxRelief** | [**SWGLineForGoodsIcmsTaxRelief***](SWGLineForGoodsIcmsTaxRelief.md) |  | [optional] 
**export** | [**NSArray&lt;SWGLineForGoodsExport&gt;***](SWGLineForGoodsExport.md) | Exportation detail | [optional] 
**di** | [**NSArray&lt;SWGLineForGoodsDi&gt;***](SWGLineForGoodsDi.md) | Import declaration | [optional] 
**calculatedTax** | [**SWGLineForGoodsCalculatedTax***](SWGLineForGoodsCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


