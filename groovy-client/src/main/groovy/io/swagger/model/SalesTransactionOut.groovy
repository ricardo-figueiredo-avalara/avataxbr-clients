package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ProcessingInfo;
import io.swagger.model.SalesCalculatedTaxSummaryForService;
import io.swagger.model.SalesHeaderOut;
import io.swagger.model.SalesLinesOut;
import java.util.List;
@Canonical
class SalesTransactionOut {

    SalesHeaderOut header = null

    List<SalesLinesOut> lines = new ArrayList<SalesLinesOut>()

    SalesCalculatedTaxSummaryForService calculatedTaxSummary = null

    ProcessingInfo processingInfo = null
  

}

