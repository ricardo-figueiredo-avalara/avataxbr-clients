package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CalculatedTaxSummaryForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.LineForGoods;
import io.swagger.model.ProcessingInfo;
import java.util.List;
@Canonical
class TransactionForGoodsOut {

    HeaderForGoods header = null

    List<LineForGoods> lines = new ArrayList<LineForGoods>()

    CalculatedTaxSummaryForGoods calculatedTaxSummary = null

    ProcessingInfo processingInfo = null
  

}

