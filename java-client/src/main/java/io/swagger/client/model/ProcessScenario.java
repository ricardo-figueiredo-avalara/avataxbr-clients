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
import io.swagger.client.model.CfopConf;
import io.swagger.client.model.IcmsTaxConf;
import io.swagger.client.model.TaxConf;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessScenario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class ProcessScenario {
  @SerializedName("code")
  private String code = null;

  @SerializedName("stockImpact")
  private Boolean stockImpact = null;

  @SerializedName("financialImpact")
  private Boolean financialImpact = null;

  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   */
  public enum CstIPIEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("I")
    I("I"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

    private String value;

    CstIPIEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cstIPI")
  private CstIPIEnum cstIPI = null;

  @SerializedName("ipiLegalTaxClass")
  private String ipiLegalTaxClass = null;

  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   */
  public enum AccruablePISTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

    private String value;

    AccruablePISTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accruablePISTaxation")
  private AccruablePISTaxationEnum accruablePISTaxation = null;

  @SerializedName("pisExemptLegalReasonCode")
  private String pisExemptLegalReasonCode = null;

  @SerializedName("pisExemptLegalReason")
  private String pisExemptLegalReason = null;

  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   */
  public enum AccruableCOFINSTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

    private String value;

    AccruableCOFINSTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accruableCOFINSTaxation")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;

  @SerializedName("cofinsExemptLegalReasonCode")
  private String cofinsExemptLegalReasonCode = null;

  @SerializedName("cofinsExemptLegalReason")
  private String cofinsExemptLegalReason = null;

  @SerializedName("allowIPIcreditWhenInGoing")
  private Boolean allowIPIcreditWhenInGoing = null;

  @SerializedName("icmsConf")
  private List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>();

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("SALES")
    SALES("SALES"),
    
    @SerializedName("PURCHASE")
    PURCHASE("PURCHASE"),
    
    @SerializedName("SALES_RETURN")
    SALES_RETURN("SALES_RETURN"),
    
    @SerializedName("PURCHASE_RETURN")
    PURCHASE_RETURN("PURCHASE_RETURN"),
    
    @SerializedName("TRANSFER_RETURN")
    TRANSFER_RETURN("TRANSFER_RETURN"),
    
    @SerializedName("SHIPPING")
    SHIPPING("SHIPPING"),
    
    @SerializedName("SHIPPING_RETURN")
    SHIPPING_RETURN("SHIPPING_RETURN"),
    
    @SerializedName("TRANSFER")
    TRANSFER("TRANSFER"),
    
    @SerializedName("RECEIPT_AJUSTE")
    RECEIPT_AJUSTE("RECEIPT_AJUSTE"),
    
    @SerializedName("TRANSFER_AJUSTE")
    TRANSFER_AJUSTE("TRANSFER_AJUSTE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * inform if the transaction is an operation to internalizing (receive) item or value
   */
  public enum WayTypeEnum {
    @SerializedName("in")
    IN("in"),
    
    @SerializedName("out")
    OUT("out");

    private String value;

    WayTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("wayType")
  private WayTypeEnum wayType = null;

  /**
   * - 'Normal' # Normal - 'Complementary' # Complemento de Valores - 'Voided' # Anulação - 'Replacement' # Substituto - 'Return' # Devolução ou retorno - 'Adjustment' # Ajuste 
   */
  public enum GoalEnum {
    @SerializedName("Normal")
    NORMAL("Normal"),
    
    @SerializedName("Complementary")
    COMPLEMENTARY("Complementary"),
    
    @SerializedName("Voided")
    VOIDED("Voided"),
    
    @SerializedName("Replacement")
    REPLACEMENT("Replacement"),
    
    @SerializedName("Return")
    RETURN("Return"),
    
    @SerializedName("Adjustment")
    ADJUSTMENT("Adjustment");

    private String value;

    GoalEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("goal")
  private GoalEnum goal = null;

  @SerializedName("overWriteCFOP")
  private Boolean overWriteCFOP = null;

  @SerializedName("cfops")
  private List<CfopConf> cfops = new ArrayList<CfopConf>();

  public ProcessScenario code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProcessScenario stockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
    return this;
  }

   /**
   * Inform that the process has inventory impact.
   * @return stockImpact
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process has inventory impact.")
  public Boolean getStockImpact() {
    return stockImpact;
  }

  public void setStockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
  }

  public ProcessScenario financialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
    return this;
  }

   /**
   * Inform that the process has financial impact.
   * @return financialImpact
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process has financial impact.")
  public Boolean getFinancialImpact() {
    return financialImpact;
  }

  public void setFinancialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
  }

  public ProcessScenario cstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
    return this;
  }

   /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return cstIPI
  **/
  @ApiModelProperty(example = "null", value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }

  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }

  public ProcessScenario ipiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
    return this;
  }

   /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @return ipiLegalTaxClass
  **/
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }

  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }

  public ProcessScenario accruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   * @return accruablePISTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }

  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  public ProcessScenario pisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
    return this;
  }

   /**
   * Reference to a tax reason record ID.
   * @return pisExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "Reference to a tax reason record ID.")
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }

  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }

  public ProcessScenario pisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
    return this;
  }

   /**
   * When specifi reason, this field has the description
   * @return pisExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }

  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }

  public ProcessScenario accruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return accruableCOFINSTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }

  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  public ProcessScenario cofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
    return this;
  }

   /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @return cofinsExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }

  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }

  public ProcessScenario cofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
    return this;
  }

   /**
   * When specifi reason, this field has the description
   * @return cofinsExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }

  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }

  public ProcessScenario allowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
    return this;
  }

   /**
   * Inform that the process allow IPI credit to Input process
   * @return allowIPIcreditWhenInGoing
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process allow IPI credit to Input process")
  public Boolean getAllowIPIcreditWhenInGoing() {
    return allowIPIcreditWhenInGoing;
  }

  public void setAllowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
  }

  public ProcessScenario icmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
    return this;
  }

  public ProcessScenario addIcmsConfItem(IcmsTaxConf icmsConfItem) {
    this.icmsConf.add(icmsConfItem);
    return this;
  }

   /**
   * the map key is state code
   * @return icmsConf
  **/
  @ApiModelProperty(example = "null", value = "the map key is state code")
  public List<IcmsTaxConf> getIcmsConf() {
    return icmsConf;
  }

  public void setIcmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
  }

  public ProcessScenario name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Process name to Identify this configuration
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Process name to Identify this configuration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessScenario type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ProcessScenario wayType(WayTypeEnum wayType) {
    this.wayType = wayType;
    return this;
  }

   /**
   * inform if the transaction is an operation to internalizing (receive) item or value
   * @return wayType
  **/
  @ApiModelProperty(example = "null", value = "inform if the transaction is an operation to internalizing (receive) item or value")
  public WayTypeEnum getWayType() {
    return wayType;
  }

  public void setWayType(WayTypeEnum wayType) {
    this.wayType = wayType;
  }

  public ProcessScenario goal(GoalEnum goal) {
    this.goal = goal;
    return this;
  }

   /**
   * - 'Normal' # Normal - 'Complementary' # Complemento de Valores - 'Voided' # Anulação - 'Replacement' # Substituto - 'Return' # Devolução ou retorno - 'Adjustment' # Ajuste 
   * @return goal
  **/
  @ApiModelProperty(example = "null", value = "- 'Normal' # Normal - 'Complementary' # Complemento de Valores - 'Voided' # Anulação - 'Replacement' # Substituto - 'Return' # Devolução ou retorno - 'Adjustment' # Ajuste ")
  public GoalEnum getGoal() {
    return goal;
  }

  public void setGoal(GoalEnum goal) {
    this.goal = goal;
  }

  public ProcessScenario overWriteCFOP(Boolean overWriteCFOP) {
    this.overWriteCFOP = overWriteCFOP;
    return this;
  }

   /**
   * inform that the configuration process overwrites the cfop configuration.
   * @return overWriteCFOP
  **/
  @ApiModelProperty(example = "null", value = "inform that the configuration process overwrites the cfop configuration.")
  public Boolean getOverWriteCFOP() {
    return overWriteCFOP;
  }

  public void setOverWriteCFOP(Boolean overWriteCFOP) {
    this.overWriteCFOP = overWriteCFOP;
  }

  public ProcessScenario cfops(List<CfopConf> cfops) {
    this.cfops = cfops;
    return this;
  }

  public ProcessScenario addCfopsItem(CfopConf cfopsItem) {
    this.cfops.add(cfopsItem);
    return this;
  }

   /**
   * Get cfops
   * @return cfops
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CfopConf> getCfops() {
    return cfops;
  }

  public void setCfops(List<CfopConf> cfops) {
    this.cfops = cfops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScenario processScenario = (ProcessScenario) o;
    return Objects.equals(this.code, processScenario.code) &&
        Objects.equals(this.stockImpact, processScenario.stockImpact) &&
        Objects.equals(this.financialImpact, processScenario.financialImpact) &&
        Objects.equals(this.cstIPI, processScenario.cstIPI) &&
        Objects.equals(this.ipiLegalTaxClass, processScenario.ipiLegalTaxClass) &&
        Objects.equals(this.accruablePISTaxation, processScenario.accruablePISTaxation) &&
        Objects.equals(this.pisExemptLegalReasonCode, processScenario.pisExemptLegalReasonCode) &&
        Objects.equals(this.pisExemptLegalReason, processScenario.pisExemptLegalReason) &&
        Objects.equals(this.accruableCOFINSTaxation, processScenario.accruableCOFINSTaxation) &&
        Objects.equals(this.cofinsExemptLegalReasonCode, processScenario.cofinsExemptLegalReasonCode) &&
        Objects.equals(this.cofinsExemptLegalReason, processScenario.cofinsExemptLegalReason) &&
        Objects.equals(this.allowIPIcreditWhenInGoing, processScenario.allowIPIcreditWhenInGoing) &&
        Objects.equals(this.icmsConf, processScenario.icmsConf) &&
        Objects.equals(this.name, processScenario.name) &&
        Objects.equals(this.type, processScenario.type) &&
        Objects.equals(this.wayType, processScenario.wayType) &&
        Objects.equals(this.goal, processScenario.goal) &&
        Objects.equals(this.overWriteCFOP, processScenario.overWriteCFOP) &&
        Objects.equals(this.cfops, processScenario.cfops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, stockImpact, financialImpact, cstIPI, ipiLegalTaxClass, accruablePISTaxation, pisExemptLegalReasonCode, pisExemptLegalReason, accruableCOFINSTaxation, cofinsExemptLegalReasonCode, cofinsExemptLegalReason, allowIPIcreditWhenInGoing, icmsConf, name, type, wayType, goal, overWriteCFOP, cfops);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScenario {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    stockImpact: ").append(toIndentedString(stockImpact)).append("\n");
    sb.append("    financialImpact: ").append(toIndentedString(financialImpact)).append("\n");
    sb.append("    cstIPI: ").append(toIndentedString(cstIPI)).append("\n");
    sb.append("    ipiLegalTaxClass: ").append(toIndentedString(ipiLegalTaxClass)).append("\n");
    sb.append("    accruablePISTaxation: ").append(toIndentedString(accruablePISTaxation)).append("\n");
    sb.append("    pisExemptLegalReasonCode: ").append(toIndentedString(pisExemptLegalReasonCode)).append("\n");
    sb.append("    pisExemptLegalReason: ").append(toIndentedString(pisExemptLegalReason)).append("\n");
    sb.append("    accruableCOFINSTaxation: ").append(toIndentedString(accruableCOFINSTaxation)).append("\n");
    sb.append("    cofinsExemptLegalReasonCode: ").append(toIndentedString(cofinsExemptLegalReasonCode)).append("\n");
    sb.append("    cofinsExemptLegalReason: ").append(toIndentedString(cofinsExemptLegalReason)).append("\n");
    sb.append("    allowIPIcreditWhenInGoing: ").append(toIndentedString(allowIPIcreditWhenInGoing)).append("\n");
    sb.append("    icmsConf: ").append(toIndentedString(icmsConf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wayType: ").append(toIndentedString(wayType)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    overWriteCFOP: ").append(toIndentedString(overWriteCFOP)).append("\n");
    sb.append("    cfops: ").append(toIndentedString(cfops)).append("\n");
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
