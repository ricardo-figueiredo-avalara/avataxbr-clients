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

import io.swagger.client.model.NRefRefECF;
import io.swagger.client.model.NRefRefFarmerNF;
import io.swagger.client.model.NRefRefNF;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Referenced Invoices The invoice can be one of this types, - &#39;refNFe - Eletronic Invoice&#39; - &#39;refCTE - Transport Invoice&#39; - &#39;refECF - Reatail Cupom&#39; - &#39;refNF  - Invoice model 1 or 1A&#39; - &#39;refFarmerNF - farmer invoice&#39; 
 **/
@ApiModel(description = "Referenced Invoices The invoice can be one of this types, - 'refNFe - Eletronic Invoice' - 'refCTE - Transport Invoice' - 'refECF - Reatail Cupom' - 'refNF  - Invoice model 1 or 1A' - 'refFarmerNF - farmer invoice' ")
public class NRef {
  
  public enum TypeEnum {
     refNFe,  refCTE,  refECF,  refNF,  refFarmerNF, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("refNFe")
  private String refNFe = null;
  @SerializedName("refCTe")
  private String refCTe = null;
  @SerializedName("refECF")
  private NRefRefECF refECF = null;
  @SerializedName("refNF")
  private NRefRefNF refNF = null;
  @SerializedName("refFarmerNF")
  private NRefRefFarmerNF refFarmerNF = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRefNFe() {
    return refNFe;
  }
  public void setRefNFe(String refNFe) {
    this.refNFe = refNFe;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRefCTe() {
    return refCTe;
  }
  public void setRefCTe(String refCTe) {
    this.refCTe = refCTe;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NRefRefECF getRefECF() {
    return refECF;
  }
  public void setRefECF(NRefRefECF refECF) {
    this.refECF = refECF;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NRefRefNF getRefNF() {
    return refNF;
  }
  public void setRefNF(NRefRefNF refNF) {
    this.refNF = refNF;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NRefRefFarmerNF getRefFarmerNF() {
    return refFarmerNF;
  }
  public void setRefFarmerNF(NRefRefFarmerNF refFarmerNF) {
    this.refFarmerNF = refFarmerNF;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRef nRef = (NRef) o;
    return (this.type == null ? nRef.type == null : this.type.equals(nRef.type)) &&
        (this.refNFe == null ? nRef.refNFe == null : this.refNFe.equals(nRef.refNFe)) &&
        (this.refCTe == null ? nRef.refCTe == null : this.refCTe.equals(nRef.refCTe)) &&
        (this.refECF == null ? nRef.refECF == null : this.refECF.equals(nRef.refECF)) &&
        (this.refNF == null ? nRef.refNF == null : this.refNF.equals(nRef.refNF)) &&
        (this.refFarmerNF == null ? nRef.refFarmerNF == null : this.refFarmerNF.equals(nRef.refFarmerNF));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.refNFe == null ? 0: this.refNFe.hashCode());
    result = 31 * result + (this.refCTe == null ? 0: this.refCTe.hashCode());
    result = 31 * result + (this.refECF == null ? 0: this.refECF.hashCode());
    result = 31 * result + (this.refNF == null ? 0: this.refNF.hashCode());
    result = 31 * result + (this.refFarmerNF == null ? 0: this.refFarmerNF.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRef {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  refNFe: ").append(refNFe).append("\n");
    sb.append("  refCTe: ").append(refCTe).append("\n");
    sb.append("  refECF: ").append(refECF).append("\n");
    sb.append("  refNF: ").append(refNF).append("\n");
    sb.append("  refFarmerNF: ").append(refFarmerNF).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}