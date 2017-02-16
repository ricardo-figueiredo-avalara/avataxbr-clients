
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
USE_OR_CONSUMPTION | &quot;use or consumption&quot;
RESALE | &quot;resale&quot;
AGRICULTURAL_PRODUCTION | &quot;agricultural production&quot;
PRODUCTION | &quot;production&quot;
USE_OR_CONSUMPTION_ON_BUSINESS_ESTABLISHMENT | &quot;use or consumption on business establishment&quot;
USE_OR_CONSUMPTION_ON_TRANSPORTER_SERVICE_ESTABLISHMENT | &quot;use or consumption on transporter service establishment&quot;
USE_OR_CONSUMPTION_ON_COMMUNICATION_SERVICE_ESTABLISHMENT | &quot;use or consumption on communication service establishment&quot;
USE_OR_CONSUMPTION_ON_DEMAND_BY_CONTRACT | &quot;use or consumption on demand by contract&quot;
USE_OR_CONSUMPTION_ON_ENERGY_SUPPLIER_ESTABLISHMENT | &quot;use or consumption on energy supplier establishment&quot;
USE_OR_CONSUMPTION_OF_FUEL_TRANSACTION_TYPE_EXPORTATION | &quot;use or consumption of fuel transaction type exportation&quot;
FIXED_ASSETS | &quot;fixed assets&quot;
RESALE_EXPORT | &quot;resale export&quot;
RESALE_ICMS_EXEMPT | &quot;resale icms exempt&quot;
RESALE_BUYER_UNDER_THE_SAME_ICMSST_TAX_RULE | &quot;resale buyer under the same icmsSt tax rule&quot;
TRANSPORT_OF_GOODS_THAT_DON_T_NEED_INVOICE_NF_ | &quot;transport of goods that don&#39;t need invoice (nf)&quot;



