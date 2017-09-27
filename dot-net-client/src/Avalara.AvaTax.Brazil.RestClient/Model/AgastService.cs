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
    /// AgastService
    /// </summary>
    [DataContract]
    public class AgastService
    {

        /// <summary>
        /// Gets or Sets CodeType
        /// </summary>
        [DataMember(Name = "codeType", EmitDefaultValue = false)]
        public CodeTypeEnum? CodeType { get; set; }
        /// <summary>
        /// Inform if this item by nature is subject to PIS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE 
        /// </summary>
        /// <value>Inform if this item by nature is subject to PIS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE </value>
        [DataMember(Name = "accruablePISTaxation", EmitDefaultValue = false)]
        public AccruablePISTaxationEnum? AccruablePISTaxation { get; set; }
        /// <summary>
        /// Inform if this item by nature is subject to COFINS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE 
        /// </summary>
        /// <value>Inform if this item by nature is subject to COFINS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE </value>
        [DataMember(Name = "accruableCOFINSTaxation", EmitDefaultValue = false)]
        public AccruableCOFINSTaxationEnum? AccruableCOFINSTaxation { get; set; }
        /// <summary>
        /// when the company is Real Profit inform if this item is cumulative or no cumulative by default
        /// </summary>
        /// <value>when the company is Real Profit inform if this item is cumulative or no cumulative by default</value>
        [DataMember(Name = "pisCofinsTaxReporting", EmitDefaultValue = false)]
        public PisCofinsTaxReportingEnum? PisCofinsTaxReporting { get; set; }
        /// <summary>
        /// Inform if this item by nature is subject to CSLL taxation or exempt - ';T'; # TAXABLE - ';E'; # EXEMPT 
        /// </summary>
        /// <value>Inform if this item by nature is subject to CSLL taxation or exempt - ';T'; # TAXABLE - ';E'; # EXEMPT </value>
        [DataMember(Name = "accruableCSLLTaxation", EmitDefaultValue = false)]
        public AccruableCSLLTaxationEnum? AccruableCSLLTaxation { get; set; }
    }
}
