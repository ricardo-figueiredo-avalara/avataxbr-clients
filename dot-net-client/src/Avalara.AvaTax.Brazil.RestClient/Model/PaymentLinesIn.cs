using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PaymentLinesIn
    /// </summary>
    [DataContract]
    public class PaymentLinesIn
    {
        /// <summary>
        /// Gets or Sets LineType
        /// </summary>
        [DataMember(Name = "lineType", EmitDefaultValue = false)]
        public LineTypeEnum? LineType { get; set; }

        /// <summary>
        /// Installment number in this document
        /// </summary>
        /// <value>Installment number in this document</value>
        [DataMember(Name = "lineCode", EmitDefaultValue = false)]
        public int? LineCode { get; set; }


        /// <summary>
        /// Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
        /// </summary>
        /// <value>Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.</value>
        [DataMember(Name = "itemCode", EmitDefaultValue = false)]
        public string ItemCode { get; set; }

        /// <summary>
        /// Free description about this payment
        /// </summary>
        /// <value>Free description about this payment</value>
        [DataMember(Name = "itemDescription", EmitDefaultValue = false)]
        public string ItemDescription { get; set; }

        /// <summary>
        /// Installment number, when paid AS IS
        /// </summary>
        /// <value>Installment number, when paid AS IS</value>
        [DataMember(Name = "itemDocNumber", EmitDefaultValue = false)]
        public string ItemDocNumber { get; set; }

        /// <summary>
        /// Penalty, usually because paid after due date
        /// </summary>
        /// <value>Penalty, usually because paid after due date</value>
        [DataMember(Name = "lineUntaxedPenality", EmitDefaultValue = false)]
        public double? LineUntaxedPenality { get; set; }

        /// <summary>
        /// unconditional discounts
        /// </summary>
        /// <value>unconditional discounts</value>
        [DataMember(Name = "lineUntaxedDiscount", EmitDefaultValue = false)]
        public double? LineUntaxedDiscount { get; set; }

        /// <summary>
        /// Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
        /// </summary>
        /// <value>Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes</value>
        [DataMember(Name = "lineNetValue", EmitDefaultValue = false)]
        public double? LineNetValue { get; set; }
    }
}
