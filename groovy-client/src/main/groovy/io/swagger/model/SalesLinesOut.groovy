package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SalesCalculatedTax;
import io.swagger.model.SalesLinesIn;
import io.swagger.model.SalesLinesOutTaxDeductions;
@Canonical
class SalesLinesOut {

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

    SalesLinesOutTaxDeductions taxDeductions = null

  /* AGAST CODE for itemCode */
  String avalaraGoodsAndServicesType = null

  /* This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings). */
  Double lineNetValue = null

  /* - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE  */
  String cst = null

  /* - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE  */
  String cstRf = null

    SalesCalculatedTax calculatedTax = null
  

}

