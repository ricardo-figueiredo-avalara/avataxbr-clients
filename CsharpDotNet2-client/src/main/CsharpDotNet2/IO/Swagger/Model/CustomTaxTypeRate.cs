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
  public class CustomTaxTypeRate {
    /// <summary>
    /// Gets or Sets TaxType
    /// </summary>
    [DataMember(Name="taxType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxType")]
    public TaxType TaxType { get; set; }

    /// <summary>
    /// Tax can be calculated by rate or by quantity
    /// </summary>
    /// <value>Tax can be calculated by rate or by quantity</value>
    [DataMember(Name="taxModel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxModel")]
    public string TaxModel { get; set; }

    /// <summary>
    /// Specific tax rate ex 3.5 (3.5%)
    /// </summary>
    /// <value>Specific tax rate ex 3.5 (3.5%)</value>
    [DataMember(Name="rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rate")]
    public double? Rate { get; set; }

    /// <summary>
    /// Specific tax rate ex 3.5 (3.5%)
    /// </summary>
    /// <value>Specific tax rate ex 3.5 (3.5%)</value>
    [DataMember(Name="srvAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "srvAmount")]
    public double? SrvAmount { get; set; }

    /// <summary>
    /// Gets or Sets QuantityUnidBase
    /// </summary>
    [DataMember(Name="quantityUnidBase", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "quantityUnidBase")]
    public string QuantityUnidBase { get; set; }

    /// <summary>
    /// Gets or Sets SpecializationType
    /// </summary>
    [DataMember(Name="specializationType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specializationType")]
    public string SpecializationType { get; set; }

    /// <summary>
    /// UUID Reference to an item in the LegalReason store. 
    /// </summary>
    /// <value>UUID Reference to an item in the LegalReason store. </value>
    [DataMember(Name="exemptionReasonCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exemptionReasonCode")]
    public string ExemptionReasonCode { get; set; }

    /// <summary>
    /// Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other). 
    /// </summary>
    /// <value>Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other). </value>
    [DataMember(Name="customExemptionReasonDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customExemptionReasonDescription")]
    public string CustomExemptionReasonDescription { get; set; }

    /// <summary>
    /// Gets or Sets Withholding
    /// </summary>
    [DataMember(Name="withholding", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholding")]
    public TaxTypeRateWithholding Withholding { get; set; }

    /// <summary>
    /// Company ID
    /// </summary>
    /// <value>Company ID</value>
    [DataMember(Name="companyId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyId")]
    public Guid? CompanyId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CustomTaxTypeRate {\n");
      sb.Append("  TaxType: ").Append(TaxType).Append("\n");
      sb.Append("  TaxModel: ").Append(TaxModel).Append("\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  SrvAmount: ").Append(SrvAmount).Append("\n");
      sb.Append("  QuantityUnidBase: ").Append(QuantityUnidBase).Append("\n");
      sb.Append("  SpecializationType: ").Append(SpecializationType).Append("\n");
      sb.Append("  ExemptionReasonCode: ").Append(ExemptionReasonCode).Append("\n");
      sb.Append("  CustomExemptionReasonDescription: ").Append(CustomExemptionReasonDescription).Append("\n");
      sb.Append("  Withholding: ").Append(Withholding).Append("\n");
      sb.Append("  CompanyId: ").Append(CompanyId).Append("\n");
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
