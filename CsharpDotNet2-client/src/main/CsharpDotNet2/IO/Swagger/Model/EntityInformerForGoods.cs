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
  public class EntityInformerForGoods {
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public EntityType Type { get; set; }

    /// <summary>
    /// Gets or Sets TaxRegime
    /// </summary>
    [DataMember(Name="taxRegime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxRegime")]
    public FederalTaxRegime TaxRegime { get; set; }

    /// <summary>
    /// Gets or Sets FederalTaxRegime
    /// </summary>
    [DataMember(Name="federalTaxRegime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxRegime")]
    public EntityInformerForGoodsFederalTaxRegime FederalTaxRegime { get; set; }

    /// <summary>
    /// Gets or Sets CityCode
    /// </summary>
    [DataMember(Name="cityCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityCode")]
    public string CityCode { get; set; }

    /// <summary>
    /// Gets or Sets Address
    /// </summary>
    [DataMember(Name="address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "address")]
    public Address Address { get; set; }

    /// <summary>
    /// Gets or Sets Details
    /// </summary>
    [DataMember(Name="details", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "details")]
    public Object Details { get; set; }

    /// <summary>
    /// Gets or Sets IcmsTaxPayer
    /// </summary>
    [DataMember(Name="icmsTaxPayer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsTaxPayer")]
    public bool? IcmsTaxPayer { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EntityInformerForGoods {\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
      sb.Append("  FederalTaxRegime: ").Append(FederalTaxRegime).Append("\n");
      sb.Append("  CityCode: ").Append(CityCode).Append("\n");
      sb.Append("  Address: ").Append(Address).Append("\n");
      sb.Append("  Details: ").Append(Details).Append("\n");
      sb.Append("  IcmsTaxPayer: ").Append(IcmsTaxPayer).Append("\n");
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
