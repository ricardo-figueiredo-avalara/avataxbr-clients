using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseHeaderOutPayment
    /// </summary>
    [DataContract]
    public class PurchaseHeaderOutPayment
    {
        /// <summary>
        /// Gets or Sets Terms
        /// </summary>
        [DataMember(Name = "terms", EmitDefaultValue = false)]
        public PaymentTerms Terms { get; set; }

        /// <summary>
        /// Gets or Sets WithholdingMode
        /// </summary>
        [DataMember(Name = "withholdingMode", EmitDefaultValue = false)]
        public WithholdingMode WithholdingMode { get; set; }

        /// <summary>
        /// installments
        /// </summary>
        /// <value>installments</value>
        [DataMember(Name = "installments", EmitDefaultValue = false)]
        public List<InstallmentComplete> Installments { get; set; }
    }
}
