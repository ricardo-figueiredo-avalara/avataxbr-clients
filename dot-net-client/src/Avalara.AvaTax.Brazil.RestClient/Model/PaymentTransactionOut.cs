using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PaymentTransactionOut
    /// </summary>
    [DataContract]
    public class PaymentTransactionOut
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
