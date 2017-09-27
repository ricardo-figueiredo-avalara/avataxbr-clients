using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Object with summary of all taxes returned by engine
    /// </summary>
    [DataContract]
    public class SalesCalculatedTaxSummaryForServiceTaxByType
    {
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

        /// <summary>
        /// Gets or Sets Pis
        /// </summary>
        [DataMember(Name = "pis", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Pis { get; set; }

        /// <summary>
        /// Gets or Sets Cofins
        /// </summary>
        [DataMember(Name = "cofins", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Cofins { get; set; }

        /// <summary>
        /// Gets or Sets Csll
        /// </summary>
        [DataMember(Name = "csll", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Csll { get; set; }

        /// <summary>
        /// Gets or Sets IssRf
        /// </summary>
        [DataMember(Name = "issRf", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService IssRf { get; set; }

        /// <summary>
        /// Gets or Sets Iss
        /// </summary>
        [DataMember(Name = "iss", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Iss { get; set; }

        /// <summary>
        /// Gets or Sets AproxtribCity
        /// </summary>
        [DataMember(Name = "aproxtribCity", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService AproxtribCity { get; set; }

        /// <summary>
        /// Gets or Sets AproxtribFed
        /// </summary>
        [DataMember(Name = "aproxtribFed", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService AproxtribFed { get; set; }

        /// <summary>
        /// Gets or Sets Irpj
        /// </summary>
        [DataMember(Name = "irpj", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Irpj { get; set; }

        /// <summary>
        /// Gets or Sets Inss
        /// </summary>
        [DataMember(Name = "inss", EmitDefaultValue = false)]
        public TaxByTypeSummaryForService Inss { get; set; }
    }
}