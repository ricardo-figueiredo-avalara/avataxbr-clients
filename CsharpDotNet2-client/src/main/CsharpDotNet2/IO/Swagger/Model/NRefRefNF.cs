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
  public class NRefRefNF {
    /// <summary>
    /// State code of fiscal Document creator
    /// </summary>
    /// <value>State code of fiscal Document creator</value>
    [DataMember(Name="stateCd", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateCd")]
    public StateEnum StateCd { get; set; }

    /// <summary>
    /// year and month of fiscal document creation
    /// </summary>
    /// <value>year and month of fiscal document creation</value>
    [DataMember(Name="yymm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "yymm")]
    public string Yymm { get; set; }

    /// <summary>
    /// fiscal document creator federalTaxId
    /// </summary>
    /// <value>fiscal document creator federalTaxId</value>
    [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxId")]
    public string FederalTaxId { get; set; }

    /// <summary>
    /// fiscal document serie
    /// </summary>
    /// <value>fiscal document serie</value>
    [DataMember(Name="serie", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serie")]
    public string Serie { get; set; }

    /// <summary>
    /// fiscal document number
    /// </summary>
    /// <value>fiscal document number</value>
    [DataMember(Name="number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number")]
    public string Number { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class NRefRefNF {\n");
      sb.Append("  StateCd: ").Append(StateCd).Append("\n");
      sb.Append("  Yymm: ").Append(Yymm).Append("\n");
      sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
      sb.Append("  Serie: ").Append(Serie).Append("\n");
      sb.Append("  Number: ").Append(Number).Append("\n");
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
