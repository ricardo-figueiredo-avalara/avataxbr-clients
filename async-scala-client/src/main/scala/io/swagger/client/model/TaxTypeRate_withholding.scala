package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxTypeRate_withholding (
  all: Option[WithholdDef],
business: Option[WithholdDef],
federalGovernment: Option[WithholdDef],
stateGovernment: Option[WithholdDef],
cityGovernment: Option[WithholdDef]
)
