package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CalculatedTaxSummaryForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.LineForSefazGoods;
import java.util.List;
@Canonical
class TransactionForSefazGoods {

    HeaderForGoods header = null

    List<LineForSefazGoods> lines = new ArrayList<LineForSefazGoods>()

    CalculatedTaxSummaryForGoods calculatedTaxSummary = null
  

}

