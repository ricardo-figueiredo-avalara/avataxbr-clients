using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesLinesInTaxDeductions
    /// </summary>
    [DataContract]
    public class SalesLinesInTaxDeductions
    {
        /// <summary>
        /// Deduction amount not taxable by ISS . Example constructions materials included in a service invoice
        /// </summary>
        /// <value>Deduction amount not taxable by ISS . Example constructions materials included in a service invoice</value>
        [DataMember(Name = "iss", EmitDefaultValue = false)]
        public double? Iss { get; set; }
    }
}