package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class InstallmentComplete (
  documentNumber: String,  // DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
date: DateTime,  // installment Due Date
grossValue: Double,  // Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
netValue: Option[Double],  // net amount due for this installment, grossValue - ∑ (withhold amounts)
withholdingMode: Option[WithholdingMode],  // Inform if this payment is subject to Pis, Cofins or CSLL
withholdingPIS: Option[Double],  // calculated PIS-RF tax for this payment
withholdingCOFINS: Option[Double],  // calculated COFINS-RF tax for this payment
withholdingCSLL: Option[Double]  // calculated CSLL-RF tax for this payment
)
