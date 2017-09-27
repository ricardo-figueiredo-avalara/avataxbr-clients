using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// DetailsCalculatedTaxImpact
    /// </summary>
    [DataContract]
    public class DetailsCalculatedTaxImpact
    {
        /// <summary>
        /// Gets or Sets ImpactOnFinalPrice
        /// </summary>
        [DataMember(Name = "impactOnFinalPrice", EmitDefaultValue = false)]
        public DetailsTaxImpactEnum ImpactOnFinalPrice { get; set; }

        /// <summary>
        /// Gets or Sets ImpactOnNetAmount
        /// </summary>
        [DataMember(Name = "impactOnNetAmount", EmitDefaultValue = false)]
        public DetailsTaxImpactEnum ImpactOnNetAmount { get; set; }

        /// <summary>
        /// Gets or Sets Accounting
        /// </summary>
        [DataMember(Name = "accounting", EmitDefaultValue = false)]
        public DetailsTaxAccountingEnum Accounting { get; set; }
    }
}
