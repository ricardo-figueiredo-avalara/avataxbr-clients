using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Assign an empty object for simple withholding, null (no key) for no withholding. Detailed behaviors for specific targets may be set by using the available optional keys. 
  /// </summary>
  [DataContract]
  public class TaxTypeRateWithholding {
    /// <summary>
    /// Gets or Sets All
    /// </summary>
    [DataMember(Name="all", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "all")]
    public WithholdDef All { get; set; }

    /// <summary>
    /// Gets or Sets Business
    /// </summary>
    [DataMember(Name="business", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "business")]
    public WithholdDef Business { get; set; }

    /// <summary>
    /// Gets or Sets FederalGovernment
    /// </summary>
    [DataMember(Name="federalGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalGovernment")]
    public WithholdDef FederalGovernment { get; set; }

    /// <summary>
    /// Gets or Sets StateGovernment
    /// </summary>
    [DataMember(Name="stateGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateGovernment")]
    public WithholdDef StateGovernment { get; set; }

    /// <summary>
    /// Gets or Sets CityGovernment
    /// </summary>
    [DataMember(Name="cityGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityGovernment")]
    public WithholdDef CityGovernment { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TaxTypeRateWithholding {\n");
      sb.Append("  All: ").Append(All).Append("\n");
      sb.Append("  Business: ").Append(Business).Append("\n");
      sb.Append("  FederalGovernment: ").Append(FederalGovernment).Append("\n");
      sb.Append("  StateGovernment: ").Append(StateGovernment).Append("\n");
      sb.Append("  CityGovernment: ").Append(CityGovernment).Append("\n");
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
