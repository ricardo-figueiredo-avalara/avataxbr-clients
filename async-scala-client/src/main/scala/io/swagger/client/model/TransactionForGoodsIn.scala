package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TransactionForGoodsIn (
  header: Option[HeaderForGoods],
lines: Option[List[LineForGoods]]
)
