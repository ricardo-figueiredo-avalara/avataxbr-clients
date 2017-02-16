# IO.Swagger.Model.LineForGoods
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineCode** | **int?** | This string is a unique identifier for this line in the transaction | 
**ItemCode** | **string** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**AvalaraGoodsAndServicesType** | **string** | AGAST CODE for itemCode | [optional] 
**NumberOfItems** | **double?** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to 1.0]
**ReturnedPercentageAmount** | **double?** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] 
**LineUnitPrice** | **double?** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] 
**LineAmount** | **double?** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**ItemDescription** | **string** | This string captures the description of the item represented by this line, will be used LC 116 | 
**LineTaxedDiscount** | **double?** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**LineUntaxedDiscount** | **double?** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**UseType** | **string** | This is a enumeration folowing table | 
**ProcessScenario** | **string** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**Cfop** | **int?** | Fiscal Operation Code of transport service | [optional] 
**HasStockImpact** | **bool?** | return if this transaction has stock impact for this process or CFOP | [optional] 
**HasFinantialImpact** | **bool?** | return if this transaction has finantial impact for this process or CFOP | [optional] 
**FreightAmount** | **double?** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**InsuranceAmount** | **double?** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**OtherCostAmount** | **double?** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**IndTotType** | **bool?** | The item value will compose the invoice total value. | [optional] [default to true]
**OrderNumber** | **string** | order number, information used for B2B control process | [optional] 
**OrderItemNumber** | **string** | number of the item from order number, information used for B2B control process | [optional] 
**FciNumber** | **string** | Gloal Unique identifier (Importation form) | [optional] 
**RecopiNumber** | **string** | RECOPI number | [optional] 
**InfAdProd** | **string** | additional information about product (referenced standard, complementary info, etc) | [optional] 
**Vehicle** | [**Vehicle**](Vehicle.md) |  | [optional] 
**Medicine** | [**Medicine**](Medicine.md) |  | [optional] 
**Weapon** | [**Weapon**](Weapon.md) |  | [optional] 
**Fuel** | [**Fuel**](Fuel.md) |  | [optional] 
**EntityIsIcmsSubstitute** | **bool?** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] 
**IsTransportIcmsWithheld** | **bool?** | Inform that this item has ICMS withheld for transport value service. | [optional] 
**IcmsTaxRelief** | [**LineForGoodsIcmsTaxRelief**](LineForGoodsIcmsTaxRelief.md) |  | [optional] 
**Export** | [**List&lt;LineForGoodsExport&gt;**](LineForGoodsExport.md) | Exportation detail | [optional] 
**Di** | [**List&lt;LineForGoodsDi&gt;**](LineForGoodsDi.md) | Import declaration | [optional] 
**CalculatedTax** | [**LineForGoodsCalculatedTax**](LineForGoodsCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

