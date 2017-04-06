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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.StateEnum;

/**
 * See definitions IcmsConfByState
 */
@ApiModel(description = "See definitions IcmsConfByState")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class AgastIcmsConf {
  @SerializedName("code")
  private String code = null;

  @SerializedName("state")
  private StateEnum state = null;

  public AgastIcmsConf code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AgastIcmsConf state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgastIcmsConf agastIcmsConf = (AgastIcmsConf) o;
    return Objects.equals(this.code, agastIcmsConf.code) &&
        Objects.equals(this.state, agastIcmsConf.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastIcmsConf {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
