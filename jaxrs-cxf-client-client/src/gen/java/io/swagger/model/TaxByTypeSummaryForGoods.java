package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TaxByTypeSummaryJurisdictionForGoods;
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

@ApiModel(description="summary of all taxes")
public class TaxByTypeSummaryForGoods  {
  
  @ApiModelProperty(example = "null", value = "sum of all lines calcbase")
  private Double calcbase = null;
  @ApiModelProperty(example = "null", value = "sum of referenced tax value")
  private Double tax = null;
  @ApiModelProperty(example = "null", value = "")
  private List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions = new ArrayList<TaxByTypeSummaryJurisdictionForGoods>();

 /**
   * sum of all lines calcbase
   * @return calcbase
  **/
  public Double getCalcbase() {
    return calcbase;
  }
  public void setCalcbase(Double calcbase) {
    this.calcbase = calcbase;
  }
 /**
   * sum of referenced tax value
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }
 /**
   * Get jurisdictions
   * @return jurisdictions
  **/
  public List<TaxByTypeSummaryJurisdictionForGoods> getJurisdictions() {
    return jurisdictions;
  }
  public void setJurisdictions(List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions) {
    this.jurisdictions = jurisdictions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxByTypeSummaryForGoods {\n");
    
    sb.append("    calcbase: ").append(toIndentedString(calcbase)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    jurisdictions: ").append(toIndentedString(jurisdictions)).append("\n");
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
