package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.IcmsConfByState;
import io.swagger.model.IcmsConfByStateIcmsSTConf;
import io.swagger.model.IcmsConfInterState;
import io.swagger.model.StateEnum;
import java.util.List;
@Canonical
class CustomIcmsConfByState {

  /* Identify the IcmsConfState in namespace */
  String code = null

    StateEnum state = null

  /* name for this configuration */
  String name = null

  /* date when this configuration values starts */
  Date startDate = null

  /* date when this configuration values expire */
  Date expirationDate = null

  /* set this configuration to Inactive */
  Boolean inactive = null

  /* inform that the item linked to this configuration is subject to ICMS ST on this state */
  Boolean subjectToST = null

  /* On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED  */
  String icmsCST = null

  /* how this ICMS will be calculed for itens linked to this configuration */
  String calcMode = null

  /* discount if the item is subject to monophase PIS/COFINS for transactions inside state */
  Double discountRateForMonoPhase = null

  /* ICMS rate */
  Double rate = null

  /* ICMS rate */
  Double icmsBaseDiscount = null

  /* SRP or MMSRP amount base for this icms configuration */
  Double msrp = null

  /* ICMS mva rate to define calc base */
  Double mvaRate = null

  /* unit used to SRP amount value */
  String msrpUnit = null

  /* Code for the ICM legal reason, this message will be placed on invoice. */
  String icmsLegalReason = null

  /* Fundo de Combate à pobreza / Fund Against Poverty */
  Double fcpRate = null

    IcmsConfByStateIcmsSTConf icmsSTConf = null

  /* the map key is state code */
  List<IcmsConfInterState> icmsInterStateConf = new ArrayList<IcmsConfInterState>()

  /* Company ID */
  String companyId = null
  

}

