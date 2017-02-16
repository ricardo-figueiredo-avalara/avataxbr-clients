package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PurchaseInfo {

  /* Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas  */
  String governmentOrder = null

  /* Order info Informação do pedido  */
  String orderNumber = null

  /* Agreement info Informação do contrato  */
  String contractNumber = null
  

}

