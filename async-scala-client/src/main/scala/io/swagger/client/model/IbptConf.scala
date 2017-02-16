package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IbptConf (
  code: Option[String],  // IBPT Code
description: Option[String],
list: Option[List[IpbtConfItem]]
)
