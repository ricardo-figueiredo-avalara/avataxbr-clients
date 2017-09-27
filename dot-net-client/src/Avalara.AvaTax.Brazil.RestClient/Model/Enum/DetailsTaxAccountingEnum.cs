using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Escrituração
    /// </summary>
    /// <value>Escrituração</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum DetailsTaxAccountingEnum
    {

        /// <summary>
        /// Enum Liability for "liability"
        /// </summary>
        [EnumMember(Value = "liability")]
        Liability,

        /// <summary>
        /// Enum Asset for "asset"
        /// </summary>
        [EnumMember(Value = "asset")]
        Asset,

        /// <summary>
        /// Enum None for "none"
        /// </summary>
        [EnumMember(Value = "none")]
        None
    }
}
