package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgastWithholdingCOFINS;
import io.swagger.model.AgastWithholdingCSLL;
import io.swagger.model.AgastWithholdingPIS;
@Canonical
class AgastWithholding {

    Boolean IRRF = null

  /* reference id to TaxLegalReason */
  String irRFLegalReason = null

  /* Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento  */
  Boolean inSSSubjectToDischarge = null

    Boolean INSS = null

  /* reference id to TaxLegalReason */
  String inSSLegalReason = null

    Boolean inSsForSimples = null

  /* reference id to TaxLegalReason */
  String inSSForSimplesLegalReason = null

    AgastWithholdingPIS PIS = null

    AgastWithholdingCOFINS COFINS = null

    AgastWithholdingCSLL CSLL = null
  

}

