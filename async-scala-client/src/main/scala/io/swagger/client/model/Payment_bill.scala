package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Payment_bill (
  nFat: Option[String],  // Bill identifier
vOrig: Option[Double],  // Orignal value
vDiscount: Option[Double],  // Discount
vNet: Option[Double]  // Net value
)
