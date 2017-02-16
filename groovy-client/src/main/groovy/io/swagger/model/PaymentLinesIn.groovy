package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PayRecLinesIn;
@Canonical
class PaymentLinesIn {

  /* Installment number in this document */
  Integer lineCode = null

    String lineType = null

  /* Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. */
  String itemCode = null

  /* Free description about this payment */
  String itemDescription = null

  /* Installment number, when paid AS IS */
  String itemDocNumber = null

  /* Penalty, usually because paid after due date */
  Double lineUntaxedPenality = null

  /* unconditional discounts */
  Double lineUntaxedDiscount = null

  /* Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes */
  Double lineNetValue = null
  

}

