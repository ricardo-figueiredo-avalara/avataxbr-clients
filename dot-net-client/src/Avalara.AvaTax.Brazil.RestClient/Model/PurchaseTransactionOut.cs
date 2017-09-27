using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseTransactionOut
    /// </summary>
    [DataContract]
    public class PurchaseTransactionOut
    {
        /// <summary>
        /// Gets or Sets Header
        /// </summary>
        [DataMember(Name = "header", EmitDefaultValue = false)]
        public PurchaseHeaderOut Header { get; set; }

        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name = "lines", EmitDefaultValue = false)]
        public List<PurchaseLinesOut> Lines { get; set; }

        /// <summary>
        /// Gets or Sets CalculatedTaxSummary
        /// </summary>
        [DataMember(Name = "calculatedTaxSummary", EmitDefaultValue = false)]
        public PurchaseCalculatedTaxSummaryForService CalculatedTaxSummary { get; set; }

        /// <summary>
        /// Gets or Sets ProcessingInfo
        /// </summary>
        [DataMember(Name = "processingInfo", EmitDefaultValue = false)]
        public ProcessingInfo ProcessingInfo { get; set; }
    }
}
