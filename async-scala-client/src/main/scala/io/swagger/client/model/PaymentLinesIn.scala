package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PaymentLinesIn (
  lineCode: Option[Integer],  // Installment number in this document
lineType: Option[String],
itemCode: String,  // Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
itemDescription: Option[String],  // Free description about this payment
itemDocNumber: Option[String],  // Installment number, when paid AS IS
lineUntaxedPenality: Option[Double],  // Penalty, usually because paid after due date
lineUntaxedDiscount: Option[Double],  // unconditional discounts
lineNetValue: Option[Double]  // Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
)
