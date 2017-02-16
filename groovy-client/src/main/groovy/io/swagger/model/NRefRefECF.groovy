package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class NRefRefECF {

  /* ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e  */
  String nECF = null

  /* Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e  */
  String nCOO = null

  /* Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax  */
  String modECF = null
  

}

