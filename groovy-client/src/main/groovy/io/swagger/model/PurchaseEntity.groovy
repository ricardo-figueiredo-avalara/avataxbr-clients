package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;
@Canonical
class PurchaseEntity {

  /* Legal Name of Service buyer. */
  String name = null

    EntityType type = null

  /* Entity Email */
  String email = null

  /* CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}' */
  String cnpjcpf = null

  /* City Tax ID */
  String cityTaxId = null

  /* State Tax ID */
  String stateTaxId = null

  /* Suframa ID */
  String suframa = null

  /* Entity Phone */
  String phone = null

    FederalTaxRegime taxRegime = null

  /* Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted. */
  Boolean hasCpom = null

  /* These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well. */
  Boolean subjectWithholdingIrrf = null

  /* The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document. */
  Double inssPreviousContrib = null

  /* The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input. */
  Double inssBasisDiscount = null

  /* When Seller is Simples regime, the seller needs send RF rate. */
  Double issRfRate = null
  

}

