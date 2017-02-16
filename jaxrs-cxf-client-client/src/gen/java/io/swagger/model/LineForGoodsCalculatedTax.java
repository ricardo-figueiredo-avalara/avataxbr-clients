package io.swagger.model;

import io.swagger.model.DetailsCalculatedTaxItem;
import io.swagger.model.LineForGoodsCalculatedTaxTaxByType;
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

public class LineForGoodsCalculatedTax  {
  
  @ApiModelProperty(example = "null", value = "")
  private LineForGoodsCalculatedTaxTaxByType taxByType = null;
  @ApiModelProperty(example = "null", value = "")
  private Double tax = null;
  @ApiModelProperty(example = "null", value = "")
  private List<DetailsCalculatedTaxItem> details = new ArrayList<DetailsCalculatedTaxItem>();

 /**
   * Get taxByType
   * @return taxByType
  **/
  public LineForGoodsCalculatedTaxTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(LineForGoodsCalculatedTaxTaxByType taxByType) {
    this.taxByType = taxByType;
  }
 /**
   * Get tax
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }
 /**
   * Get details
   * @return details
  **/
  public List<DetailsCalculatedTaxItem> getDetails() {
    return details;
  }
  public void setDetails(List<DetailsCalculatedTaxItem> details) {
    this.details = details;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsCalculatedTax {\n");
    
    sb.append("    taxByType: ").append(toIndentedString(taxByType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

