package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class IcmsConfByStateIcmsSTConf {

  /* inform that substituted is tax regime Simplified the operation MVA will be reduced */
  Boolean hasReductionOfMVAForSimples = null

  /* mva reduction when substituted is tax regime Simplified. */
  Double reductionOfMVAForSimples = null

  /* how this ICMS-ST will be calculed for itens linked to this configuration */
  String calcMode = null

  /* ICMS-ST mva rate to define calc base */
  Double mvaRate = null

  /* ICMS rate - Redução da BC ICMS ST (%) */
  Double icmsStBaseDiscount = null

  /* SRP or MSRP amount base for this ICMS-ST configuration */
  Double srp = null

  /* unit used to srv amount value */
  String srpUnit = null
  

}

