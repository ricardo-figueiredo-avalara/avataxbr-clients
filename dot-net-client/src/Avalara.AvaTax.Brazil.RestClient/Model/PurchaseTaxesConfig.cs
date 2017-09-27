using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseTaxesConfig
    /// </summary>
    [DataContract]
    public class PurchaseTaxesConfig
    {
        /// <summary>
        /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE 
        /// </summary>
        /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE </value>
        [DataMember(Name = "entityAccruableCOFINSTaxation", EmitDefaultValue = false)]
        public EntityAccruableCOFINSTaxation? EntityAccruableCOFINSTaxation { get; set; }
        /// <summary>
        /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
        /// </summary>
        /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT </value>
        [DataMember(Name = "entityAccruableCSLLTaxation", EmitDefaultValue = false)]
        public EntityAccruableCSLLTaxation? EntityAccruableCSLLTaxation { get; set; }
        /// <summary>
        /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE 
        /// </summary>
        /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE </value>
        [DataMember(Name = "entityAccruablePISTaxation", EmitDefaultValue = false)]
        public EntityAccruablePISTaxation? EntityAccruablePISTaxation { get; set; }

        /// <summary>
        /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
        /// </summary>
        /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.</value>
        [DataMember(Name = "accruableCOFINSExempCodeTaxation", EmitDefaultValue = false)]
        public string AccruableCOFINSExempCodeTaxation { get; set; }

        /// <summary>
        /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
        /// </summary>
        /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.</value>
        [DataMember(Name = "accruablePISExempCodeTaxation", EmitDefaultValue = false)]
        public string AccruablePISExempCodeTaxation { get; set; }

        /// <summary>
        /// When Code is 999 the user system need send the custom reason to Exemption
        /// </summary>
        /// <value>When Code is 999 the user system need send the custom reason to Exemption</value>
        [DataMember(Name = "accruablePISExemptReasonTaxation", EmitDefaultValue = false)]
        public string AccruablePISExemptReasonTaxation { get; set; }

        /// <summary>
        /// When Code is 999 the user system need send the custom reason to Exemption
        /// </summary>
        /// <value>When Code is 999 the user system need send the custom reason to Exemption</value>
        [DataMember(Name = "accruableCOFINSExemptReasonTaxation", EmitDefaultValue = false)]
        public string AccruableCOFINSExemptReasonTaxation { get; set; }

        /// <summary>
        /// CSLL no withholding Custom Reason
        /// </summary>
        /// <value>CSLL no withholding Custom Reason</value>
        [DataMember(Name = "accruableCSLLExemptReasonTaxation", EmitDefaultValue = false)]
        public string AccruableCSLLExemptReasonTaxation { get; set; }

        /// <summary>
        /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
        /// </summary>
        /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
        [DataMember(Name = "withholdingPIS", EmitDefaultValue = false)]
        public bool? WithholdingPIS { get; set; }

        /// <summary>
        /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
        /// </summary>
        /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
        [DataMember(Name = "withholdingCOFINS", EmitDefaultValue = false)]
        public bool? WithholdingCOFINS { get; set; }

        /// <summary>
        /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
        /// </summary>
        /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
        [DataMember(Name = "withholdingCSLL", EmitDefaultValue = false)]
        public bool? WithholdingCSLL { get; set; }

        /// <summary>
        /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
        /// </summary>
        /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
        [DataMember(Name = "withholdingIRRF", EmitDefaultValue = false)]
        public bool? WithholdingIRRF { get; set; }

        /// <summary>
        /// COFINS no withholding Custom Reason
        /// </summary>
        /// <value>COFINS no withholding Custom Reason</value>
        [DataMember(Name = "withholdCOFINSExemptReasonTaxation", EmitDefaultValue = false)]
        public string WithholdCOFINSExemptReasonTaxation { get; set; }

        /// <summary>
        /// CSLL no withholding Custom Reason
        /// </summary>
        /// <value>CSLL no withholding Custom Reason</value>
        [DataMember(Name = "withholdCSLLExemptReasonTaxation", EmitDefaultValue = false)]
        public string WithholdCSLLExemptReasonTaxation { get; set; }

        /// <summary>
        /// PIS no withholding Custom Reason
        /// </summary>
        /// <value>PIS no withholding Custom Reason</value>
        [DataMember(Name = "withholdPISExemptReasonTaxation", EmitDefaultValue = false)]
        public string WithholdPISExemptReasonTaxation { get; set; }
    }
}
