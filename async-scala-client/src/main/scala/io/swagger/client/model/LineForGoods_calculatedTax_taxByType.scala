package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods_calculatedTax_taxByType (
  icms: Option[TaxByTypeTax],
icmsSt: Option[TaxByTypeTax],
icmsStSd: Option[TaxByTypeTax],
icmsPartOwn: Option[TaxByTypeTax],
icmsPartDest: Option[TaxByTypeTax],
icmsDifaFCP: Option[TaxByTypeTax],
icmsDifaDest: Option[TaxByTypeTax],
icmsDifaRemet: Option[TaxByTypeTax],
icmsRf: Option[TaxByTypeTax],
icmsDeson: Option[TaxByTypeTax],
icmsCredsn: Option[TaxByTypeTax],
pis: Option[TaxByTypeTax],
pisSt: Option[TaxByTypeTax],
cofins: Option[TaxByTypeTax],
cofinsSt: Option[TaxByTypeTax],
ipi: Option[TaxByTypeTax],
ipiReturned: Option[TaxByTypeTax],
ii: Option[TaxByTypeTax],
iof: Option[TaxByTypeTax],
aproxtribState: Option[TaxByTypeTax],
aproxtribFed: Option[TaxByTypeTax]
)
