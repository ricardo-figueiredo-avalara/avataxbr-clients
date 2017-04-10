using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseCalculatedTaxSummaryForService
    /// </summary>
    [DataContract]
    public class PurchaseCalculatedTaxSummaryForService
    {
        /// <summary>
        /// Count of lines
        /// </summary>
        /// <value>Count of lines</value>
        [DataMember(Name = "numberOfLines", EmitDefaultValue = false)]
        public int? NumberOfLines { get; set; }

        /// <summary>
        /// sum of all line tax attribute
        /// </summary>
        /// <value>sum of all line tax attribute</value>
        [DataMember(Name = "subtotal", EmitDefaultValue = false)]
        public double? Subtotal { get; set; }

        /// <summary>
        /// sum of all line lineAmount attribute
        /// </summary>
        /// <value>sum of all line lineAmount attribute</value>
        [DataMember(Name = "totalTax", EmitDefaultValue = false)]
        public double? TotalTax { get; set; }

        /// <summary>
        /// sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
        /// </summary>
        /// <value>sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute</value>
        [DataMember(Name = "grandTotal", EmitDefaultValue = false)]
        public double? GrandTotal { get; set; }

        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name = "taxByType", EmitDefaultValue = false)]
        public PurchaseCalculatedTaxSummaryForServiceTaxByType TaxByType { get; set; }
    }
}
