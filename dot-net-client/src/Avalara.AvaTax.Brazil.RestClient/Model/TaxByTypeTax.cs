using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// TaxByTypeTax
    /// </summary>
    [DataContract]
    public class TaxByTypeTax
    {
        /// <summary>
        /// Tax value, negative value for withhold value
        /// </summary>
        /// <value>Tax value, negative value for withhold value</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }
    }
}
