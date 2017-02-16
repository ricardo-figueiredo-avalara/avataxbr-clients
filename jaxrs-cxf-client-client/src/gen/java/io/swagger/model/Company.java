package io.swagger.model;

import io.swagger.model.CompanyAuthorizedToDownloadNFe;
import io.swagger.model.CompanyConfiguration;
import io.swagger.model.CompanyMailServer;
import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Company  {
  
  @ApiModelProperty(example = "null", required = true, value = "string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  private String code = null;
  @ApiModelProperty(example = "null", required = true, value = "Official Company name (Razão Social)")
  private String officialName = null;
  @ApiModelProperty(example = "null", required = true, value = "Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name")
  private String name = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private EntityType entityType = null;
  @ApiModelProperty(example = "null", value = "Company has participation of state-owned capital (it will be considerated like a government entity)")
  private Boolean subjectToSRF1234 = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private FederalTaxRegime federalTaxRegime = null;

@XmlType(name="PisSubjectToEnum")
@XmlEnum(String.class)
public enum PisSubjectToEnum {

    @XmlEnumValue("TAXABLE") TAXABLE(String.valueOf("TAXABLE")), @XmlEnumValue("NOT TAXABLE") NOT_TAXABLE(String.valueOf("NOT TAXABLE")), @XmlEnumValue("EXEMPT") EXEMPT(String.valueOf("EXEMPT"));


    private String value;

    PisSubjectToEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PisSubjectToEnum fromValue(String v) {
        for (PisSubjectToEnum b : PisSubjectToEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. ")
  private PisSubjectToEnum pisSubjectTo = null;

@XmlType(name="CofinsSubjectToEnum")
@XmlEnum(String.class)
public enum CofinsSubjectToEnum {

    @XmlEnumValue("TAXABLE") TAXABLE(String.valueOf("TAXABLE")), @XmlEnumValue("NOT TAXABLE") NOT_TAXABLE(String.valueOf("NOT TAXABLE")), @XmlEnumValue("EXEMPT") EXEMPT(String.valueOf("EXEMPT"));


    private String value;

    CofinsSubjectToEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CofinsSubjectToEnum fromValue(String v) {
        for (CofinsSubjectToEnum b : CofinsSubjectToEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. ")
  private CofinsSubjectToEnum cofinsSubjectTo = null;

@XmlType(name="CsllSubjectToEnum")
@XmlEnum(String.class)
public enum CsllSubjectToEnum {

    @XmlEnumValue("TAXABLE") TAXABLE(String.valueOf("TAXABLE")), @XmlEnumValue("NOT TAXABLE") NOT_TAXABLE(String.valueOf("NOT TAXABLE")), @XmlEnumValue("EXEMPT") EXEMPT(String.valueOf("EXEMPT"));


    private String value;

    CsllSubjectToEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CsllSubjectToEnum fromValue(String v) {
        for (CsllSubjectToEnum b : CsllSubjectToEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. ")
  private CsllSubjectToEnum csllSubjectTo = null;
  @ApiModelProperty(example = "null", value = "When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6% ")
  private Boolean receiptsAreFullNoCumulativePisCofins = null;
  @ApiModelProperty(example = "null", value = "On purchase transaction, to force withholding INSS this Flag can be set to True")
  private Boolean inssWithholdSubjectTo = null;
  @ApiModelProperty(example = "null", value = "On purchase transaction, to force withhold ISS this Flag can be set to True")
  private Boolean issWithholdSubjectTo = null;
  @ApiModelProperty(example = "null", value = "On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding ")
  private Boolean irrfWithholdSubjectTo = null;
  @ApiModelProperty(example = "null", value = "Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples ")
  private Double icmsRateForSimplestaxregime = null;
  @ApiModelProperty(example = "null", value = "ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta ")
  private Boolean isExemptByGrossRevenueForSimplestaxregime = null;
  @ApiModelProperty(example = "null", value = "")
  private CompanyConfiguration _configuration = null;
  @ApiModelProperty(example = "null", value = "")
  private CompanyMailServer mailServer = null;
  @ApiModelProperty(example = "null", value = "Person or company authorized to downloadNFe")
  private List<CompanyAuthorizedToDownloadNFe> authorizedToDownloadNFe = new ArrayList<CompanyAuthorizedToDownloadNFe>();

 /**
   * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Official Company name (Razão Social)
   * @return officialName
  **/
  public String getOfficialName() {
    return officialName;
  }
  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }
 /**
   * Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get entityType
   * @return entityType
  **/
  public EntityType getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }
 /**
   * Company has participation of state-owned capital (it will be considerated like a government entity)
   * @return subjectToSRF1234
  **/
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }
  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }
 /**
   * Get federalTaxRegime
   * @return federalTaxRegime
  **/
  public FederalTaxRegime getFederalTaxRegime() {
    return federalTaxRegime;
  }
  public void setFederalTaxRegime(FederalTaxRegime federalTaxRegime) {
    this.federalTaxRegime = federalTaxRegime;
  }
 /**
   * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
   * @return pisSubjectTo
  **/
  public PisSubjectToEnum getPisSubjectTo() {
    return pisSubjectTo;
  }
  public void setPisSubjectTo(PisSubjectToEnum pisSubjectTo) {
    this.pisSubjectTo = pisSubjectTo;
  }
 /**
   * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
   * @return cofinsSubjectTo
  **/
  public CofinsSubjectToEnum getCofinsSubjectTo() {
    return cofinsSubjectTo;
  }
  public void setCofinsSubjectTo(CofinsSubjectToEnum cofinsSubjectTo) {
    this.cofinsSubjectTo = cofinsSubjectTo;
  }
 /**
   * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
   * @return csllSubjectTo
  **/
  public CsllSubjectToEnum getCsllSubjectTo() {
    return csllSubjectTo;
  }
  public void setCsllSubjectTo(CsllSubjectToEnum csllSubjectTo) {
    this.csllSubjectTo = csllSubjectTo;
  }
 /**
   * When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6% 
   * @return receiptsAreFullNoCumulativePisCofins
  **/
  public Boolean getReceiptsAreFullNoCumulativePisCofins() {
    return receiptsAreFullNoCumulativePisCofins;
  }
  public void setReceiptsAreFullNoCumulativePisCofins(Boolean receiptsAreFullNoCumulativePisCofins) {
    this.receiptsAreFullNoCumulativePisCofins = receiptsAreFullNoCumulativePisCofins;
  }
 /**
   * On purchase transaction, to force withholding INSS this Flag can be set to True
   * @return inssWithholdSubjectTo
  **/
  public Boolean getInssWithholdSubjectTo() {
    return inssWithholdSubjectTo;
  }
  public void setInssWithholdSubjectTo(Boolean inssWithholdSubjectTo) {
    this.inssWithholdSubjectTo = inssWithholdSubjectTo;
  }
 /**
   * On purchase transaction, to force withhold ISS this Flag can be set to True
   * @return issWithholdSubjectTo
  **/
  public Boolean getIssWithholdSubjectTo() {
    return issWithholdSubjectTo;
  }
  public void setIssWithholdSubjectTo(Boolean issWithholdSubjectTo) {
    this.issWithholdSubjectTo = issWithholdSubjectTo;
  }
 /**
   * On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding 
   * @return irrfWithholdSubjectTo
  **/
  public Boolean getIrrfWithholdSubjectTo() {
    return irrfWithholdSubjectTo;
  }
  public void setIrrfWithholdSubjectTo(Boolean irrfWithholdSubjectTo) {
    this.irrfWithholdSubjectTo = irrfWithholdSubjectTo;
  }
 /**
   * Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples 
   * @return icmsRateForSimplestaxregime
  **/
  public Double getIcmsRateForSimplestaxregime() {
    return icmsRateForSimplestaxregime;
  }
  public void setIcmsRateForSimplestaxregime(Double icmsRateForSimplestaxregime) {
    this.icmsRateForSimplestaxregime = icmsRateForSimplestaxregime;
  }
 /**
   * ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta 
   * @return isExemptByGrossRevenueForSimplestaxregime
  **/
  public Boolean getIsExemptByGrossRevenueForSimplestaxregime() {
    return isExemptByGrossRevenueForSimplestaxregime;
  }
  public void setIsExemptByGrossRevenueForSimplestaxregime(Boolean isExemptByGrossRevenueForSimplestaxregime) {
    this.isExemptByGrossRevenueForSimplestaxregime = isExemptByGrossRevenueForSimplestaxregime;
  }
 /**
   * Get _configuration
   * @return _configuration
  **/
  public CompanyConfiguration getConfiguration() {
    return _configuration;
  }
  public void setConfiguration(CompanyConfiguration _configuration) {
    this._configuration = _configuration;
  }
 /**
   * Get mailServer
   * @return mailServer
  **/
  public CompanyMailServer getMailServer() {
    return mailServer;
  }
  public void setMailServer(CompanyMailServer mailServer) {
    this.mailServer = mailServer;
  }
 /**
   * Person or company authorized to downloadNFe
   * @return authorizedToDownloadNFe
  **/
  public List<CompanyAuthorizedToDownloadNFe> getAuthorizedToDownloadNFe() {
    return authorizedToDownloadNFe;
  }
  public void setAuthorizedToDownloadNFe(List<CompanyAuthorizedToDownloadNFe> authorizedToDownloadNFe) {
    this.authorizedToDownloadNFe = authorizedToDownloadNFe;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    subjectToSRF1234: ").append(toIndentedString(subjectToSRF1234)).append("\n");
    sb.append("    federalTaxRegime: ").append(toIndentedString(federalTaxRegime)).append("\n");
    sb.append("    pisSubjectTo: ").append(toIndentedString(pisSubjectTo)).append("\n");
    sb.append("    cofinsSubjectTo: ").append(toIndentedString(cofinsSubjectTo)).append("\n");
    sb.append("    csllSubjectTo: ").append(toIndentedString(csllSubjectTo)).append("\n");
    sb.append("    receiptsAreFullNoCumulativePisCofins: ").append(toIndentedString(receiptsAreFullNoCumulativePisCofins)).append("\n");
    sb.append("    inssWithholdSubjectTo: ").append(toIndentedString(inssWithholdSubjectTo)).append("\n");
    sb.append("    issWithholdSubjectTo: ").append(toIndentedString(issWithholdSubjectTo)).append("\n");
    sb.append("    irrfWithholdSubjectTo: ").append(toIndentedString(irrfWithholdSubjectTo)).append("\n");
    sb.append("    icmsRateForSimplestaxregime: ").append(toIndentedString(icmsRateForSimplestaxregime)).append("\n");
    sb.append("    isExemptByGrossRevenueForSimplestaxregime: ").append(toIndentedString(isExemptByGrossRevenueForSimplestaxregime)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    mailServer: ").append(toIndentedString(mailServer)).append("\n");
    sb.append("    authorizedToDownloadNFe: ").append(toIndentedString(authorizedToDownloadNFe)).append("\n");
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

