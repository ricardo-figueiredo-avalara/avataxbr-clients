using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// PaymentTerms
    /// </summary>
    [DataContract(Name = "paymentTerms")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PaymentTerms
    {
        /// <summary>
        /// Enum NUMBER_0 for 0
        /// </summary>
        [EnumMember(Value = "0")]
        NUMBER_0,

        /// <summary>
        /// Enum NUMBER_1 for 1
        /// </summary>
        [EnumMember(Value = "1")]
        NUMBER_1
    }
}
