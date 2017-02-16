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
  public class SalesTaxesConfig {
    /// <summary>
    /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataMember(Name="accruableCOFINSTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSTaxation")]
    public string AccruableCOFINSTaxation { get; set; }

    /// <summary>
    /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
    /// </summary>
    /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT </value>
    [DataMember(Name="accruableCSLLTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCSLLTaxation")]
    public string AccruableCSLLTaxation { get; set; }

    /// <summary>
    /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataMember(Name="accruablePISTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISTaxation")]
    public string AccruablePISTaxation { get; set; }

    /// <summary>
    /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
    /// </summary>
    /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption</value>
    [DataMember(Name="accruableCOFINSExempCodeTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSExempCodeTaxation")]
    public string AccruableCOFINSExempCodeTaxation { get; set; }

    /// <summary>
    /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
    /// </summary>
    /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption</value>
    [DataMember(Name="accruablePISExempCodeTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISExempCodeTaxation")]
    public string AccruablePISExempCodeTaxation { get; set; }

    /// <summary>
    /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    /// </summary>
    /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
    [DataMember(Name="withholdingCOFINS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingCOFINS")]
    public bool? WithholdingCOFINS { get; set; }

    /// <summary>
    /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    /// </summary>
    /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
    [DataMember(Name="withholdingCSLL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingCSLL")]
    public bool? WithholdingCSLL { get; set; }

    /// <summary>
    /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    /// </summary>
    /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
    [DataMember(Name="withholdingIRRF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingIRRF")]
    public bool? WithholdingIRRF { get; set; }

    /// <summary>
    /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    /// </summary>
    /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
    [DataMember(Name="withholdingPIS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingPIS")]
    public bool? WithholdingPIS { get; set; }

    /// <summary>
    /// When property withholdingIRRF is false is mandatory inform the reason
    /// </summary>
    /// <value>When property withholdingIRRF is false is mandatory inform the reason</value>
    [DataMember(Name="withholdIRRFExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdIRRFExemptReasonTaxation")]
    public string WithholdIRRFExemptReasonTaxation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesTaxesConfig {\n");
      sb.Append("  AccruableCOFINSTaxation: ").Append(AccruableCOFINSTaxation).Append("\n");
      sb.Append("  AccruableCSLLTaxation: ").Append(AccruableCSLLTaxation).Append("\n");
      sb.Append("  AccruablePISTaxation: ").Append(AccruablePISTaxation).Append("\n");
      sb.Append("  AccruableCOFINSExempCodeTaxation: ").Append(AccruableCOFINSExempCodeTaxation).Append("\n");
      sb.Append("  AccruablePISExempCodeTaxation: ").Append(AccruablePISExempCodeTaxation).Append("\n");
      sb.Append("  WithholdingCOFINS: ").Append(WithholdingCOFINS).Append("\n");
      sb.Append("  WithholdingCSLL: ").Append(WithholdingCSLL).Append("\n");
      sb.Append("  WithholdingIRRF: ").Append(WithholdingIRRF).Append("\n");
      sb.Append("  WithholdingPIS: ").Append(WithholdingPIS).Append("\n");
      sb.Append("  WithholdIRRFExemptReasonTaxation: ").Append(WithholdIRRFExemptReasonTaxation).Append("\n");
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
