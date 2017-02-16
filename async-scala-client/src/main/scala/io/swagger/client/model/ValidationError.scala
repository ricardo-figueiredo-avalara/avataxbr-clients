package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ValidationError (
  message: Option[String],
errors: Option[List[Error]]
)
