package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class SefazDisableRangeIn {

  /* This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity */
  String companyLocation = null

  /* This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  */
  String transactionModel = null

  /* Invoice number, sequential unique by invoice serial (Número da nota fiscal)  */
  Integer invoiceSerial = null

    BigDecimal year = null

    String message = null

  /* First number of disable range. */
  BigDecimal invoiceNumberInit = null

  /* Last number of disable range. */
  BigDecimal invoiceNumberEnd = null
  

}

