using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Object with summary of all taxes returned by engine
    /// </summary>
    [DataContract]
    public class PurchaseTaxByType
    {
        /// <summary>
        /// Gets or Sets IssRf
        /// </summary>
        [DataMember(Name = "issRf", EmitDefaultValue = false)]
        public TaxByTypeTax IssRf { get; set; }

        /// <summary>
        /// Gets or Sets PisRf
        /// </summary>
        [DataMember(Name = "pisRf", EmitDefaultValue = false)]
        public TaxByTypeTax PisRf { get; set; }

        /// <summary>
        /// Gets or Sets CofinsRf
        /// </summary>
        [DataMember(Name = "cofinsRf", EmitDefaultValue = false)]
        public TaxByTypeTax CofinsRf { get; set; }

        /// <summary>
        /// Gets or Sets CsllRf
        /// </summary>
        [DataMember(Name = "csllRf", EmitDefaultValue = false)]
        public TaxByTypeTax CsllRf { get; set; }

        /// <summary>
        /// Gets or Sets Irrf
        /// </summary>
        [DataMember(Name = "irrf", EmitDefaultValue = false)]
        public TaxByTypeTax Irrf { get; set; }

        /// <summary>
        /// Gets or Sets InssRf
        /// </summary>
        [DataMember(Name = "inssRf", EmitDefaultValue = false)]
        public TaxByTypeTax InssRf { get; set; }

        /// <summary>
        /// Gets or Sets InssAr
        /// </summary>
        [DataMember(Name = "inssAr", EmitDefaultValue = false)]
        public TaxByTypeTax InssAr { get; set; }

        /// <summary>
        /// Gets or Sets Pis
        /// </summary>
        [DataMember(Name = "pis", EmitDefaultValue = false)]
        public TaxByTypeTax Pis { get; set; }

        /// <summary>
        /// Gets or Sets Cofins
        /// </summary>
        [DataMember(Name = "cofins", EmitDefaultValue = false)]
        public TaxByTypeTax Cofins { get; set; }
    }
}
