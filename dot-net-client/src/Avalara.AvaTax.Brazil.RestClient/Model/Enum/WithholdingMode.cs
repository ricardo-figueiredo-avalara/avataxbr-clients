using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x = tax is not subject to withholding.  - 'xxx' - 'PCC' - 'PCx' - 'PxC' - 'Pxx' - 'xCC' - 'xxC' - 'xCx' 
    /// </summary>
    /// <value>Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x = tax is not subject to withholding.  - 'xxx' - 'PCC' - 'PCx' - 'PxC' - 'Pxx' - 'xCC' - 'xxC' - 'xCx' </value>
    [DataContract(Name = "withholdingMode")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum WithholdingMode
    {
        /// <summary>
        /// Enum Xxx for "xxx"
        /// </summary>
        [EnumMember(Value = "xxx")]
        Xxx,

        /// <summary>
        /// Enum PCC for "PCC"
        /// </summary>
        [EnumMember(Value = "PCC")]
        PCC,

        /// <summary>
        /// Enum PCx for "PCx"
        /// </summary>
        [EnumMember(Value = "PCx")]
        PCx,

        /// <summary>
        /// Enum PxC for "PxC"
        /// </summary>
        [EnumMember(Value = "PxC")]
        PxC,

        /// <summary>
        /// Enum Pxx for "Pxx"
        /// </summary>
        [EnumMember(Value = "Pxx")]
        Pxx,

        /// <summary>
        /// Enum XCC for "xCC"
        /// </summary>
        [EnumMember(Value = "xCC")]
        XCC,

        /// <summary>
        /// Enum XxC for "xxC"
        /// </summary>
        [EnumMember(Value = "xxC")]
        XxC,

        /// <summary>
        /// Enum XCx for "xCx"
        /// </summary>
        [EnumMember(Value = "xCx")]
        XCx
    }
}
