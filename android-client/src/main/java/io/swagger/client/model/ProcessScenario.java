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

import io.swagger.client.model.CfopConf;
import io.swagger.client.model.IcmsTaxConf;
import io.swagger.client.model.TaxConf;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProcessScenario {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("stockImpact")
  private Boolean stockImpact = null;
  @SerializedName("financialImpact")
  private Boolean financialImpact = null;
  public enum CstIPIEnum {
     T,  Z,  E,  H,  N,  I,  O,  OZ, 
  };
  @SerializedName("cstIPI")
  private CstIPIEnum cstIPI = null;
  @SerializedName("ipiLegalTaxClass")
  private String ipiLegalTaxClass = null;
  public enum AccruablePISTaxationEnum {
     T,  Z,  E,  H,  N,  O,  OZ, 
  };
  @SerializedName("accruablePISTaxation")
  private AccruablePISTaxationEnum accruablePISTaxation = null;
  @SerializedName("pisExemptLegalReasonCode")
  private String pisExemptLegalReasonCode = null;
  @SerializedName("pisExemptLegalReason")
  private String pisExemptLegalReason = null;
  public enum AccruableCOFINSTaxationEnum {
     T,  Z,  E,  H,  N,  O,  OZ, 
  };
  @SerializedName("accruableCOFINSTaxation")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;
  @SerializedName("cofinsExemptLegalReasonCode")
  private String cofinsExemptLegalReasonCode = null;
  @SerializedName("cofinsExemptLegalReason")
  private String cofinsExemptLegalReason = null;
  @SerializedName("allowIPIcreditWhenInGoing")
  private Boolean allowIPIcreditWhenInGoing = null;
  @SerializedName("icmsConf")
  private List<IcmsTaxConf> icmsConf = null;
  @SerializedName("name")
  private String name = null;
  public enum TypeEnum {
     SALES,  PURCHASE,  SALES_RETURN,  PURCHASE_RETURN,  TRANSFER_RETURN,  SHIPPING,  SHIPPING_RETURN,  TRANSFER,  RECEIPT_AJUSTE,  TRANSFER_AJUSTE, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum WayTypeEnum {
     in,  out, 
  };
  @SerializedName("wayType")
  private WayTypeEnum wayType = null;
  public enum GoalEnum {
     Normal,  Complementary,  Voided,  Replacement,  Return,  Adjustment, 
  };
  @SerializedName("goal")
  private GoalEnum goal = null;
  @SerializedName("overWriteCFOP")
  private Boolean overWriteCFOP = null;
  @SerializedName("cfops")
  private List<CfopConf> cfops = null;

  /**
   * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
   **/
  @ApiModelProperty(required = true, value = "Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Inform that the process has inventory impact.
   **/
  @ApiModelProperty(value = "Inform that the process has inventory impact.")
  public Boolean getStockImpact() {
    return stockImpact;
  }
  public void setStockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
  }

  /**
   * Inform that the process has financial impact.
   **/
  @ApiModelProperty(value = "Inform that the process has financial impact.")
  public Boolean getFinancialImpact() {
    return financialImpact;
  }
  public void setFinancialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
  }

  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   **/
  @ApiModelProperty(value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }
  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }

  /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   **/
  @ApiModelProperty(value = "Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }
  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }

  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   **/
  @ApiModelProperty(value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }
  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   **/
  @ApiModelProperty(value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }
  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }

  /**
   * When specifi reason, this field has the description
   **/
  @ApiModelProperty(value = "When specifi reason, this field has the description")
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }
  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }

  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   **/
  @ApiModelProperty(value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }
  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   **/
  @ApiModelProperty(value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }
  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }

  /**
   * When specifi reason, this field has the description
   **/
  @ApiModelProperty(value = "When specifi reason, this field has the description")
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }
  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }

  /**
   * Inform that the process allow IPI credit to Input process
   **/
  @ApiModelProperty(value = "Inform that the process allow IPI credit to Input process")
  public Boolean getAllowIPIcreditWhenInGoing() {
    return allowIPIcreditWhenInGoing;
  }
  public void setAllowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
  }

  /**
   * the map key is state code
   **/
  @ApiModelProperty(value = "the map key is state code")
  public List<IcmsTaxConf> getIcmsConf() {
    return icmsConf;
  }
  public void setIcmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
  }

  /**
   * Process name to Identify this configuration
   **/
  @ApiModelProperty(required = true, value = "Process name to Identify this configuration")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

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
   * inform if the transaction is an operation to internalizing (receive) item or value
   **/
  @ApiModelProperty(value = "inform if the transaction is an operation to internalizing (receive) item or value")
  public WayTypeEnum getWayType() {
    return wayType;
  }
  public void setWayType(WayTypeEnum wayType) {
    this.wayType = wayType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GoalEnum getGoal() {
    return goal;
  }
  public void setGoal(GoalEnum goal) {
    this.goal = goal;
  }

  /**
   * inform that the configuration process overwrites the cfop configuration.
   **/
  @ApiModelProperty(value = "inform that the configuration process overwrites the cfop configuration.")
  public Boolean getOverWriteCFOP() {
    return overWriteCFOP;
  }
  public void setOverWriteCFOP(Boolean overWriteCFOP) {
    this.overWriteCFOP = overWriteCFOP;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CfopConf> getCfops() {
    return cfops;
  }
  public void setCfops(List<CfopConf> cfops) {
    this.cfops = cfops;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScenario processScenario = (ProcessScenario) o;
    return (this.code == null ? processScenario.code == null : this.code.equals(processScenario.code)) &&
        (this.stockImpact == null ? processScenario.stockImpact == null : this.stockImpact.equals(processScenario.stockImpact)) &&
        (this.financialImpact == null ? processScenario.financialImpact == null : this.financialImpact.equals(processScenario.financialImpact)) &&
        (this.cstIPI == null ? processScenario.cstIPI == null : this.cstIPI.equals(processScenario.cstIPI)) &&
        (this.ipiLegalTaxClass == null ? processScenario.ipiLegalTaxClass == null : this.ipiLegalTaxClass.equals(processScenario.ipiLegalTaxClass)) &&
        (this.accruablePISTaxation == null ? processScenario.accruablePISTaxation == null : this.accruablePISTaxation.equals(processScenario.accruablePISTaxation)) &&
        (this.pisExemptLegalReasonCode == null ? processScenario.pisExemptLegalReasonCode == null : this.pisExemptLegalReasonCode.equals(processScenario.pisExemptLegalReasonCode)) &&
        (this.pisExemptLegalReason == null ? processScenario.pisExemptLegalReason == null : this.pisExemptLegalReason.equals(processScenario.pisExemptLegalReason)) &&
        (this.accruableCOFINSTaxation == null ? processScenario.accruableCOFINSTaxation == null : this.accruableCOFINSTaxation.equals(processScenario.accruableCOFINSTaxation)) &&
        (this.cofinsExemptLegalReasonCode == null ? processScenario.cofinsExemptLegalReasonCode == null : this.cofinsExemptLegalReasonCode.equals(processScenario.cofinsExemptLegalReasonCode)) &&
        (this.cofinsExemptLegalReason == null ? processScenario.cofinsExemptLegalReason == null : this.cofinsExemptLegalReason.equals(processScenario.cofinsExemptLegalReason)) &&
        (this.allowIPIcreditWhenInGoing == null ? processScenario.allowIPIcreditWhenInGoing == null : this.allowIPIcreditWhenInGoing.equals(processScenario.allowIPIcreditWhenInGoing)) &&
        (this.icmsConf == null ? processScenario.icmsConf == null : this.icmsConf.equals(processScenario.icmsConf)) &&
        (this.name == null ? processScenario.name == null : this.name.equals(processScenario.name)) &&
        (this.type == null ? processScenario.type == null : this.type.equals(processScenario.type)) &&
        (this.wayType == null ? processScenario.wayType == null : this.wayType.equals(processScenario.wayType)) &&
        (this.goal == null ? processScenario.goal == null : this.goal.equals(processScenario.goal)) &&
        (this.overWriteCFOP == null ? processScenario.overWriteCFOP == null : this.overWriteCFOP.equals(processScenario.overWriteCFOP)) &&
        (this.cfops == null ? processScenario.cfops == null : this.cfops.equals(processScenario.cfops));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.stockImpact == null ? 0: this.stockImpact.hashCode());
    result = 31 * result + (this.financialImpact == null ? 0: this.financialImpact.hashCode());
    result = 31 * result + (this.cstIPI == null ? 0: this.cstIPI.hashCode());
    result = 31 * result + (this.ipiLegalTaxClass == null ? 0: this.ipiLegalTaxClass.hashCode());
    result = 31 * result + (this.accruablePISTaxation == null ? 0: this.accruablePISTaxation.hashCode());
    result = 31 * result + (this.pisExemptLegalReasonCode == null ? 0: this.pisExemptLegalReasonCode.hashCode());
    result = 31 * result + (this.pisExemptLegalReason == null ? 0: this.pisExemptLegalReason.hashCode());
    result = 31 * result + (this.accruableCOFINSTaxation == null ? 0: this.accruableCOFINSTaxation.hashCode());
    result = 31 * result + (this.cofinsExemptLegalReasonCode == null ? 0: this.cofinsExemptLegalReasonCode.hashCode());
    result = 31 * result + (this.cofinsExemptLegalReason == null ? 0: this.cofinsExemptLegalReason.hashCode());
    result = 31 * result + (this.allowIPIcreditWhenInGoing == null ? 0: this.allowIPIcreditWhenInGoing.hashCode());
    result = 31 * result + (this.icmsConf == null ? 0: this.icmsConf.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.wayType == null ? 0: this.wayType.hashCode());
    result = 31 * result + (this.goal == null ? 0: this.goal.hashCode());
    result = 31 * result + (this.overWriteCFOP == null ? 0: this.overWriteCFOP.hashCode());
    result = 31 * result + (this.cfops == null ? 0: this.cfops.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScenario {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  stockImpact: ").append(stockImpact).append("\n");
    sb.append("  financialImpact: ").append(financialImpact).append("\n");
    sb.append("  cstIPI: ").append(cstIPI).append("\n");
    sb.append("  ipiLegalTaxClass: ").append(ipiLegalTaxClass).append("\n");
    sb.append("  accruablePISTaxation: ").append(accruablePISTaxation).append("\n");
    sb.append("  pisExemptLegalReasonCode: ").append(pisExemptLegalReasonCode).append("\n");
    sb.append("  pisExemptLegalReason: ").append(pisExemptLegalReason).append("\n");
    sb.append("  accruableCOFINSTaxation: ").append(accruableCOFINSTaxation).append("\n");
    sb.append("  cofinsExemptLegalReasonCode: ").append(cofinsExemptLegalReasonCode).append("\n");
    sb.append("  cofinsExemptLegalReason: ").append(cofinsExemptLegalReason).append("\n");
    sb.append("  allowIPIcreditWhenInGoing: ").append(allowIPIcreditWhenInGoing).append("\n");
    sb.append("  icmsConf: ").append(icmsConf).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  wayType: ").append(wayType).append("\n");
    sb.append("  goal: ").append(goal).append("\n");
    sb.append("  overWriteCFOP: ").append(overWriteCFOP).append("\n");
    sb.append("  cfops: ").append(cfops).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
