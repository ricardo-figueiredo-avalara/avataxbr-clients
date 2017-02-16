package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PccWithholdingMode (
  _type: Option[String],  // Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
totalTax: Option[Double],  // this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
pisRf: Option[TaxByTypeTax],
cofinsRf: Option[TaxByTypeTax],
csllRf: Option[TaxByTypeTax]
)
