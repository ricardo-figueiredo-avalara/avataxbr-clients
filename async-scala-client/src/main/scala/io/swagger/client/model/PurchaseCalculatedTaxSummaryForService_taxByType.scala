package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseCalculatedTaxSummaryForService_taxByType (
  issRf: Option[TaxByTypeSummaryForService],
pisRf: Option[TaxByTypeSummaryForService],
cofinsRf: Option[TaxByTypeSummaryForService],
csllRf: Option[TaxByTypeSummaryForService],
irrf: Option[TaxByTypeSummaryForService],
inssRf: Option[TaxByTypeSummaryForService],
inssAr: Option[TaxByTypeSummaryForService],
pis: Option[TaxByTypeSummaryForService],
cofins: Option[TaxByTypeSummaryForService]
)
