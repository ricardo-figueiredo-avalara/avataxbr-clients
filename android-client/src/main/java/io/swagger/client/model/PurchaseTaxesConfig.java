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
public class PurchaseTaxesConfig {
  
  public enum EntityAccruableCOFINSTaxationEnum {
     T,  N,  Z,  E,  H,  S, 
  };
  @SerializedName("entityAccruableCOFINSTaxation")
  private EntityAccruableCOFINSTaxationEnum entityAccruableCOFINSTaxation = null;
  public enum EntityAccruableCSLLTaxationEnum {
     T,  E, 
  };
  @SerializedName("entityAccruableCSLLTaxation")
  private EntityAccruableCSLLTaxationEnum entityAccruableCSLLTaxation = null;
  public enum EntityAccruablePISTaxationEnum {
     T,  N,  Z,  E,  H,  S, 
  };
  @SerializedName("entityAccruablePISTaxation")
  private EntityAccruablePISTaxationEnum entityAccruablePISTaxation = null;
  @SerializedName("accruableCOFINSExempCodeTaxation")
  private String accruableCOFINSExempCodeTaxation = null;
  @SerializedName("accruablePISExempCodeTaxation")
  private String accruablePISExempCodeTaxation = null;
  @SerializedName("accruablePISExemptReasonTaxation")
  private String accruablePISExemptReasonTaxation = null;
  @SerializedName("accruableCOFINSExemptReasonTaxation")
  private String accruableCOFINSExemptReasonTaxation = null;
  @SerializedName("accruableCSLLExemptReasonTaxation")
  private String accruableCSLLExemptReasonTaxation = null;
  @SerializedName("withholdingPIS")
  private Boolean withholdingPIS = null;
  @SerializedName("withholdingCOFINS")
  private Boolean withholdingCOFINS = null;
  @SerializedName("withholdingCSLL")
  private Boolean withholdingCSLL = null;
  @SerializedName("withholdingIRRF")
  private Boolean withholdingIRRF = null;
  @SerializedName("withholdCOFINSExemptReasonTaxation")
  private String withholdCOFINSExemptReasonTaxation = null;
  @SerializedName("withholdCSLLExemptReasonTaxation")
  private String withholdCSLLExemptReasonTaxation = null;
  @SerializedName("withholdPISExemptReasonTaxation")
  private String withholdPISExemptReasonTaxation = null;

  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   **/
  @ApiModelProperty(value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  public EntityAccruableCOFINSTaxationEnum getEntityAccruableCOFINSTaxation() {
    return entityAccruableCOFINSTaxation;
  }
  public void setEntityAccruableCOFINSTaxation(EntityAccruableCOFINSTaxationEnum entityAccruableCOFINSTaxation) {
    this.entityAccruableCOFINSTaxation = entityAccruableCOFINSTaxation;
  }

  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   **/
  @ApiModelProperty(value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT ")
  public EntityAccruableCSLLTaxationEnum getEntityAccruableCSLLTaxation() {
    return entityAccruableCSLLTaxation;
  }
  public void setEntityAccruableCSLLTaxation(EntityAccruableCSLLTaxationEnum entityAccruableCSLLTaxation) {
    this.entityAccruableCSLLTaxation = entityAccruableCSLLTaxation;
  }

  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   **/
  @ApiModelProperty(value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  public EntityAccruablePISTaxationEnum getEntityAccruablePISTaxation() {
    return entityAccruablePISTaxation;
  }
  public void setEntityAccruablePISTaxation(EntityAccruablePISTaxationEnum entityAccruablePISTaxation) {
    this.entityAccruablePISTaxation = entityAccruablePISTaxation;
  }

  /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   **/
  @ApiModelProperty(value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.")
  public String getAccruableCOFINSExempCodeTaxation() {
    return accruableCOFINSExempCodeTaxation;
  }
  public void setAccruableCOFINSExempCodeTaxation(String accruableCOFINSExempCodeTaxation) {
    this.accruableCOFINSExempCodeTaxation = accruableCOFINSExempCodeTaxation;
  }

  /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   **/
  @ApiModelProperty(value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.")
  public String getAccruablePISExempCodeTaxation() {
    return accruablePISExempCodeTaxation;
  }
  public void setAccruablePISExempCodeTaxation(String accruablePISExempCodeTaxation) {
    this.accruablePISExempCodeTaxation = accruablePISExempCodeTaxation;
  }

  /**
   * When Code is 999 the user system need send the custom reason to Exemption
   **/
  @ApiModelProperty(value = "When Code is 999 the user system need send the custom reason to Exemption")
  public String getAccruablePISExemptReasonTaxation() {
    return accruablePISExemptReasonTaxation;
  }
  public void setAccruablePISExemptReasonTaxation(String accruablePISExemptReasonTaxation) {
    this.accruablePISExemptReasonTaxation = accruablePISExemptReasonTaxation;
  }

  /**
   * When Code is 999 the user system need send the custom reason to Exemption
   **/
  @ApiModelProperty(value = "When Code is 999 the user system need send the custom reason to Exemption")
  public String getAccruableCOFINSExemptReasonTaxation() {
    return accruableCOFINSExemptReasonTaxation;
  }
  public void setAccruableCOFINSExemptReasonTaxation(String accruableCOFINSExemptReasonTaxation) {
    this.accruableCOFINSExemptReasonTaxation = accruableCOFINSExemptReasonTaxation;
  }

  /**
   * CSLL no withholding Custom Reason
   **/
  @ApiModelProperty(value = "CSLL no withholding Custom Reason")
  public String getAccruableCSLLExemptReasonTaxation() {
    return accruableCSLLExemptReasonTaxation;
  }
  public void setAccruableCSLLExemptReasonTaxation(String accruableCSLLExemptReasonTaxation) {
    this.accruableCSLLExemptReasonTaxation = accruableCSLLExemptReasonTaxation;
  }

  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   **/
  @ApiModelProperty(value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingPIS() {
    return withholdingPIS;
  }
  public void setWithholdingPIS(Boolean withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }

  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   **/
  @ApiModelProperty(value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingCOFINS() {
    return withholdingCOFINS;
  }
  public void setWithholdingCOFINS(Boolean withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }

  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   **/
  @ApiModelProperty(value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingCSLL() {
    return withholdingCSLL;
  }
  public void setWithholdingCSLL(Boolean withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }

  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   **/
  @ApiModelProperty(value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingIRRF() {
    return withholdingIRRF;
  }
  public void setWithholdingIRRF(Boolean withholdingIRRF) {
    this.withholdingIRRF = withholdingIRRF;
  }

  /**
   * COFINS no withholding Custom Reason
   **/
  @ApiModelProperty(value = "COFINS no withholding Custom Reason")
  public String getWithholdCOFINSExemptReasonTaxation() {
    return withholdCOFINSExemptReasonTaxation;
  }
  public void setWithholdCOFINSExemptReasonTaxation(String withholdCOFINSExemptReasonTaxation) {
    this.withholdCOFINSExemptReasonTaxation = withholdCOFINSExemptReasonTaxation;
  }

  /**
   * CSLL no withholding Custom Reason
   **/
  @ApiModelProperty(value = "CSLL no withholding Custom Reason")
  public String getWithholdCSLLExemptReasonTaxation() {
    return withholdCSLLExemptReasonTaxation;
  }
  public void setWithholdCSLLExemptReasonTaxation(String withholdCSLLExemptReasonTaxation) {
    this.withholdCSLLExemptReasonTaxation = withholdCSLLExemptReasonTaxation;
  }

  /**
   * PIS no withholding Custom Reason
   **/
  @ApiModelProperty(value = "PIS no withholding Custom Reason")
  public String getWithholdPISExemptReasonTaxation() {
    return withholdPISExemptReasonTaxation;
  }
  public void setWithholdPISExemptReasonTaxation(String withholdPISExemptReasonTaxation) {
    this.withholdPISExemptReasonTaxation = withholdPISExemptReasonTaxation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTaxesConfig purchaseTaxesConfig = (PurchaseTaxesConfig) o;
    return (this.entityAccruableCOFINSTaxation == null ? purchaseTaxesConfig.entityAccruableCOFINSTaxation == null : this.entityAccruableCOFINSTaxation.equals(purchaseTaxesConfig.entityAccruableCOFINSTaxation)) &&
        (this.entityAccruableCSLLTaxation == null ? purchaseTaxesConfig.entityAccruableCSLLTaxation == null : this.entityAccruableCSLLTaxation.equals(purchaseTaxesConfig.entityAccruableCSLLTaxation)) &&
        (this.entityAccruablePISTaxation == null ? purchaseTaxesConfig.entityAccruablePISTaxation == null : this.entityAccruablePISTaxation.equals(purchaseTaxesConfig.entityAccruablePISTaxation)) &&
        (this.accruableCOFINSExempCodeTaxation == null ? purchaseTaxesConfig.accruableCOFINSExempCodeTaxation == null : this.accruableCOFINSExempCodeTaxation.equals(purchaseTaxesConfig.accruableCOFINSExempCodeTaxation)) &&
        (this.accruablePISExempCodeTaxation == null ? purchaseTaxesConfig.accruablePISExempCodeTaxation == null : this.accruablePISExempCodeTaxation.equals(purchaseTaxesConfig.accruablePISExempCodeTaxation)) &&
        (this.accruablePISExemptReasonTaxation == null ? purchaseTaxesConfig.accruablePISExemptReasonTaxation == null : this.accruablePISExemptReasonTaxation.equals(purchaseTaxesConfig.accruablePISExemptReasonTaxation)) &&
        (this.accruableCOFINSExemptReasonTaxation == null ? purchaseTaxesConfig.accruableCOFINSExemptReasonTaxation == null : this.accruableCOFINSExemptReasonTaxation.equals(purchaseTaxesConfig.accruableCOFINSExemptReasonTaxation)) &&
        (this.accruableCSLLExemptReasonTaxation == null ? purchaseTaxesConfig.accruableCSLLExemptReasonTaxation == null : this.accruableCSLLExemptReasonTaxation.equals(purchaseTaxesConfig.accruableCSLLExemptReasonTaxation)) &&
        (this.withholdingPIS == null ? purchaseTaxesConfig.withholdingPIS == null : this.withholdingPIS.equals(purchaseTaxesConfig.withholdingPIS)) &&
        (this.withholdingCOFINS == null ? purchaseTaxesConfig.withholdingCOFINS == null : this.withholdingCOFINS.equals(purchaseTaxesConfig.withholdingCOFINS)) &&
        (this.withholdingCSLL == null ? purchaseTaxesConfig.withholdingCSLL == null : this.withholdingCSLL.equals(purchaseTaxesConfig.withholdingCSLL)) &&
        (this.withholdingIRRF == null ? purchaseTaxesConfig.withholdingIRRF == null : this.withholdingIRRF.equals(purchaseTaxesConfig.withholdingIRRF)) &&
        (this.withholdCOFINSExemptReasonTaxation == null ? purchaseTaxesConfig.withholdCOFINSExemptReasonTaxation == null : this.withholdCOFINSExemptReasonTaxation.equals(purchaseTaxesConfig.withholdCOFINSExemptReasonTaxation)) &&
        (this.withholdCSLLExemptReasonTaxation == null ? purchaseTaxesConfig.withholdCSLLExemptReasonTaxation == null : this.withholdCSLLExemptReasonTaxation.equals(purchaseTaxesConfig.withholdCSLLExemptReasonTaxation)) &&
        (this.withholdPISExemptReasonTaxation == null ? purchaseTaxesConfig.withholdPISExemptReasonTaxation == null : this.withholdPISExemptReasonTaxation.equals(purchaseTaxesConfig.withholdPISExemptReasonTaxation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entityAccruableCOFINSTaxation == null ? 0: this.entityAccruableCOFINSTaxation.hashCode());
    result = 31 * result + (this.entityAccruableCSLLTaxation == null ? 0: this.entityAccruableCSLLTaxation.hashCode());
    result = 31 * result + (this.entityAccruablePISTaxation == null ? 0: this.entityAccruablePISTaxation.hashCode());
    result = 31 * result + (this.accruableCOFINSExempCodeTaxation == null ? 0: this.accruableCOFINSExempCodeTaxation.hashCode());
    result = 31 * result + (this.accruablePISExempCodeTaxation == null ? 0: this.accruablePISExempCodeTaxation.hashCode());
    result = 31 * result + (this.accruablePISExemptReasonTaxation == null ? 0: this.accruablePISExemptReasonTaxation.hashCode());
    result = 31 * result + (this.accruableCOFINSExemptReasonTaxation == null ? 0: this.accruableCOFINSExemptReasonTaxation.hashCode());
    result = 31 * result + (this.accruableCSLLExemptReasonTaxation == null ? 0: this.accruableCSLLExemptReasonTaxation.hashCode());
    result = 31 * result + (this.withholdingPIS == null ? 0: this.withholdingPIS.hashCode());
    result = 31 * result + (this.withholdingCOFINS == null ? 0: this.withholdingCOFINS.hashCode());
    result = 31 * result + (this.withholdingCSLL == null ? 0: this.withholdingCSLL.hashCode());
    result = 31 * result + (this.withholdingIRRF == null ? 0: this.withholdingIRRF.hashCode());
    result = 31 * result + (this.withholdCOFINSExemptReasonTaxation == null ? 0: this.withholdCOFINSExemptReasonTaxation.hashCode());
    result = 31 * result + (this.withholdCSLLExemptReasonTaxation == null ? 0: this.withholdCSLLExemptReasonTaxation.hashCode());
    result = 31 * result + (this.withholdPISExemptReasonTaxation == null ? 0: this.withholdPISExemptReasonTaxation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTaxesConfig {\n");
    
    sb.append("  entityAccruableCOFINSTaxation: ").append(entityAccruableCOFINSTaxation).append("\n");
    sb.append("  entityAccruableCSLLTaxation: ").append(entityAccruableCSLLTaxation).append("\n");
    sb.append("  entityAccruablePISTaxation: ").append(entityAccruablePISTaxation).append("\n");
    sb.append("  accruableCOFINSExempCodeTaxation: ").append(accruableCOFINSExempCodeTaxation).append("\n");
    sb.append("  accruablePISExempCodeTaxation: ").append(accruablePISExempCodeTaxation).append("\n");
    sb.append("  accruablePISExemptReasonTaxation: ").append(accruablePISExemptReasonTaxation).append("\n");
    sb.append("  accruableCOFINSExemptReasonTaxation: ").append(accruableCOFINSExemptReasonTaxation).append("\n");
    sb.append("  accruableCSLLExemptReasonTaxation: ").append(accruableCSLLExemptReasonTaxation).append("\n");
    sb.append("  withholdingPIS: ").append(withholdingPIS).append("\n");
    sb.append("  withholdingCOFINS: ").append(withholdingCOFINS).append("\n");
    sb.append("  withholdingCSLL: ").append(withholdingCSLL).append("\n");
    sb.append("  withholdingIRRF: ").append(withholdingIRRF).append("\n");
    sb.append("  withholdCOFINSExemptReasonTaxation: ").append(withholdCOFINSExemptReasonTaxation).append("\n");
    sb.append("  withholdCSLLExemptReasonTaxation: ").append(withholdCSLLExemptReasonTaxation).append("\n");
    sb.append("  withholdPISExemptReasonTaxation: ").append(withholdPISExemptReasonTaxation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}