package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PurchaseTaxesConfig  {
  

@XmlType(name="EntityAccruableCOFINSTaxationEnum")
@XmlEnum(String.class)
public enum EntityAccruableCOFINSTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("S") S(String.valueOf("S"));


    private String value;

    EntityAccruableCOFINSTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityAccruableCOFINSTaxationEnum fromValue(String v) {
        for (EntityAccruableCOFINSTaxationEnum b : EntityAccruableCOFINSTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  private EntityAccruableCOFINSTaxationEnum entityAccruableCOFINSTaxation = EntityAccruableCOFINSTaxationEnum.T;

@XmlType(name="EntityAccruableCSLLTaxationEnum")
@XmlEnum(String.class)
public enum EntityAccruableCSLLTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("E") E(String.valueOf("E"));


    private String value;

    EntityAccruableCSLLTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityAccruableCSLLTaxationEnum fromValue(String v) {
        for (EntityAccruableCSLLTaxationEnum b : EntityAccruableCSLLTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT ")
  private EntityAccruableCSLLTaxationEnum entityAccruableCSLLTaxation = EntityAccruableCSLLTaxationEnum.T;

@XmlType(name="EntityAccruablePISTaxationEnum")
@XmlEnum(String.class)
public enum EntityAccruablePISTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("S") S(String.valueOf("S"));


    private String value;

    EntityAccruablePISTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityAccruablePISTaxationEnum fromValue(String v) {
        for (EntityAccruablePISTaxationEnum b : EntityAccruablePISTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE ")
  private EntityAccruablePISTaxationEnum entityAccruablePISTaxation = EntityAccruablePISTaxationEnum.T;
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.")
  private String accruableCOFINSExempCodeTaxation = null;
  @ApiModelProperty(example = "null", value = "This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.")
  private String accruablePISExempCodeTaxation = null;
  @ApiModelProperty(example = "null", value = "When Code is 999 the user system need send the custom reason to Exemption")
  private String accruablePISExemptReasonTaxation = null;
  @ApiModelProperty(example = "null", value = "When Code is 999 the user system need send the custom reason to Exemption")
  private String accruableCOFINSExemptReasonTaxation = null;
  @ApiModelProperty(example = "null", value = "CSLL no withholding Custom Reason")
  private String accruableCSLLExemptReasonTaxation = null;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingPIS = true;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingCOFINS = true;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingCSLL = true;
  @ApiModelProperty(example = "null", value = "Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.")
  private Boolean withholdingIRRF = true;
  @ApiModelProperty(example = "null", value = "COFINS no withholding Custom Reason")
  private String withholdCOFINSExemptReasonTaxation = null;
  @ApiModelProperty(example = "null", value = "CSLL no withholding Custom Reason")
  private String withholdCSLLExemptReasonTaxation = null;
  @ApiModelProperty(example = "null", value = "PIS no withholding Custom Reason")
  private String withholdPISExemptReasonTaxation = null;

 /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return entityAccruableCOFINSTaxation
  **/
  public EntityAccruableCOFINSTaxationEnum getEntityAccruableCOFINSTaxation() {
    return entityAccruableCOFINSTaxation;
  }
  public void setEntityAccruableCOFINSTaxation(EntityAccruableCOFINSTaxationEnum entityAccruableCOFINSTaxation) {
    this.entityAccruableCOFINSTaxation = entityAccruableCOFINSTaxation;
  }
 /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   * @return entityAccruableCSLLTaxation
  **/
  public EntityAccruableCSLLTaxationEnum getEntityAccruableCSLLTaxation() {
    return entityAccruableCSLLTaxation;
  }
  public void setEntityAccruableCSLLTaxation(EntityAccruableCSLLTaxationEnum entityAccruableCSLLTaxation) {
    this.entityAccruableCSLLTaxation = entityAccruableCSLLTaxation;
  }
 /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @return entityAccruablePISTaxation
  **/
  public EntityAccruablePISTaxationEnum getEntityAccruablePISTaxation() {
    return entityAccruablePISTaxation;
  }
  public void setEntityAccruablePISTaxation(EntityAccruablePISTaxationEnum entityAccruablePISTaxation) {
    this.entityAccruablePISTaxation = entityAccruablePISTaxation;
  }
 /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   * @return accruableCOFINSExempCodeTaxation
  **/
  public String getAccruableCOFINSExempCodeTaxation() {
    return accruableCOFINSExempCodeTaxation;
  }
  public void setAccruableCOFINSExempCodeTaxation(String accruableCOFINSExempCodeTaxation) {
    this.accruableCOFINSExempCodeTaxation = accruableCOFINSExempCodeTaxation;
  }
 /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   * @return accruablePISExempCodeTaxation
  **/
  public String getAccruablePISExempCodeTaxation() {
    return accruablePISExempCodeTaxation;
  }
  public void setAccruablePISExempCodeTaxation(String accruablePISExempCodeTaxation) {
    this.accruablePISExempCodeTaxation = accruablePISExempCodeTaxation;
  }
 /**
   * When Code is 999 the user system need send the custom reason to Exemption
   * @return accruablePISExemptReasonTaxation
  **/
  public String getAccruablePISExemptReasonTaxation() {
    return accruablePISExemptReasonTaxation;
  }
  public void setAccruablePISExemptReasonTaxation(String accruablePISExemptReasonTaxation) {
    this.accruablePISExemptReasonTaxation = accruablePISExemptReasonTaxation;
  }
 /**
   * When Code is 999 the user system need send the custom reason to Exemption
   * @return accruableCOFINSExemptReasonTaxation
  **/
  public String getAccruableCOFINSExemptReasonTaxation() {
    return accruableCOFINSExemptReasonTaxation;
  }
  public void setAccruableCOFINSExemptReasonTaxation(String accruableCOFINSExemptReasonTaxation) {
    this.accruableCOFINSExemptReasonTaxation = accruableCOFINSExemptReasonTaxation;
  }
 /**
   * CSLL no withholding Custom Reason
   * @return accruableCSLLExemptReasonTaxation
  **/
  public String getAccruableCSLLExemptReasonTaxation() {
    return accruableCSLLExemptReasonTaxation;
  }
  public void setAccruableCSLLExemptReasonTaxation(String accruableCSLLExemptReasonTaxation) {
    this.accruableCSLLExemptReasonTaxation = accruableCSLLExemptReasonTaxation;
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
   * COFINS no withholding Custom Reason
   * @return withholdCOFINSExemptReasonTaxation
  **/
  public String getWithholdCOFINSExemptReasonTaxation() {
    return withholdCOFINSExemptReasonTaxation;
  }
  public void setWithholdCOFINSExemptReasonTaxation(String withholdCOFINSExemptReasonTaxation) {
    this.withholdCOFINSExemptReasonTaxation = withholdCOFINSExemptReasonTaxation;
  }
 /**
   * CSLL no withholding Custom Reason
   * @return withholdCSLLExemptReasonTaxation
  **/
  public String getWithholdCSLLExemptReasonTaxation() {
    return withholdCSLLExemptReasonTaxation;
  }
  public void setWithholdCSLLExemptReasonTaxation(String withholdCSLLExemptReasonTaxation) {
    this.withholdCSLLExemptReasonTaxation = withholdCSLLExemptReasonTaxation;
  }
 /**
   * PIS no withholding Custom Reason
   * @return withholdPISExemptReasonTaxation
  **/
  public String getWithholdPISExemptReasonTaxation() {
    return withholdPISExemptReasonTaxation;
  }
  public void setWithholdPISExemptReasonTaxation(String withholdPISExemptReasonTaxation) {
    this.withholdPISExemptReasonTaxation = withholdPISExemptReasonTaxation;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTaxesConfig {\n");
    
    sb.append("    entityAccruableCOFINSTaxation: ").append(toIndentedString(entityAccruableCOFINSTaxation)).append("\n");
    sb.append("    entityAccruableCSLLTaxation: ").append(toIndentedString(entityAccruableCSLLTaxation)).append("\n");
    sb.append("    entityAccruablePISTaxation: ").append(toIndentedString(entityAccruablePISTaxation)).append("\n");
    sb.append("    accruableCOFINSExempCodeTaxation: ").append(toIndentedString(accruableCOFINSExempCodeTaxation)).append("\n");
    sb.append("    accruablePISExempCodeTaxation: ").append(toIndentedString(accruablePISExempCodeTaxation)).append("\n");
    sb.append("    accruablePISExemptReasonTaxation: ").append(toIndentedString(accruablePISExemptReasonTaxation)).append("\n");
    sb.append("    accruableCOFINSExemptReasonTaxation: ").append(toIndentedString(accruableCOFINSExemptReasonTaxation)).append("\n");
    sb.append("    accruableCSLLExemptReasonTaxation: ").append(toIndentedString(accruableCSLLExemptReasonTaxation)).append("\n");
    sb.append("    withholdingPIS: ").append(toIndentedString(withholdingPIS)).append("\n");
    sb.append("    withholdingCOFINS: ").append(toIndentedString(withholdingCOFINS)).append("\n");
    sb.append("    withholdingCSLL: ").append(toIndentedString(withholdingCSLL)).append("\n");
    sb.append("    withholdingIRRF: ").append(toIndentedString(withholdingIRRF)).append("\n");
    sb.append("    withholdCOFINSExemptReasonTaxation: ").append(toIndentedString(withholdCOFINSExemptReasonTaxation)).append("\n");
    sb.append("    withholdCSLLExemptReasonTaxation: ").append(toIndentedString(withholdCSLLExemptReasonTaxation)).append("\n");
    sb.append("    withholdPISExemptReasonTaxation: ").append(toIndentedString(withholdPISExemptReasonTaxation)).append("\n");
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

