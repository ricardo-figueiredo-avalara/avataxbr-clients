package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class VehicleID (
  licensePlate: String,
stateCode: StateEnum,
rtnc: Option[String]  // Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
)
