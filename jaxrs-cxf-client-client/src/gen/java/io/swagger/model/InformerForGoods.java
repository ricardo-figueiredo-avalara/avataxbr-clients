package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.EntityInformerForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.InformerForGoodsCsts;
import io.swagger.model.LineForGoods;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Internal Type used to references all taxes.")
public class InformerForGoods  {
  
  @ApiModelProperty(example = "null", value = "")
  private HeaderForGoods header = null;
  @ApiModelProperty(example = "null", value = "")
  private LineForGoods line = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoods company = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoods entity = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoods emitter = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoods receiver = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoods transporter = null;
  @ApiModelProperty(example = "null", value = "")
  private InformerForGoodsCsts csts = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal amount = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal discount = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal quantity = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal unitPrice = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal freightAmount = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal insuranceAmount = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal otherCostAmount = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal exemptValue = null;

 /**
   * Get header
   * @return header
  **/
  public HeaderForGoods getHeader() {
    return header;
  }
  public void setHeader(HeaderForGoods header) {
    this.header = header;
  }
 /**
   * Get line
   * @return line
  **/
  public LineForGoods getLine() {
    return line;
  }
  public void setLine(LineForGoods line) {
    this.line = line;
  }
 /**
   * Get company
   * @return company
  **/
  public EntityInformerForGoods getCompany() {
    return company;
  }
  public void setCompany(EntityInformerForGoods company) {
    this.company = company;
  }
 /**
   * Get entity
   * @return entity
  **/
  public EntityInformerForGoods getEntity() {
    return entity;
  }
  public void setEntity(EntityInformerForGoods entity) {
    this.entity = entity;
  }
 /**
   * Get emitter
   * @return emitter
  **/
  public EntityInformerForGoods getEmitter() {
    return emitter;
  }
  public void setEmitter(EntityInformerForGoods emitter) {
    this.emitter = emitter;
  }
 /**
   * Get receiver
   * @return receiver
  **/
  public EntityInformerForGoods getReceiver() {
    return receiver;
  }
  public void setReceiver(EntityInformerForGoods receiver) {
    this.receiver = receiver;
  }
 /**
   * Get transporter
   * @return transporter
  **/
  public EntityInformerForGoods getTransporter() {
    return transporter;
  }
  public void setTransporter(EntityInformerForGoods transporter) {
    this.transporter = transporter;
  }
 /**
   * Get csts
   * @return csts
  **/
  public InformerForGoodsCsts getCsts() {
    return csts;
  }
  public void setCsts(InformerForGoodsCsts csts) {
    this.csts = csts;
  }
 /**
   * Get amount
   * @return amount
  **/
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
 /**
   * Get discount
   * @return discount
  **/
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }
 /**
   * Get quantity
   * @return quantity
  **/
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }
 /**
   * Get unitPrice
   * @return unitPrice
  **/
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }
 /**
   * Get freightAmount
   * @return freightAmount
  **/
  public BigDecimal getFreightAmount() {
    return freightAmount;
  }
  public void setFreightAmount(BigDecimal freightAmount) {
    this.freightAmount = freightAmount;
  }
 /**
   * Get insuranceAmount
   * @return insuranceAmount
  **/
  public BigDecimal getInsuranceAmount() {
    return insuranceAmount;
  }
  public void setInsuranceAmount(BigDecimal insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }
 /**
   * Get otherCostAmount
   * @return otherCostAmount
  **/
  public BigDecimal getOtherCostAmount() {
    return otherCostAmount;
  }
  public void setOtherCostAmount(BigDecimal otherCostAmount) {
    this.otherCostAmount = otherCostAmount;
  }
 /**
   * Get exemptValue
   * @return exemptValue
  **/
  public BigDecimal getExemptValue() {
    return exemptValue;
  }
  public void setExemptValue(BigDecimal exemptValue) {
    this.exemptValue = exemptValue;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformerForGoods {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    emitter: ").append(toIndentedString(emitter)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    transporter: ").append(toIndentedString(transporter)).append("\n");
    sb.append("    csts: ").append(toIndentedString(csts)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    freightAmount: ").append(toIndentedString(freightAmount)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    otherCostAmount: ").append(toIndentedString(otherCostAmount)).append("\n");
    sb.append("    exemptValue: ").append(toIndentedString(exemptValue)).append("\n");
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

