using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Filter this message application to specified tax cases. - taxtype - jurisdictionType 
  /// </summary>
  [DataContract]
  public class LegalReasonTaxScope {
    /// <summary>
    /// This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
    /// </summary>
    /// <value>This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' </value>
    [DataMember(Name="taxType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxType")]
    public string TaxType { get; set; }

    /// <summary>
    /// These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
    /// </summary>
    /// <value>These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' </value>
    [DataMember(Name="specializedTaxType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specializedTaxType")]
    public string SpecializedTaxType { get; set; }

    /// <summary>
    /// Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
    /// </summary>
    /// <value>Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' </value>
    [DataMember(Name="jurisdictionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionType")]
    public string JurisdictionType { get; set; }

    /// <summary>
    /// Code to identify the Jurisdiction
    /// </summary>
    /// <value>Code to identify the Jurisdiction</value>
    [DataMember(Name="jurisdictionIbgeCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionIbgeCode")]
    public string JurisdictionIbgeCode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LegalReasonTaxScope {\n");
      sb.Append("  TaxType: ").Append(TaxType).Append("\n");
      sb.Append("  SpecializedTaxType: ").Append(SpecializedTaxType).Append("\n");
      sb.Append("  JurisdictionType: ").Append(JurisdictionType).Append("\n");
      sb.Append("  JurisdictionIbgeCode: ").Append(JurisdictionIbgeCode).Append("\n");
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
