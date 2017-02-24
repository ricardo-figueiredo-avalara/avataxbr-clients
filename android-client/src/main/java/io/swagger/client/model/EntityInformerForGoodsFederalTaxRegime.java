/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EntityInformerForGoodsFederalTaxRegime {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("abbr")
  private String abbr = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAbbr() {
    return abbr;
  }
  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityInformerForGoodsFederalTaxRegime entityInformerForGoodsFederalTaxRegime = (EntityInformerForGoodsFederalTaxRegime) o;
    return (this.code == null ? entityInformerForGoodsFederalTaxRegime.code == null : this.code.equals(entityInformerForGoodsFederalTaxRegime.code)) &&
        (this.name == null ? entityInformerForGoodsFederalTaxRegime.name == null : this.name.equals(entityInformerForGoodsFederalTaxRegime.name)) &&
        (this.abbr == null ? entityInformerForGoodsFederalTaxRegime.abbr == null : this.abbr.equals(entityInformerForGoodsFederalTaxRegime.abbr));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.abbr == null ? 0: this.abbr.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityInformerForGoodsFederalTaxRegime {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  abbr: ").append(abbr).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
