package io.swagger.model;

import io.swagger.model.IssConfServiceList;
import io.swagger.model.StateEnum;
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

public class IssConfByCity  {
  
  @ApiModelProperty(example = "null", required = true, value = "City Code (IBGE)")
  private Long cityCode = null;
  @ApiModelProperty(example = "null", value = "")
  private String name = null;
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean issWhDestOtherCities = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean issWhDestSameCity = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean issWhOriginUnregSeller = null;
  @ApiModelProperty(example = "null", value = "")
  private List<IssConfServiceList> serviceList = new ArrayList<IssConfServiceList>();

 /**
   * City Code (IBGE)
   * @return cityCode
  **/
  public Long getCityCode() {
    return cityCode;
  }
  public void setCityCode(Long cityCode) {
    this.cityCode = cityCode;
  }
 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
 /**
   * Get issWhDestOtherCities
   * @return issWhDestOtherCities
  **/
  public Boolean getIssWhDestOtherCities() {
    return issWhDestOtherCities;
  }
  public void setIssWhDestOtherCities(Boolean issWhDestOtherCities) {
    this.issWhDestOtherCities = issWhDestOtherCities;
  }
 /**
   * Get issWhDestSameCity
   * @return issWhDestSameCity
  **/
  public Boolean getIssWhDestSameCity() {
    return issWhDestSameCity;
  }
  public void setIssWhDestSameCity(Boolean issWhDestSameCity) {
    this.issWhDestSameCity = issWhDestSameCity;
  }
 /**
   * Get issWhOriginUnregSeller
   * @return issWhOriginUnregSeller
  **/
  public Boolean getIssWhOriginUnregSeller() {
    return issWhOriginUnregSeller;
  }
  public void setIssWhOriginUnregSeller(Boolean issWhOriginUnregSeller) {
    this.issWhOriginUnregSeller = issWhOriginUnregSeller;
  }
 /**
   * Get serviceList
   * @return serviceList
  **/
  public List<IssConfServiceList> getServiceList() {
    return serviceList;
  }
  public void setServiceList(List<IssConfServiceList> serviceList) {
    this.serviceList = serviceList;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfByCity {\n");
    
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    issWhDestOtherCities: ").append(toIndentedString(issWhDestOtherCities)).append("\n");
    sb.append("    issWhDestSameCity: ").append(toIndentedString(issWhDestSameCity)).append("\n");
    sb.append("    issWhOriginUnregSeller: ").append(toIndentedString(issWhOriginUnregSeller)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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

