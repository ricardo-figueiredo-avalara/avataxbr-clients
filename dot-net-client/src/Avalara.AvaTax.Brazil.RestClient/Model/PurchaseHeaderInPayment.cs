﻿using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseHeaderInPayment
    /// </summary>
    [DataContract]
    public class PurchaseHeaderInPayment
    {
        /// <summary>
        /// Gets or Sets Terms
        /// </summary>
        [DataMember(Name = "terms", EmitDefaultValue = false)]
        public PaymentTerms? Terms { get; set; }

        /// <summary>
        /// installments
        /// </summary>
        /// <value>installments</value>
        [DataMember(Name = "installments", EmitDefaultValue = false)]
        public List<PurchaseInstallmentIn> Installments { get; set; }
    }
}
