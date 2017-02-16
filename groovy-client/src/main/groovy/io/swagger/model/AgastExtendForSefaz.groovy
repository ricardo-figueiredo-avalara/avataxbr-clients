package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AgastExtendForSefaz {

  /* harmonized code, NCM or LC 116 */
  String hsCode = null

  /* hsCode Exception for IPI tax */
  Integer ex = null

  /* tax substitution code - Codigo especificador da Substuicao Tributaria */
  String cest = null

  /* GTIN NUMBER */
  String cean = null

  /* Nomenclatura de Valor aduaneio e Estatístico - NCM extension code */
  String nve = null

  /* Sales Unit */
  String unit = null

  /* Sales Taxable Unit */
  String unitTaxable = null

  /* Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação) */
  String nFCI = null
  

}

