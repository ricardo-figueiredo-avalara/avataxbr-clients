using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Company {
    /// <summary>
    /// string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
    /// </summary>
    /// <value>string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Official Company name (Razão Social)
    /// </summary>
    /// <value>Official Company name (Razão Social)</value>
    [DataMember(Name="officialName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "officialName")]
    public string OfficialName { get; set; }

    /// <summary>
    /// Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name
    /// </summary>
    /// <value>Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets EntityType
    /// </summary>
    [DataMember(Name="entityType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityType")]
    public EntityType EntityType { get; set; }

    /// <summary>
    /// Company has participation of state-owned capital (it will be considerated like a government entity)
    /// </summary>
    /// <value>Company has participation of state-owned capital (it will be considerated like a government entity)</value>
    [DataMember(Name="subjectToSRF1234", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subjectToSRF1234")]
    public bool? SubjectToSRF1234 { get; set; }

    /// <summary>
    /// Gets or Sets FederalTaxRegime
    /// </summary>
    [DataMember(Name="federalTaxRegime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxRegime")]
    public FederalTaxRegime FederalTaxRegime { get; set; }

    /// <summary>
    /// this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
    /// </summary>
    /// <value>this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. </value>
    [DataMember(Name="pisSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisSubjectTo")]
    public string PisSubjectTo { get; set; }

    /// <summary>
    /// this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
    /// </summary>
    /// <value>this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. </value>
    [DataMember(Name="cofinsSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsSubjectTo")]
    public string CofinsSubjectTo { get; set; }

    /// <summary>
    /// this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
    /// </summary>
    /// <value>this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. </value>
    [DataMember(Name="csllSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csllSubjectTo")]
    public string CsllSubjectTo { get; set; }

    /// <summary>
    /// When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6% 
    /// </summary>
    /// <value>When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6% </value>
    [DataMember(Name="receiptsAreFullNoCumulativePisCofins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "receiptsAreFullNoCumulativePisCofins")]
    public bool? ReceiptsAreFullNoCumulativePisCofins { get; set; }

    /// <summary>
    /// On purchase transaction, to force withholding INSS this Flag can be set to True
    /// </summary>
    /// <value>On purchase transaction, to force withholding INSS this Flag can be set to True</value>
    [DataMember(Name="inssWithholdSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inssWithholdSubjectTo")]
    public bool? InssWithholdSubjectTo { get; set; }

    /// <summary>
    /// On purchase transaction, to force withhold ISS this Flag can be set to True
    /// </summary>
    /// <value>On purchase transaction, to force withhold ISS this Flag can be set to True</value>
    [DataMember(Name="issWithholdSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issWithholdSubjectTo")]
    public bool? IssWithholdSubjectTo { get; set; }

    /// <summary>
    /// On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding 
    /// </summary>
    /// <value>On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding </value>
    [DataMember(Name="irrfWithholdSubjectTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "irrfWithholdSubjectTo")]
    public bool? IrrfWithholdSubjectTo { get; set; }

    /// <summary>
    /// Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples 
    /// </summary>
    /// <value>Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples </value>
    [DataMember(Name="icmsRateForSimplestaxregime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsRateForSimplestaxregime")]
    public double? IcmsRateForSimplestaxregime { get; set; }

    /// <summary>
    /// ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta 
    /// </summary>
    /// <value>ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta </value>
    [DataMember(Name="isExemptByGrossRevenueForSimplestaxregime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isExemptByGrossRevenueForSimplestaxregime")]
    public bool? IsExemptByGrossRevenueForSimplestaxregime { get; set; }

    /// <summary>
    /// Gets or Sets Configuration
    /// </summary>
    [DataMember(Name="configuration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configuration")]
    public CompanyConfiguration Configuration { get; set; }

    /// <summary>
    /// Gets or Sets MailServer
    /// </summary>
    [DataMember(Name="mailServer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mailServer")]
    public CompanyMailServer MailServer { get; set; }

    /// <summary>
    /// Person or company authorized to downloadNFe
    /// </summary>
    /// <value>Person or company authorized to downloadNFe</value>
    [DataMember(Name="authorizedToDownloadNFe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authorizedToDownloadNFe")]
    public List<CompanyAuthorizedToDownloadNFe> AuthorizedToDownloadNFe { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Company {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  OfficialName: ").Append(OfficialName).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  EntityType: ").Append(EntityType).Append("\n");
      sb.Append("  SubjectToSRF1234: ").Append(SubjectToSRF1234).Append("\n");
      sb.Append("  FederalTaxRegime: ").Append(FederalTaxRegime).Append("\n");
      sb.Append("  PisSubjectTo: ").Append(PisSubjectTo).Append("\n");
      sb.Append("  CofinsSubjectTo: ").Append(CofinsSubjectTo).Append("\n");
      sb.Append("  CsllSubjectTo: ").Append(CsllSubjectTo).Append("\n");
      sb.Append("  ReceiptsAreFullNoCumulativePisCofins: ").Append(ReceiptsAreFullNoCumulativePisCofins).Append("\n");
      sb.Append("  InssWithholdSubjectTo: ").Append(InssWithholdSubjectTo).Append("\n");
      sb.Append("  IssWithholdSubjectTo: ").Append(IssWithholdSubjectTo).Append("\n");
      sb.Append("  IrrfWithholdSubjectTo: ").Append(IrrfWithholdSubjectTo).Append("\n");
      sb.Append("  IcmsRateForSimplestaxregime: ").Append(IcmsRateForSimplestaxregime).Append("\n");
      sb.Append("  IsExemptByGrossRevenueForSimplestaxregime: ").Append(IsExemptByGrossRevenueForSimplestaxregime).Append("\n");
      sb.Append("  Configuration: ").Append(Configuration).Append("\n");
      sb.Append("  MailServer: ").Append(MailServer).Append("\n");
      sb.Append("  AuthorizedToDownloadNFe: ").Append(AuthorizedToDownloadNFe).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
