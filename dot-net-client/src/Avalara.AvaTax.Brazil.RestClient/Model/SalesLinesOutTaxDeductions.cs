using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesLinesOutTaxDeductions
    /// </summary>
    [DataContract]
    public class SalesLinesOutTaxDeductions
    {
        /// <summary>
        /// Deduction amount not ISS taxable. Example Building material
        /// </summary>
        /// <value>Deduction amount not ISS taxable. Example Building material</value>
        [DataMember(Name = "iss", EmitDefaultValue = false)]
        public double? Iss { get; set; }
    }
}
