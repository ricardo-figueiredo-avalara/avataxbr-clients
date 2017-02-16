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
  public class NRefRefFarmerNF {
    /// <summary>
    /// State code of fiscal Document creator, farmer
    /// </summary>
    /// <value>State code of fiscal Document creator, farmer</value>
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
    /// fiscal document creator farmer federalTaxId
    /// </summary>
    /// <value>fiscal document creator farmer federalTaxId</value>
    [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxId")]
    public string FederalTaxId { get; set; }

    /// <summary>
    /// fiscal document creator, farmer stateTaxId
    /// </summary>
    /// <value>fiscal document creator, farmer stateTaxId</value>
    [DataMember(Name="stateTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateTaxId")]
    public string StateTaxId { get; set; }

    /// <summary>
    /// Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 
    /// </summary>
    /// <value>Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO </value>
    [DataMember(Name="model", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "model")]
    public string Model { get; set; }

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
      sb.Append("class NRefRefFarmerNF {\n");
      sb.Append("  StateCd: ").Append(StateCd).Append("\n");
      sb.Append("  Yymm: ").Append(Yymm).Append("\n");
      sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
      sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
      sb.Append("  Model: ").Append(Model).Append("\n");
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
