package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PaymentBill;
import io.swagger.model.PaymentInstallment;
import io.swagger.model.PaymentPaymentMode;
import java.util.List;
@Canonical
class Payment {

  /* Installment terms - 0 # cash - 1 # on terms - 2 # other  */
  Integer installmentsTerms = null

    PaymentBill bill = null

    List<PaymentInstallment> installment = new ArrayList<PaymentInstallment>()

    List<PaymentPaymentMode> paymentMode = new ArrayList<PaymentPaymentMode>()
  

}

