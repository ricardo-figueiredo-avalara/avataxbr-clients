package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ItemSimple  {
  
  @ApiModelProperty(example = "null", required = true, value = "Company ID")
  private String companyId = null;
  @ApiModelProperty(example = "null", required = true, value = "ERP Code")
  private String code = null;
  @ApiModelProperty(example = "null", required = true, value = "Agast Code")
  private String agast = null;
  @ApiModelProperty(example = "null", value = "Item Description")
  private String description = null;

 /**
   * Company ID
   * @return companyId
  **/
  public String getCompanyId() {
    return companyId;
  }
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }
 /**
   * ERP Code
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Agast Code
   * @return agast
  **/
  public String getAgast() {
    return agast;
  }
  public void setAgast(String agast) {
    this.agast = agast;
  }
 /**
   * Item Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSimple {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    agast: ").append(toIndentedString(agast)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

