package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AgastWithholdingCOFINS {

    String legalReason = null

    Boolean business = null

  /* reference id to TaxLegalReason */
  String businessLegalReason = null

    Boolean federalGovernment = null

  /* reference id to TaxLegalReason */
  String federalGovernmentLegalReason = null

    Boolean stateGovernment = null

  /* reference id to TaxLegalReason */
  String stateGovernmentLegalReason = null

    Boolean cityGovernment = null

  /* reference id to TaxLegalReason */
  String cityGovernmentLegalReason = null
  

}

