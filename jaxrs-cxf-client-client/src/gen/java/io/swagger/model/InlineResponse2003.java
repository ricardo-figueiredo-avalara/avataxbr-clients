package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InlineResponse2003  {
  
  @ApiModelProperty(example = "null", value = "")
  private Boolean contingency = null;
  @ApiModelProperty(example = "null", value = "")
  private javax.xml.datatype.XMLGregorianCalendar startDate = null;
  @ApiModelProperty(example = "null", value = "")
  private javax.xml.datatype.XMLGregorianCalendar finishDate = null;

 /**
   * Get contingency
   * @return contingency
  **/
  public Boolean getContingency() {
    return contingency;
  }
  public void setContingency(Boolean contingency) {
    this.contingency = contingency;
  }
 /**
   * Get startDate
   * @return startDate
  **/
  public javax.xml.datatype.XMLGregorianCalendar getStartDate() {
    return startDate;
  }
  public void setStartDate(javax.xml.datatype.XMLGregorianCalendar startDate) {
    this.startDate = startDate;
  }
 /**
   * Get finishDate
   * @return finishDate
  **/
  public javax.xml.datatype.XMLGregorianCalendar getFinishDate() {
    return finishDate;
  }
  public void setFinishDate(javax.xml.datatype.XMLGregorianCalendar finishDate) {
    this.finishDate = finishDate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    contingency: ").append(toIndentedString(contingency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
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

