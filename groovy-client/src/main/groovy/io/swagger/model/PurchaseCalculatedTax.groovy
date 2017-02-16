package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PurchaseTaxByType;
import io.swagger.model.PurchaseTaxByTypeDetail;
import java.util.List;
@Canonical
class PurchaseCalculatedTax {

    PurchaseTaxByType taxByType = null

  /* Sum of tax type not VAT (Value Added Tax) */
  Double tax = null

    List<PurchaseTaxByTypeDetail> details = new ArrayList<PurchaseTaxByTypeDetail>()
  

}

