package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SefazPostOut (
  key: Option[String],
documentCode: Option[String],
status: Option[SefazInvoiceStatus]
)
