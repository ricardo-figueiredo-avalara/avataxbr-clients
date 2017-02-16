package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PayRecHeader;
import io.swagger.model.PaymentLinesIn;
import java.util.List;
@Canonical
class ReceiptTransactionIn {

    PayRecHeader header = null

    List<PaymentLinesIn> lines = new ArrayList<PaymentLinesIn>()
  

}

