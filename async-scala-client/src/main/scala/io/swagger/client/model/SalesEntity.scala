package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesEntity (
  name: Option[String],  // SERVICE BUYER NAME OFFICIAL
_type: EntityType,
email: Option[String],  // Entity Email
cnpjcpf: Option[String],  // CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;
cityTaxId: Option[String],  // City Tax ID
stateTaxId: Option[String],  // State Tax ID
suframa: Option[String],  // Suframa ID
phone: Option[String],  // Entity Phone
taxRegime: FederalTaxRegime,
specialTaxRegime: Option[String],  // Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP) 
subjectToSRF1234: Option[Boolean],  // Companies subject to rule follow same rule of Government
requiredWithholdingISS: Option[Boolean],  // If Withholding ISS is required, independently the rules applied.
art: Option[String],  // technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
adminProcess: Option[String],  // PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
buildCode: Option[String]  // Business code. Código da obra OBRA
)
