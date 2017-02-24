using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// inform if this item is subject to withholding CSLL on service Transactions, by entity type, default true
  /// </summary>
  [DataContract]
  public class AgastWithholdingCSLL {
    /// <summary>
    /// Gets or Sets LegalReason
    /// </summary>
    [DataMember(Name="legalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "legalReason")]
    public string LegalReason { get; set; }

    /// <summary>
    /// Gets or Sets Business
    /// </summary>
    [DataMember(Name="business", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "business")]
    public bool? Business { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="businessLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "businessLegalReason")]
    public string BusinessLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets FederalGovernment
    /// </summary>
    [DataMember(Name="federalGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalGovernment")]
    public bool? FederalGovernment { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="federalGovernmentLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalGovernmentLegalReason")]
    public string FederalGovernmentLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets StateGovernment
    /// </summary>
    [DataMember(Name="stateGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateGovernment")]
    public bool? StateGovernment { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="stateGovernmentLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateGovernmentLegalReason")]
    public string StateGovernmentLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets CityGovernment
    /// </summary>
    [DataMember(Name="cityGovernment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityGovernment")]
    public bool? CityGovernment { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="cityGovernmentLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityGovernmentLegalReason")]
    public string CityGovernmentLegalReason { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AgastWithholdingCSLL {\n");
      sb.Append("  LegalReason: ").Append(LegalReason).Append("\n");
      sb.Append("  Business: ").Append(Business).Append("\n");
      sb.Append("  BusinessLegalReason: ").Append(BusinessLegalReason).Append("\n");
      sb.Append("  FederalGovernment: ").Append(FederalGovernment).Append("\n");
      sb.Append("  FederalGovernmentLegalReason: ").Append(FederalGovernmentLegalReason).Append("\n");
      sb.Append("  StateGovernment: ").Append(StateGovernment).Append("\n");
      sb.Append("  StateGovernmentLegalReason: ").Append(StateGovernmentLegalReason).Append("\n");
      sb.Append("  CityGovernment: ").Append(CityGovernment).Append("\n");
      sb.Append("  CityGovernmentLegalReason: ").Append(CityGovernmentLegalReason).Append("\n");
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
