package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxByTypeSummaryForService (
  tax: Option[Double],  // sum of referenced tax value
jurisdictions: Option[List[TaxByTypeSummaryJurisdiction]]
)
