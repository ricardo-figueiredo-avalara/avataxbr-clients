package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PayRecCalculatedTaxSummaryForServiceTaxByType;
import io.swagger.model.PccWithholdingMode;
import java.util.List;
@Canonical
class PayRecCalculatedTaxSummaryForService {

  /* Count of lines */
  Integer numberOfLines = null

  /* Sum of grossvalues */
  Double subtotal = null

  /* Sum of all withholding values */
  Double totalTax = null

  /* Sum all NetValues */
  Double grandTotal = null

    List<PccWithholdingMode> pccWithholdingModes = new ArrayList<PccWithholdingMode>()

    PayRecCalculatedTaxSummaryForServiceTaxByType taxByType = null
  

}

