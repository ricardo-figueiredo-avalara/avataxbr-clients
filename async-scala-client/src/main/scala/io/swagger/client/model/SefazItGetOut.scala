package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SefazItGetOut (
  key: Option[String],  // Invoice Access Key
xml: Option[String],  // XML Signed
status: Option[SefazInvoiceStatus]
)
