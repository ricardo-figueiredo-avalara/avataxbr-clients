using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
  /// </summary>
  [DataContract]
  public class PurchaseDefaultLocations {
    /// <summary>
    /// Gets or Sets PointOfOrderOrigin
    /// </summary>
    [DataMember(Name="PointOfOrderOrigin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PointOfOrderOrigin")]
    public PointOfOrderOrigin PointOfOrderOrigin { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseDefaultLocations {\n");
      sb.Append("  PointOfOrderOrigin: ").Append(PointOfOrderOrigin).Append("\n");
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
