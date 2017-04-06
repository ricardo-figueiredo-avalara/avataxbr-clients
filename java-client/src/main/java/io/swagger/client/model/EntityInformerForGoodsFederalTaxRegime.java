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

import io.swagger.annotations.ApiModelProperty;

/**
 * EntityInformerForGoodsFederalTaxRegime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class EntityInformerForGoodsFederalTaxRegime {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("abbr")
  private String abbr = null;

  public EntityInformerForGoodsFederalTaxRegime code(String code) {
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

  public EntityInformerForGoodsFederalTaxRegime name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityInformerForGoodsFederalTaxRegime abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

   /**
   * Get abbr
   * @return abbr
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityInformerForGoodsFederalTaxRegime entityInformerForGoodsFederalTaxRegime = (EntityInformerForGoodsFederalTaxRegime) o;
    return Objects.equals(this.code, entityInformerForGoodsFederalTaxRegime.code) &&
        Objects.equals(this.name, entityInformerForGoodsFederalTaxRegime.name) &&
        Objects.equals(this.abbr, entityInformerForGoodsFederalTaxRegime.abbr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, abbr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityInformerForGoodsFederalTaxRegime {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
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

