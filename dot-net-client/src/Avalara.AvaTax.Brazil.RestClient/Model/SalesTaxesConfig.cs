using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesTaxesConfig
    /// </summary>
    [DataContract]
    public class SalesTaxesConfig
    {
        /// <summary>
        /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE 
        /// </summary>
        /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE </value>
        [DataMember(Name = "accruableCOFINSTaxation", EmitDefaultValue = false)]
        public AccruableCOFINSTaxationEnum? AccruableCOFINSTaxation { get; set; }
        /// <summary>
        /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
        /// </summary>
        /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT </value>
        [DataMember(Name = "accruableCSLLTaxation", EmitDefaultValue = false)]
        public AccruableCSLLTaxationEnum? AccruableCSLLTaxation { get; set; }
        /// <summary>
        /// There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE 
        /// </summary>
        /// <value>There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE </value>
        [DataMember(Name = "accruablePISTaxation", EmitDefaultValue = false)]
        public AccruablePISTaxationEnum? AccruablePISTaxation { get; set; }

        /// <summary>
        /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
        /// </summary>
        /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption</value>
        [DataMember(Name = "accruableCOFINSExempCodeTaxation", EmitDefaultValue = false)]
        public string AccruableCOFINSExempCodeTaxation { get; set; }

        /// <summary>
        /// This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
        /// </summary>
        /// <value>This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption</value>
        [DataMember(Name = "accruablePISExempCodeTaxation", EmitDefaultValue = false)]
        public string AccruablePISExempCodeTaxation { get; set; }

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
        /// Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
        /// </summary>
        /// <value>Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.</value>
        [DataMember(Name = "withholdingPIS", EmitDefaultValue = false)]
        public bool? WithholdingPIS { get; set; }

        /// <summary>
        /// When property withholdingIRRF is false is mandatory inform the reason
        /// </summary>
        /// <value>When property withholdingIRRF is false is mandatory inform the reason</value>
        [DataMember(Name = "withholdIRRFExemptReasonTaxation", EmitDefaultValue = false)]
        public string WithholdIRRFExemptReasonTaxation { get; set; }
    }
}
