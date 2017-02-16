package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentTaxByType;
@Canonical
class PaymentCalculatedTax {

    PaymentTaxByType taxByType = null

  /* Sum of tax type not VAT (Value Added Tax) */
  Double tax = null
  

}

