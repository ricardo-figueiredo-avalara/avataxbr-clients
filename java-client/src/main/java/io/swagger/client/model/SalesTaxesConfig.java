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
 * SalesTaxesConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class SalesTaxesConfig {
  /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   */
  public enum AccruableCOFINSTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("S")
    S("S");

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

  /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   */
  public enum AccruableCSLLTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("E")
    E("E");

    private String value;

    AccruableCSLLTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accruableCSLLTaxation")
  private AccruableCSLLTaxationEnum accruableCSLLTaxation = null;

  /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   */
  public enum AccruablePISTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("S")
    S("S");

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

  @SerializedName("accruableCOFINSExempCodeTaxation")
  private String accruableCOFINSExempCodeTaxation = null;

  @SerializedName("accruablePISExempCodeTaxation")
  private String accruablePISExempCodeTaxation = null;

  @SerializedName("withholdingCOFINS")
  private Boolean withholdingCOFINS = null;

  @SerializedName("withholdingCSLL")
  private Boolean withholdingCSLL = null;

  @SerializedName("withholdingIRRF")
  private Boolean withholdingIRRF = null;

  @SerializedName("withholdingPIS")
  private Boolean withholdingPIS = null;

  @SerializedName("withholdIRRFExemptReasonTaxation")
  private String withholdIRRFExemptReasonTaxation = null;

  public SalesTaxesConfig accruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
    return this;
  }

   /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return accruableCOFINSTaxation
  **/
  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }

  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  public SalesTaxesConfig accruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
    return this;
  }

   /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   * @return accruableCSLLTaxation
  **/
  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT ")
  public AccruableCSLLTaxationEnum getAccruableCSLLTaxation() {
    return accruableCSLLTaxation;
  }

  public void setAccruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
  }

  public SalesTaxesConfig accruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
    return this;
  }

   /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return accruablePISTaxation
  **/
  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }

  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  public SalesTaxesConfig accruableCOFINSExempCodeTaxation(String accruableCOFINSExempCodeTaxation) {
    this.accruableCOFINSExempCodeTaxation = accruableCOFINSExempCodeTaxation;
    return this;
  }

   /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
   * @return accruableCOFINSExempCodeTaxation
  **/
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption")
  public String getAccruableCOFINSExempCodeTaxation() {
    return accruableCOFINSExempCodeTaxation;
  }

  public void setAccruableCOFINSExempCodeTaxation(String accruableCOFINSExempCodeTaxation) {
    this.accruableCOFINSExempCodeTaxation = accruableCOFINSExempCodeTaxation;
  }

  public SalesTaxesConfig accruablePISExempCodeTaxation(String accruablePISExempCodeTaxation) {
    this.accruablePISExempCodeTaxation = accruablePISExempCodeTaxation;
    return this;
  }

   /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
   * @return accruablePISExempCodeTaxation
  **/
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption")
  public String getAccruablePISExempCodeTaxation() {
    return accruablePISExempCodeTaxation;
  }

  public void setAccruablePISExempCodeTaxation(String accruablePISExempCodeTaxation) {
    this.accruablePISExempCodeTaxation = accruablePISExempCodeTaxation;
  }

  public SalesTaxesConfig withholdingCOFINS(Boolean withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
    return this;
  }

   /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingCOFINS
  **/
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingCOFINS() {
    return withholdingCOFINS;
  }

  public void setWithholdingCOFINS(Boolean withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }

  public SalesTaxesConfig withholdingCSLL(Boolean withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
    return this;
  }

   /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingCSLL
  **/
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingCSLL() {
    return withholdingCSLL;
  }

  public void setWithholdingCSLL(Boolean withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }

  public SalesTaxesConfig withholdingIRRF(Boolean withholdingIRRF) {
    this.withholdingIRRF = withholdingIRRF;
    return this;
  }

   /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingIRRF
  **/
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingIRRF() {
    return withholdingIRRF;
  }

  public void setWithholdingIRRF(Boolean withholdingIRRF) {
    this.withholdingIRRF = withholdingIRRF;
  }

  public SalesTaxesConfig withholdingPIS(Boolean withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
    return this;
  }

   /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingPIS
  **/
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  public Boolean getWithholdingPIS() {
    return withholdingPIS;
  }

  public void setWithholdingPIS(Boolean withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }

  public SalesTaxesConfig withholdIRRFExemptReasonTaxation(String withholdIRRFExemptReasonTaxation) {
    this.withholdIRRFExemptReasonTaxation = withholdIRRFExemptReasonTaxation;
    return this;
  }

   /**
   * When property withholdingIRRF is false is mandatory inform the reason
   * @return withholdIRRFExemptReasonTaxation
  **/
  @ApiModelProperty(example = "null", value = "When property withholdingIRRF is false is mandatory inform the reason")
  public String getWithholdIRRFExemptReasonTaxation() {
    return withholdIRRFExemptReasonTaxation;
  }

  public void setWithholdIRRFExemptReasonTaxation(String withholdIRRFExemptReasonTaxation) {
    this.withholdIRRFExemptReasonTaxation = withholdIRRFExemptReasonTaxation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTaxesConfig salesTaxesConfig = (SalesTaxesConfig) o;
    return Objects.equals(this.accruableCOFINSTaxation, salesTaxesConfig.accruableCOFINSTaxation) &&
        Objects.equals(this.accruableCSLLTaxation, salesTaxesConfig.accruableCSLLTaxation) &&
        Objects.equals(this.accruablePISTaxation, salesTaxesConfig.accruablePISTaxation) &&
        Objects.equals(this.accruableCOFINSExempCodeTaxation, salesTaxesConfig.accruableCOFINSExempCodeTaxation) &&
        Objects.equals(this.accruablePISExempCodeTaxation, salesTaxesConfig.accruablePISExempCodeTaxation) &&
        Objects.equals(this.withholdingCOFINS, salesTaxesConfig.withholdingCOFINS) &&
        Objects.equals(this.withholdingCSLL, salesTaxesConfig.withholdingCSLL) &&
        Objects.equals(this.withholdingIRRF, salesTaxesConfig.withholdingIRRF) &&
        Objects.equals(this.withholdingPIS, salesTaxesConfig.withholdingPIS) &&
        Objects.equals(this.withholdIRRFExemptReasonTaxation, salesTaxesConfig.withholdIRRFExemptReasonTaxation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accruableCOFINSTaxation, accruableCSLLTaxation, accruablePISTaxation, accruableCOFINSExempCodeTaxation, accruablePISExempCodeTaxation, withholdingCOFINS, withholdingCSLL, withholdingIRRF, withholdingPIS, withholdIRRFExemptReasonTaxation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxesConfig {\n");
    
    sb.append("    accruableCOFINSTaxation: ").append(toIndentedString(accruableCOFINSTaxation)).append("\n");
    sb.append("    accruableCSLLTaxation: ").append(toIndentedString(accruableCSLLTaxation)).append("\n");
    sb.append("    accruablePISTaxation: ").append(toIndentedString(accruablePISTaxation)).append("\n");
    sb.append("    accruableCOFINSExempCodeTaxation: ").append(toIndentedString(accruableCOFINSExempCodeTaxation)).append("\n");
    sb.append("    accruablePISExempCodeTaxation: ").append(toIndentedString(accruablePISExempCodeTaxation)).append("\n");
    sb.append("    withholdingCOFINS: ").append(toIndentedString(withholdingCOFINS)).append("\n");
    sb.append("    withholdingCSLL: ").append(toIndentedString(withholdingCSLL)).append("\n");
    sb.append("    withholdingIRRF: ").append(toIndentedString(withholdingIRRF)).append("\n");
    sb.append("    withholdingPIS: ").append(toIndentedString(withholdingPIS)).append("\n");
    sb.append("    withholdIRRFExemptReasonTaxation: ").append(toIndentedString(withholdIRRFExemptReasonTaxation)).append("\n");
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

