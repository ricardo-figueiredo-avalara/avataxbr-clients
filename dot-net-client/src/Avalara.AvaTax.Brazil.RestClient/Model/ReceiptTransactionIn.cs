using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// ReceiptTransactionIn
    /// </summary>
    [DataContract]
    public class ReceiptTransactionIn
    {
        /// <summary>
        /// Gets or Sets Header
        /// </summary>
        [DataMember(Name = "header", EmitDefaultValue = false)]
        public PayRecHeader Header { get; set; }

        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name = "lines", EmitDefaultValue = false)]
        public List<PaymentLinesIn> Lines { get; set; }
    }
}
