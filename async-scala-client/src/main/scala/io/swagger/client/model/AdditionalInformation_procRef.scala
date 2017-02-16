package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class AdditionalInformation_procRef (
  nProc: Option[String],  // Process Identifier
indProc: Option[String]  // Process Origin - &#39;0&#39; # SEFAZ; - &#39;1&#39; # Justiça Federal; - &#39;2&#39; # Justiça Estadual; - &#39;3&#39; # Secex/RFB; - &#39;9&#39; # Outros 
)
