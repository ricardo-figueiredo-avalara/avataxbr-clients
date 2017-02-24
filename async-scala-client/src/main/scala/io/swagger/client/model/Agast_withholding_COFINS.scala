package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Agast_withholding_COFINS (
  legalReason: Option[String],
business: Option[Boolean],
businessLegalReason: Option[String],  // reference id to TaxLegalReason
federalGovernment: Option[Boolean],
federalGovernmentLegalReason: Option[String],  // reference id to TaxLegalReason
stateGovernment: Option[Boolean],
stateGovernmentLegalReason: Option[String],  // reference id to TaxLegalReason
cityGovernment: Option[Boolean],
cityGovernmentLegalReason: Option[String]  // reference id to TaxLegalReason
)
