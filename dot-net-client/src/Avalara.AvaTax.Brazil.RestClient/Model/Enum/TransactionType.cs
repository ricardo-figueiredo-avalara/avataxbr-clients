using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// TransactionType
    /// </summary>
    [DataContract(Name = "transactionType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TransactionType
    {
        /// <summary>
        /// Enum Sale for "Sale"
        /// </summary>
        [EnumMember(Value = "Sale")]
        Sale,

        /// <summary>
        /// Enum Purchase for "Purchase"
        /// </summary>
        [EnumMember(Value = "Purchase")]
        Purchase,

        /// <summary>
        /// Enum Payment for "Payment"
        /// </summary>
        [EnumMember(Value = "Payment")]
        Payment,

        /// <summary>
        /// Enum Receipt for "Receipt"
        /// </summary>
        [EnumMember(Value = "Receipt")]
        Receipt
    }
}
