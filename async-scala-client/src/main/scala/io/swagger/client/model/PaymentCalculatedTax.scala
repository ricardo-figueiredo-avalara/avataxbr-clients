package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PaymentCalculatedTax (
  taxByType: Option[PaymentTaxByType],
tax: Option[Double]  // Sum of tax type not VAT (Value Added Tax)
)
