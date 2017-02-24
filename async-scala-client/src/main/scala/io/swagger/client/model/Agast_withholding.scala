package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Agast_withholding (
  IRRF: Option[Boolean],
IRRFLegalReason: Option[String],  // reference id to TaxLegalReason
INSSSubjectToDischarge: Option[Boolean],  // Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
INSS: Option[Boolean],
INSSLegalReason: Option[String],  // reference id to TaxLegalReason
INSsForSimples: Option[Boolean],
INSSForSimplesLegalReason: Option[String],  // reference id to TaxLegalReason
PIS: Option[Agast_withholding_PIS],
COFINS: Option[Agast_withholding_COFINS],
CSLL: Option[Agast_withholding_CSLL]
)
