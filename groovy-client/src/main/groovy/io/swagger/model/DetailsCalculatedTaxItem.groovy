package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DetailsCalculatedTax;
import java.util.List;
@Canonical
class DetailsCalculatedTaxItem {

  /* This string captures the applicable location type. Location used for calc. Buyer or Seller */
  String locationType = null

  /* Jurisdiction used for calctax amount */
  String jurisdictionName = null

  /* Type of jurisdiction - 'City' - 'State' - 'Country'  */
  String jurisdictionType = null

  /* Tax identificator */
  String taxType = null

  /* Name of configuration rate */
  String rateType = null

  /* This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. */
  String scenario = null

  /* This decimal captures how much of the lineAmount was taxable by this tax, calc base */
  Double subtotalTaxable = null

  /* This decimal captures the tax rate for this tax.3.00 (3%) */
  Double rate = null

  /* This decimal captures how much of the lineAmount was taxable by this tax */
  Double tax = null

  /* This string is required if is exempt */
  String exemptionCode = null

  /* This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address */
  List<String> significantLocations = new ArrayList<String>()

  /* This string with type of rule */
  String taxRuleType = null

    Integer source = null

    String cstB = null

    String modBC = null

    String cst = null
  

}

