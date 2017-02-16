package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityType;
@Canonical
class Entity {

  /* Entity name, official name (Razão Social) */
  String name = null

  /* - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO  */
  String role = null

    EntityType type = null

  /* CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}' */
  String federalTaxId = null

  /* City Tax ID */
  String cityTaxId = null

  /* State Tax ID */
  String stateTaxId = null

  /* Suframa ID */
  String suframa = null

  /* Entity Phone */
  String phone = null

    String taxRegime = null

  /* Entity Email */
  String email = null

  /* Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) */
  Boolean subjectToSRF1234 = null
  

}

