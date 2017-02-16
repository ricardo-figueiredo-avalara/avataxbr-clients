package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IcmsTaxConfBase (
  state: StateEnum,
icmsCST: Option[String],  // On sales process inform the CST hat the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED 
messageCode: Option[String]  // Message to add to NF when this configuration is used
)
