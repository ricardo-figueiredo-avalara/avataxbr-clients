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
  public class IpbtConfItem {
    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// Gets or Sets FederalTax
    /// </summary>
    [DataMember(Name="federalTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTax")]
    public double? FederalTax { get; set; }

    /// <summary>
    /// Gets or Sets ImportTax
    /// </summary>
    [DataMember(Name="importTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "importTax")]
    public double? ImportTax { get; set; }

    /// <summary>
    /// Gets or Sets StateTax
    /// </summary>
    [DataMember(Name="stateTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateTax")]
    public double? StateTax { get; set; }

    /// <summary>
    /// Gets or Sets CityTax
    /// </summary>
    [DataMember(Name="cityTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityTax")]
    public double? CityTax { get; set; }

    /// <summary>
    /// Gets or Sets Source
    /// </summary>
    [DataMember(Name="source", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source")]
    public string Source { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IpbtConfItem {\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  FederalTax: ").Append(FederalTax).Append("\n");
      sb.Append("  ImportTax: ").Append(ImportTax).Append("\n");
      sb.Append("  StateTax: ").Append(StateTax).Append("\n");
      sb.Append("  CityTax: ").Append(CityTax).Append("\n");
      sb.Append("  Source: ").Append(Source).Append("\n");
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
