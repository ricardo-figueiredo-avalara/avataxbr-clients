package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LegalReason_referencedProcesses (
  nProc: Option[String],  // Process Identifier (NFe &lt;nProc&gt; tag)
indProc: Option[String]  // Process Origin (NFe &lt;indProc&gt; tag) - &#39;0&#39; # SEFAZ; - &#39;1&#39; # Justiça Federal; - &#39;2&#39; # Justiça Estadual; - &#39;3&#39; # Secex/RFB; - &#39;9&#39; # Outros 
)
