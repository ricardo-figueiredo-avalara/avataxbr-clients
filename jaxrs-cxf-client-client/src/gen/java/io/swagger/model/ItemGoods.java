package io.swagger.model;

import io.swagger.model.ItemSimple;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ItemGoods  {
  
  @ApiModelProperty(example = "null", required = true, value = "Company ID")
  private String companyId = null;
  @ApiModelProperty(example = "null", required = true, value = "ERP Code")
  private String code = null;
  @ApiModelProperty(example = "null", required = true, value = "Agast Code")
  private String agast = null;
  @ApiModelProperty(example = "null", value = "Item Description")
  private String description = null;
  @ApiModelProperty(example = "null", required = true, value = "Seal Code for ipi tax control (código do selo para controle de IPI)")
  private String sealCode = null;
  @ApiModelProperty(example = "null", value = "Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)")
  private String nFCI = null;
  @ApiModelProperty(example = "null", value = "this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. ")
  private Boolean isIcmsStSubstitute = null;

@XmlType(name="SourceEnum")
@XmlEnum(String.class)
public enum SourceEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("5") _5(String.valueOf("5")), @XmlEnumValue("6") _6(String.valueOf("6")), @XmlEnumValue("7") _7(String.valueOf("7")), @XmlEnumValue("8") _8(String.valueOf("8"));


    private String value;

    SourceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceEnum fromValue(String v) {
        for (SourceEnum b : SourceEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% ")
  private SourceEnum source = null;

@XmlType(name="ProductTypeEnum")
@XmlEnum(String.class)
public enum ProductTypeEnum {

    @XmlEnumValue("FOR PRODUCT") FOR_PRODUCT(String.valueOf("FOR PRODUCT")), @XmlEnumValue("FOR MERCHANDISE") FOR_MERCHANDISE(String.valueOf("FOR MERCHANDISE")), @XmlEnumValue("NO RESTRICTION") NO_RESTRICTION(String.valueOf("NO RESTRICTION")), @XmlEnumValue("SERVICE") SERVICE(String.valueOf("SERVICE")), @XmlEnumValue("FEEDSTOCK") FEEDSTOCK(String.valueOf("FEEDSTOCK")), @XmlEnumValue("FIXED ASSETS") FIXED_ASSETS(String.valueOf("FIXED ASSETS"));


    private String value;

    ProductTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String v) {
        for (ProductTypeEnum b : ProductTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private ProductTypeEnum productType = null;
  @ApiModelProperty(example = "null", value = "Item is merchandise but will be considered product")
  private Boolean manufacturerEquivalent = null;
  @ApiModelProperty(example = "null", value = "Inform that this item will have rights to aprropriate IPI credit")
  private Boolean appropriateIPIcreditWhenInGoing = null;
  @ApiModelProperty(example = "null", value = "Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE")
  private Boolean usuallyAppropriatePISCOFINSCredit = null;
  @ApiModelProperty(example = "null", value = "The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount")
  private Boolean isPisCofinsEstimatedCredit = null;

@XmlType(name="PiscofinsRevenueTypeEnum")
@XmlEnum(String.class)
public enum PiscofinsRevenueTypeEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("05") _05(String.valueOf("05")), @XmlEnumValue("06") _06(String.valueOf("06")), @XmlEnumValue("07") _07(String.valueOf("07"));


    private String value;

    PiscofinsRevenueTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PiscofinsRevenueTypeEnum fromValue(String v) {
        for (PiscofinsRevenueTypeEnum b : PiscofinsRevenueTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação ")
  private PiscofinsRevenueTypeEnum piscofinsRevenueType = null;
  @ApiModelProperty(example = "null", value = "Discount allowed on icms base when PIS/COFINS are Monophase")
  private Double icmsBaseDiscountForMonoPhaseSocialContr = null;
  @ApiModelProperty(example = "null", value = "GTIN NUMBER")
  private String cean = null;
  @ApiModelProperty(example = "null", value = "Nomenclatura de Valor aduaneio e Estatístico - NCM extension code")
  private String nve = null;
  @ApiModelProperty(example = "null", value = "")
  private String salesUnit = null;
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double salesUnitIPIfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double salesUnitIcmsfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double salesUnitIcmsStfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double salesUnitPisCofinsfactor = null;
  @ApiModelProperty(example = "null", value = "")
  private String purchaseUnit = null;
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double purchaseUnitIPIfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double purchaseUnitIcmsfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double purchaseUnitIcmsStfactor = null;
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  private Double purchaseUnitPisCofinsfactor = null;
  @ApiModelProperty(example = "null", value = "When the product is new, and will be retail, firt time that it exit it is subject to IPI")
  private Boolean firstUse = null;

 /**
   * Company ID
   * @return companyId
  **/
  public String getCompanyId() {
    return companyId;
  }
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }
 /**
   * ERP Code
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Agast Code
   * @return agast
  **/
  public String getAgast() {
    return agast;
  }
  public void setAgast(String agast) {
    this.agast = agast;
  }
 /**
   * Item Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 /**
   * Seal Code for ipi tax control (código do selo para controle de IPI)
   * @return sealCode
  **/
  public String getSealCode() {
    return sealCode;
  }
  public void setSealCode(String sealCode) {
    this.sealCode = sealCode;
  }
 /**
   * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
   * @return nFCI
  **/
  public String getNFCI() {
    return nFCI;
  }
  public void setNFCI(String nFCI) {
    this.nFCI = nFCI;
  }
 /**
   * this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
   * @return isIcmsStSubstitute
  **/
  public Boolean getIsIcmsStSubstitute() {
    return isIcmsStSubstitute;
  }
  public void setIsIcmsStSubstitute(Boolean isIcmsStSubstitute) {
    this.isIcmsStSubstitute = isIcmsStSubstitute;
  }
 /**
   * - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
   * @return source
  **/
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }
 /**
   * Get productType
   * @return productType
  **/
  public ProductTypeEnum getProductType() {
    return productType;
  }
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }
 /**
   * Item is merchandise but will be considered product
   * @return manufacturerEquivalent
  **/
  public Boolean getManufacturerEquivalent() {
    return manufacturerEquivalent;
  }
  public void setManufacturerEquivalent(Boolean manufacturerEquivalent) {
    this.manufacturerEquivalent = manufacturerEquivalent;
  }
 /**
   * Inform that this item will have rights to aprropriate IPI credit
   * @return appropriateIPIcreditWhenInGoing
  **/
  public Boolean getAppropriateIPIcreditWhenInGoing() {
    return appropriateIPIcreditWhenInGoing;
  }
  public void setAppropriateIPIcreditWhenInGoing(Boolean appropriateIPIcreditWhenInGoing) {
    this.appropriateIPIcreditWhenInGoing = appropriateIPIcreditWhenInGoing;
  }
 /**
   * Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
   * @return usuallyAppropriatePISCOFINSCredit
  **/
  public Boolean getUsuallyAppropriatePISCOFINSCredit() {
    return usuallyAppropriatePISCOFINSCredit;
  }
  public void setUsuallyAppropriatePISCOFINSCredit(Boolean usuallyAppropriatePISCOFINSCredit) {
    this.usuallyAppropriatePISCOFINSCredit = usuallyAppropriatePISCOFINSCredit;
  }
 /**
   * The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
   * @return isPisCofinsEstimatedCredit
  **/
  public Boolean getIsPisCofinsEstimatedCredit() {
    return isPisCofinsEstimatedCredit;
  }
  public void setIsPisCofinsEstimatedCredit(Boolean isPisCofinsEstimatedCredit) {
    this.isPisCofinsEstimatedCredit = isPisCofinsEstimatedCredit;
  }
 /**
   * - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
   * @return piscofinsRevenueType
  **/
  public PiscofinsRevenueTypeEnum getPiscofinsRevenueType() {
    return piscofinsRevenueType;
  }
  public void setPiscofinsRevenueType(PiscofinsRevenueTypeEnum piscofinsRevenueType) {
    this.piscofinsRevenueType = piscofinsRevenueType;
  }
 /**
   * Discount allowed on icms base when PIS/COFINS are Monophase
   * @return icmsBaseDiscountForMonoPhaseSocialContr
  **/
  public Double getIcmsBaseDiscountForMonoPhaseSocialContr() {
    return icmsBaseDiscountForMonoPhaseSocialContr;
  }
  public void setIcmsBaseDiscountForMonoPhaseSocialContr(Double icmsBaseDiscountForMonoPhaseSocialContr) {
    this.icmsBaseDiscountForMonoPhaseSocialContr = icmsBaseDiscountForMonoPhaseSocialContr;
  }
 /**
   * GTIN NUMBER
   * @return cean
  **/
  public String getCean() {
    return cean;
  }
  public void setCean(String cean) {
    this.cean = cean;
  }
 /**
   * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
   * @return nve
  **/
  public String getNve() {
    return nve;
  }
  public void setNve(String nve) {
    this.nve = nve;
  }
 /**
   * Get salesUnit
   * @return salesUnit
  **/
  public String getSalesUnit() {
    return salesUnit;
  }
  public void setSalesUnit(String salesUnit) {
    this.salesUnit = salesUnit;
  }
 /**
   * factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIPIfactor
  **/
  public Double getSalesUnitIPIfactor() {
    return salesUnitIPIfactor;
  }
  public void setSalesUnitIPIfactor(Double salesUnitIPIfactor) {
    this.salesUnitIPIfactor = salesUnitIPIfactor;
  }
 /**
   * factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIcmsfactor
  **/
  public Double getSalesUnitIcmsfactor() {
    return salesUnitIcmsfactor;
  }
  public void setSalesUnitIcmsfactor(Double salesUnitIcmsfactor) {
    this.salesUnitIcmsfactor = salesUnitIcmsfactor;
  }
 /**
   * factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIcmsStfactor
  **/
  public Double getSalesUnitIcmsStfactor() {
    return salesUnitIcmsStfactor;
  }
  public void setSalesUnitIcmsStfactor(Double salesUnitIcmsStfactor) {
    this.salesUnitIcmsStfactor = salesUnitIcmsStfactor;
  }
 /**
   * factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitPisCofinsfactor
  **/
  public Double getSalesUnitPisCofinsfactor() {
    return salesUnitPisCofinsfactor;
  }
  public void setSalesUnitPisCofinsfactor(Double salesUnitPisCofinsfactor) {
    this.salesUnitPisCofinsfactor = salesUnitPisCofinsfactor;
  }
 /**
   * Get purchaseUnit
   * @return purchaseUnit
  **/
  public String getPurchaseUnit() {
    return purchaseUnit;
  }
  public void setPurchaseUnit(String purchaseUnit) {
    this.purchaseUnit = purchaseUnit;
  }
 /**
   * factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIPIfactor
  **/
  public Double getPurchaseUnitIPIfactor() {
    return purchaseUnitIPIfactor;
  }
  public void setPurchaseUnitIPIfactor(Double purchaseUnitIPIfactor) {
    this.purchaseUnitIPIfactor = purchaseUnitIPIfactor;
  }
 /**
   * factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIcmsfactor
  **/
  public Double getPurchaseUnitIcmsfactor() {
    return purchaseUnitIcmsfactor;
  }
  public void setPurchaseUnitIcmsfactor(Double purchaseUnitIcmsfactor) {
    this.purchaseUnitIcmsfactor = purchaseUnitIcmsfactor;
  }
 /**
   * factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIcmsStfactor
  **/
  public Double getPurchaseUnitIcmsStfactor() {
    return purchaseUnitIcmsStfactor;
  }
  public void setPurchaseUnitIcmsStfactor(Double purchaseUnitIcmsStfactor) {
    this.purchaseUnitIcmsStfactor = purchaseUnitIcmsStfactor;
  }
 /**
   * factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitPisCofinsfactor
  **/
  public Double getPurchaseUnitPisCofinsfactor() {
    return purchaseUnitPisCofinsfactor;
  }
  public void setPurchaseUnitPisCofinsfactor(Double purchaseUnitPisCofinsfactor) {
    this.purchaseUnitPisCofinsfactor = purchaseUnitPisCofinsfactor;
  }
 /**
   * When the product is new, and will be retail, firt time that it exit it is subject to IPI
   * @return firstUse
  **/
  public Boolean getFirstUse() {
    return firstUse;
  }
  public void setFirstUse(Boolean firstUse) {
    this.firstUse = firstUse;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGoods {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    agast: ").append(toIndentedString(agast)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sealCode: ").append(toIndentedString(sealCode)).append("\n");
    sb.append("    nFCI: ").append(toIndentedString(nFCI)).append("\n");
    sb.append("    isIcmsStSubstitute: ").append(toIndentedString(isIcmsStSubstitute)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    manufacturerEquivalent: ").append(toIndentedString(manufacturerEquivalent)).append("\n");
    sb.append("    appropriateIPIcreditWhenInGoing: ").append(toIndentedString(appropriateIPIcreditWhenInGoing)).append("\n");
    sb.append("    usuallyAppropriatePISCOFINSCredit: ").append(toIndentedString(usuallyAppropriatePISCOFINSCredit)).append("\n");
    sb.append("    isPisCofinsEstimatedCredit: ").append(toIndentedString(isPisCofinsEstimatedCredit)).append("\n");
    sb.append("    piscofinsRevenueType: ").append(toIndentedString(piscofinsRevenueType)).append("\n");
    sb.append("    icmsBaseDiscountForMonoPhaseSocialContr: ").append(toIndentedString(icmsBaseDiscountForMonoPhaseSocialContr)).append("\n");
    sb.append("    cean: ").append(toIndentedString(cean)).append("\n");
    sb.append("    nve: ").append(toIndentedString(nve)).append("\n");
    sb.append("    salesUnit: ").append(toIndentedString(salesUnit)).append("\n");
    sb.append("    salesUnitIPIfactor: ").append(toIndentedString(salesUnitIPIfactor)).append("\n");
    sb.append("    salesUnitIcmsfactor: ").append(toIndentedString(salesUnitIcmsfactor)).append("\n");
    sb.append("    salesUnitIcmsStfactor: ").append(toIndentedString(salesUnitIcmsStfactor)).append("\n");
    sb.append("    salesUnitPisCofinsfactor: ").append(toIndentedString(salesUnitPisCofinsfactor)).append("\n");
    sb.append("    purchaseUnit: ").append(toIndentedString(purchaseUnit)).append("\n");
    sb.append("    purchaseUnitIPIfactor: ").append(toIndentedString(purchaseUnitIPIfactor)).append("\n");
    sb.append("    purchaseUnitIcmsfactor: ").append(toIndentedString(purchaseUnitIcmsfactor)).append("\n");
    sb.append("    purchaseUnitIcmsStfactor: ").append(toIndentedString(purchaseUnitIcmsStfactor)).append("\n");
    sb.append("    purchaseUnitPisCofinsfactor: ").append(toIndentedString(purchaseUnitPisCofinsfactor)).append("\n");
    sb.append("    firstUse: ").append(toIndentedString(firstUse)).append("\n");
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

