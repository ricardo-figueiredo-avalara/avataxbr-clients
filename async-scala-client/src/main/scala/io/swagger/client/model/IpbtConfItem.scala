package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IpbtConfItem (
  state: Option[StateEnum],
federalTax: Option[Double],
importTax: Option[Double],
stateTax: Option[Double],
cityTax: Option[Double],
source: Option[String]
)
