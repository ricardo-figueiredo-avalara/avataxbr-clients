using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// List of transaction participants, Seller, Buyer, Carrier
  /// </summary>
  [DataContract]
  public class HeaderForGoodsParticipants {
    /// <summary>
    /// Gets or Sets Entity
    /// </summary>
    [DataMember(Name="entity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entity")]
    public EntityForGoods Entity { get; set; }

    /// <summary>
    /// Gets or Sets Transporter
    /// </summary>
    [DataMember(Name="transporter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transporter")]
    public EntityForGoods Transporter { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HeaderForGoodsParticipants {\n");
      sb.Append("  Entity: ").Append(Entity).Append("\n");
      sb.Append("  Transporter: ").Append(Transporter).Append("\n");
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
