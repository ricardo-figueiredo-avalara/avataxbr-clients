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
  public class TaxConf {
    /// <summary>
    /// main unique identificator
    /// </summary>
    /// <value>main unique identificator</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Inform that the process has inventory impact.
    /// </summary>
    /// <value>Inform that the process has inventory impact.</value>
    [DataMember(Name="stockImpact", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stockImpact")]
    public bool? StockImpact { get; set; }

    /// <summary>
    /// Inform that the process has financial impact.
    /// </summary>
    /// <value>Inform that the process has financial impact.</value>
    [DataMember(Name="financialImpact", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "financialImpact")]
    public bool? FinancialImpact { get; set; }

    /// <summary>
    /// Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
    /// </summary>
    /// <value>Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune </value>
    [DataMember(Name="cstIPI", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstIPI")]
    public string CstIPI { get; set; }

    /// <summary>
    /// Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
    /// </summary>
    /// <value>Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= </value>
    [DataMember(Name="ipiLegalTaxClass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ipiLegalTaxClass")]
    public string IpiLegalTaxClass { get; set; }

    /// <summary>
    /// Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    /// </summary>
    /// <value>Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE </value>
    [DataMember(Name="accruablePISTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISTaxation")]
    public string AccruablePISTaxation { get; set; }

    /// <summary>
    /// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
    /// </summary>
    /// <value>When exempt, taxable with zero, suspended, not taxable, this field holds the official code number</value>
    [DataMember(Name="pisExemptLegalReasonCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisExemptLegalReasonCode")]
    public string PisExemptLegalReasonCode { get; set; }

    /// <summary>
    /// When specifi reason, this field has the description
    /// </summary>
    /// <value>When specifi reason, this field has the description</value>
    [DataMember(Name="pisExemptLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisExemptLegalReason")]
    public string PisExemptLegalReason { get; set; }

    /// <summary>
    /// Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    /// </summary>
    /// <value>Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE </value>
    [DataMember(Name="accruableCOFINSTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSTaxation")]
    public string AccruableCOFINSTaxation { get; set; }

    /// <summary>
    /// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
    /// </summary>
    /// <value>When exempt, taxable with zero, suspended, not taxable, this field holds the official code number</value>
    [DataMember(Name="cofinsExemptLegalReasonCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsExemptLegalReasonCode")]
    public string CofinsExemptLegalReasonCode { get; set; }

    /// <summary>
    /// When specifi reason, this field has the description
    /// </summary>
    /// <value>When specifi reason, this field has the description</value>
    [DataMember(Name="cofinsExemptLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsExemptLegalReason")]
    public string CofinsExemptLegalReason { get; set; }

    /// <summary>
    /// Inform that the process allow IPI credit to Input process
    /// </summary>
    /// <value>Inform that the process allow IPI credit to Input process</value>
    [DataMember(Name="allowIPIcreditWhenInGoing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allowIPIcreditWhenInGoing")]
    public bool? AllowIPIcreditWhenInGoing { get; set; }

    /// <summary>
    /// the map key is state code
    /// </summary>
    /// <value>the map key is state code</value>
    [DataMember(Name="icmsConf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsConf")]
    public List<IcmsTaxConf> IcmsConf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TaxConf {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  StockImpact: ").Append(StockImpact).Append("\n");
      sb.Append("  FinancialImpact: ").Append(FinancialImpact).Append("\n");
      sb.Append("  CstIPI: ").Append(CstIPI).Append("\n");
      sb.Append("  IpiLegalTaxClass: ").Append(IpiLegalTaxClass).Append("\n");
      sb.Append("  AccruablePISTaxation: ").Append(AccruablePISTaxation).Append("\n");
      sb.Append("  PisExemptLegalReasonCode: ").Append(PisExemptLegalReasonCode).Append("\n");
      sb.Append("  PisExemptLegalReason: ").Append(PisExemptLegalReason).Append("\n");
      sb.Append("  AccruableCOFINSTaxation: ").Append(AccruableCOFINSTaxation).Append("\n");
      sb.Append("  CofinsExemptLegalReasonCode: ").Append(CofinsExemptLegalReasonCode).Append("\n");
      sb.Append("  CofinsExemptLegalReason: ").Append(CofinsExemptLegalReason).Append("\n");
      sb.Append("  AllowIPIcreditWhenInGoing: ").Append(AllowIPIcreditWhenInGoing).Append("\n");
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
