package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class HeaderBaseInfo {

  /* This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. */
  String accountId = null

  /* This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company */
  String companyCode = null

  /* This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt'  */
  String transactionType = null

  /* This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored */
  String documentCode = null

  /* currency code / transactions must be in Brazilian Reais \"BRL\" */
  String currency = null

  /* This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) */
  Date transactionDate = null

  /* accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. */
  Date taxCalculationDate = null

  /* This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity */
  String companyLocation = null
  

}

