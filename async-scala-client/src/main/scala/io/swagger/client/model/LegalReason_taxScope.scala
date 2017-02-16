package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LegalReason_taxScope (
  taxType: String,  // This is the Tax Type to apply legal messages. - &#39;NONE&#39; - &#39;INSS&#39; - &#39;IRRF&#39; - &#39;IRPJ&#39; - &#39;PIS&#39; - &#39;COFINS&#39; - &#39;CSLL&#39; - &#39;IPI&#39; - &#39;ICMS&#39; - &#39;II&#39; - &#39;IOF&#39; - &#39;ISS&#39; - &#39;APROXTOTALTAX&#39; 
specializedTaxType: Option[String],  // These are the specific tax types to which a message may be applied - &#39;icms&#39; - &#39;icmsSt&#39; - &#39;icmsStSd&#39; - &#39;icmsPartOwn&#39; - &#39;icmsPartDest&#39; - &#39;icmsDifaFCP&#39; - &#39;icmsDifaDest&#39; - &#39;icmsDifaRemet&#39; - &#39;icmsRf&#39; - &#39;icmsDeson&#39; - &#39;icmsCredsn&#39; - &#39;pis&#39; - &#39;pisSt&#39; - &#39;cofins&#39; - &#39;cofinsSt&#39; - &#39;ipi&#39; - &#39;ipiReturned&#39; - &#39;ii&#39; - &#39;iof&#39; 
jurisdictionType: String,  // Types of jurisdiction - &#39;NONE&#39; - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; 
jurisdictionIbgeCode: Option[String]  // Code to identify the Jurisdiction
)
