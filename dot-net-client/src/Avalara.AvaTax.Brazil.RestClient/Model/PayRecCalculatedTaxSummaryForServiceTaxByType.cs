using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Object with summary of all taxes returned by engine
    /// </summary>
    [DataContract]
    public class PayRecCalculatedTaxSummaryForServiceTaxByType
    {
        /// <summary>
        /// Gets or Sets IssRf
        /// </summary>
        [DataMember(Name = "issRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService IssRf { get; set; }

        /// <summary>
        /// Gets or Sets PisRf
        /// </summary>
        [DataMember(Name = "pisRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService PisRf { get; set; }

        /// <summary>
        /// Gets or Sets CofinsRf
        /// </summary>
        [DataMember(Name = "cofinsRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService CofinsRf { get; set; }

        /// <summary>
        /// Gets or Sets CsllRf
        /// </summary>
        [DataMember(Name = "csllRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService CsllRf { get; set; }

        /// <summary>
        /// Gets or Sets Irrf
        /// </summary>
        [DataMember(Name = "irrf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Irrf { get; set; }

        /// <summary>
        /// Gets or Sets InssRf
        /// </summary>
        [DataMember(Name = "inssRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService InssRf { get; set; }
    }
}