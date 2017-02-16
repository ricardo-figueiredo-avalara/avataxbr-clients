/*
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
import io.swagger.client.model.IcmsTaxConfBase;
import io.swagger.client.model.StateEnum;
import java.util.ArrayList;
import java.util.List;

/**
 * IcmsTaxConf
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class IcmsTaxConf {
  @SerializedName("state")
  private StateEnum state = null;

  /**
   * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   */
  public enum IcmsCSTEnum {
    @SerializedName("00")
    _00("00"),
    
    @SerializedName("20")
    _20("20"),
    
    @SerializedName("40")
    _40("40"),
    
    @SerializedName("41")
    _41("41"),
    
    @SerializedName("50")
    _50("50");

    private String value;

    IcmsCSTEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("icmsCST")
  private IcmsCSTEnum icmsCST = null;

  @SerializedName("messageCode")
  private String messageCode = null;

  @SerializedName("relationShip")
  private List<IcmsTaxConfBase> relationShip = new ArrayList<IcmsTaxConfBase>();

  public IcmsTaxConf state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public IcmsTaxConf icmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
    return this;
  }

   /**
   * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   * @return icmsCST
  **/
  @ApiModelProperty(example = "null", value = "On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED ")
  public IcmsCSTEnum getIcmsCST() {
    return icmsCST;
  }

  public void setIcmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
  }

  public IcmsTaxConf messageCode(String messageCode) {
    this.messageCode = messageCode;
    return this;
  }

   /**
   * Message to add to NF when this configuration is used
   * @return messageCode
  **/
  @ApiModelProperty(example = "null", value = "Message to add to NF when this configuration is used")
  public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public IcmsTaxConf relationShip(List<IcmsTaxConfBase> relationShip) {
    this.relationShip = relationShip;
    return this;
  }

  public IcmsTaxConf addRelationShipItem(IcmsTaxConfBase relationShipItem) {
    this.relationShip.add(relationShipItem);
    return this;
  }

   /**
   * the mapping key is state code / A chave do mapeamento é o código do Estado.
   * @return relationShip
  **/
  @ApiModelProperty(example = "null", value = "the mapping key is state code / A chave do mapeamento é o código do Estado.")
  public List<IcmsTaxConfBase> getRelationShip() {
    return relationShip;
  }

  public void setRelationShip(List<IcmsTaxConfBase> relationShip) {
    this.relationShip = relationShip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcmsTaxConf icmsTaxConf = (IcmsTaxConf) o;
    return Objects.equals(this.state, icmsTaxConf.state) &&
        Objects.equals(this.icmsCST, icmsTaxConf.icmsCST) &&
        Objects.equals(this.messageCode, icmsTaxConf.messageCode) &&
        Objects.equals(this.relationShip, icmsTaxConf.relationShip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, icmsCST, messageCode, relationShip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsTaxConf {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    icmsCST: ").append(toIndentedString(icmsCST)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    relationShip: ").append(toIndentedString(relationShip)).append("\n");
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

