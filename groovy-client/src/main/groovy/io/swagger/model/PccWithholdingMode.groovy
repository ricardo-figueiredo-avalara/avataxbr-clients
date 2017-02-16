package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaxByTypeTax;
@Canonical
class PccWithholdingMode {

  /* Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) */
  String type = null

  /* this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf */
  Double totalTax = null

    TaxByTypeTax pisRf = null

    TaxByTypeTax cofinsRf = null

    TaxByTypeTax csllRf = null
  

}

