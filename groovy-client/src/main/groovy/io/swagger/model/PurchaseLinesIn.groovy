package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SalesLinesOutTaxDeductions;
@Canonical
class PurchaseLinesIn {

  /* This string is a unique identifier for this line in the transaction */
  Integer lineCode = null

  /* This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. */
  String itemCode = null

  /* This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 */
  Double numberOfItems = 1.0d

  /* This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems). */
  Double lineAmount = null

  /* This string captures the description of the item represented by this line, will be used LC 116 */
  String itemDescription = null

  /* Conditional discount */
  Double lineTaxedDiscount = null

  /* Unconditional discount */
  Double lineUntaxedDiscount = null

  /* Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets'  */
  String useType = null

    SalesLinesOutTaxDeductions taxDeductions = null
  

}

