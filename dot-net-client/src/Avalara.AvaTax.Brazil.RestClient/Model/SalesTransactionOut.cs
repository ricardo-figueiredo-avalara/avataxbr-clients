using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesTransactionOut
    /// </summary>
    [DataContract]
    public class SalesTransactionOut
    {
        /// <summary>
        /// Gets or Sets Header
        /// </summary>
        [DataMember(Name = "header", EmitDefaultValue = false)]
        public SalesHeaderOut Header { get; set; }

        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name = "lines", EmitDefaultValue = false)]
        public List<SalesLinesOut> Lines { get; set; }

        /// <summary>
        /// Gets or Sets CalculatedTaxSummary
        /// </summary>
        [DataMember(Name = "calculatedTaxSummary", EmitDefaultValue = false)]
        public SalesCalculatedTaxSummaryForService CalculatedTaxSummary { get; set; }

        /// <summary>
        /// Gets or Sets ProcessingInfo
        /// </summary>
        [DataMember(Name = "processingInfo", EmitDefaultValue = false)]
        public ProcessingInfo ProcessingInfo { get; set; }
    }
}
