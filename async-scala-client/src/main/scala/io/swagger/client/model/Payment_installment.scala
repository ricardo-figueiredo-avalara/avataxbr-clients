package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Payment_installment (
  documentNumber: Option[String],  // Instalment number identifier
date: Option[Date],  // Installment expiration date
grossValue: Double  // Installment value
)
