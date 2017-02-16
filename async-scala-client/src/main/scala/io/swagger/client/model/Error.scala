package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Error (
  code: Option[Integer],
message: String,
field: Option[String],
value: Option[String],
in: Option[String]
)
