package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SefazInvoiceStatus (
  code: Option[String],
desc: Option[String],
protocol: Option[String],
rec: Option[String],
date: Option[DateTime],
environment: Option[String],  // - &#39;1&#39; # Ambiente de Produção - &#39;2&#39; # Ambiente de Homologação 
appVersion: Option[String]
)
