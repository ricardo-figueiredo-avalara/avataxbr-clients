package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PayRecCalculatedTaxSummaryForService;
import io.swagger.model.PayRecHeader;
import io.swagger.model.PayRecLinesOut;
import io.swagger.model.ProcessingInfo;
import java.util.List;
@Canonical
class PaymentTransactionOut {

    PayRecHeader header = null

    List<PayRecLinesOut> lines = new ArrayList<PayRecLinesOut>()

    PayRecCalculatedTaxSummaryForService calculatedTaxSummary = null

    ProcessingInfo processingInfo = null
  

}

