package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.SefazInvoiceBasicStatus;
@Canonical
class SefazInvoiceStatus {

    String code = null

    String desc = null

    String protocol = null

    String rec = null

    Date date = null

  /* - '1' # Ambiente de Produção - '2' # Ambiente de Homologação  */
  String environment = null

    String appVersion = null
  

}

