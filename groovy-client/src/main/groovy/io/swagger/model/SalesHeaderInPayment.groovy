package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PaymentTerms;
import io.swagger.model.SalesInstallmentIn;
import java.util.List;
@Canonical
class SalesHeaderInPayment {

    PaymentTerms terms = null

  /* installments */
  List<SalesInstallmentIn> installments = new ArrayList<SalesInstallmentIn>()
  

}

