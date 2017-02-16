package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseHeaderOut_payment (
  terms: Option[PaymentTerms],
withholdingMode: Option[WithholdingMode],
installments: Option[List[InstallmentComplete]]  // installments
)
