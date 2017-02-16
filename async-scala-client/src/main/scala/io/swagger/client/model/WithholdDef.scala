package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class WithholdDef (
  exemptionReasonCode: Option[String],  // UUID Reference to an item in the LegalReason store.
customExemptionReasonDescription: Option[String]
)
