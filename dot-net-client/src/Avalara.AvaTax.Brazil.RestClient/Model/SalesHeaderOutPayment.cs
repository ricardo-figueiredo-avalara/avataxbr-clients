using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesHeaderOutPayment
    /// </summary>
    [DataContract]
    public class SalesHeaderOutPayment
    {
        /// <summary>
        /// Gets or Sets Terms
        /// </summary>
        [DataMember(Name = "terms", EmitDefaultValue = false)]
        public PaymentTerms Terms { get; set; }

        /// <summary>
        /// To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...
        /// </summary>
        /// <value>To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...</value>
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
