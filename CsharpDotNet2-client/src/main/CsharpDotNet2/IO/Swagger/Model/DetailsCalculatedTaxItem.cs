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
  public class DetailsCalculatedTaxItem {
    /// <summary>
    /// This string captures the applicable location type. Location used for calc. Buyer or Seller
    /// </summary>
    /// <value>This string captures the applicable location type. Location used for calc. Buyer or Seller</value>
    [DataMember(Name="locationType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locationType")]
    public string LocationType { get; set; }

    /// <summary>
    /// Jurisdiction used for calctax amount
    /// </summary>
    /// <value>Jurisdiction used for calctax amount</value>
    [DataMember(Name="jurisdictionName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionName")]
    public string JurisdictionName { get; set; }

    /// <summary>
    /// Type of jurisdiction
    /// </summary>
    /// <value>Type of jurisdiction</value>
    [DataMember(Name="jurisdictionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionType")]
    public string JurisdictionType { get; set; }

    /// <summary>
    /// Tax identificator
    /// </summary>
    /// <value>Tax identificator</value>
    [DataMember(Name="taxType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxType")]
    public string TaxType { get; set; }

    /// <summary>
    /// Name of configuration rate
    /// </summary>
    /// <value>Name of configuration rate</value>
    [DataMember(Name="rateType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rateType")]
    public string RateType { get; set; }

    /// <summary>
    /// This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
    /// </summary>
    /// <value>This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.</value>
    [DataMember(Name="scenario", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scenario")]
    public string Scenario { get; set; }

    /// <summary>
    /// This decimal captures how much of the lineAmount was taxable by this tax, calc base
    /// </summary>
    /// <value>This decimal captures how much of the lineAmount was taxable by this tax, calc base</value>
    [DataMember(Name="subtotalTaxable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subtotalTaxable")]
    public double? SubtotalTaxable { get; set; }

    /// <summary>
    /// This decimal captures the tax rate for this tax.3.00 (3%)
    /// </summary>
    /// <value>This decimal captures the tax rate for this tax.3.00 (3%)</value>
    [DataMember(Name="rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rate")]
    public double? Rate { get; set; }

    /// <summary>
    /// This decimal captures how much of the lineAmount was taxable by this tax
    /// </summary>
    /// <value>This decimal captures how much of the lineAmount was taxable by this tax</value>
    [DataMember(Name="tax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax")]
    public double? Tax { get; set; }

    /// <summary>
    /// This string is required if is exempt
    /// </summary>
    /// <value>This string is required if is exempt</value>
    [DataMember(Name="exemptionCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exemptionCode")]
    public string ExemptionCode { get; set; }

    /// <summary>
    /// This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
    /// </summary>
    /// <value>This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address</value>
    [DataMember(Name="significantLocations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "significantLocations")]
    public List<string> SignificantLocations { get; set; }

    /// <summary>
    /// This string with type of rule
    /// </summary>
    /// <value>This string with type of rule</value>
    [DataMember(Name="taxRuleType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxRuleType")]
    public string TaxRuleType { get; set; }

    /// <summary>
    /// Gets or Sets Source
    /// </summary>
    [DataMember(Name="source", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source")]
    public int? Source { get; set; }

    /// <summary>
    /// Gets or Sets CstB
    /// </summary>
    [DataMember(Name="cstB", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstB")]
    public string CstB { get; set; }

    /// <summary>
    /// Gets or Sets ModBC
    /// </summary>
    [DataMember(Name="modBC", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modBC")]
    public string ModBC { get; set; }

    /// <summary>
    /// Gets or Sets Cst
    /// </summary>
    [DataMember(Name="cst", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cst")]
    public string Cst { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DetailsCalculatedTaxItem {\n");
      sb.Append("  LocationType: ").Append(LocationType).Append("\n");
      sb.Append("  JurisdictionName: ").Append(JurisdictionName).Append("\n");
      sb.Append("  JurisdictionType: ").Append(JurisdictionType).Append("\n");
      sb.Append("  TaxType: ").Append(TaxType).Append("\n");
      sb.Append("  RateType: ").Append(RateType).Append("\n");
      sb.Append("  Scenario: ").Append(Scenario).Append("\n");
      sb.Append("  SubtotalTaxable: ").Append(SubtotalTaxable).Append("\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  Tax: ").Append(Tax).Append("\n");
      sb.Append("  ExemptionCode: ").Append(ExemptionCode).Append("\n");
      sb.Append("  SignificantLocations: ").Append(SignificantLocations).Append("\n");
      sb.Append("  TaxRuleType: ").Append(TaxRuleType).Append("\n");
      sb.Append("  Source: ").Append(Source).Append("\n");
      sb.Append("  CstB: ").Append(CstB).Append("\n");
      sb.Append("  ModBC: ").Append(ModBC).Append("\n");
      sb.Append("  Cst: ").Append(Cst).Append("\n");
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
