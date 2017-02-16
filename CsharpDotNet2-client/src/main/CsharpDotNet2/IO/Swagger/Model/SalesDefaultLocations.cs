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
  public class SalesDefaultLocations {
    /// <summary>
    /// Gets or Sets ServiceRendered
    /// </summary>
    [DataMember(Name="serviceRendered", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceRendered")]
    public ServiceRendered ServiceRendered { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesDefaultLocations {\n");
      sb.Append("  ServiceRendered: ").Append(ServiceRendered).Append("\n");
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
