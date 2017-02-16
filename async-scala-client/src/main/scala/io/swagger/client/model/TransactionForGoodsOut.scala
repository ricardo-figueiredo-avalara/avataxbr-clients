package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TransactionForGoodsOut (
  header: Option[HeaderForGoods],
lines: Option[List[LineForGoods]],
calculatedTaxSummary: Option[CalculatedTaxSummaryForGoods],
processingInfo: Option[ProcessingInfo]
)
