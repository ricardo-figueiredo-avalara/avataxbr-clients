package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class StateTransition (
  _type: String,  // - &#39;voided&#39; - &#39;unvoided&#39; - &#39;reconciled&#39; - &#39;unreconciled&#39; - &#39;filed&#39; - &#39;unfiled&#39; - &#39;filedByAvalara&#39; 
comment: Option[String]
)
