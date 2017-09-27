using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; - &#39;NO_EXEMPTION&#39; 
    /// </summary>
    /// <value>This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; - &#39;NO_EXEMPTION&#39; </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TaxRuleTypeEnum
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
        TAX,

        /// <summary>
        /// Enum NOEXEMPTION for "NO_EXEMPTION"
        /// </summary>
        [EnumMember(Value = "NO_EXEMPTION")]
        NOEXEMPTION
    }
}
