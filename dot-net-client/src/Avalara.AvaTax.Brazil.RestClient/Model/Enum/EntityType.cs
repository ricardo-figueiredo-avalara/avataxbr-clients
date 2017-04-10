using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// EntityType
    /// </summary>
    [DataContract(Name = "entityType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EntityType
    {
        /// <summary>
        /// Enum Business for "business"
        /// </summary>
        [EnumMember(Value = "business")]
        Business,

        /// <summary>
        /// Enum Individual for "individual"
        /// </summary>
        [EnumMember(Value = "individual")]
        Individual,

        /// <summary>
        /// Enum FederalGovernment for "federalGovernment"
        /// </summary>
        [EnumMember(Value = "federalGovernment")]
        FederalGovernment,

        /// <summary>
        /// Enum StateGovernment for "stateGovernment"
        /// </summary>
        [EnumMember(Value = "stateGovernment")]
        StateGovernment,

        /// <summary>
        /// Enum CityGovernment for "cityGovernment"
        /// </summary>
        [EnumMember(Value = "cityGovernment")]
        CityGovernment,

        /// <summary>
        /// Enum Foreign for "foreign"
        /// </summary>
        [EnumMember(Value = "foreign")]
        Foreign
    }
}
