using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Object with summary of all taxes returned by engine
    /// </summary>
    [DataContract]
    public class SalesTaxByType
    {
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
        /// Gets or Sets Pis
        /// </summary>
        [DataMember(Name = "pis", EmitDefaultValue = false)]
        public TaxByTypeTax Pis { get; set; }

        /// <summary>
        /// Gets or Sets Cofins
        /// </summary>
        [DataMember(Name = "cofins", EmitDefaultValue = false)]
        public TaxByTypeTax Cofins { get; set; }

        /// <summary>
        /// Gets or Sets Csll
        /// </summary>
        [DataMember(Name = "csll", EmitDefaultValue = false)]
        public TaxByTypeTax Csll { get; set; }

        /// <summary>
        /// Gets or Sets IssRf
        /// </summary>
        [DataMember(Name = "issRf", EmitDefaultValue = false)]
        public TaxByTypeTax IssRf { get; set; }

        /// <summary>
        /// Gets or Sets Iss
        /// </summary>
        [DataMember(Name = "iss", EmitDefaultValue = false)]
        public TaxByTypeTax Iss { get; set; }

        /// <summary>
        /// Gets or Sets AproxtribCity
        /// </summary>
        [DataMember(Name = "aproxtribCity", EmitDefaultValue = false)]
        public TaxByTypeTax AproxtribCity { get; set; }

        /// <summary>
        /// Gets or Sets AproxtribFed
        /// </summary>
        [DataMember(Name = "aproxtribFed", EmitDefaultValue = false)]
        public TaxByTypeTax AproxtribFed { get; set; }

        /// <summary>
        /// Gets or Sets Irpj
        /// </summary>
        [DataMember(Name = "irpj", EmitDefaultValue = false)]
        public TaxByTypeTax Irpj { get; set; }

        /// <summary>
        /// Gets or Sets Inss
        /// </summary>
        [DataMember(Name = "inss", EmitDefaultValue = false)]
        public TaxByTypeTax Inss { get; set; }
    }
}