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
  public class IssConfServiceListTaxRate {
    /// <summary>
    /// Gets or Sets ISS
    /// </summary>
    [DataMember(Name="ISS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ISS")]
    public ServiceItemTaxRate ISS { get; set; }

    /// <summary>
    /// Gets or Sets ISS_RF
    /// </summary>
    [DataMember(Name="ISS_RF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ISS_RF")]
    public ServiceItemTaxRate ISS_RF { get; set; }

    /// <summary>
    /// Gets or Sets ISS_E
    /// </summary>
    [DataMember(Name="ISS_E", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ISS_E")]
    public ServiceItemTaxRate ISS_E { get; set; }

    /// <summary>
    /// Gets or Sets ISS_I
    /// </summary>
    [DataMember(Name="ISS_I", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ISS_I")]
    public ServiceItemTaxRate ISS_I { get; set; }

    /// <summary>
    /// Gets or Sets Ibpt
    /// </summary>
    [DataMember(Name="ibpt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ibpt")]
    public IssConfServiceListTaxRateIbpt Ibpt { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IssConfServiceListTaxRate {\n");
      sb.Append("  ISS: ").Append(ISS).Append("\n");
      sb.Append("  ISS_RF: ").Append(ISS_RF).Append("\n");
      sb.Append("  ISS_E: ").Append(ISS_E).Append("\n");
      sb.Append("  ISS_I: ").Append(ISS_I).Append("\n");
      sb.Append("  Ibpt: ").Append(Ibpt).Append("\n");
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
