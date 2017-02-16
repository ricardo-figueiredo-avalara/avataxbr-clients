using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Export information
  /// </summary>
  [DataContract]
  public class ExportInfo {
    /// <summary>
    /// shipping state
    /// </summary>
    /// <value>shipping state</value>
    [DataMember(Name="shippingState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shippingState")]
    public StateEnum ShippingState { get; set; }

    /// <summary>
    /// shipping place
    /// </summary>
    /// <value>shipping place</value>
    [DataMember(Name="place", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "place")]
    public string Place { get; set; }

    /// <summary>
    /// description of shipping place
    /// </summary>
    /// <value>description of shipping place</value>
    [DataMember(Name="placeDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "placeDescription")]
    public string PlaceDescription { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ExportInfo {\n");
      sb.Append("  ShippingState: ").Append(ShippingState).Append("\n");
      sb.Append("  Place: ").Append(Place).Append("\n");
      sb.Append("  PlaceDescription: ").Append(PlaceDescription).Append("\n");
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
