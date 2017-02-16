package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IssConfByCity (
  cityCode: Long,  // City Code (IBGE)
name: Option[String],
state: Option[StateEnum],
issWhDestOtherCities: Option[Boolean],
issWhDestSameCity: Option[Boolean],
issWhOriginUnregSeller: Option[Boolean],
serviceList: Option[List[IssConfServiceList]]
)
