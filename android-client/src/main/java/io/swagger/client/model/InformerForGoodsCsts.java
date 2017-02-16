/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InformerForGoodsCsts {
  
  @SerializedName("icms")
  private String icms = null;
  @SerializedName("ipi")
  private String ipi = null;
  @SerializedName("pisCofins")
  private String pisCofins = null;

  /**
   * CST-B
   **/
  @ApiModelProperty(value = "CST-B")
  public String getIcms() {
    return icms;
  }
  public void setIcms(String icms) {
    this.icms = icms;
  }

  /**
   * CST-IPI
   **/
  @ApiModelProperty(value = "CST-IPI")
  public String getIpi() {
    return ipi;
  }
  public void setIpi(String ipi) {
    this.ipi = ipi;
  }

  /**
   * CST PIS/COFINS
   **/
  @ApiModelProperty(value = "CST PIS/COFINS")
  public String getPisCofins() {
    return pisCofins;
  }
  public void setPisCofins(String pisCofins) {
    this.pisCofins = pisCofins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformerForGoodsCsts informerForGoodsCsts = (InformerForGoodsCsts) o;
    return (this.icms == null ? informerForGoodsCsts.icms == null : this.icms.equals(informerForGoodsCsts.icms)) &&
        (this.ipi == null ? informerForGoodsCsts.ipi == null : this.ipi.equals(informerForGoodsCsts.ipi)) &&
        (this.pisCofins == null ? informerForGoodsCsts.pisCofins == null : this.pisCofins.equals(informerForGoodsCsts.pisCofins));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.icms == null ? 0: this.icms.hashCode());
    result = 31 * result + (this.ipi == null ? 0: this.ipi.hashCode());
    result = 31 * result + (this.pisCofins == null ? 0: this.pisCofins.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformerForGoodsCsts {\n");
    
    sb.append("  icms: ").append(icms).append("\n");
    sb.append("  ipi: ").append(ipi).append("\n");
    sb.append("  pisCofins: ").append(pisCofins).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}