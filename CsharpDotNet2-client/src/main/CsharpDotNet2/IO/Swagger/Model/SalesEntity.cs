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
  public class SalesEntity {
    /// <summary>
    /// SERVICE BUYER NAME OFFICIAL
    /// </summary>
    /// <value>SERVICE BUYER NAME OFFICIAL</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public EntityType Type { get; set; }

    /// <summary>
    /// Entity Email
    /// </summary>
    /// <value>Entity Email</value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
    /// </summary>
    /// <value>CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'</value>
    [DataMember(Name="cnpjcpf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cnpjcpf")]
    public string Cnpjcpf { get; set; }

    /// <summary>
    /// City Tax ID
    /// </summary>
    /// <value>City Tax ID</value>
    [DataMember(Name="cityTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityTaxId")]
    public string CityTaxId { get; set; }

    /// <summary>
    /// State Tax ID
    /// </summary>
    /// <value>State Tax ID</value>
    [DataMember(Name="stateTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateTaxId")]
    public string StateTaxId { get; set; }

    /// <summary>
    /// Suframa ID
    /// </summary>
    /// <value>Suframa ID</value>
    [DataMember(Name="suframa", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suframa")]
    public string Suframa { get; set; }

    /// <summary>
    /// Entity Phone
    /// </summary>
    /// <value>Entity Phone</value>
    [DataMember(Name="phone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "phone")]
    public string Phone { get; set; }

    /// <summary>
    /// Gets or Sets TaxRegime
    /// </summary>
    [DataMember(Name="taxRegime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxRegime")]
    public FederalTaxRegime TaxRegime { get; set; }

    /// <summary>
    /// Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
    /// </summary>
    /// <value>Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) </value>
    [DataMember(Name="specialTaxRegime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specialTaxRegime")]
    public string SpecialTaxRegime { get; set; }

    /// <summary>
    /// Companies subject to rule follow same rule of Government
    /// </summary>
    /// <value>Companies subject to rule follow same rule of Government</value>
    [DataMember(Name="subjectToSRF1234", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subjectToSRF1234")]
    public bool? SubjectToSRF1234 { get; set; }

    /// <summary>
    /// If Withholding ISS is required, independently the rules applied.
    /// </summary>
    /// <value>If Withholding ISS is required, independently the rules applied.</value>
    [DataMember(Name="requiredWithholdingISS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requiredWithholdingISS")]
    public bool? RequiredWithholdingISS { get; set; }

    /// <summary>
    /// technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
    /// </summary>
    /// <value>technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia</value>
    [DataMember(Name="art", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "art")]
    public string Art { get; set; }

    /// <summary>
    /// PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
    /// </summary>
    /// <value>PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS</value>
    [DataMember(Name="adminProcess", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adminProcess")]
    public string AdminProcess { get; set; }

    /// <summary>
    /// Business code. Código da obra OBRA
    /// </summary>
    /// <value>Business code. Código da obra OBRA</value>
    [DataMember(Name="buildCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "buildCode")]
    public string BuildCode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesEntity {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  Cnpjcpf: ").Append(Cnpjcpf).Append("\n");
      sb.Append("  CityTaxId: ").Append(CityTaxId).Append("\n");
      sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
      sb.Append("  Suframa: ").Append(Suframa).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
      sb.Append("  SpecialTaxRegime: ").Append(SpecialTaxRegime).Append("\n");
      sb.Append("  SubjectToSRF1234: ").Append(SubjectToSRF1234).Append("\n");
      sb.Append("  RequiredWithholdingISS: ").Append(RequiredWithholdingISS).Append("\n");
      sb.Append("  Art: ").Append(Art).Append("\n");
      sb.Append("  AdminProcess: ").Append(AdminProcess).Append("\n");
      sb.Append("  BuildCode: ").Append(BuildCode).Append("\n");
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
