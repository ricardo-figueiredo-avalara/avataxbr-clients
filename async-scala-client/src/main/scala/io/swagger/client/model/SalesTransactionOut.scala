package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesTransactionOut (
  header: SalesHeaderOut,
lines: List[SalesLinesOut],
calculatedTaxSummary: SalesCalculatedTaxSummaryForService,
processingInfo: ProcessingInfo
)
