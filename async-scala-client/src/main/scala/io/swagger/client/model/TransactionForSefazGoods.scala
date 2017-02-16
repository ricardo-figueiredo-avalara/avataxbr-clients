package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TransactionForSefazGoods (
  header: Option[HeaderForGoods],
lines: Option[List[LineForSefazGoods]],
calculatedTaxSummary: Option[CalculatedTaxSummaryForGoods]
)
