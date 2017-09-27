using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Defines DetailsTaxImpactEnum
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum DetailsTaxImpactEnum
    {

        /// <summary>
        /// Enum Add for "Add"
        /// </summary>
        [EnumMember(Value = "Add")]
        Add,

        /// <summary>
        /// Enum Included for "Included"
        /// </summary>
        [EnumMember(Value = "Included")]
        Included,

        /// <summary>
        /// Enum Subtracted for "Subtracted"
        /// </summary>
        [EnumMember(Value = "Subtracted")]
        Subtracted,

        /// <summary>
        /// Enum Informative for "Informative"
        /// </summary>
        [EnumMember(Value = "Informative")]
        Informative
    }
}
