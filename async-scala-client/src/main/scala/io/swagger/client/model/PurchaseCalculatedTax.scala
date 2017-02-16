package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseCalculatedTax (
  taxByType: Option[PurchaseTaxByType],
tax: Option[Double],  // Sum of tax type not VAT (Value Added Tax)
details: Option[List[PurchaseTaxByTypeDetail]]
)
