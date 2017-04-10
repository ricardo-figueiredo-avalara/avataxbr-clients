using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// summary of all taxes
    /// </summary>
    [DataContract]
    public class TaxByTypeSummaryForService
    {
        /// <summary>
        /// sum of referenced tax value
        /// </summary>
        /// <value>sum of referenced tax value</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }

        /// <summary>
        /// Gets or Sets Jurisdictions
        /// </summary>
        [DataMember(Name = "jurisdictions", EmitDefaultValue = false)]
        public List<TaxByTypeSummaryJurisdiction> Jurisdictions { get; set; }
    }
}
