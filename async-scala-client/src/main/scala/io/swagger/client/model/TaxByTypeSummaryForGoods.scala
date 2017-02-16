package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxByTypeSummaryForGoods (
  calcbase: Option[Double],  // sum of all lines calcbase
tax: Option[Double],  // sum of referenced tax value
jurisdictions: Option[List[TaxByTypeSummaryJurisdictionForGoods]]
)
