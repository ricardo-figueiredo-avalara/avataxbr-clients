using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// ReceiptTransactionOut
    /// </summary>
    [DataContract]
    public class ReceiptTransactionOut
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
        public List<PayRecLinesOut> Lines { get; set; }

        /// <summary>
        /// Gets or Sets CalculatedTaxSummary
        /// </summary>
        [DataMember(Name = "calculatedTaxSummary", EmitDefaultValue = false)]
        public PayRecCalculatedTaxSummaryForService CalculatedTaxSummary { get; set; }

        /// <summary>
        /// Gets or Sets ProcessingInfo
        /// </summary>
        [DataMember(Name = "processingInfo", EmitDefaultValue = false)]
        public ProcessingInfo ProcessingInfo { get; set; }
    }
}
