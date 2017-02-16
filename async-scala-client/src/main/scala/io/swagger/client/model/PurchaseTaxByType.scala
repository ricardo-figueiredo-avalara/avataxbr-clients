package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseTaxByType (
  issRf: Option[TaxByTypeTax],
pisRf: Option[TaxByTypeTax],
cofinsRf: Option[TaxByTypeTax],
csllRf: Option[TaxByTypeTax],
irrf: Option[TaxByTypeTax],
inssRf: Option[TaxByTypeTax],
inssAr: Option[TaxByTypeTax],
pis: Option[TaxByTypeTax],
cofins: Option[TaxByTypeTax]
)
