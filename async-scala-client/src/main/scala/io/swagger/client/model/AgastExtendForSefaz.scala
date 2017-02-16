package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class AgastExtendForSefaz (
  hsCode: Option[String],  // harmonized code, NCM or LC 116
ex: Option[Integer],  // hsCode Exception for IPI tax
cest: Option[String],  // tax substitution code - Codigo especificador da Substuicao Tributaria
cean: Option[String],  // GTIN NUMBER
nve: Option[String],  // Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
unit: Option[String],  // Sales Unit
unitTaxable: Option[String],  // Sales Taxable Unit
nFCI: Option[String]  // Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
)
