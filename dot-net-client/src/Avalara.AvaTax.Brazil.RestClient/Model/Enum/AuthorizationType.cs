using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// AuthorizationType
    /// </summary>
    [DataContract(Name = "authorizationType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AuthorizationType
    {
        /// <summary>
        /// Enum Basic for "Basic"
        /// </summary>
        [EnumMember(Value = "basic")]
        Basic,

        /// <summary>
        /// Enum Bearer for "Bearer"
        /// </summary>
        [EnumMember(Value = "bearer")]
        Bearer
    }
}
