package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CustomTaxTypeRate (
  taxType: TaxType,
taxModel: String,  // Tax can be calculated by rate or by quantity
rate: Option[Double],  // Specific tax rate ex 3.5 (3.5%)
srvAmount: Option[Double],  // Specific tax rate ex 3.5 (3.5%)
quantityUnidBase: Option[String],
specializationType: Option[String],
companyId: UUID  // Company ID
)
