/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * IbptConf
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class IbptConf {
  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("list")
  private List<IpbtConfItem> list = new ArrayList<IpbtConfItem>();

  public IbptConf code(String code) {
    this.code = code;
    return this;
  }

   /**
   * IBPT Code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "IBPT Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IbptConf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IbptConf list(List<IpbtConfItem> list) {
    this.list = list;
    return this;
  }

  public IbptConf addListItem(IpbtConfItem listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IpbtConfItem> getList() {
    return list;
  }

  public void setList(List<IpbtConfItem> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbptConf ibptConf = (IbptConf) o;
    return Objects.equals(this.code, ibptConf.code) &&
        Objects.equals(this.description, ibptConf.description) &&
        Objects.equals(this.list, ibptConf.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbptConf {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

