package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesCalculatedTax (
  taxByType: Option[SalesTaxByType],
tax: Option[Double],  // Sum of tax type not VAT (Value Added Tax)
details: Option[List[SalesTaxByTypeDetail]]
)
