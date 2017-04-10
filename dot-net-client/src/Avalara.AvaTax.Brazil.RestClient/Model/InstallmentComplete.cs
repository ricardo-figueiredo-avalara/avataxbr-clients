using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// InstallmentComplete
    /// </summary>
    [DataContract]
    public class InstallmentComplete
    {
        /// <summary>
        /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
        /// </summary>
        /// <value>DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction</value>
        [DataMember(Name = "documentNumber", EmitDefaultValue = false)]
        public string DocumentNumber { get; set; }

        /// <summary>
        /// installment Due Date
        /// </summary>
        /// <value>installment Due Date</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
        /// </summary>
        /// <value>Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)</value>
        [DataMember(Name = "grossValue", EmitDefaultValue = false)]
        public double? GrossValue { get; set; }

        /// <summary>
        /// net amount due for this installment, grossValue - ∑ (withhold amounts)
        /// </summary>
        /// <value>net amount due for this installment, grossValue - ∑ (withhold amounts)</value>
        [DataMember(Name = "netValue", EmitDefaultValue = false)]
        public double? NetValue { get; set; }

        /// <summary>
        /// Inform if this payment is subject to Pis, Cofins or CSLL
        /// </summary>
        /// <value>Inform if this payment is subject to Pis, Cofins or CSLL</value>
        [DataMember(Name = "withholdingMode", EmitDefaultValue = false)]
        public WithholdingMode? WithholdingMode { get; set; }

        /// <summary>
        /// calculated PIS-RF tax for this payment
        /// </summary>
        /// <value>calculated PIS-RF tax for this payment</value>
        [DataMember(Name = "withholdingPIS", EmitDefaultValue = false)]
        public double? WithholdingPIS { get; set; }

        /// <summary>
        /// calculated COFINS-RF tax for this payment
        /// </summary>
        /// <value>calculated COFINS-RF tax for this payment</value>
        [DataMember(Name = "withholdingCOFINS", EmitDefaultValue = false)]
        public double? WithholdingCOFINS { get; set; }

        /// <summary>
        /// calculated CSLL-RF tax for this payment
        /// </summary>
        /// <value>calculated CSLL-RF tax for this payment</value>
        [DataMember(Name = "withholdingCSLL", EmitDefaultValue = false)]
        public double? WithholdingCSLL { get; set; }
    }
}
