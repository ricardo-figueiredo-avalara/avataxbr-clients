package io.swagger.model;

import io.swagger.model.AgastExtendForSefaz;
import io.swagger.model.Fuel;
import io.swagger.model.LineForGoods;
import io.swagger.model.LineForGoodsCalculatedTax;
import io.swagger.model.LineForGoodsDi;
import io.swagger.model.LineForGoodsExport;
import io.swagger.model.LineForGoodsIcmsTaxRelief;
import io.swagger.model.Medicine;
import io.swagger.model.Vehicle;
import io.swagger.model.Weapon;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LineForSefazGoods  {
  
  @ApiModelProperty(example = "null", required = true, value = "This string is a unique identifier for this line in the transaction")
  private Integer lineCode = null;
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.")
  private String itemCode = null;
  @ApiModelProperty(example = "null", value = "AGAST CODE for itemCode")
  private String avalaraGoodsAndServicesType = null;
  @ApiModelProperty(example = "null", required = true, value = "This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1")
  private Double numberOfItems = 1.0d;
  @ApiModelProperty(example = "null", value = "when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00")
  private Double returnedPercentageAmount = null;
  @ApiModelProperty(example = "null", value = "This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.")
  private Double lineUnitPrice = null;
  @ApiModelProperty(example = "null", required = true, value = "In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).")
  private Double lineAmount = null;
  @ApiModelProperty(example = "null", required = true, value = "This string captures the description of the item represented by this line, will be used LC 116")
  private String itemDescription = null;
  @ApiModelProperty(example = "null", value = "Discount conditional, This decimal 13 integers and 0 to 2 decimals")
  private Double lineTaxedDiscount = null;
  @ApiModelProperty(example = "null", value = "discount unconditional, This decimal 13 integers and 0 to 2 decimals")
  private Double lineUntaxedDiscount = null;

@XmlType(name="UseTypeEnum")
@XmlEnum(String.class)
public enum UseTypeEnum {

    @XmlEnumValue("use or consumption") USE_OR_CONSUMPTION(String.valueOf("use or consumption")), @XmlEnumValue("resale") RESALE(String.valueOf("resale")), @XmlEnumValue("agricultural production") AGRICULTURAL_PRODUCTION(String.valueOf("agricultural production")), @XmlEnumValue("production") PRODUCTION(String.valueOf("production")), @XmlEnumValue("use or consumption on business establishment") USE_OR_CONSUMPTION_ON_BUSINESS_ESTABLISHMENT(String.valueOf("use or consumption on business establishment")), @XmlEnumValue("use or consumption on transporter service establishment") USE_OR_CONSUMPTION_ON_TRANSPORTER_SERVICE_ESTABLISHMENT(String.valueOf("use or consumption on transporter service establishment")), @XmlEnumValue("use or consumption on communication service establishment") USE_OR_CONSUMPTION_ON_COMMUNICATION_SERVICE_ESTABLISHMENT(String.valueOf("use or consumption on communication service establishment")), @XmlEnumValue("use or consumption on demand by contract") USE_OR_CONSUMPTION_ON_DEMAND_BY_CONTRACT(String.valueOf("use or consumption on demand by contract")), @XmlEnumValue("use or consumption on energy supplier establishment") USE_OR_CONSUMPTION_ON_ENERGY_SUPPLIER_ESTABLISHMENT(String.valueOf("use or consumption on energy supplier establishment")), @XmlEnumValue("use or consumption of fuel transaction type exportation") USE_OR_CONSUMPTION_OF_FUEL_TRANSACTION_TYPE_EXPORTATION(String.valueOf("use or consumption of fuel transaction type exportation")), @XmlEnumValue("fixed assets") FIXED_ASSETS(String.valueOf("fixed assets")), @XmlEnumValue("resale export") RESALE_EXPORT(String.valueOf("resale export")), @XmlEnumValue("resale icms exempt") RESALE_ICMS_EXEMPT(String.valueOf("resale icms exempt")), @XmlEnumValue("resale buyer under the same icmsSt tax rule") RESALE_BUYER_UNDER_THE_SAME_ICMSST_TAX_RULE(String.valueOf("resale buyer under the same icmsSt tax rule")), @XmlEnumValue("transport of goods that don't need invoice (nf)") TRANSPORT_OF_GOODS_THAT_DON_T_NEED_INVOICE_NF_(String.valueOf("transport of goods that don't need invoice (nf)"));


    private String value;

    UseTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UseTypeEnum fromValue(String v) {
        for (UseTypeEnum b : UseTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "This is a enumeration folowing table")
  private UseTypeEnum useType = null;
  @ApiModelProperty(example = "null", required = true, value = "Reference to process configurantion of this transaction, See ProcessScenario definition")
  private String processScenario = null;
  @ApiModelProperty(example = "null", value = "Fiscal Operation Code of transport service")
  private Integer cfop = null;
  @ApiModelProperty(example = "null", value = "return if this transaction has stock impact for this process or CFOP")
  private Boolean hasStockImpact = null;
  @ApiModelProperty(example = "null", value = "return if this transaction has finantial impact for this process or CFOP")
  private Boolean hasFinantialImpact = null;
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  private Double freightAmount = null;
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  private Double insuranceAmount = null;
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 0 to 2 decimals")
  private Double otherCostAmount = null;
  @ApiModelProperty(example = "null", value = "The item value will compose the invoice total value.")
  private Boolean indTotType = true;
  @ApiModelProperty(example = "null", value = "order number, information used for B2B control process")
  private String orderNumber = null;
  @ApiModelProperty(example = "null", value = "number of the item from order number, information used for B2B control process")
  private String orderItemNumber = null;
  @ApiModelProperty(example = "null", value = "Gloal Unique identifier (Importation form)")
  private String fciNumber = null;
  @ApiModelProperty(example = "null", value = "RECOPI number")
  private String recopiNumber = null;
  @ApiModelProperty(example = "null", value = "additional information about product (referenced standard, complementary info, etc)")
  private String infAdProd = null;
  @ApiModelProperty(example = "null", value = "")
  private Vehicle vehicle = null;
  @ApiModelProperty(example = "null", value = "")
  private Medicine medicine = null;
  @ApiModelProperty(example = "null", value = "")
  private Weapon weapon = null;
  @ApiModelProperty(example = "null", value = "")
  private Fuel fuel = null;
  @ApiModelProperty(example = "null", value = "Inform that for this item the Entity referenced is ICMS Substitute")
  private Boolean entityIsIcmsSubstitute = null;
  @ApiModelProperty(example = "null", value = "Inform that this item has ICMS withheld for transport value service.")
  private Boolean isTransportIcmsWithheld = null;
  @ApiModelProperty(example = "null", value = "")
  private LineForGoodsIcmsTaxRelief icmsTaxRelief = null;
  @ApiModelProperty(example = "null", value = "Exportation detail")
  private List<LineForGoodsExport> export = new ArrayList<LineForGoodsExport>();
  @ApiModelProperty(example = "null", value = "Import declaration")
  private List<LineForGoodsDi> di = new ArrayList<LineForGoodsDi>();
  @ApiModelProperty(example = "null", value = "")
  private LineForGoodsCalculatedTax calculatedTax = null;
  @ApiModelProperty(example = "null", value = "")
  private AgastExtendForSefaz extend = null;

 /**
   * This string is a unique identifier for this line in the transaction
   * @return lineCode
  **/
  public Integer getLineCode() {
    return lineCode;
  }
  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }
 /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @return itemCode
  **/
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }
 /**
   * AGAST CODE for itemCode
   * @return avalaraGoodsAndServicesType
  **/
  public String getAvalaraGoodsAndServicesType() {
    return avalaraGoodsAndServicesType;
  }
  public void setAvalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
  }
 /**
   * This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @return numberOfItems
  **/
  public Double getNumberOfItems() {
    return numberOfItems;
  }
  public void setNumberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
  }
 /**
   * when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
   * @return returnedPercentageAmount
  **/
  public Double getReturnedPercentageAmount() {
    return returnedPercentageAmount;
  }
  public void setReturnedPercentageAmount(Double returnedPercentageAmount) {
    this.returnedPercentageAmount = returnedPercentageAmount;
  }
 /**
   * This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
   * @return lineUnitPrice
  **/
  public Double getLineUnitPrice() {
    return lineUnitPrice;
  }
  public void setLineUnitPrice(Double lineUnitPrice) {
    this.lineUnitPrice = lineUnitPrice;
  }
 /**
   * In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
   * @return lineAmount
  **/
  public Double getLineAmount() {
    return lineAmount;
  }
  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }
 /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @return itemDescription
  **/
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }
 /**
   * Discount conditional, This decimal 13 integers and 0 to 2 decimals
   * @return lineTaxedDiscount
  **/
  public Double getLineTaxedDiscount() {
    return lineTaxedDiscount;
  }
  public void setLineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
  }
 /**
   * discount unconditional, This decimal 13 integers and 0 to 2 decimals
   * @return lineUntaxedDiscount
  **/
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }
  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }
 /**
   * This is a enumeration folowing table
   * @return useType
  **/
  public UseTypeEnum getUseType() {
    return useType;
  }
  public void setUseType(UseTypeEnum useType) {
    this.useType = useType;
  }
 /**
   * Reference to process configurantion of this transaction, See ProcessScenario definition
   * @return processScenario
  **/
  public String getProcessScenario() {
    return processScenario;
  }
  public void setProcessScenario(String processScenario) {
    this.processScenario = processScenario;
  }
 /**
   * Fiscal Operation Code of transport service
   * @return cfop
  **/
  public Integer getCfop() {
    return cfop;
  }
  public void setCfop(Integer cfop) {
    this.cfop = cfop;
  }
 /**
   * return if this transaction has stock impact for this process or CFOP
   * @return hasStockImpact
  **/
  public Boolean getHasStockImpact() {
    return hasStockImpact;
  }
  public void setHasStockImpact(Boolean hasStockImpact) {
    this.hasStockImpact = hasStockImpact;
  }
 /**
   * return if this transaction has finantial impact for this process or CFOP
   * @return hasFinantialImpact
  **/
  public Boolean getHasFinantialImpact() {
    return hasFinantialImpact;
  }
  public void setHasFinantialImpact(Boolean hasFinantialImpact) {
    this.hasFinantialImpact = hasFinantialImpact;
  }
 /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return freightAmount
  **/
  public Double getFreightAmount() {
    return freightAmount;
  }
  public void setFreightAmount(Double freightAmount) {
    this.freightAmount = freightAmount;
  }
 /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return insuranceAmount
  **/
  public Double getInsuranceAmount() {
    return insuranceAmount;
  }
  public void setInsuranceAmount(Double insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }
 /**
   * This decimal 13 integers and 0 to 2 decimals
   * @return otherCostAmount
  **/
  public Double getOtherCostAmount() {
    return otherCostAmount;
  }
  public void setOtherCostAmount(Double otherCostAmount) {
    this.otherCostAmount = otherCostAmount;
  }
 /**
   * The item value will compose the invoice total value.
   * @return indTotType
  **/
  public Boolean getIndTotType() {
    return indTotType;
  }
  public void setIndTotType(Boolean indTotType) {
    this.indTotType = indTotType;
  }
 /**
   * order number, information used for B2B control process
   * @return orderNumber
  **/
  public String getOrderNumber() {
    return orderNumber;
  }
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }
 /**
   * number of the item from order number, information used for B2B control process
   * @return orderItemNumber
  **/
  public String getOrderItemNumber() {
    return orderItemNumber;
  }
  public void setOrderItemNumber(String orderItemNumber) {
    this.orderItemNumber = orderItemNumber;
  }
 /**
   * Gloal Unique identifier (Importation form)
   * @return fciNumber
  **/
  public String getFciNumber() {
    return fciNumber;
  }
  public void setFciNumber(String fciNumber) {
    this.fciNumber = fciNumber;
  }
 /**
   * RECOPI number
   * @return recopiNumber
  **/
  public String getRecopiNumber() {
    return recopiNumber;
  }
  public void setRecopiNumber(String recopiNumber) {
    this.recopiNumber = recopiNumber;
  }
 /**
   * additional information about product (referenced standard, complementary info, etc)
   * @return infAdProd
  **/
  public String getInfAdProd() {
    return infAdProd;
  }
  public void setInfAdProd(String infAdProd) {
    this.infAdProd = infAdProd;
  }
 /**
   * Get vehicle
   * @return vehicle
  **/
  public Vehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
 /**
   * Get medicine
   * @return medicine
  **/
  public Medicine getMedicine() {
    return medicine;
  }
  public void setMedicine(Medicine medicine) {
    this.medicine = medicine;
  }
 /**
   * Get weapon
   * @return weapon
  **/
  public Weapon getWeapon() {
    return weapon;
  }
  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }
 /**
   * Get fuel
   * @return fuel
  **/
  public Fuel getFuel() {
    return fuel;
  }
  public void setFuel(Fuel fuel) {
    this.fuel = fuel;
  }
 /**
   * Inform that for this item the Entity referenced is ICMS Substitute
   * @return entityIsIcmsSubstitute
  **/
  public Boolean getEntityIsIcmsSubstitute() {
    return entityIsIcmsSubstitute;
  }
  public void setEntityIsIcmsSubstitute(Boolean entityIsIcmsSubstitute) {
    this.entityIsIcmsSubstitute = entityIsIcmsSubstitute;
  }
 /**
   * Inform that this item has ICMS withheld for transport value service.
   * @return isTransportIcmsWithheld
  **/
  public Boolean getIsTransportIcmsWithheld() {
    return isTransportIcmsWithheld;
  }
  public void setIsTransportIcmsWithheld(Boolean isTransportIcmsWithheld) {
    this.isTransportIcmsWithheld = isTransportIcmsWithheld;
  }
 /**
   * Get icmsTaxRelief
   * @return icmsTaxRelief
  **/
  public LineForGoodsIcmsTaxRelief getIcmsTaxRelief() {
    return icmsTaxRelief;
  }
  public void setIcmsTaxRelief(LineForGoodsIcmsTaxRelief icmsTaxRelief) {
    this.icmsTaxRelief = icmsTaxRelief;
  }
 /**
   * Exportation detail
   * @return export
  **/
  public List<LineForGoodsExport> getExport() {
    return export;
  }
  public void setExport(List<LineForGoodsExport> export) {
    this.export = export;
  }
 /**
   * Import declaration
   * @return di
  **/
  public List<LineForGoodsDi> getDi() {
    return di;
  }
  public void setDi(List<LineForGoodsDi> di) {
    this.di = di;
  }
 /**
   * Get calculatedTax
   * @return calculatedTax
  **/
  public LineForGoodsCalculatedTax getCalculatedTax() {
    return calculatedTax;
  }
  public void setCalculatedTax(LineForGoodsCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
  }
 /**
   * Get extend
   * @return extend
  **/
  public AgastExtendForSefaz getExtend() {
    return extend;
  }
  public void setExtend(AgastExtendForSefaz extend) {
    this.extend = extend;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

