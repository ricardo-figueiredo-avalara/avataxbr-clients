using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseCalculatedTax
    /// </summary>
    [DataContract]
    public class PurchaseCalculatedTax
    {
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name = "taxByType", EmitDefaultValue = false)]
        public PurchaseTaxByType TaxByType { get; set; }

        /// <summary>
        /// Sum of tax type not VAT (Value Added Tax)
        /// </summary>
        /// <value>Sum of tax type not VAT (Value Added Tax)</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }

        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public List<DetailsCalculatedTaxServicePurchase> Details { get; set; }
    }
}
