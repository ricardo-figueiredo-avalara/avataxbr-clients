package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class VehicleTransp (
  _type: Option[String],
automobile: Option[VehicleID],
trailer: Option[List[VehicleID]],  // Trailer
wagon: Option[String],
ferry: Option[String]  // Ferry
)
