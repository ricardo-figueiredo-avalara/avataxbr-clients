package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesTaxesConfig  {
  

@XmlType(name="AccruableCOFINSTaxationEnum")
@XmlEnum(String.class)
public enum AccruableCOFINSTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("S") S(String.valueOf("S"));


    private String value;

    AccruableCOFINSTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruableCOFINSTaxationEnum fromValue(String v) {
        for (AccruableCOFINSTaxationEnum b : AccruableCOFINSTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;

@XmlType(name="AccruableCSLLTaxationEnum")
@XmlEnum(String.class)
public enum AccruableCSLLTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("E") E(String.valueOf("E"));


    private String value;

    AccruableCSLLTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruableCSLLTaxationEnum fromValue(String v) {
        for (AccruableCSLLTaxationEnum b : AccruableCSLLTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT ")
  private AccruableCSLLTaxationEnum accruableCSLLTaxation = null;

@XmlType(name="AccruablePISTaxationEnum")
@XmlEnum(String.class)
public enum AccruablePISTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("S") S(String.valueOf("S"));


    private String value;

    AccruablePISTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruablePISTaxationEnum fromValue(String v) {
        for (AccruablePISTaxationEnum b : AccruablePISTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  private AccruablePISTaxationEnum accruablePISTaxation = null;
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption")
  private String accruableCOFINSExempCodeTaxation = null;
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption")
  private String accruablePISExempCodeTaxation = null;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingCOFINS = null;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingCSLL = null;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingIRRF = null;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingPIS = null;
  @ApiModelProperty(example = "null", value = "When property withholdingIRRF is false is mandatory inform the reason")
  private String withholdIRRFExemptReasonTaxation = null;

 /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return accruableCOFINSTaxation
  **/
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }
  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }
 /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   * @return accruableCSLLTaxation
  **/
  public AccruableCSLLTaxationEnum getAccruableCSLLTaxation() {
    return accruableCSLLTaxation;
  }
  public void setAccruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
  }
 /**
   * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return accruablePISTaxation
  **/
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }
  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }
 /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
   * @return accruableCOFINSExempCodeTaxation
  **/
  public String getAccruableCOFINSExempCodeTaxation() {
    return accruableCOFINSExempCodeTaxation;
  }
  public void setAccruableCOFINSExempCodeTaxation(String accruableCOFINSExempCodeTaxation) {
    this.accruableCOFINSExempCodeTaxation = accruableCOFINSExempCodeTaxation;
  }
 /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
   * @return accruablePISExempCodeTaxation
  **/
  public String getAccruablePISExempCodeTaxation() {
    return accruablePISExempCodeTaxation;
  }
  public void setAccruablePISExempCodeTaxation(String accruablePISExempCodeTaxation) {
    this.accruablePISExempCodeTaxation = accruablePISExempCodeTaxation;
  }
 /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingCOFINS
  **/
  public Boolean getWithholdingCOFINS() {
    return withholdingCOFINS;
  }
  public void setWithholdingCOFINS(Boolean withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }
 /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingCSLL
  **/
  public Boolean getWithholdingCSLL() {
    return withholdingCSLL;
  }
  public void setWithholdingCSLL(Boolean withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }
 /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingIRRF
  **/
  public Boolean getWithholdingIRRF() {
    return withholdingIRRF;
  }
  public void setWithholdingIRRF(Boolean withholdingIRRF) {
    this.withholdingIRRF = withholdingIRRF;
  }
 /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @return withholdingPIS
  **/
  public Boolean getWithholdingPIS() {
    return withholdingPIS;
  }
  public void setWithholdingPIS(Boolean withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }
 /**
   * When property withholdingIRRF is false is mandatory inform the reason
   * @return withholdIRRFExemptReasonTaxation
  **/
  public String getWithholdIRRFExemptReasonTaxation() {
    return withholdIRRFExemptReasonTaxation;
  }
  public void setWithholdIRRFExemptReasonTaxation(String withholdIRRFExemptReasonTaxation) {
    this.withholdIRRFExemptReasonTaxation = withholdIRRFExemptReasonTaxation;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

