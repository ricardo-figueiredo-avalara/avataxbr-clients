package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseTransactionOut (
  header: PurchaseHeaderOut,
lines: List[PurchaseLinesOut],
calculatedTaxSummary: PurchaseCalculatedTaxSummaryForService,
processingInfo: ProcessingInfo
)
