using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseEntity
    /// </summary>
    [DataContract]
    public class PurchaseEntity
    {
        /// <summary>
        /// Legal Name of Service buyer.
        /// </summary>
        /// <value>Legal Name of Service buyer.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public EntityType Type { get; set; }

        /// <summary>
        /// Entity Email
        /// </summary>
        /// <value>Entity Email</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;
        /// </summary>
        /// <value>CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;</value>
        [DataMember(Name = "cnpjcpf", EmitDefaultValue = false)]
        public string Cnpjcpf { get; set; }

        /// <summary>
        /// City Tax ID
        /// </summary>
        /// <value>City Tax ID</value>
        [DataMember(Name = "cityTaxId", EmitDefaultValue = false)]
        public string CityTaxId { get; set; }

        /// <summary>
        /// State Tax ID
        /// </summary>
        /// <value>State Tax ID</value>
        [DataMember(Name = "stateTaxId", EmitDefaultValue = false)]
        public string StateTaxId { get; set; }

        /// <summary>
        /// Suframa ID
        /// </summary>
        /// <value>Suframa ID</value>
        [DataMember(Name = "suframa", EmitDefaultValue = false)]
        public string Suframa { get; set; }

        /// <summary>
        /// Entity Phone
        /// </summary>
        /// <value>Entity Phone</value>
        [DataMember(Name = "phone", EmitDefaultValue = false)]
        public string Phone { get; set; }

        /// <summary>
        /// Gets or Sets TaxRegime
        /// </summary>
        [DataMember(Name = "taxRegime", EmitDefaultValue = false)]
        public FederalTaxRegime TaxRegime { get; set; }

        /// <summary>
        /// Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
        /// </summary>
        /// <value>Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.</value>
        [DataMember(Name = "hasCpom", EmitDefaultValue = false)]
        public bool? HasCpom { get; set; }

        /// <summary>
        /// These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
        /// </summary>
        /// <value>These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.</value>
        [DataMember(Name = "subjectWithholdingIrrf", EmitDefaultValue = false)]
        public bool? SubjectWithholdingIrrf { get; set; }

        /// <summary>
        /// The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
        /// </summary>
        /// <value>The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.</value>
        [DataMember(Name = "inssPreviousContrib", EmitDefaultValue = false)]
        public double? InssPreviousContrib { get; set; }

        /// <summary>
        /// The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
        /// </summary>
        /// <value>The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.</value>
        [DataMember(Name = "inssBasisDiscount", EmitDefaultValue = false)]
        public double? InssBasisDiscount { get; set; }

        /// <summary>
        /// When Seller is Simples regime, the seller needs send RF rate.
        /// </summary>
        /// <value>When Seller is Simples regime, the seller needs send RF rate.</value>
        [DataMember(Name = "issRfRate", EmitDefaultValue = false)]
        public double? IssRfRate { get; set; }
    }
}
