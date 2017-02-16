package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Fuel (
  prodANPCode: String,
perMixGN: Option[Double],  // percentage of natural gas (GLP)
authorizationCodeCODIF: Option[String],
quantityOnRoomTemperature: Option[Double],  // This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
stateCodeOfUndUser: StateEnum,  // state where fuel was used
cide: Option[Fuel_cide],
pumpNumber: Option[Fuel_pumpNumber]
)
