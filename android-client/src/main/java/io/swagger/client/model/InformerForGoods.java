/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.EntityInformerForGoods;
import io.swagger.client.model.HeaderForGoods;
import io.swagger.client.model.InformerForGoodsCsts;
import io.swagger.client.model.LineForGoods;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Internal Type used to references all taxes.
 **/
@ApiModel(description = "Internal Type used to references all taxes.")
public class InformerForGoods {
  
  @SerializedName("header")
  private HeaderForGoods header = null;
  @SerializedName("line")
  private LineForGoods line = null;
  @SerializedName("_company")
  private EntityInformerForGoods company = null;
  @SerializedName("_entity")
  private EntityInformerForGoods entity = null;
  @SerializedName("emitter")
  private EntityInformerForGoods emitter = null;
  @SerializedName("receiver")
  private EntityInformerForGoods receiver = null;
  @SerializedName("transporter")
  private EntityInformerForGoods transporter = null;
  @SerializedName("csts")
  private InformerForGoodsCsts csts = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("discount")
  private BigDecimal discount = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("unitPrice")
  private BigDecimal unitPrice = null;
  @SerializedName("freightAmount")
  private BigDecimal freightAmount = null;
  @SerializedName("insuranceAmount")
  private BigDecimal insuranceAmount = null;
  @SerializedName("otherCostAmount")
  private BigDecimal otherCostAmount = null;
  @SerializedName("exemptValue")
  private BigDecimal exemptValue = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public HeaderForGoods getHeader() {
    return header;
  }
  public void setHeader(HeaderForGoods header) {
    this.header = header;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LineForGoods getLine() {
    return line;
  }
  public void setLine(LineForGoods line) {
    this.line = line;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityInformerForGoods getCompany() {
    return company;
  }
  public void setCompany(EntityInformerForGoods company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityInformerForGoods getEntity() {
    return entity;
  }
  public void setEntity(EntityInformerForGoods entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityInformerForGoods getEmitter() {
    return emitter;
  }
  public void setEmitter(EntityInformerForGoods emitter) {
    this.emitter = emitter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityInformerForGoods getReceiver() {
    return receiver;
  }
  public void setReceiver(EntityInformerForGoods receiver) {
    this.receiver = receiver;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityInformerForGoods getTransporter() {
    return transporter;
  }
  public void setTransporter(EntityInformerForGoods transporter) {
    this.transporter = transporter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InformerForGoodsCsts getCsts() {
    return csts;
  }
  public void setCsts(InformerForGoodsCsts csts) {
    this.csts = csts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFreightAmount() {
    return freightAmount;
  }
  public void setFreightAmount(BigDecimal freightAmount) {
    this.freightAmount = freightAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getInsuranceAmount() {
    return insuranceAmount;
  }
  public void setInsuranceAmount(BigDecimal insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOtherCostAmount() {
    return otherCostAmount;
  }
  public void setOtherCostAmount(BigDecimal otherCostAmount) {
    this.otherCostAmount = otherCostAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExemptValue() {
    return exemptValue;
  }
  public void setExemptValue(BigDecimal exemptValue) {
    this.exemptValue = exemptValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformerForGoods informerForGoods = (InformerForGoods) o;
    return (this.header == null ? informerForGoods.header == null : this.header.equals(informerForGoods.header)) &&
        (this.line == null ? informerForGoods.line == null : this.line.equals(informerForGoods.line)) &&
        (this.company == null ? informerForGoods.company == null : this.company.equals(informerForGoods.company)) &&
        (this.entity == null ? informerForGoods.entity == null : this.entity.equals(informerForGoods.entity)) &&
        (this.emitter == null ? informerForGoods.emitter == null : this.emitter.equals(informerForGoods.emitter)) &&
        (this.receiver == null ? informerForGoods.receiver == null : this.receiver.equals(informerForGoods.receiver)) &&
        (this.transporter == null ? informerForGoods.transporter == null : this.transporter.equals(informerForGoods.transporter)) &&
        (this.csts == null ? informerForGoods.csts == null : this.csts.equals(informerForGoods.csts)) &&
        (this.amount == null ? informerForGoods.amount == null : this.amount.equals(informerForGoods.amount)) &&
        (this.discount == null ? informerForGoods.discount == null : this.discount.equals(informerForGoods.discount)) &&
        (this.quantity == null ? informerForGoods.quantity == null : this.quantity.equals(informerForGoods.quantity)) &&
        (this.unitPrice == null ? informerForGoods.unitPrice == null : this.unitPrice.equals(informerForGoods.unitPrice)) &&
        (this.freightAmount == null ? informerForGoods.freightAmount == null : this.freightAmount.equals(informerForGoods.freightAmount)) &&
        (this.insuranceAmount == null ? informerForGoods.insuranceAmount == null : this.insuranceAmount.equals(informerForGoods.insuranceAmount)) &&
        (this.otherCostAmount == null ? informerForGoods.otherCostAmount == null : this.otherCostAmount.equals(informerForGoods.otherCostAmount)) &&
        (this.exemptValue == null ? informerForGoods.exemptValue == null : this.exemptValue.equals(informerForGoods.exemptValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.header == null ? 0: this.header.hashCode());
    result = 31 * result + (this.line == null ? 0: this.line.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.entity == null ? 0: this.entity.hashCode());
    result = 31 * result + (this.emitter == null ? 0: this.emitter.hashCode());
    result = 31 * result + (this.receiver == null ? 0: this.receiver.hashCode());
    result = 31 * result + (this.transporter == null ? 0: this.transporter.hashCode());
    result = 31 * result + (this.csts == null ? 0: this.csts.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.discount == null ? 0: this.discount.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.unitPrice == null ? 0: this.unitPrice.hashCode());
    result = 31 * result + (this.freightAmount == null ? 0: this.freightAmount.hashCode());
    result = 31 * result + (this.insuranceAmount == null ? 0: this.insuranceAmount.hashCode());
    result = 31 * result + (this.otherCostAmount == null ? 0: this.otherCostAmount.hashCode());
    result = 31 * result + (this.exemptValue == null ? 0: this.exemptValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformerForGoods {\n");
    
    sb.append("  header: ").append(header).append("\n");
    sb.append("  line: ").append(line).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  entity: ").append(entity).append("\n");
    sb.append("  emitter: ").append(emitter).append("\n");
    sb.append("  receiver: ").append(receiver).append("\n");
    sb.append("  transporter: ").append(transporter).append("\n");
    sb.append("  csts: ").append(csts).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  unitPrice: ").append(unitPrice).append("\n");
    sb.append("  freightAmount: ").append(freightAmount).append("\n");
    sb.append("  insuranceAmount: ").append(insuranceAmount).append("\n");
    sb.append("  otherCostAmount: ").append(otherCostAmount).append("\n");
    sb.append("  exemptValue: ").append(exemptValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}