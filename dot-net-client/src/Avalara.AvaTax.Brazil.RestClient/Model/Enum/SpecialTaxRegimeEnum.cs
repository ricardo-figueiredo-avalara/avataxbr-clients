using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP) 
    /// </summary>
    /// <value>Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP) </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SpecialTaxRegimeEnum
    {

        /// <summary>
        /// Enum MEM for "MEM"
        /// </summary>
        [EnumMember(Value = "MEM")]
        MEM,

        /// <summary>
        /// Enum EST for "EST"
        /// </summary>
        [EnumMember(Value = "EST")]
        EST,

        /// <summary>
        /// Enum SPR for "SPR"
        /// </summary>
        [EnumMember(Value = "SPR")]
        SPR,

        /// <summary>
        /// Enum COP for "COP"
        /// </summary>
        [EnumMember(Value = "COP")]
        COP,

        /// <summary>
        /// Enum MEI for "MEI"
        /// </summary>
        [EnumMember(Value = "MEI")]
        MEI,

        /// <summary>
        /// Enum MPP for "MPP"
        /// </summary>
        [EnumMember(Value = "MPP")]
        MPP
    }
}
