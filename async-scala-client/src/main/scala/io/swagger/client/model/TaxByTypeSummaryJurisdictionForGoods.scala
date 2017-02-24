package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxByTypeSummaryJurisdictionForGoods (
  jurisdictionName: Option[String],  // Jurisdiction used for calctax amount
jurisdictionType: Option[String],  // Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; 
tax: Option[Double]  // sum of referenced tax value by jurisdiction
)
