package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IcmsConfInterStateIcmsSTConf;
import io.swagger.model.StateEnum;
@Canonical
class IcmsConfInterState {

    StateEnum state = null

  /* how this ICMS will be calculed for itens linked to this configuration */
  String calcMode = null

  /* discount if the item is subject to monophase PIS/COFINS when operation interstate */
  Double discountRateForMonoPhase = null

  /* ICMS rate */
  Double rate = null

  /* FCP rate (Fundo de Combate à Probreza / Fund Against Poverty */
  Double fcpRate = null

  /* ICMS rate */
  Double icmsBaseDiscount = null

  /* SRP or MMSRP amount base for this icms configuration */
  Double msrp = null

  /* ICMS MVA rate to define calc base */
  Double mvaRate = null

  /* unit used to SRP amount value */
  String msrpUnit = null

  /* Code for the ICM legal reason, this message will be placed on invoice. */
  String icmsLegalReason = null

    IcmsConfInterStateIcmsSTConf icmsSTConf = null
  

}

