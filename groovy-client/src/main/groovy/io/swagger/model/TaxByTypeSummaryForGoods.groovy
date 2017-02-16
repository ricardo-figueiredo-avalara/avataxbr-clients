package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TaxByTypeSummaryJurisdictionForGoods;
import java.util.List;
@Canonical
class TaxByTypeSummaryForGoods {

  /* sum of all lines calcbase */
  Double calcbase = null

  /* sum of referenced tax value */
  Double tax = null

    List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions = new ArrayList<TaxByTypeSummaryJurisdictionForGoods>()
  

}

