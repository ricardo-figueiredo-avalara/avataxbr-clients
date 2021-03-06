/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * LineForSefazGoods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class LineForSefazGoods {
  @SerializedName("lineCode")
  private Integer lineCode = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("avalaraGoodsAndServicesType")
  private String avalaraGoodsAndServicesType = null;

  @SerializedName("numberOfItems")
  private Double numberOfItems = 1.0d;

  @SerializedName("returnedPercentageAmount")
  private Double returnedPercentageAmount = null;

  @SerializedName("lineUnitPrice")
  private Double lineUnitPrice = null;

  @SerializedName("lineAmount")
  private Double lineAmount = null;

  @SerializedName("itemDescription")
  private String itemDescription = null;

  @SerializedName("lineTaxedDiscount")
  private Double lineTaxedDiscount = null;

  @SerializedName("lineUntaxedDiscount")
  private Double lineUntaxedDiscount = null;

  /**
   * This is a enumeration folowing table
   */
  public enum UseTypeEnum {
    @SerializedName("use or consumption")
    USE_OR_CONSUMPTION("use or consumption"),
    
    @SerializedName("resale")
    RESALE("resale"),
    
    @SerializedName("agricultural production")
    AGRICULTURAL_PRODUCTION("agricultural production"),
    
    @SerializedName("production")
    PRODUCTION("production"),
    
    @SerializedName("use or consumption on business establishment")
    USE_OR_CONSUMPTION_ON_BUSINESS_ESTABLISHMENT("use or consumption on business establishment"),
    
    @SerializedName("use or consumption on transporter service establishment")
    USE_OR_CONSUMPTION_ON_TRANSPORTER_SERVICE_ESTABLISHMENT("use or consumption on transporter service establishment"),
    
    @SerializedName("use or consumption on communication service establishment")
    USE_OR_CONSUMPTION_ON_COMMUNICATION_SERVICE_ESTABLISHMENT("use or consumption on communication service establishment"),
    
    @SerializedName("use or consumption on demand by contract")
    USE_OR_CONSUMPTION_ON_DEMAND_BY_CONTRACT("use or consumption on demand by contract"),
    
    @SerializedName("use or consumption on energy supplier establishment")
    USE_OR_CONSUMPTION_ON_ENERGY_SUPPLIER_ESTABLISHMENT("use or consumption on energy supplier establishment"),
    
    @SerializedName("use or consumption of fuel transaction type exportation")
    USE_OR_CONSUMPTION_OF_FUEL_TRANSACTION_TYPE_EXPORTATION("use or consumption of fuel transaction type exportation"),
    
    @SerializedName("fixed assets")
    FIXED_ASSETS("fixed assets"),
    
    @SerializedName("resale export")
    RESALE_EXPORT("resale export"),
    
    @SerializedName("resale icms exempt")
    RESALE_ICMS_EXEMPT("resale icms exempt"),
    
    @SerializedName("resale buyer under the same icmsSt tax rule")
    RESALE_BUYER_UNDER_THE_SAME_ICMSST_TAX_RULE("resale buyer under the same icmsSt tax rule"),
    
    @SerializedName("transport of goods that don't need invoice (nf)")
    TRANSPORT_OF_GOODS_THAT_DON_T_NEED_INVOICE_NF_("transport of goods that don't need invoice (nf)");

    private String value;

    UseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("useType")
  private UseTypeEnum useType = null;

  @SerializedName("processScenario")
  private String processScenario = null;

  @SerializedName("cfop")
  private Integer cfop = null;

  @SerializedName("hasStockImpact")
  private Boolean hasStockImpact = null;

  @SerializedName("hasFinantialImpact")
  private Boolean hasFinantialImpact = null;

  @SerializedName("freightAmount")
  private Double freightAmount = null;

  @SerializedName("insuranceAmount")
  private Double insuranceAmount = null;

  @SerializedName("otherCostAmount")
  private Double otherCostAmount = null;

  @SerializedName("indTotType")
  private Boolean indTotType = true;

  @SerializedName("orderNumber")
  private String orderNumber = null;

  @SerializedName("orderItemNumber")
  private String orderItemNumber = null;

  @SerializedName("fciNumber")
  private String fciNumber = null;

  @SerializedName("recopiNumber")
  private String recopiNumber = null;

  @SerializedName("infAdProd")
  private String infAdProd = null;

  @SerializedName("vehicle")
  private Vehicle vehicle = null;

  @SerializedName("medicine")
  private Medicine medicine = null;

  @SerializedName("weapon")
  private Weapon weapon = null;

  @SerializedName("fuel")
  private Fuel fuel = null;

  @SerializedName("entityIsIcmsSubstitute")
  private Boolean entityIsIcmsSubstitute = null;

  @SerializedName("isTransportIcmsWithheld")
  private Boolean isTransportIcmsWithheld = null;

  @SerializedName("icmsTaxRelief")
  private LineForGoodsIcmsTaxRelief icmsTaxRelief = null;

  @SerializedName("export")
  private List<LineForGoodsExport> export = new ArrayList<LineForGoodsExport>();

  @SerializedName("di")
  private List<LineForGoodsDi> di = new ArrayList<LineForGoodsDi>();

  @SerializedName("calculatedTax")
  private LineForGoodsCalculatedTax calculatedTax = null;

  @SerializedName("extend")
  private AgastExtendForSefaz extend = null;

  public LineForSefazGoods lineCode(Integer lineCode) {
    this.lineCode = lineCode;
    return this;
  }

   /**
   * This string is a unique identifier for this line in the transaction
   * @return lineCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a unique identifier for this line in the transaction")
  public Integer getLineCode() {
    return lineCode;
  }

  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }

  public LineForSefazGoods itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @return itemCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public LineForSefazGoods avalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
    return this;
  }

   /**
   * AGAST CODE for itemCode
   * @return avalaraGoodsAndServicesType
  **/
  @ApiModelProperty(example = "null", value = "AGAST CODE for itemCode")
  public String getAvalaraGoodsAndServicesType() {
    return avalaraGoodsAndServicesType;
  }

  public void setAvalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
  }

  public LineForSefazGoods numberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

   /**
   * This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @return numberOfItems
  **/
  @ApiModelProperty(example = "null", required = true, value = "This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1")
  public Double getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public LineForSefazGoods returnedPercentageAmount(Double returnedPercentageAmount) {
    this.returnedPercentageAmount = returnedPercentageAmount;
    return this;
  }

   /**
   * when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
   * @return returnedPercentageAmount
  **/
  @ApiModelProperty(example = "null", value = "when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00")
  public Double getReturnedPercentageAmount() {
    return returnedPercentageAmount;
  }

  public void setReturnedPercentageAmount(Double returnedPercentageAmount) {
    this.returnedPercentageAmount = returnedPercentageAmount;
  }

  public LineForSefazGoods lineUnitPrice(Double lineUnitPrice) {
    this.lineUnitPrice = lineUnitPrice;
    return this;
  }

   /**
   * This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
   * @return lineUnitPrice
  **/
  @ApiModelProperty(example = "null", value = "This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.")
  public Double getLineUnitPrice() {
    return lineUnitPrice;
  }

  public void setLineUnitPrice(Double lineUnitPrice) {
    this.lineUnitPrice = lineUnitPrice;
  }

  public LineForSefazGoods lineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

   /**
   * In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
   * @return lineAmount
  **/
  @ApiModelProperty(example = "null", required = true, value = "In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).")
  public Double getLineAmount() {
    return lineAmount;
  }

  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }

  public LineForSefazGoods itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @return itemDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string captures the description of the item represented by this line, will be used LC 116")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public LineForSefazGoods lineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
    return this;
  }

   /**
   * Discount conditional, This decimal 13 integers and 0 to 2 decimals
   * @return lineTaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "Discount conditional, This decimal 13 integers and 0 to 2 decimals")
  public Double getLineTaxedDiscount() {
    return lineTaxedDiscount;
  }

  public void setLineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
  }

  public LineForSefazGoods lineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
    return this;
  }

   /**
   * discount unconditional, This decimal 13 integers and 0 to 2 decimals
   * @return lineUntaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "discount unconditional, This decimal 13 integers and 0 to 2 decimals")
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }

  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }

  public LineForSefazGoods useType(UseTypeEnum useType) {
    this.useType = useType;
    return this;
  }

   /**
   * This is a enumeration folowing table
   * @return useType
  **/
  @ApiModelProperty(example = "null", required = true, value = "This is a enumeration folowing table")
  public UseTypeEnum getUseType() {
    return useType;
  }

  public void setUseType(UseTypeEnum useType) {
    this.useType = useType;
  }

  public LineForSefazGoods processScenario(String processScenario) {
    this.processScenario = processScenario;
    return this;
  }

   /**
   * Reference to process configurantion of this transaction, See ProcessScenario definition
   * @return processScenario
  **/
  @ApiModelProperty(example = "null", required = true, value = "Reference to process configurantion of this transaction, See ProcessScenario definition")
  public String getProcessScenario() {
    return processScenario;
  }

  public void setProcessScenario(String processScenario) {
    this.processScenario = processScenario;
  }

  public LineForSefazGoods cfop(Integer cfop) {
    this.cfop = cfop;
    return this;
  }

   /**
   * Fiscal Operation Code of transport service
   * @return cfop
  **/
  @ApiModelProperty(example = "null", value = "Fiscal Operation Code of transport service")
  public Integer getCfop() {
    return cfop;
  }

  public void setCfop(Integer cfop) {
    this.cfop = cfop;
  }

  public LineForSefazGoods hasStockImpact(Boolean hasStockImpact) {
    this.hasStockImpact = hasStockImpact;
    return this;
  }

   /**
   * return if this transaction has stock impact for this process or CFOP
   * @return hasStockImpact
  **/
  @ApiModelProperty(example = "null", value = "return if this transaction has stock impact for this process or CFOP")
  public Boolean getHasStockImpact() {
    return hasStockImpact;
  }

  public void setHasStockImpact(Boolean hasStockImpact) {
    this.hasStockImpact = hasStockImpact;
  }

  public LineForSefazGoods hasFinantialImpact(Boolean hasFinantialImpact) {
    this.hasFinantialImpact = hasFinantialImpact;
    return this;
  }

   /**
   * return if this transaction has finantial impact for this process or CFOP
   * @return hasFinantialImpact
  **/
  @ApiModelProperty(example = "null", value = "return if this transaction has finantial impact for this process or CFOP")
  public Boolean getHasFinantialImpact() {
    return hasFinantialImpact;
  }

  public void setHasFinantialImpact(Boolean hasFinantialImpact) {
    this.hasFinantialImpact = hasFinantialImpact;
  }

  public LineForSefazGoods freightAmount(Double freightAmount) {
    this.freightAmount = freightAmount;
    return this;
  }

   /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return freightAmount
  **/
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  public Double getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(Double freightAmount) {
    this.freightAmount = freightAmount;
  }

  public LineForSefazGoods insuranceAmount(Double insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

   /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return insuranceAmount
  **/
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  public Double getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(Double insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public LineForSefazGoods otherCostAmount(Double otherCostAmount) {
    this.otherCostAmount = otherCostAmount;
    return this;
  }

   /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return otherCostAmount
  **/
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  public Double getOtherCostAmount() {
    return otherCostAmount;
  }

  public void setOtherCostAmount(Double otherCostAmount) {
    this.otherCostAmount = otherCostAmount;
  }

  public LineForSefazGoods indTotType(Boolean indTotType) {
    this.indTotType = indTotType;
    return this;
  }

   /**
   * The item value will compose the invoice total value.
   * @return indTotType
  **/
  @ApiModelProperty(example = "null", value = "The item value will compose the invoice total value.")
  public Boolean getIndTotType() {
    return indTotType;
  }

  public void setIndTotType(Boolean indTotType) {
    this.indTotType = indTotType;
  }

  public LineForSefazGoods orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * order number, information used for B2B control process
   * @return orderNumber
  **/
  @ApiModelProperty(example = "null", value = "order number, information used for B2B control process")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public LineForSefazGoods orderItemNumber(String orderItemNumber) {
    this.orderItemNumber = orderItemNumber;
    return this;
  }

   /**
   * number of the item from order number, information used for B2B control process
   * @return orderItemNumber
  **/
  @ApiModelProperty(example = "null", value = "number of the item from order number, information used for B2B control process")
  public String getOrderItemNumber() {
    return orderItemNumber;
  }

  public void setOrderItemNumber(String orderItemNumber) {
    this.orderItemNumber = orderItemNumber;
  }

  public LineForSefazGoods fciNumber(String fciNumber) {
    this.fciNumber = fciNumber;
    return this;
  }

   /**
   * Gloal Unique identifier (Importation form)
   * @return fciNumber
  **/
  @ApiModelProperty(example = "null", value = "Gloal Unique identifier (Importation form)")
  public String getFciNumber() {
    return fciNumber;
  }

  public void setFciNumber(String fciNumber) {
    this.fciNumber = fciNumber;
  }

  public LineForSefazGoods recopiNumber(String recopiNumber) {
    this.recopiNumber = recopiNumber;
    return this;
  }

   /**
   * RECOPI number
   * @return recopiNumber
  **/
  @ApiModelProperty(example = "null", value = "RECOPI number")
  public String getRecopiNumber() {
    return recopiNumber;
  }

  public void setRecopiNumber(String recopiNumber) {
    this.recopiNumber = recopiNumber;
  }

  public LineForSefazGoods infAdProd(String infAdProd) {
    this.infAdProd = infAdProd;
    return this;
  }

   /**
   * additional information about product (referenced standard, complementary info, etc)
   * @return infAdProd
  **/
  @ApiModelProperty(example = "null", value = "additional information about product (referenced standard, complementary info, etc)")
  public String getInfAdProd() {
    return infAdProd;
  }

  public void setInfAdProd(String infAdProd) {
    this.infAdProd = infAdProd;
  }

  public LineForSefazGoods vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @ApiModelProperty(example = "null", value = "")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public LineForSefazGoods medicine(Medicine medicine) {
    this.medicine = medicine;
    return this;
  }

   /**
   * Get medicine
   * @return medicine
  **/
  @ApiModelProperty(example = "null", value = "")
  public Medicine getMedicine() {
    return medicine;
  }

  public void setMedicine(Medicine medicine) {
    this.medicine = medicine;
  }

  public LineForSefazGoods weapon(Weapon weapon) {
    this.weapon = weapon;
    return this;
  }

   /**
   * Get weapon
   * @return weapon
  **/
  @ApiModelProperty(example = "null", value = "")
  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public LineForSefazGoods fuel(Fuel fuel) {
    this.fuel = fuel;
    return this;
  }

   /**
   * Get fuel
   * @return fuel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Fuel getFuel() {
    return fuel;
  }

  public void setFuel(Fuel fuel) {
    this.fuel = fuel;
  }

  public LineForSefazGoods entityIsIcmsSubstitute(Boolean entityIsIcmsSubstitute) {
    this.entityIsIcmsSubstitute = entityIsIcmsSubstitute;
    return this;
  }

   /**
   * Inform that for this item the Entity referenced is ICMS Substitute
   * @return entityIsIcmsSubstitute
  **/
  @ApiModelProperty(example = "null", value = "Inform that for this item the Entity referenced is ICMS Substitute")
  public Boolean getEntityIsIcmsSubstitute() {
    return entityIsIcmsSubstitute;
  }

  public void setEntityIsIcmsSubstitute(Boolean entityIsIcmsSubstitute) {
    this.entityIsIcmsSubstitute = entityIsIcmsSubstitute;
  }

  public LineForSefazGoods isTransportIcmsWithheld(Boolean isTransportIcmsWithheld) {
    this.isTransportIcmsWithheld = isTransportIcmsWithheld;
    return this;
  }

   /**
   * Inform that this item has ICMS withheld for transport value service.
   * @return isTransportIcmsWithheld
  **/
  @ApiModelProperty(example = "null", value = "Inform that this item has ICMS withheld for transport value service.")
  public Boolean getIsTransportIcmsWithheld() {
    return isTransportIcmsWithheld;
  }

  public void setIsTransportIcmsWithheld(Boolean isTransportIcmsWithheld) {
    this.isTransportIcmsWithheld = isTransportIcmsWithheld;
  }

  public LineForSefazGoods icmsTaxRelief(LineForGoodsIcmsTaxRelief icmsTaxRelief) {
    this.icmsTaxRelief = icmsTaxRelief;
    return this;
  }

   /**
   * Get icmsTaxRelief
   * @return icmsTaxRelief
  **/
  @ApiModelProperty(example = "null", value = "")
  public LineForGoodsIcmsTaxRelief getIcmsTaxRelief() {
    return icmsTaxRelief;
  }

  public void setIcmsTaxRelief(LineForGoodsIcmsTaxRelief icmsTaxRelief) {
    this.icmsTaxRelief = icmsTaxRelief;
  }

  public LineForSefazGoods export(List<LineForGoodsExport> export) {
    this.export = export;
    return this;
  }

  public LineForSefazGoods addExportItem(LineForGoodsExport exportItem) {
    this.export.add(exportItem);
    return this;
  }

   /**
   * Exportation detail
   * @return export
  **/
  @ApiModelProperty(example = "null", value = "Exportation detail")
  public List<LineForGoodsExport> getExport() {
    return export;
  }

  public void setExport(List<LineForGoodsExport> export) {
    this.export = export;
  }

  public LineForSefazGoods di(List<LineForGoodsDi> di) {
    this.di = di;
    return this;
  }

  public LineForSefazGoods addDiItem(LineForGoodsDi diItem) {
    this.di.add(diItem);
    return this;
  }

   /**
   * Import declaration
   * @return di
  **/
  @ApiModelProperty(example = "null", value = "Import declaration")
  public List<LineForGoodsDi> getDi() {
    return di;
  }

  public void setDi(List<LineForGoodsDi> di) {
    this.di = di;
  }

  public LineForSefazGoods calculatedTax(LineForGoodsCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
    return this;
  }

   /**
   * Get calculatedTax
   * @return calculatedTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public LineForGoodsCalculatedTax getCalculatedTax() {
    return calculatedTax;
  }

  public void setCalculatedTax(LineForGoodsCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
  }

  public LineForSefazGoods extend(AgastExtendForSefaz extend) {
    this.extend = extend;
    return this;
  }

   /**
   * Get extend
   * @return extend
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastExtendForSefaz getExtend() {
    return extend;
  }

  public void setExtend(AgastExtendForSefaz extend) {
    this.extend = extend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForSefazGoods lineForSefazGoods = (LineForSefazGoods) o;
    return Objects.equals(this.lineCode, lineForSefazGoods.lineCode) &&
        Objects.equals(this.itemCode, lineForSefazGoods.itemCode) &&
        Objects.equals(this.avalaraGoodsAndServicesType, lineForSefazGoods.avalaraGoodsAndServicesType) &&
        Objects.equals(this.numberOfItems, lineForSefazGoods.numberOfItems) &&
        Objects.equals(this.returnedPercentageAmount, lineForSefazGoods.returnedPercentageAmount) &&
        Objects.equals(this.lineUnitPrice, lineForSefazGoods.lineUnitPrice) &&
        Objects.equals(this.lineAmount, lineForSefazGoods.lineAmount) &&
        Objects.equals(this.itemDescription, lineForSefazGoods.itemDescription) &&
        Objects.equals(this.lineTaxedDiscount, lineForSefazGoods.lineTaxedDiscount) &&
        Objects.equals(this.lineUntaxedDiscount, lineForSefazGoods.lineUntaxedDiscount) &&
        Objects.equals(this.useType, lineForSefazGoods.useType) &&
        Objects.equals(this.processScenario, lineForSefazGoods.processScenario) &&
        Objects.equals(this.cfop, lineForSefazGoods.cfop) &&
        Objects.equals(this.hasStockImpact, lineForSefazGoods.hasStockImpact) &&
        Objects.equals(this.hasFinantialImpact, lineForSefazGoods.hasFinantialImpact) &&
        Objects.equals(this.freightAmount, lineForSefazGoods.freightAmount) &&
        Objects.equals(this.insuranceAmount, lineForSefazGoods.insuranceAmount) &&
        Objects.equals(this.otherCostAmount, lineForSefazGoods.otherCostAmount) &&
        Objects.equals(this.indTotType, lineForSefazGoods.indTotType) &&
        Objects.equals(this.orderNumber, lineForSefazGoods.orderNumber) &&
        Objects.equals(this.orderItemNumber, lineForSefazGoods.orderItemNumber) &&
        Objects.equals(this.fciNumber, lineForSefazGoods.fciNumber) &&
        Objects.equals(this.recopiNumber, lineForSefazGoods.recopiNumber) &&
        Objects.equals(this.infAdProd, lineForSefazGoods.infAdProd) &&
        Objects.equals(this.vehicle, lineForSefazGoods.vehicle) &&
        Objects.equals(this.medicine, lineForSefazGoods.medicine) &&
        Objects.equals(this.weapon, lineForSefazGoods.weapon) &&
        Objects.equals(this.fuel, lineForSefazGoods.fuel) &&
        Objects.equals(this.entityIsIcmsSubstitute, lineForSefazGoods.entityIsIcmsSubstitute) &&
        Objects.equals(this.isTransportIcmsWithheld, lineForSefazGoods.isTransportIcmsWithheld) &&
        Objects.equals(this.icmsTaxRelief, lineForSefazGoods.icmsTaxRelief) &&
        Objects.equals(this.export, lineForSefazGoods.export) &&
        Objects.equals(this.di, lineForSefazGoods.di) &&
        Objects.equals(this.calculatedTax, lineForSefazGoods.calculatedTax) &&
        Objects.equals(this.extend, lineForSefazGoods.extend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineCode, itemCode, avalaraGoodsAndServicesType, numberOfItems, returnedPercentageAmount, lineUnitPrice, lineAmount, itemDescription, lineTaxedDiscount, lineUntaxedDiscount, useType, processScenario, cfop, hasStockImpact, hasFinantialImpact, freightAmount, insuranceAmount, otherCostAmount, indTotType, orderNumber, orderItemNumber, fciNumber, recopiNumber, infAdProd, vehicle, medicine, weapon, fuel, entityIsIcmsSubstitute, isTransportIcmsWithheld, icmsTaxRelief, export, di, calculatedTax, extend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForSefazGoods {\n");
    
    sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    avalaraGoodsAndServicesType: ").append(toIndentedString(avalaraGoodsAndServicesType)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    returnedPercentageAmount: ").append(toIndentedString(returnedPercentageAmount)).append("\n");
    sb.append("    lineUnitPrice: ").append(toIndentedString(lineUnitPrice)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    lineTaxedDiscount: ").append(toIndentedString(lineTaxedDiscount)).append("\n");
    sb.append("    lineUntaxedDiscount: ").append(toIndentedString(lineUntaxedDiscount)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    processScenario: ").append(toIndentedString(processScenario)).append("\n");
    sb.append("    cfop: ").append(toIndentedString(cfop)).append("\n");
    sb.append("    hasStockImpact: ").append(toIndentedString(hasStockImpact)).append("\n");
    sb.append("    hasFinantialImpact: ").append(toIndentedString(hasFinantialImpact)).append("\n");
    sb.append("    freightAmount: ").append(toIndentedString(freightAmount)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    otherCostAmount: ").append(toIndentedString(otherCostAmount)).append("\n");
    sb.append("    indTotType: ").append(toIndentedString(indTotType)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderItemNumber: ").append(toIndentedString(orderItemNumber)).append("\n");
    sb.append("    fciNumber: ").append(toIndentedString(fciNumber)).append("\n");
    sb.append("    recopiNumber: ").append(toIndentedString(recopiNumber)).append("\n");
    sb.append("    infAdProd: ").append(toIndentedString(infAdProd)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    medicine: ").append(toIndentedString(medicine)).append("\n");
    sb.append("    weapon: ").append(toIndentedString(weapon)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
    sb.append("    entityIsIcmsSubstitute: ").append(toIndentedString(entityIsIcmsSubstitute)).append("\n");
    sb.append("    isTransportIcmsWithheld: ").append(toIndentedString(isTransportIcmsWithheld)).append("\n");
    sb.append("    icmsTaxRelief: ").append(toIndentedString(icmsTaxRelief)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    di: ").append(toIndentedString(di)).append("\n");
    sb.append("    calculatedTax: ").append(toIndentedString(calculatedTax)).append("\n");
    sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

