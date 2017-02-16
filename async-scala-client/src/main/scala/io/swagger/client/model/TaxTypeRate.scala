package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxTypeRate (
  taxType: TaxType,
taxModel: String,  // Tax can be calculated by rate or by quantity
rate: Option[Double],  // Specific tax rate ex 3.5 (3.5%)
srvAmount: Option[Double],  // Specific tax rate ex 3.5 (3.5%)
quantityUnidBase: Option[String],
specializationType: Option[String],
exemptionReasonCode: Option[String],  // UUID Reference to an item in the LegalReason store. 
customExemptionReasonDescription: Option[String],  // Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other). 
withholding: Option[TaxTypeRate_withholding]
)
