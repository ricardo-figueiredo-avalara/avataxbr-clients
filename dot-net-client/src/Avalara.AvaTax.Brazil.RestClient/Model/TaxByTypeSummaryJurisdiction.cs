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
        /// Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; 
        /// </summary>
        /// <value>Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; </value>
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
