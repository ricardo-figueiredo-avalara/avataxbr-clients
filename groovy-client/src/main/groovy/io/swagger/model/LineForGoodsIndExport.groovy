package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LineForGoodsIndExport {

  /* Exportation register number */
  String registerNumber = null

  /* invoice access key received to export */
  String accessKey = null

  /* This decimal 11 integers and 0 to 4 decimals, quantity exported in real */
  Double quantity = null
  

}

