using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesHeaderIn
    /// </summary>
    [DataContract]
    public class SalesHeaderIn
    {
        /// <summary>
        /// This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; 
        /// </summary>
        /// <value>This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; </value>
        [DataMember(Name = "transactionType", EmitDefaultValue = false)]
        public TransactionType? TransactionType { get; set; }

        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored</value>
        [DataMember(Name = "documentCode", EmitDefaultValue = false)]
        public string DocumentCode { get; set; }

        /// <summary>
        /// currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot;
        /// </summary>
        /// <value>currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot;</value>
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

        /// <summary>
        /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
        /// </summary>
        /// <value>This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity</value>
        [DataMember(Name = "companyLocation", EmitDefaultValue = false)]
        public string CompanyLocation { get; set; }

        /// <summary>
        /// The number of Purchase Order
        /// </summary>
        /// <value>The number of Purchase Order</value>
        [DataMember(Name = "purchaseOrderNumber", EmitDefaultValue = false)]
        public string PurchaseOrderNumber { get; set; }

        /// <summary>
        /// Provisional receipt services, sequencial number maintained by the client application, unique by serie
        /// </summary>
        /// <value>Provisional receipt services, sequencial number maintained by the client application, unique by serie</value>
        [DataMember(Name = "rpsNumber", EmitDefaultValue = false)]
        public int? RpsNumber { get; set; }

        /// <summary>
        /// set name identifier for rps number sequency.
        /// </summary>
        /// <value>set name identifier for rps number sequency.</value>
        [DataMember(Name = "rpsSerie", EmitDefaultValue = false)]
        public string RpsSerie { get; set; }

        /// <summary>
        /// Service discrimination, free description about service
        /// </summary>
        /// <value>Service discrimination, free description about service</value>
        [DataMember(Name = "discriminationIn", EmitDefaultValue = false)]
        public string DiscriminationIn { get; set; }

        /// <summary>
        /// Gets or Sets Entity
        /// </summary>
        [DataMember(Name = "entity", EmitDefaultValue = false)]
        public SalesEntity Entity { get; set; }

        /// <summary>
        /// Gets or Sets Payment
        /// </summary>
        [DataMember(Name = "payment", EmitDefaultValue = false)]
        public SalesHeaderInPayment Payment { get; set; }

        /// <summary>
        /// Gets or Sets TaxesConfig
        /// </summary>
        [DataMember(Name = "taxesConfig", EmitDefaultValue = false)]
        public SalesTaxesConfig TaxesConfig { get; set; }

        /// <summary>
        /// Gets or Sets DefaultLocations
        /// </summary>
        [DataMember(Name = "defaultLocations", EmitDefaultValue = false)]
        public SalesDefaultLocations DefaultLocations { get; set; }
    }
}