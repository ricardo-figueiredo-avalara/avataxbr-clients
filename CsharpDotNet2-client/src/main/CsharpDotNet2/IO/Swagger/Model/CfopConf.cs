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
  public class CfopConf {
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
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// inform if the transaction is an operation to internalizing item or value
    /// </summary>
    /// <value>inform if the transaction is an operation to internalizing item or value</value>
    [DataMember(Name="wayType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wayType")]
    public string WayType { get; set; }

    /// <summary>
    /// CFOP code (tax code operation) when the transactions are within the same state.
    /// </summary>
    /// <value>CFOP code (tax code operation) when the transactions are within the same state.</value>
    [DataMember(Name="codInState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codInState")]
    public int? CodInState { get; set; }

    /// <summary>
    /// CFOP code (tax code operation) when the transactions are to another state.
    /// </summary>
    /// <value>CFOP code (tax code operation) when the transactions are to another state.</value>
    [DataMember(Name="codOtherState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codOtherState")]
    public int? CodOtherState { get; set; }

    /// <summary>
    /// CFOP code (tax code operation) when the transactions are to another country.
    /// </summary>
    /// <value>CFOP code (tax code operation) when the transactions are to another country.</value>
    [DataMember(Name="codOtherCountry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codOtherCountry")]
    public int? CodOtherCountry { get; set; }

    /// <summary>
    /// Gets or Sets CstICMSSameState
    /// </summary>
    [DataMember(Name="cstICMSSameState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstICMSSameState")]
    public CstIcmsEnum CstICMSSameState { get; set; }

    /// <summary>
    /// Gets or Sets CstICMSOtherState
    /// </summary>
    [DataMember(Name="cstICMSOtherState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstICMSOtherState")]
    public CstIcmsEnum CstICMSOtherState { get; set; }

    /// <summary>
    /// Gets or Sets CstICMSOtherCountry
    /// </summary>
    [DataMember(Name="cstICMSOtherCountry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstICMSOtherCountry")]
    public CstIcmsEnum CstICMSOtherCountry { get; set; }

    /// <summary>
    /// this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
    /// </summary>
    /// <value>this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic</value>
    [DataMember(Name="productType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "productType")]
    public string ProductType { get; set; }

    /// <summary>
    /// field used to indicate an operation to ICMS tax payer
    /// </summary>
    /// <value>field used to indicate an operation to ICMS tax payer</value>
    [DataMember(Name="operationToTaxPayerOtherState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operationToTaxPayerOtherState")]
    public bool? OperationToTaxPayerOtherState { get; set; }

    /// <summary>
    /// field used to indicate an operation to items sibject to ICMS-ST
    /// </summary>
    /// <value>field used to indicate an operation to items sibject to ICMS-ST</value>
    [DataMember(Name="operationWithST", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operationWithST")]
    public bool? OperationWithST { get; set; }

    /// <summary>
    /// field used to indicate an operation to free zone
    /// </summary>
    /// <value>field used to indicate an operation to free zone</value>
    [DataMember(Name="operationToFreeZone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operationToFreeZone")]
    public bool? OperationToFreeZone { get; set; }

    /// <summary>
    /// field used to indicate an operation to some product class specifically
    /// </summary>
    /// <value>field used to indicate an operation to some product class specifically</value>
    [DataMember(Name="specificForProductClass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specificForProductClass")]
    public string SpecificForProductClass { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CfopConf {\n");
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
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  WayType: ").Append(WayType).Append("\n");
      sb.Append("  CodInState: ").Append(CodInState).Append("\n");
      sb.Append("  CodOtherState: ").Append(CodOtherState).Append("\n");
      sb.Append("  CodOtherCountry: ").Append(CodOtherCountry).Append("\n");
      sb.Append("  CstICMSSameState: ").Append(CstICMSSameState).Append("\n");
      sb.Append("  CstICMSOtherState: ").Append(CstICMSOtherState).Append("\n");
      sb.Append("  CstICMSOtherCountry: ").Append(CstICMSOtherCountry).Append("\n");
      sb.Append("  ProductType: ").Append(ProductType).Append("\n");
      sb.Append("  OperationToTaxPayerOtherState: ").Append(OperationToTaxPayerOtherState).Append("\n");
      sb.Append("  OperationWithST: ").Append(OperationWithST).Append("\n");
      sb.Append("  OperationToFreeZone: ").Append(OperationToFreeZone).Append("\n");
      sb.Append("  SpecificForProductClass: ").Append(SpecificForProductClass).Append("\n");
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
