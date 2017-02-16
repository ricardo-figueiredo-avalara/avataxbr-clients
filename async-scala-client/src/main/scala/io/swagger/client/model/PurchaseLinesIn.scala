package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseLinesIn (
  lineCode: Option[Integer],  // This string is a unique identifier for this line in the transaction
itemCode: String,  // This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
numberOfItems: Option[Double],  // This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
lineAmount: Option[Double],  // This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).
itemDescription: Option[String],  // This string captures the description of the item represented by this line, will be used LC 116
lineTaxedDiscount: Option[Double],  // Conditional discount
lineUntaxedDiscount: Option[Double],  // Unconditional discount
useType: Option[String],  // Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39; 
taxDeductions: Option[SalesLinesOut_taxDeductions]
)
