package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Bill information")
public class PaymentBill  {
  
  @ApiModelProperty(example = "null", value = "Bill identifier")
  private String nFat = null;
  @ApiModelProperty(example = "null", value = "Orignal value")
  private Double vOrig = null;
  @ApiModelProperty(example = "null", value = "Discount")
  private Double vDiscount = null;
  @ApiModelProperty(example = "null", value = "Net value")
  private Double vNet = null;

 /**
   * Bill identifier
   * @return nFat
  **/
  public String getNFat() {
    return nFat;
  }
  public void setNFat(String nFat) {
    this.nFat = nFat;
  }
 /**
   * Orignal value
   * @return vOrig
  **/
  public Double getVOrig() {
    return vOrig;
  }
  public void setVOrig(Double vOrig) {
    this.vOrig = vOrig;
  }
 /**
   * Discount
   * @return vDiscount
  **/
  public Double getVDiscount() {
    return vDiscount;
  }
  public void setVDiscount(Double vDiscount) {
    this.vDiscount = vDiscount;
  }
 /**
   * Net value
   * @return vNet
  **/
  public Double getVNet() {
    return vNet;
  }
  public void setVNet(Double vNet) {
    this.vNet = vNet;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBill {\n");
    
    sb.append("    nFat: ").append(toIndentedString(nFat)).append("\n");
    sb.append("    vOrig: ").append(toIndentedString(vOrig)).append("\n");
    sb.append("    vDiscount: ").append(toIndentedString(vDiscount)).append("\n");
    sb.append("    vNet: ").append(toIndentedString(vNet)).append("\n");
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

