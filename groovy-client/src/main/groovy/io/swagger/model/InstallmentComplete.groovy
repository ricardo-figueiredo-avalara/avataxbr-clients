package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.WithholdingMode;
@Canonical
class InstallmentComplete {

  /* DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction */
  String documentNumber = null

  /* installment Due Date */
  Date date = null

  /* Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount) */
  Double grossValue = null

  /* net amount due for this installment, grossValue - ∑ (withhold amounts) */
  Double netValue = null

  /* Inform if this payment is subject to Pis, Cofins or CSLL */
  WithholdingMode withholdingMode = null

  /* calculated PIS-RF tax for this payment */
  Double withholdingPIS = null

  /* calculated COFINS-RF tax for this payment */
  Double withholdingCOFINS = null

  /* calculated CSLL-RF tax for this payment */
  Double withholdingCSLL = null
  

}

