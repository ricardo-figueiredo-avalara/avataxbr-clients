package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class DefaultLocations (
  entity: Option[EntityLocation],
company: Option[EntityLocation],
transporter: Option[EntityLocation],
deliveryLocation: Option[EntityLocation],
pickupLocation: Option[EntityLocation]
)
