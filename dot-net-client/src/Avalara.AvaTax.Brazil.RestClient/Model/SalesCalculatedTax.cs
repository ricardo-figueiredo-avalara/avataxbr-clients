using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesCalculatedTax
    /// </summary>
    [DataContract]
    public class SalesCalculatedTax
    {
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name = "taxByType", EmitDefaultValue = false)]
        public SalesTaxByType TaxByType { get; set; }

        /// <summary>
        /// Sum of tax type not VAT (Value Added Tax)
        /// </summary>
        /// <value>Sum of tax type not VAT (Value Added Tax)</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }

        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public List<DetailsCalculatedTaxServiceSales> Details { get; set; }
    }
}