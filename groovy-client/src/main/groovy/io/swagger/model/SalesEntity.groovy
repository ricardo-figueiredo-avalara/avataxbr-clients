package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;
@Canonical
class SalesEntity {

  /* SERVICE BUYER NAME OFFICIAL */
  String name = null

    EntityType type = null

  /* Entity Email */
  String email = null

  /* CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}' */
  String cnpjcpf = null

  /* City Tax ID */
  String cityTaxId = null

  /* State Tax ID */
  String stateTaxId = null

  /* Suframa ID */
  String suframa = null

  /* Entity Phone */
  String phone = null

    FederalTaxRegime taxRegime = null

  /* Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP)  */
  String specialTaxRegime = null

  /* Companies subject to rule follow same rule of Government */
  Boolean subjectToSRF1234 = null

  /* If Withholding ISS is required, independently the rules applied. */
  Boolean requiredWithholdingISS = null

  /* technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia */
  String art = null

  /* PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS */
  String adminProcess = null

  /* Business code. Código da obra OBRA */
  String buildCode = null
  

}

