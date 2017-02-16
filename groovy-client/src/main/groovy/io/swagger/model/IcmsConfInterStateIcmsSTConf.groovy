package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class IcmsConfInterStateIcmsSTConf {

    String protocolType = null

  /* inform that substituted is tax regime Simplified the operation MVA will be reduced */
  Boolean hasReductionOfMVAForSimples = null

  /* MVA reduction when substituted is tax regime Simplified. */
  Double reductionOfMVAForSimples = null

  /* how this ICMS-ST will be calculed for itens linked to this configuration */
  String calcMode = null

  /* ICMS rate - Redução da BC ICMS ST (%) */
  Double icmsStBaseDiscount = null

  /* ICMS-ST MVA rate to define calc base */
  Double mvaRate = null

  /* SRP or MSRP amount base for this ICMS-ST configuration */
  Double srp = null

  /* unit used to SRP amount value */
  String srpUnit = null
  

}

