package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SefazInvoiceStatus;
@Canonical
class SefazItGetOut {

  /* Invoice Access Key */
  String key = null

  /* XML Signed */
  String xml = null

    SefazInvoiceStatus status = null
  

}

