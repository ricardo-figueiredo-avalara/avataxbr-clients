package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SalesCalculatedTaxSummaryForServiceTaxByType;
@Canonical
class SalesCalculatedTaxSummaryForService {

  /* Count of lines */
  Integer numberOfLines = null

  /* sum of all line tax attribute */
  Double subtotal = null

  /* sum of all line lineAmount attribute */
  Double totalTax = null

  /* sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute */
  Double grandTotal = null

    SalesCalculatedTaxSummaryForServiceTaxByType taxByType = null
  

}

