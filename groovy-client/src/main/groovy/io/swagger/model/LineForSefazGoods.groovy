package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgastExtendForSefaz;
import io.swagger.model.ArrayList;
import io.swagger.model.Fuel;
import io.swagger.model.LineForGoods;
import io.swagger.model.LineForGoodsCalculatedTax;
import io.swagger.model.LineForGoodsDi;
import io.swagger.model.LineForGoodsExport;
import io.swagger.model.LineForGoodsIcmsTaxRelief;
import io.swagger.model.Medicine;
import io.swagger.model.Vehicle;
import io.swagger.model.Weapon;
import java.util.List;
@Canonical
class LineForSefazGoods {

  /* This string is a unique identifier for this line in the transaction */
  Integer lineCode = null

  /* This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. */
  String itemCode = null

  /* AGAST CODE for itemCode */
  String avalaraGoodsAndServicesType = null

  /* This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 */
  Double numberOfItems = 1.0d

  /* when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00 */
  Double returnedPercentageAmount = null

  /* This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. */
  Double lineUnitPrice = null

  /* In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax). */
  Double lineAmount = null

  /* This string captures the description of the item represented by this line, will be used LC 116 */
  String itemDescription = null

  /* Discount conditional, This decimal 13 integers and 0 to 2 decimals */
  Double lineTaxedDiscount = null

  /* discount unconditional, This decimal 13 integers and 0 to 2 decimals */
  Double lineUntaxedDiscount = null

  /* This is a enumeration folowing table */
  String useType = null

  /* Reference to process configurantion of this transaction, See ProcessScenario definition */
  String processScenario = null

  /* Fiscal Operation Code of transport service */
  Integer cfop = null

  /* return if this transaction has stock impact for this process or CFOP */
  Boolean hasStockImpact = null

  /* return if this transaction has finantial impact for this process or CFOP */
  Boolean hasFinantialImpact = null

  /* This decimal 13 integers and 0 to 2 decimals */
  Double freightAmount = null

  /* This decimal 13 integers and 0 to 2 decimals */
  Double insuranceAmount = null

  /* This decimal 13 integers and 0 to 2 decimals */
  Double otherCostAmount = null

  /* The item value will compose the invoice total value. */
  Boolean indTotType = true

  /* order number, information used for B2B control process */
  String orderNumber = null

  /* number of the item from order number, information used for B2B control process */
  String orderItemNumber = null

  /* Gloal Unique identifier (Importation form) */
  String fciNumber = null

  /* RECOPI number */
  String recopiNumber = null

  /* additional information about product (referenced standard, complementary info, etc) */
  String infAdProd = null

    Vehicle vehicle = null

    Medicine medicine = null

    Weapon weapon = null

    Fuel fuel = null

  /* Inform that for this item the Entity referenced is ICMS Substitute */
  Boolean entityIsIcmsSubstitute = null

  /* Inform that this item has ICMS withheld for transport value service. */
  Boolean isTransportIcmsWithheld = null

    LineForGoodsIcmsTaxRelief icmsTaxRelief = null

  /* Exportation detail */
  List<LineForGoodsExport> export = new ArrayList<LineForGoodsExport>()

  /* Import declaration */
  List<LineForGoodsDi> di = new ArrayList<LineForGoodsDi>()

    LineForGoodsCalculatedTax calculatedTax = null

    AgastExtendForSefaz extend = null
  

}

