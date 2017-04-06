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

/**
 * AgastCodeType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class AgastCodeType {
  @SerializedName("code")
  private Integer code = null;

  /**
   * Gets or Sets name
   */
  public enum NameEnum {
    @SerializedName("NCM")
    NCM("NCM"),
    
    @SerializedName("NBS")
    NBS("NBS"),
    
    @SerializedName("LC116")
    LC116("LC116"),
    
    @SerializedName("SERVICE UNREGULATED")
    SERVICE_UNREGULATED("SERVICE UNREGULATED");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  public AgastCodeType code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * - 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' 
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "- 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' ")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AgastCodeType name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgastCodeType agastCodeType = (AgastCodeType) o;
    return Objects.equals(this.code, agastCodeType.code) &&
        Objects.equals(this.name, agastCodeType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastCodeType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

