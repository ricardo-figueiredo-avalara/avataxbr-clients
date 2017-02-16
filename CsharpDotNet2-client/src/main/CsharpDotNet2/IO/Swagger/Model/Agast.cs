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
  public class Agast {
    /// <summary>
    /// Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
    /// </summary>
    /// <value>Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Agast Description
    /// </summary>
    /// <value>Agast Description</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// harmonized code, NCM or LC 116
    /// </summary>
    /// <value>harmonized code, NCM or LC 116</value>
    [DataMember(Name="hsCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hsCode")]
    public string HsCode { get; set; }

    /// <summary>
    /// hsCode Exception for IPI tax
    /// </summary>
    /// <value>hsCode Exception for IPI tax</value>
    [DataMember(Name="ex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ex")]
    public int? Ex { get; set; }

    /// <summary>
    /// tax substitution code - Codigo especificador da Substuicao Tributaria
    /// </summary>
    /// <value>tax substitution code - Codigo especificador da Substuicao Tributaria</value>
    [DataMember(Name="cest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cest")]
    public string Cest { get; set; }

    /// <summary>
    /// GTIN NUMBER
    /// </summary>
    /// <value>GTIN NUMBER</value>
    [DataMember(Name="cean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cean")]
    public string Cean { get; set; }

    /// <summary>
    /// Gets or Sets CodeType
    /// </summary>
    [DataMember(Name="codeType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codeType")]
    public AgastCodeType CodeType { get; set; }

    /// <summary>
    /// Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
    /// </summary>
    /// <value>Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune </value>
    [DataMember(Name="cstIPI", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstIPI")]
    public string CstIPI { get; set; }

    /// <summary>
    /// Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
    /// </summary>
    /// <value>Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= </value>
    [DataMember(Name="ipiLegalTaxClass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ipiLegalTaxClass")]
    public string IpiLegalTaxClass { get; set; }

    /// <summary>
    /// when the company is Real Profit inform if this item is cumulative or no cumulative by default
    /// </summary>
    /// <value>when the company is Real Profit inform if this item is cumulative or no cumulative by default</value>
    [DataMember(Name="pisCofinsTaxReporting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisCofinsTaxReporting")]
    public string PisCofinsTaxReporting { get; set; }

    /// <summary>
    /// Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    /// </summary>
    /// <value>Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE </value>
    [DataMember(Name="accruablePISTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISTaxation")]
    public string AccruablePISTaxation { get; set; }

    /// <summary>
    /// Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    /// </summary>
    /// <value>Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE </value>
    [DataMember(Name="accruableCOFINSTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSTaxation")]
    public string AccruableCOFINSTaxation { get; set; }

    /// <summary>
    /// Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
    /// </summary>
    /// <value>Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT </value>
    [DataMember(Name="accruableCSLLTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCSLLTaxation")]
    public string AccruableCSLLTaxation { get; set; }

    /// <summary>
    /// for service items with City Jurisdiction, inform where the ISS tax is due
    /// </summary>
    /// <value>for service items with City Jurisdiction, inform where the ISS tax is due</value>
    [DataMember(Name="issDueatDestination", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issDueatDestination")]
    public bool? IssDueatDestination { get; set; }

    /// <summary>
    /// on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
    /// </summary>
    /// <value>on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative</value>
    [DataMember(Name="pisCofinsCreditNotAllowed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisCofinsCreditNotAllowed")]
    public bool? PisCofinsCreditNotAllowed { get; set; }

    /// <summary>
    /// - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
    /// </summary>
    /// <value>- 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE </value>
    [DataMember(Name="issTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issTaxation")]
    public string IssTaxation { get; set; }

    /// <summary>
    /// This is an array of tax object related to an agast.
    /// </summary>
    /// <value>This is an array of tax object related to an agast.</value>
    [DataMember(Name="federalTaxRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxRate")]
    public List<TaxTypeRate> FederalTaxRate { get; set; }

    /// <summary>
    /// Gets or Sets SpecialProductClass
    /// </summary>
    [DataMember(Name="specialProductClass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specialProductClass")]
    public string SpecialProductClass { get; set; }

    /// <summary>
    /// One per State
    /// </summary>
    /// <value>One per State</value>
    [DataMember(Name="icmsConf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsConf")]
    public List<AgastIcmsConf> IcmsConf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Agast {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  HsCode: ").Append(HsCode).Append("\n");
      sb.Append("  Ex: ").Append(Ex).Append("\n");
      sb.Append("  Cest: ").Append(Cest).Append("\n");
      sb.Append("  Cean: ").Append(Cean).Append("\n");
      sb.Append("  CodeType: ").Append(CodeType).Append("\n");
      sb.Append("  CstIPI: ").Append(CstIPI).Append("\n");
      sb.Append("  IpiLegalTaxClass: ").Append(IpiLegalTaxClass).Append("\n");
      sb.Append("  PisCofinsTaxReporting: ").Append(PisCofinsTaxReporting).Append("\n");
      sb.Append("  AccruablePISTaxation: ").Append(AccruablePISTaxation).Append("\n");
      sb.Append("  AccruableCOFINSTaxation: ").Append(AccruableCOFINSTaxation).Append("\n");
      sb.Append("  AccruableCSLLTaxation: ").Append(AccruableCSLLTaxation).Append("\n");
      sb.Append("  IssDueatDestination: ").Append(IssDueatDestination).Append("\n");
      sb.Append("  PisCofinsCreditNotAllowed: ").Append(PisCofinsCreditNotAllowed).Append("\n");
      sb.Append("  IssTaxation: ").Append(IssTaxation).Append("\n");
      sb.Append("  FederalTaxRate: ").Append(FederalTaxRate).Append("\n");
      sb.Append("  SpecialProductClass: ").Append(SpecialProductClass).Append("\n");
      sb.Append("  IcmsConf: ").Append(IcmsConf).Append("\n");
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
