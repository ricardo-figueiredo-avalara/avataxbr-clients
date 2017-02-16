using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Bill information
  /// </summary>
  [DataContract]
  public class PaymentBill {
    /// <summary>
    /// Bill identifier
    /// </summary>
    /// <value>Bill identifier</value>
    [DataMember(Name="nFat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nFat")]
    public string NFat { get; set; }

    /// <summary>
    /// Orignal value
    /// </summary>
    /// <value>Orignal value</value>
    [DataMember(Name="vOrig", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vOrig")]
    public double? VOrig { get; set; }

    /// <summary>
    /// Discount
    /// </summary>
    /// <value>Discount</value>
    [DataMember(Name="vDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vDiscount")]
    public double? VDiscount { get; set; }

    /// <summary>
    /// Net value
    /// </summary>
    /// <value>Net value</value>
    [DataMember(Name="vNet", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vNet")]
    public double? VNet { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PaymentBill {\n");
      sb.Append("  NFat: ").Append(NFat).Append("\n");
      sb.Append("  VOrig: ").Append(VOrig).Append("\n");
      sb.Append("  VDiscount: ").Append(VDiscount).Append("\n");
      sb.Append("  VNet: ").Append(VNet).Append("\n");
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
