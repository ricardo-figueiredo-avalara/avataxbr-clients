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
  public class PurchaseTaxesConfig {
    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataMember(Name="entityAccruableCOFINSTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityAccruableCOFINSTaxation")]
    public string EntityAccruableCOFINSTaxation { get; set; }

    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT </value>
    [DataMember(Name="entityAccruableCSLLTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityAccruableCSLLTaxation")]
    public string EntityAccruableCSLLTaxation { get; set; }

    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataMember(Name="entityAccruablePISTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityAccruablePISTaxation")]
    public string EntityAccruablePISTaxation { get; set; }

    /// <summary>
    /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
    /// </summary>
    /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.</value>
    [DataMember(Name="accruableCOFINSExempCodeTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSExempCodeTaxation")]
    public string AccruableCOFINSExempCodeTaxation { get; set; }

    /// <summary>
    /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
    /// </summary>
    /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.</value>
    [DataMember(Name="accruablePISExempCodeTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISExempCodeTaxation")]
    public string AccruablePISExempCodeTaxation { get; set; }

    /// <summary>
    /// When Code is 999 the user system need send the custom reason to Exemption
    /// </summary>
    /// <value>When Code is 999 the user system need send the custom reason to Exemption</value>
    [DataMember(Name="accruablePISExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruablePISExemptReasonTaxation")]
    public string AccruablePISExemptReasonTaxation { get; set; }

    /// <summary>
    /// When Code is 999 the user system need send the custom reason to Exemption
    /// </summary>
    /// <value>When Code is 999 the user system need send the custom reason to Exemption</value>
    [DataMember(Name="accruableCOFINSExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCOFINSExemptReasonTaxation")]
    public string AccruableCOFINSExemptReasonTaxation { get; set; }

    /// <summary>
    /// CSLL no withholding Custom Reason
    /// </summary>
    /// <value>CSLL no withholding Custom Reason</value>
    [DataMember(Name="accruableCSLLExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accruableCSLLExemptReasonTaxation")]
    public string AccruableCSLLExemptReasonTaxation { get; set; }

    /// <summary>
    /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    /// </summary>
    /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
    [DataMember(Name="withholdingPIS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingPIS")]
    public bool? WithholdingPIS { get; set; }

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
    /// COFINS no withholding Custom Reason
    /// </summary>
    /// <value>COFINS no withholding Custom Reason</value>
    [DataMember(Name="withholdCOFINSExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdCOFINSExemptReasonTaxation")]
    public string WithholdCOFINSExemptReasonTaxation { get; set; }

    /// <summary>
    /// CSLL no withholding Custom Reason
    /// </summary>
    /// <value>CSLL no withholding Custom Reason</value>
    [DataMember(Name="withholdCSLLExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdCSLLExemptReasonTaxation")]
    public string WithholdCSLLExemptReasonTaxation { get; set; }

    /// <summary>
    /// PIS no withholding Custom Reason
    /// </summary>
    /// <value>PIS no withholding Custom Reason</value>
    [DataMember(Name="withholdPISExemptReasonTaxation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdPISExemptReasonTaxation")]
    public string WithholdPISExemptReasonTaxation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseTaxesConfig {\n");
      sb.Append("  EntityAccruableCOFINSTaxation: ").Append(EntityAccruableCOFINSTaxation).Append("\n");
      sb.Append("  EntityAccruableCSLLTaxation: ").Append(EntityAccruableCSLLTaxation).Append("\n");
      sb.Append("  EntityAccruablePISTaxation: ").Append(EntityAccruablePISTaxation).Append("\n");
      sb.Append("  AccruableCOFINSExempCodeTaxation: ").Append(AccruableCOFINSExempCodeTaxation).Append("\n");
      sb.Append("  AccruablePISExempCodeTaxation: ").Append(AccruablePISExempCodeTaxation).Append("\n");
      sb.Append("  AccruablePISExemptReasonTaxation: ").Append(AccruablePISExemptReasonTaxation).Append("\n");
      sb.Append("  AccruableCOFINSExemptReasonTaxation: ").Append(AccruableCOFINSExemptReasonTaxation).Append("\n");
      sb.Append("  AccruableCSLLExemptReasonTaxation: ").Append(AccruableCSLLExemptReasonTaxation).Append("\n");
      sb.Append("  WithholdingPIS: ").Append(WithholdingPIS).Append("\n");
      sb.Append("  WithholdingCOFINS: ").Append(WithholdingCOFINS).Append("\n");
      sb.Append("  WithholdingCSLL: ").Append(WithholdingCSLL).Append("\n");
      sb.Append("  WithholdingIRRF: ").Append(WithholdingIRRF).Append("\n");
      sb.Append("  WithholdCOFINSExemptReasonTaxation: ").Append(WithholdCOFINSExemptReasonTaxation).Append("\n");
      sb.Append("  WithholdCSLLExemptReasonTaxation: ").Append(WithholdCSLLExemptReasonTaxation).Append("\n");
      sb.Append("  WithholdPISExemptReasonTaxation: ").Append(WithholdPISExemptReasonTaxation).Append("\n");
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
