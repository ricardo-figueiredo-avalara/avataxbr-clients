package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SalesTaxByType;
import io.swagger.model.SalesTaxByTypeDetail;
import java.util.List;
@Canonical
class SalesCalculatedTax {

    SalesTaxByType taxByType = null

  /* Sum of tax type not VAT (Value Added Tax) */
  Double tax = null

    List<SalesTaxByTypeDetail> details = new ArrayList<SalesTaxByTypeDetail>()
  

}

