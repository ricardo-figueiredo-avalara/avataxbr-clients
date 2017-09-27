using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Structure with value for each tax withhold value of this line
    /// </summary>
    [DataContract]
    public class PaymentCalculatedTax
    {
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name = "taxByType", EmitDefaultValue = false)]
        public PaymentTaxByType TaxByType { get; set; }

        /// <summary>
        /// Sum of tax type not VAT (Value Added Tax)
        /// </summary>
        /// <value>Sum of tax type not VAT (Value Added Tax)</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }
    }
}
