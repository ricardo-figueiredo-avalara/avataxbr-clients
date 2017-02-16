package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CalculatedTaxSummaryForGoodsTaxByType;
@Canonical
class CalculatedTaxSummaryForGoods {

  /* Count of lines */
  Integer numberOfLines = null

  /* sum of all line taxed discounts */
  Double taxedDiscount = null

  /* sum of all line untaxed discounts */
  Double untaxedDiscount = null

  /* sum of all line lineAmount attribute */
  Double subtotal = null

  /* sum of all line tax attribute */
  Double totalTax = null

  /* sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute */
  Double grandTotal = null

    CalculatedTaxSummaryForGoodsTaxByType taxByType = null
  

}

