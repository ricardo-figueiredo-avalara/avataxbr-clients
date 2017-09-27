using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Type of jurisdiction - 'City' - 'State' - 'Country' 
    /// </summary>
    /// <value>Type of jurisdiction - 'City' - 'State' - 'Country' </value>
    [DataContract(Name = "JurisdictionType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum JurisdictionType
    {
        /// <summary>
        /// Enum City for "City"
        /// </summary>
        [EnumMember(Value = "City")]
        City,

        /// <summary>
        /// Enum State for "State"
        /// </summary>
        [EnumMember(Value = "State")]
        State,

        /// <summary>
        /// Enum Country for "Country"
        /// </summary>
        [EnumMember(Value = "Country")]
        Country
    }
}
