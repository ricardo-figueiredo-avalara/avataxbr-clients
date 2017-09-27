using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// This string with type of rule
    /// </summary>
    /// <value>This string with type of rule</value>
    [DataContract(Name = "taxRuleType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TaxRuleType
    {
        /// <summary>
        /// Enum SELLER for "SELLER"
        /// </summary>
        [EnumMember(Value = "SELLER")]
        SELLER,

        /// <summary>
        /// Enum BUYER for "BUYER"
        /// </summary>
        [EnumMember(Value = "BUYER")]
        BUYER,

        /// <summary>
        /// Enum TRANSACTION for "TRANSACTION"
        /// </summary>
        [EnumMember(Value = "TRANSACTION")]
        TRANSACTION,

        /// <summary>
        /// Enum ITEM for "ITEM"
        /// </summary>
        [EnumMember(Value = "ITEM")]
        ITEM,

        /// <summary>
        /// Enum TAX for "TAX"
        /// </summary>
        [EnumMember(Value = "TAX")]
        TAX
    }
}
