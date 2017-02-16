package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Transport_volumes (
  qVol: Option[String],  // Quantity of packages transported
specie: Option[String],  // package type
brand: Option[String],  // brand
volumeNumeration: Option[String],  // packages numeration
netWeight: Option[Double],  // net weight using Kg
grossWeight: Option[Double],  // gross weight using Kg
seal: Option[List[String]]
)
