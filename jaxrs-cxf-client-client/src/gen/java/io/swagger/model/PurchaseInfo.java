package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PurchaseInfo  {
  
  @ApiModelProperty(example = "null", value = "Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas ")
  private String governmentOrder = null;
  @ApiModelProperty(example = "null", value = "Order info Informação do pedido ")
  private String orderNumber = null;
  @ApiModelProperty(example = "null", value = "Agreement info Informação do contrato ")
  private String contractNumber = null;

 /**
   * Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
   * @return governmentOrder
  **/
  public String getGovernmentOrder() {
    return governmentOrder;
  }
  public void setGovernmentOrder(String governmentOrder) {
    this.governmentOrder = governmentOrder;
  }
 /**
   * Order info Informação do pedido 
   * @return orderNumber
  **/
  public String getOrderNumber() {
    return orderNumber;
  }
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }
 /**
   * Agreement info Informação do contrato 
   * @return contractNumber
  **/
  public String getContractNumber() {
    return contractNumber;
  }
  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseInfo {\n");
    
    sb.append("    governmentOrder: ").append(toIndentedString(governmentOrder)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
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

