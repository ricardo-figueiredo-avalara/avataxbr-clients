# LineForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineCode** | **int32** | This string is a unique identifier for this line in the transaction | [default to null]
**ItemCode** | **string** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | [default to null]
**AvalaraGoodsAndServicesType** | **string** | AGAST CODE for itemCode | [optional] [default to null]
**NumberOfItems** | **float64** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to 1.0]
**ReturnedPercentageAmount** | **float64** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] [default to null]
**LineUnitPrice** | **float64** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] [default to null]
**LineAmount** | **float64** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | [default to null]
**ItemDescription** | **string** | This string captures the description of the item represented by this line, will be used LC 116 | [default to null]
**LineTaxedDiscount** | **float64** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] [default to null]
**LineUntaxedDiscount** | **float64** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] [default to null]
**UseType** | **string** | This is a enumeration folowing table | [default to null]
**ProcessScenario** | **string** | Reference to process configurantion of this transaction, See ProcessScenario definition | [default to null]
**Cfop** | **int32** | Fiscal Operation Code of transport service | [optional] [default to null]
**HasStockImpact** | **bool** | return if this transaction has stock impact for this process or CFOP | [optional] [default to null]
**HasFinantialImpact** | **bool** | return if this transaction has finantial impact for this process or CFOP | [optional] [default to null]
**FreightAmount** | **float64** | This decimal 13 integers and 0 to 2 decimals | [optional] [default to null]
**InsuranceAmount** | **float64** | This decimal 13 integers and 0 to 2 decimals | [optional] [default to null]
**OtherCostAmount** | **float64** | This decimal 13 integers and 0 to 2 decimals | [optional] [default to null]
**IndTotType** | **bool** | The item value will compose the invoice total value. | [optional] [default to null]
**OrderNumber** | **string** | order number, information used for B2B control process | [optional] [default to null]
**OrderItemNumber** | **string** | number of the item from order number, information used for B2B control process | [optional] [default to null]
**FciNumber** | **string** | Gloal Unique identifier (Importation form) | [optional] [default to null]
**RecopiNumber** | **string** | RECOPI number | [optional] [default to null]
**InfAdProd** | **string** | additional information about product (referenced standard, complementary info, etc) | [optional] [default to null]
**Vehicle** | [**Vehicle**](Vehicle.md) |  | [optional] [default to null]
**Medicine** | [**Medicine**](Medicine.md) |  | [optional] [default to null]
**Weapon** | [**Weapon**](Weapon.md) |  | [optional] [default to null]
**Fuel** | [**Fuel**](Fuel.md) |  | [optional] [default to null]
**EntityIsIcmsSubstitute** | **bool** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] [default to null]
**IsTransportIcmsWithheld** | **bool** | Inform that this item has ICMS withheld for transport value service. | [optional] [default to null]
**IcmsTaxRelief** | [**LineForGoodsIcmsTaxRelief**](LineForGoods_icmsTaxRelief.md) |  | [optional] [default to null]
**Export** | [**[]LineForGoodsExport**](LineForGoods_export.md) | Exportation detail | [optional] [default to null]
**Di** | [**[]LineForGoodsDi**](LineForGoods_di.md) | Import declaration | [optional] [default to null]
**CalculatedTax** | [**LineForGoodsCalculatedTax**](LineForGoods_calculatedTax.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

