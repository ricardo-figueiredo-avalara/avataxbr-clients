package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class NRefRefNF {

  /* State code of fiscal Document creator */
  StateEnum stateCd = null

  /* year and month of fiscal document creation */
  String yymm = null

  /* fiscal document creator federalTaxId */
  String federalTaxId = null

  /* fiscal document serie */
  String serie = null

  /* fiscal document number */
  String number = null
  

}

