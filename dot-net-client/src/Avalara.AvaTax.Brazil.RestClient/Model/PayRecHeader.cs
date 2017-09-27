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
    /// PayRecHeader
    /// </summary>
    [DataContract]
    public class PayRecHeader
    {
        /// <summary>
        /// This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; 
        /// </summary>
        /// <value>This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; </value>
        [DataMember(Name = "transactionType", EmitDefaultValue = false)]
        public TransactionType? TransactionType { get; set; }
        /// <summary>
        /// - &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation). 
        /// </summary>
        /// <value>- &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation). </value>
        [DataMember(Name = "paymentMode", EmitDefaultValue = false)]
        public PaymentModeEnum? PaymentMode { get; set; }

        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored</value>
        [DataMember(Name = "documentCode", EmitDefaultValue = false)]
        public string DocumentCode { get; set; }

        /// <summary>
        /// currency code. &#39;BRL&#39; for Brazilian Reais.
        /// </summary>
        /// <value>currency code. &#39;BRL&#39; for Brazilian Reais.</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
        /// </summary>
        /// <value>This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)</value>
        [DataMember(Name = "transactionDate", EmitDefaultValue = false)]
        public string TransactionDate { get; set; }

        /// <summary>
        /// accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
        /// </summary>
        /// <value>accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.</value>
        [DataMember(Name = "taxCalculationDate", EmitDefaultValue = false)]
        public string TaxCalculationDate { get; set; }

    }
}
