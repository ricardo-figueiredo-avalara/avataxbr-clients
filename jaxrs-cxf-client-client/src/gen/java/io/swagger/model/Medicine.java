package io.swagger.model;

import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Medicine  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private String loteNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "This is a decimal type with 11 digits including 3 decimal positions.")
  private Double loteQuantity = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private LocalDate manufactotyDate = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private LocalDate expirationDate = null;
  @ApiModelProperty(example = "null", required = true, value = "This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.")
  private Double maxValueToEndUser = null;

 /**
   * Get loteNumber
   * @return loteNumber
  **/
  public String getLoteNumber() {
    return loteNumber;
  }
  public void setLoteNumber(String loteNumber) {
    this.loteNumber = loteNumber;
  }
 /**
   * This is a decimal type with 11 digits including 3 decimal positions.
   * @return loteQuantity
  **/
  public Double getLoteQuantity() {
    return loteQuantity;
  }
  public void setLoteQuantity(Double loteQuantity) {
    this.loteQuantity = loteQuantity;
  }
 /**
   * Get manufactotyDate
   * @return manufactotyDate
  **/
  public LocalDate getManufactotyDate() {
    return manufactotyDate;
  }
  public void setManufactotyDate(LocalDate manufactotyDate) {
    this.manufactotyDate = manufactotyDate;
  }
 /**
   * Get expirationDate
   * @return expirationDate
  **/
  public LocalDate getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }
 /**
   * This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.
   * @return maxValueToEndUser
  **/
  public Double getMaxValueToEndUser() {
    return maxValueToEndUser;
  }
  public void setMaxValueToEndUser(Double maxValueToEndUser) {
    this.maxValueToEndUser = maxValueToEndUser;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Medicine {\n");
    
    sb.append("    loteNumber: ").append(toIndentedString(loteNumber)).append("\n");
    sb.append("    loteQuantity: ").append(toIndentedString(loteQuantity)).append("\n");
    sb.append("    manufactotyDate: ").append(toIndentedString(manufactotyDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    maxValueToEndUser: ").append(toIndentedString(maxValueToEndUser)).append("\n");
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

