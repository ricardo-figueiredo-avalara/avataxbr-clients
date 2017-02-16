package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Entity (
  name: Option[String],  // Entity name, official name (Razão Social)
role: Option[String],  // - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO 
_type: EntityType,
federalTaxId: String,  // CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;
cityTaxId: Option[String],  // City Tax ID
stateTaxId: Option[String],  // State Tax ID
suframa: Option[String],  // Suframa ID
phone: Option[String],  // Entity Phone
taxRegime: Option[String],
email: Option[String],  // Entity Email
subjectToSRF1234: Option[Boolean]  // Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
)
