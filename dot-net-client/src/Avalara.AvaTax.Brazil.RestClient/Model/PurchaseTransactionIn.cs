using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseTransactionIn
    /// </summary>
    [DataContract]
    public class PurchaseTransactionIn
    {
        public PurchaseTransactionIn()
        {
            Header = new PurchaseHeaderIn();
            Lines = new List<PurchaseLinesIn>();
        }

        /// <summary>
        /// Gets or Sets Header
        /// </summary>
        [DataMember(Name = "header", EmitDefaultValue = false, IsRequired = true)]
        public PurchaseHeaderIn Header { get; set; }

        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name = "lines", EmitDefaultValue = false, IsRequired = true)]
        public List<PurchaseLinesIn> Lines { get; set; }
    }
}
