using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// AuthorizationVersion
    /// </summary>
    [DataContract(Name = "authorizationVersion")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AuthorizationVersion
    {
        /// <summary>
        /// Enum v1 for "v1"
        /// </summary>
        [EnumMember(Value = "v1")]
        v1,

        /// <summary>
        /// Enum v2 for "v2"
        /// </summary>
        [EnumMember(Value = "v2")]
        v2
    }
}
