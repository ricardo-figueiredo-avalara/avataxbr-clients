package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ServiceItemTaxRate (
  taxType: Option[String],
rateType: Option[String],
rate: Option[Double],
isExempt: Option[Boolean],
discount: Option[Double],
zone1: Option[Integer],
zone2: Option[Integer],
period: Option[ServiceItemTaxRate_period],
reason: Option[String],
message: Option[String]
)
