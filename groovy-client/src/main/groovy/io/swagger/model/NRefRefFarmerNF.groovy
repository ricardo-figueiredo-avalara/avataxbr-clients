package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class NRefRefFarmerNF {

  /* State code of fiscal Document creator, farmer */
  StateEnum stateCd = null

  /* year and month of fiscal document creation */
  String yymm = null

  /* fiscal document creator farmer federalTaxId */
  String federalTaxId = null

  /* fiscal document creator, farmer stateTaxId */
  String stateTaxId = null

  /* Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO  */
  String model = null

  /* fiscal document serie */
  String serie = null

  /* fiscal document number */
  String number = null
  

}

