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
  public class IssConfByCity {
    /// <summary>
    /// City Code (IBGE)
    /// </summary>
    /// <value>City Code (IBGE)</value>
    [DataMember(Name="cityCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityCode")]
    public long? CityCode { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// Gets or Sets IssWhDestOtherCities
    /// </summary>
    [DataMember(Name="issWhDestOtherCities", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issWhDestOtherCities")]
    public bool? IssWhDestOtherCities { get; set; }

    /// <summary>
    /// Gets or Sets IssWhDestSameCity
    /// </summary>
    [DataMember(Name="issWhDestSameCity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issWhDestSameCity")]
    public bool? IssWhDestSameCity { get; set; }

    /// <summary>
    /// Gets or Sets IssWhOriginUnregSeller
    /// </summary>
    [DataMember(Name="issWhOriginUnregSeller", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issWhOriginUnregSeller")]
    public bool? IssWhOriginUnregSeller { get; set; }

    /// <summary>
    /// Gets or Sets ServiceList
    /// </summary>
    [DataMember(Name="serviceList", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceList")]
    public List<IssConfServiceList> ServiceList { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IssConfByCity {\n");
      sb.Append("  CityCode: ").Append(CityCode).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  IssWhDestOtherCities: ").Append(IssWhDestOtherCities).Append("\n");
      sb.Append("  IssWhDestSameCity: ").Append(IssWhDestSameCity).Append("\n");
      sb.Append("  IssWhOriginUnregSeller: ").Append(IssWhOriginUnregSeller).Append("\n");
      sb.Append("  ServiceList: ").Append(ServiceList).Append("\n");
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
