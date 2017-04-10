using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// TaxByTypeSummaryJurisdiction
    /// </summary>
    [DataContract]
    public class TaxByTypeSummaryJurisdiction
    {
        /// <summary>
        /// Type of jurisdiction - 'City' - 'State' - 'Country' 
        /// </summary>
        /// <value>Type of jurisdiction - 'City' - 'State' - 'Country' </value>
        [DataMember(Name = "jurisdictionType", EmitDefaultValue = false)]
        public JurisdictionType? JurisdictionType { get; set; }

        /// <summary>
        /// Jurisdiction used for calctax amount
        /// </summary>
        /// <value>Jurisdiction used for calctax amount</value>
        [DataMember(Name = "jurisdictionName", EmitDefaultValue = false)]
        public string JurisdictionName { get; set; }

        /// <summary>
        /// sum of referenced tax value by jurisdiction
        /// </summary>
        /// <value>sum of referenced tax value by jurisdiction</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }
    }
}
