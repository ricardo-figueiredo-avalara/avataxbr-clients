using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// In
    /// </summary>
    [DataContract(Name = "in")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum In
    {

        /// <summary>
        /// Enum Params for "params"
        /// </summary>
        [EnumMember(Value = "params")]
        Params,

        /// <summary>
        /// Enum Body for "body"
        /// </summary>
        [EnumMember(Value = "body")]
        Body,

        /// <summary>
        /// Enum Query for "query"
        /// </summary>
        [EnumMember(Value = "query")]
        Query
    }
}
