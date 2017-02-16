package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PaymentTransactionOut (
  header: Option[PayRecHeader],
lines: Option[List[PayRecLinesOut]],
calculatedTaxSummary: Option[PayRecCalculatedTaxSummaryForService],
processingInfo: Option[ProcessingInfo]
)
