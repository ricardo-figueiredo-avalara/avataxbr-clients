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
  public class IssConfServiceList {
    /// <summary>
    /// Gets or Sets Agast
    /// </summary>
    [DataMember(Name="agast", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agast")]
    public string Agast { get; set; }

    /// <summary>
    /// Gets or Sets CityServiceCode
    /// </summary>
    [DataMember(Name="cityServiceCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityServiceCode")]
    public string CityServiceCode { get; set; }

    /// <summary>
    /// Gets or Sets TaxRate
    /// </summary>
    [DataMember(Name="taxRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxRate")]
    public IssConfServiceListTaxRate TaxRate { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IssConfServiceList {\n");
      sb.Append("  Agast: ").Append(Agast).Append("\n");
      sb.Append("  CityServiceCode: ").Append(CityServiceCode).Append("\n");
      sb.Append("  TaxRate: ").Append(TaxRate).Append("\n");
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
