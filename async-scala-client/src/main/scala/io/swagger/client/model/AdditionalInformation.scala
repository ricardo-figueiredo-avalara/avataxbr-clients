package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class AdditionalInformation (
  fiscalInfo: Option[String],  // Additional information of fiscal interest
complementaryInfo: Option[String],  // Additional information of user interest
procRef: Option[List[AdditionalInformation_procRef]]  // Referenced Process
)
