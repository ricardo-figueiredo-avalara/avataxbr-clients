package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.InstallmentComplete;
import io.swagger.model.PaymentTerms;
import io.swagger.model.WithholdingMode;
import java.util.List;
@Canonical
class PurchaseHeaderOutPayment {

    PaymentTerms terms = null

    WithholdingMode withholdingMode = null

  /* installments */
  List<InstallmentComplete> installments = new ArrayList<InstallmentComplete>()
  

}

