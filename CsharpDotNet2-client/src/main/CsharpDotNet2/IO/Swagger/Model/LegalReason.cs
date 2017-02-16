using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Legal Reason (Fundamentação Legal): - &#39;name&#39; - &#39;description&#39; - &#39;scope&#39; 
  /// </summary>
  [DataContract]
  public class LegalReason {
    /// <summary>
    /// Internal ID
    /// </summary>
    /// <value>Internal ID</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
    /// </summary>
    /// <value>Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); </value>
    [DataMember(Name="scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scope")]
    public string Scope { get; set; }

    /// <summary>
    /// Set this message as no longer valid
    /// </summary>
    /// <value>Set this message as no longer valid</value>
    [DataMember(Name="disable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disable")]
    public bool? Disable { get; set; }

    /// <summary>
    /// Legal reason textual description;
    /// </summary>
    /// <value>Legal reason textual description;</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Short name to this message
    /// </summary>
    /// <value>Short name to this message</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// this field inform the official code number
    /// </summary>
    /// <value>this field inform the official code number</value>
    [DataMember(Name="legalCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "legalCode")]
    public string LegalCode { get; set; }

    /// <summary>
    /// Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
    /// </summary>
    /// <value>Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.</value>
    [DataMember(Name="showInInvoice", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "showInInvoice")]
    public string ShowInInvoice { get; set; }

    /// <summary>
    /// Referenced Process
    /// </summary>
    /// <value>Referenced Process</value>
    [DataMember(Name="referencedProcesses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "referencedProcesses")]
    public List<LegalReasonReferencedProcesses> ReferencedProcesses { get; set; }

    /// <summary>
    /// Gets or Sets TaxScope
    /// </summary>
    [DataMember(Name="taxScope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxScope")]
    public LegalReasonTaxScope TaxScope { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LegalReason {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Scope: ").Append(Scope).Append("\n");
      sb.Append("  Disable: ").Append(Disable).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  LegalCode: ").Append(LegalCode).Append("\n");
      sb.Append("  ShowInInvoice: ").Append(ShowInInvoice).Append("\n");
      sb.Append("  ReferencedProcesses: ").Append(ReferencedProcesses).Append("\n");
      sb.Append("  TaxScope: ").Append(TaxScope).Append("\n");
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
