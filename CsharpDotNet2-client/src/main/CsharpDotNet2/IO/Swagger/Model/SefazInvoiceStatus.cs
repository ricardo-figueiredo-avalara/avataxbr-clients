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
  public class SefazInvoiceStatus {
    /// <summary>
    /// Gets or Sets Code
    /// </summary>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Gets or Sets Desc
    /// </summary>
    [DataMember(Name="desc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "desc")]
    public string Desc { get; set; }

    /// <summary>
    /// Gets or Sets Protocol
    /// </summary>
    [DataMember(Name="protocol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "protocol")]
    public string Protocol { get; set; }

    /// <summary>
    /// Gets or Sets Rec
    /// </summary>
    [DataMember(Name="rec", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rec")]
    public string Rec { get; set; }

    /// <summary>
    /// Gets or Sets Date
    /// </summary>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public DateTime? Date { get; set; }

    /// <summary>
    /// - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
    /// </summary>
    /// <value>- '1' # Ambiente de Produção - '2' # Ambiente de Homologação </value>
    [DataMember(Name="environment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "environment")]
    public string Environment { get; set; }

    /// <summary>
    /// Gets or Sets AppVersion
    /// </summary>
    [DataMember(Name="appVersion", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "appVersion")]
    public string AppVersion { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SefazInvoiceStatus {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Desc: ").Append(Desc).Append("\n");
      sb.Append("  Protocol: ").Append(Protocol).Append("\n");
      sb.Append("  Rec: ").Append(Rec).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  Environment: ").Append(Environment).Append("\n");
      sb.Append("  AppVersion: ").Append(AppVersion).Append("\n");
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
