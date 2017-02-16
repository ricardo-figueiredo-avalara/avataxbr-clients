package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PaymentTaxByType (
  irrf: Option[TaxByTypeTax],
inssRf: Option[TaxByTypeTax],
issRf: Option[TaxByTypeTax],
pisRf: Option[TaxByTypeTax],
cofinsRf: Option[TaxByTypeTax],
csllRf: Option[TaxByTypeTax]
)
