using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; 
    /// </summary>
    /// <value>Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum JurisdictionTypeEnum
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
