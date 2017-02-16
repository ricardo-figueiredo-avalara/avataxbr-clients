package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LegalReasonTaxScope {

  /* This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX'  */
  String taxType = null

  /* These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof'  */
  String specializedTaxType = null

  /* Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country'  */
  String jurisdictionType = null

  /* Code to identify the Jurisdiction */
  String jurisdictionIbgeCode = null
  

}

