using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PayRecCalculatedTaxSummaryForService
    /// </summary>
    [DataContract]
    public class PayRecCalculatedTaxSummaryForService
    {
        /// <summary>
        /// Count of lines
        /// </summary>
        /// <value>Count of lines</value>
        [DataMember(Name = "numberOfLines", EmitDefaultValue = false)]
        public int? NumberOfLines { get; set; }

        /// <summary>
        /// Sum of grossvalues
        /// </summary>
        /// <value>Sum of grossvalues</value>
        [DataMember(Name = "subtotal", EmitDefaultValue = false)]
        public double? Subtotal { get; set; }

        /// <summary>
        /// Sum of all withholding values
        /// </summary>
        /// <value>Sum of all withholding values</value>
        [DataMember(Name = "totalTax", EmitDefaultValue = false)]
        public double? TotalTax { get; set; }

        /// <summary>
        /// Sum all NetValues
        /// </summary>
        /// <value>Sum all NetValues</value>
        [DataMember(Name = "grandTotal", EmitDefaultValue = false)]
        public double? GrandTotal { get; set; }

        /// <summary>
        /// Gets or Sets PccWithholdingModes
        /// </summary>
        [DataMember(Name = "pccWithholdingModes", EmitDefaultValue = false)]
        public List<PccWithholdingMode> PccWithholdingModes { get; set; }

        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name = "taxByType", EmitDefaultValue = false)]
        public PayRecCalculatedTaxSummaryForServiceTaxByType TaxByType { get; set; }
    }
}
