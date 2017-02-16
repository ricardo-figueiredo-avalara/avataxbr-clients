package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PaymentBill {

  /* Bill identifier */
  String nFat = null

  /* Orignal value */
  Double vOrig = null

  /* Discount */
  Double vDiscount = null

  /* Net value */
  Double vNet = null
  

}

