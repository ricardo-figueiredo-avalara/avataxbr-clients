using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PccWithholdingMode
    /// </summary>
    [DataContract]
    public class PccWithholdingMode
    {
        /// <summary>
        /// Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
        /// </summary>
        /// <value>Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }

        /// <summary>
        /// this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
        /// </summary>
        /// <value>this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf</value>
        [DataMember(Name = "totalTax", EmitDefaultValue = false)]
        public double? TotalTax { get; set; }

        /// <summary>
        /// Gets or Sets PisRf
        /// </summary>
        [DataMember(Name = "pisRf", EmitDefaultValue = false)]
        public TaxByTypeTax PisRf { get; set; }

        /// <summary>
        /// Gets or Sets CofinsRf
        /// </summary>
        [DataMember(Name = "cofinsRf", EmitDefaultValue = false)]
        public TaxByTypeTax CofinsRf { get; set; }

        /// <summary>
        /// Gets or Sets CsllRf
        /// </summary>
        [DataMember(Name = "csllRf", EmitDefaultValue = false)]
        public TaxByTypeTax CsllRf { get; set; }
    }
}
