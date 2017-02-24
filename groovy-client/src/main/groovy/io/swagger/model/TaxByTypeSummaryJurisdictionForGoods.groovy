package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TaxByTypeSummaryJurisdictionForGoods {

  /* Jurisdiction used for calctax amount */
  String jurisdictionName = null

  /* Type of jurisdiction - 'City' - 'State' - 'Country'  */
  String jurisdictionType = null

  /* sum of referenced tax value by jurisdiction */
  Double tax = null
  

}

