package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ReceiptTransactionOut (
  header: PayRecHeader,
lines: List[PayRecLinesOut],
calculatedTaxSummary: PayRecCalculatedTaxSummaryForService,
processingInfo: ProcessingInfo
)
