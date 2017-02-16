package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class PaymentInstallment {

  /* Instalment number identifier */
  String documentNumber = null

  /* Installment expiration date */
  Date date = null

  /* Installment value */
  Double grossValue = null
  

}

