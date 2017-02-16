package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CalculatedTaxSummaryForGoods_taxByType (
  icms: Option[TaxByTypeSummaryForGoods],
icmsSt: Option[TaxByTypeSummaryForGoods],
icmsStSd: Option[TaxByTypeSummaryForGoods],
icmsPartOwn: Option[TaxByTypeSummaryForGoods],
icmsPartDest: Option[TaxByTypeSummaryForGoods],
icmsDifaFCP: Option[TaxByTypeSummaryForGoods],
icmsDifaDest: Option[TaxByTypeSummaryForGoods],
icmsDifaRemet: Option[TaxByTypeSummaryForGoods],
icmsRf: Option[TaxByTypeSummaryForGoods],
icmsDeson: Option[TaxByTypeSummaryForGoods],
icmsCredsn: Option[TaxByTypeSummaryForGoods],
pis: Option[TaxByTypeSummaryForGoods],
pisSt: Option[TaxByTypeSummaryForGoods],
cofins: Option[TaxByTypeSummaryForGoods],
cofinsSt: Option[TaxByTypeSummaryForGoods],
ipi: Option[TaxByTypeSummaryForGoods],
ipiReturned: Option[TaxByTypeSummaryForGoods],
ii: Option[TaxByTypeSummaryForGoods],
iof: Option[TaxByTypeSummaryForGoods],
aproxtribState: Option[TaxByTypeSummaryForGoods],
aproxtribFed: Option[TaxByTypeSummaryForGoods]
)
