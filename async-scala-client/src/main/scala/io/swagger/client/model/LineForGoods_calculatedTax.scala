package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods_calculatedTax (
  taxByType: Option[LineForGoods_calculatedTax_taxByType],
tax: Option[Double],
details: Option[List[DetailsCalculatedTaxItem]]
)
