package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesCalculatedTaxSummaryForService (
  numberOfLines: Option[Integer],  // Count of lines
subtotal: Option[Double],  // sum of all line tax attribute
totalTax: Option[Double],  // sum of all line lineAmount attribute
grandTotal: Option[Double],  // sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
taxByType: Option[SalesCalculatedTaxSummaryForService_taxByType]
)
