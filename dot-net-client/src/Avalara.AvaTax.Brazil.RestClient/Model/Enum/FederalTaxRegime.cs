using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// FederalTaxRegime
    /// </summary>
    [DataContract(Name = "federalTaxRegime")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FederalTaxRegime
    {
        /// <summary>
        /// Enum RealProfit for "realProfit"
        /// </summary>
        [EnumMember(Value = "realProfit")]
        RealProfit,

        /// <summary>
        /// Enum EstimatedProfit for "estimatedProfit"
        /// </summary>
        [EnumMember(Value = "estimatedProfit")]
        EstimatedProfit,

        /// <summary>
        /// Enum Simplified for "simplified"
        /// </summary>
        [EnumMember(Value = "simplified")]
        Simplified,

        /// <summary>
        /// Enum SimplifiedOverGrossthreshold for "simplifiedOverGrossthreshold"
        /// </summary>
        [EnumMember(Value = "simplifiedOverGrossthreshold")]
        SimplifiedOverGrossthreshold,

        /// <summary>
        /// Enum SimplifiedEntrepreneur for "simplifiedEntrepreneur"
        /// </summary>
        [EnumMember(Value = "simplifiedEntrepreneur")]
        SimplifiedEntrepreneur,

        /// <summary>
        /// Enum NotApplicable for "notApplicable"
        /// </summary>
        [EnumMember(Value = "notApplicable")]
        NotApplicable,

        /// <summary>
        /// Enum Individual for "individual"
        /// </summary>
        [EnumMember(Value = "individual")]
        Individual
    }
}
