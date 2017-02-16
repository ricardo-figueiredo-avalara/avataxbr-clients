package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesHeaderIn_payment (
  terms: Option[PaymentTerms],
installments: Option[List[SalesInstallmentIn]]  // installments
)
