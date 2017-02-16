package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesTransactionIn (
  header: SalesHeaderIn,
lines: List[SalesLinesIn]
)
