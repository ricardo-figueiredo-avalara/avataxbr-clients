using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesLinesIn
    /// </summary>
    [DataContract]
    public class SalesLinesIn
    {
        /// <summary>
        /// This string is a unique identifier for this line in the transaction
        /// </summary>
        /// <value>This string is a unique identifier for this line in the transaction</value>
        [DataMember(Name = "lineCode", EmitDefaultValue = false)]
        public int? LineCode { get; set; }

        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU.
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU.</value>
        [DataMember(Name = "itemCode", EmitDefaultValue = false)]
        public string ItemCode { get; set; }

        /// <summary>
        /// This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
        /// </summary>
        /// <value>This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1</value>
        [DataMember(Name = "numberOfItems", EmitDefaultValue = false)]
        public double? NumberOfItems { get; set; }

        /// <summary>
        /// This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).
        /// </summary>
        /// <value>This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).</value>
        [DataMember(Name = "lineAmount", EmitDefaultValue = false)]
        public double? LineAmount { get; set; }

        /// <summary>
        /// This string captures the description of the item represented by this line, will be used LC 116
        /// </summary>
        /// <value>This string captures the description of the item represented by this line, will be used LC 116</value>
        [DataMember(Name = "itemDescription", EmitDefaultValue = false)]
        public string ItemDescription { get; set; }

        /// <summary>
        /// Conditional discount
        /// </summary>
        /// <value>Conditional discount</value>
        [DataMember(Name = "lineTaxedDiscount", EmitDefaultValue = false)]
        public double? LineTaxedDiscount { get; set; }

        /// <summary>
        /// Unconditional discount
        /// </summary>
        /// <value>Unconditional discount</value>
        [DataMember(Name = "lineUntaxedDiscount", EmitDefaultValue = false)]
        public double? LineUntaxedDiscount { get; set; }

        /// <summary>
        /// Service w/labor assignment Serviço com cessão de mão de obra 
        /// </summary>
        /// <value>Service w/labor assignment Serviço com cessão de mão de obra </value>
        [DataMember(Name = "withLaborAssignment", EmitDefaultValue = false)]
        public bool? WithLaborAssignment { get; set; }

        /// <summary>
        /// Gets or Sets TaxDeductions
        /// </summary>
        [DataMember(Name = "taxDeductions", EmitDefaultValue = false)]
        public SalesLinesInTaxDeductions TaxDeductions { get; set; }
    }
}