package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods (
  lineCode: Integer,  // This string is a unique identifier for this line in the transaction
itemCode: String,  // This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
avalaraGoodsAndServicesType: Option[String],  // AGAST CODE for itemCode
numberOfItems: Double,  // This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
returnedPercentageAmount: Option[Double],  // when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00
lineUnitPrice: Option[Double],  // This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
lineAmount: Double,  // In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax).
itemDescription: String,  // This string captures the description of the item represented by this line, will be used LC 116
lineTaxedDiscount: Option[Double],  // Discount conditional, This decimal 13 integers and 0 to 2 decimals
lineUntaxedDiscount: Option[Double],  // discount unconditional, This decimal 13 integers and 0 to 2 decimals
useType: String,  // This is a enumeration folowing table
processScenario: String,  // Reference to process configurantion of this transaction, See ProcessScenario definition
cfop: Option[Integer],  // Fiscal Operation Code of transport service
hasStockImpact: Option[Boolean],  // return if this transaction has stock impact for this process or CFOP
hasFinantialImpact: Option[Boolean],  // return if this transaction has finantial impact for this process or CFOP
freightAmount: Option[Double],  // This decimal 13 integers and 0 to 2 decimals
insuranceAmount: Option[Double],  // This decimal 13 integers and 0 to 2 decimals
otherCostAmount: Option[Double],  // This decimal 13 integers and 0 to 2 decimals
indTotType: Option[Boolean],  // The item value will compose the invoice total value.
orderNumber: Option[String],  // order number, information used for B2B control process
orderItemNumber: Option[String],  // number of the item from order number, information used for B2B control process
fciNumber: Option[String],  // Gloal Unique identifier (Importation form)
recopiNumber: Option[String],  // RECOPI number
infAdProd: Option[String],  // additional information about product (referenced standard, complementary info, etc)
vehicle: Option[Vehicle],
medicine: Option[Medicine],
weapon: Option[Weapon],
fuel: Option[Fuel],
entityIsIcmsSubstitute: Option[Boolean],  // Inform that for this item the Entity referenced is ICMS Substitute
isTransportIcmsWithheld: Option[Boolean],  // Inform that this item has ICMS withheld for transport value service.
icmsTaxRelief: Option[LineForGoods_icmsTaxRelief],
export: Option[List[LineForGoods_export]],  // Exportation detail
di: Option[List[LineForGoods_di]],  // Import declaration
calculatedTax: Option[LineForGoods_calculatedTax]
)
