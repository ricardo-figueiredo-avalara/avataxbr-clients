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
class SalesHeaderOutPayment {

    PaymentTerms terms = null

  /* To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ... */
  WithholdingMode withholdingMode = null

  /* installments */
  List<InstallmentComplete> installments = new ArrayList<InstallmentComplete>()
  

}

