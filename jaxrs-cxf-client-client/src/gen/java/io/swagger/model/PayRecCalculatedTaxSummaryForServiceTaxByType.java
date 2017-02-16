package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TaxByTypeSummaryForService;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Object with summary of all taxes returned by engine")
public class PayRecCalculatedTaxSummaryForServiceTaxByType  {
  
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService issRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService pisRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService cofinsRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService csllRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService irrf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService inssRf = null;

 /**
   * Get issRf
   * @return issRf
  **/
  public TaxByTypeSummaryForService getIssRf() {
    return issRf;
  }
  public void setIssRf(TaxByTypeSummaryForService issRf) {
    this.issRf = issRf;
  }
 /**
   * Get pisRf
   * @return pisRf
  **/
  public TaxByTypeSummaryForService getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeSummaryForService pisRf) {
    this.pisRf = pisRf;
  }
 /**
   * Get cofinsRf
   * @return cofinsRf
  **/
  public TaxByTypeSummaryForService getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeSummaryForService cofinsRf) {
    this.cofinsRf = cofinsRf;
  }
 /**
   * Get csllRf
   * @return csllRf
  **/
  public TaxByTypeSummaryForService getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeSummaryForService csllRf) {
    this.csllRf = csllRf;
  }
 /**
   * Get irrf
   * @return irrf
  **/
  public TaxByTypeSummaryForService getIrrf() {
    return irrf;
  }
  public void setIrrf(TaxByTypeSummaryForService irrf) {
    this.irrf = irrf;
  }
 /**
   * Get inssRf
   * @return inssRf
  **/
  public TaxByTypeSummaryForService getInssRf() {
    return inssRf;
  }
  public void setInssRf(TaxByTypeSummaryForService inssRf) {
    this.inssRf = inssRf;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRecCalculatedTaxSummaryForServiceTaxByType {\n");
    
    sb.append("    issRf: ").append(toIndentedString(issRf)).append("\n");
    sb.append("    pisRf: ").append(toIndentedString(pisRf)).append("\n");
    sb.append("    cofinsRf: ").append(toIndentedString(cofinsRf)).append("\n");
    sb.append("    csllRf: ").append(toIndentedString(csllRf)).append("\n");
    sb.append("    irrf: ").append(toIndentedString(irrf)).append("\n");
    sb.append("    inssRf: ").append(toIndentedString(inssRf)).append("\n");
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

