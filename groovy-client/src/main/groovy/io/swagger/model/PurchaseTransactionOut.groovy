package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ProcessingInfo;
import io.swagger.model.PurchaseCalculatedTaxSummaryForService;
import io.swagger.model.PurchaseHeaderOut;
import io.swagger.model.PurchaseLinesOut;
import java.util.List;
@Canonical
class PurchaseTransactionOut {

    PurchaseHeaderOut header = null

    List<PurchaseLinesOut> lines = new ArrayList<PurchaseLinesOut>()

    PurchaseCalculatedTaxSummaryForService calculatedTaxSummary = null

    ProcessingInfo processingInfo = null
  

}

