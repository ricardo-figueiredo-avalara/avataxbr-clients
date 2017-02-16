package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PayRecCalculatedTaxSummaryForService (
  numberOfLines: Option[Integer],  // Count of lines
subtotal: Option[Double],  // Sum of grossvalues
totalTax: Option[Double],  // Sum of all withholding values
grandTotal: Option[Double],  // Sum all NetValues
pccWithholdingModes: Option[List[PccWithholdingMode]],
taxByType: Option[PayRecCalculatedTaxSummaryForService_taxByType]
)
