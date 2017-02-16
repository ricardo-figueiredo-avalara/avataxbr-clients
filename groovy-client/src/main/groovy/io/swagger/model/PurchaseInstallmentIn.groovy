package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class PurchaseInstallmentIn {

  /* DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction */
  String documentNumber = null

  /* installment, Due Date */
  Date date = null

  /* Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount) */
  Double grossValue = null
  

}

