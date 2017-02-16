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
  public class IssConfServiceListTaxRateIbpt {
    /// <summary>
    /// Gets or Sets NationalFedTax
    /// </summary>
    [DataMember(Name="nationalFedTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nationalFedTax")]
    public double? NationalFedTax { get; set; }

    /// <summary>
    /// Gets or Sets CityTax
    /// </summary>
    [DataMember(Name="cityTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityTax")]
    public double? CityTax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IssConfServiceListTaxRateIbpt {\n");
      sb.Append("  NationalFedTax: ").Append(NationalFedTax).Append("\n");
      sb.Append("  CityTax: ").Append(CityTax).Append("\n");
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
