package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LineForGoodsAdi {

  /* aditional sequence number (1 to 100) */
  Integer addNumber = null

  /* sequential item number for this adi, sequence number (1 to 999) */
  Integer sequentialNumber = null

  /* Manufatorer erp internal code */
  String manufacturerCode = null

  /* This decimal 13 integers and 2 decimals, aditional adi discount */
  Double adiDiscount = null

  /* Drawback number */
  String drawbackNumber = null
  

}

