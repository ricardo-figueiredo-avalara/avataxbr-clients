package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PaymentTerms;
import io.swagger.model.PurchaseInstallmentIn;
import java.util.List;
@Canonical
class PurchaseHeaderInPayment {

    PaymentTerms terms = null

  /* installments */
  List<PurchaseInstallmentIn> installments = new ArrayList<PurchaseInstallmentIn>()
  

}

