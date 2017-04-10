using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseInstallmentIn
    /// </summary>
    [DataContract]
    public class PurchaseInstallmentIn
    {
        /// <summary>
        /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
        /// </summary>
        /// <value>DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction</value>
        [DataMember(Name = "documentNumber", EmitDefaultValue = false)]
        public string DocumentNumber { get; set; }

        /// <summary>
        /// installment, Due Date
        /// </summary>
        /// <value>installment, Due Date</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
        /// </summary>
        /// <value>Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)</value>
        [DataMember(Name = "grossValue", EmitDefaultValue = false)]
        public double? GrossValue { get; set; }
    }
}
