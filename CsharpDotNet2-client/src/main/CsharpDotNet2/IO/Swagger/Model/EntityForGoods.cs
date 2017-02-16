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
  public class EntityForGoods {
    /// <summary>
    /// Entity name, official name (Razão Social)
    /// </summary>
    /// <value>Entity name, official name (Razão Social)</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
    /// </summary>
    /// <value>- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO </value>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public string Role { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public EntityType Type { get; set; }

    /// <summary>
    /// CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
    /// </summary>
    /// <value>CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'</value>
    [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxId")]
    public string FederalTaxId { get; set; }

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
    public string TaxRegime { get; set; }

    /// <summary>
    /// Entity Email
    /// </summary>
    /// <value>Entity Email</value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
    /// </summary>
    /// <value>Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)</value>
    [DataMember(Name="subjectToSRF1234", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subjectToSRF1234")]
    public bool? SubjectToSRF1234 { get; set; }

    /// <summary>
    /// Inform if the entity is ICMS tax payer.
    /// </summary>
    /// <value>Inform if the entity is ICMS tax payer.</value>
    [DataMember(Name="icmsTaxPayer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsTaxPayer")]
    public bool? IcmsTaxPayer { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EntityForGoods {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Role: ").Append(Role).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
      sb.Append("  CityTaxId: ").Append(CityTaxId).Append("\n");
      sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
      sb.Append("  Suframa: ").Append(Suframa).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  SubjectToSRF1234: ").Append(SubjectToSRF1234).Append("\n");
      sb.Append("  IcmsTaxPayer: ").Append(IcmsTaxPayer).Append("\n");
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
