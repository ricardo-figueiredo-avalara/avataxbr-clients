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
 * LegalReasonReferencedProcesses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class LegalReasonReferencedProcesses {
  @SerializedName("nProc")
  private String nProc = null;

  /**
   * Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
   */
  public enum IndProcEnum {
    @SerializedName("0")
    _0("0"),
    
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("9")
    _9("9");

    private String value;

    IndProcEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("indProc")
  private IndProcEnum indProc = null;

  public LegalReasonReferencedProcesses nProc(String nProc) {
    this.nProc = nProc;
    return this;
  }

   /**
   * Process Identifier (NFe <nProc> tag)
   * @return nProc
  **/
  @ApiModelProperty(example = "null", value = "Process Identifier (NFe <nProc> tag)")
  public String getNProc() {
    return nProc;
  }

  public void setNProc(String nProc) {
    this.nProc = nProc;
  }

  public LegalReasonReferencedProcesses indProc(IndProcEnum indProc) {
    this.indProc = indProc;
    return this;
  }

   /**
   * Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
   * @return indProc
  **/
  @ApiModelProperty(example = "null", value = "Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros ")
  public IndProcEnum getIndProc() {
    return indProc;
  }

  public void setIndProc(IndProcEnum indProc) {
    this.indProc = indProc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalReasonReferencedProcesses legalReasonReferencedProcesses = (LegalReasonReferencedProcesses) o;
    return Objects.equals(this.nProc, legalReasonReferencedProcesses.nProc) &&
        Objects.equals(this.indProc, legalReasonReferencedProcesses.indProc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nProc, indProc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalReasonReferencedProcesses {\n");
    
    sb.append("    nProc: ").append(toIndentedString(nProc)).append("\n");
    sb.append("    indProc: ").append(toIndentedString(indProc)).append("\n");
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

