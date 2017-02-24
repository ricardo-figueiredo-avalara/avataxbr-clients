package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaxType;
@Canonical
class TaxTypeRate {

    TaxType taxType = null

  /* Tax can be calculated by rate or by quantity */
  String taxModel = null

  /* Specific tax rate ex 3.5 (3.5%) */
  Double rate = null

  /* Specific tax rate ex 3.5 (3.5%) */
  Double srvAmount = null

    String quantityUnidBase = null

    String specializationType = null
  

}

