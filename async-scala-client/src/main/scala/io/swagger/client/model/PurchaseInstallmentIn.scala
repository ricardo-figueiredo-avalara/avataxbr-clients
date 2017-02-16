package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseInstallmentIn (
  documentNumber: String,  // DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
date: Date,  // installment, Due Date
grossValue: Double  // Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
)
