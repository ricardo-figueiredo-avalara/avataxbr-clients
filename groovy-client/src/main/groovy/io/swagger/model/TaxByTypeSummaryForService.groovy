package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TaxByTypeSummaryJurisdiction;
import java.util.List;
@Canonical
class TaxByTypeSummaryForService {

  /* sum of referenced tax value */
  Double tax = null

    List<TaxByTypeSummaryJurisdiction> jurisdictions = new ArrayList<TaxByTypeSummaryJurisdiction>()
  

}

