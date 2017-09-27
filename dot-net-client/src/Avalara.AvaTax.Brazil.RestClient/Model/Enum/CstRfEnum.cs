using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// - &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE 
    /// </summary>
    /// <value>- &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CstRfEnum
    {

        /// <summary>
        /// Enum _61 for "61"
        /// </summary>
        [EnumMember(Value = "61")]
        _61,

        /// <summary>
        /// Enum _62 for "62"
        /// </summary>
        [EnumMember(Value = "62")]
        _62,

        /// <summary>
        /// Enum _63 for "63"
        /// </summary>
        [EnumMember(Value = "63")]
        _63,

        /// <summary>
        /// Enum _64 for "64"
        /// </summary>
        [EnumMember(Value = "64")]
        _64,

        /// <summary>
        /// Enum _65 for "65"
        /// </summary>
        [EnumMember(Value = "65")]
        _65,

        /// <summary>
        /// Enum _66 for "66"
        /// </summary>
        [EnumMember(Value = "66")]
        _66,

        /// <summary>
        /// Enum _67 for "67"
        /// </summary>
        [EnumMember(Value = "67")]
        _67,

        /// <summary>
        /// Enum _68 for "68"
        /// </summary>
        [EnumMember(Value = "68")]
        _68,

        /// <summary>
        /// Enum _69 for "69"
        /// </summary>
        [EnumMember(Value = "69")]
        _69,

        /// <summary>
        /// Enum _70 for "70"
        /// </summary>
        [EnumMember(Value = "70")]
        _70,

        /// <summary>
        /// Enum _71 for "71"
        /// </summary>
        [EnumMember(Value = "71")]
        _71,

        /// <summary>
        /// Enum _72 for "72"
        /// </summary>
        [EnumMember(Value = "72")]
        _72
    }
}
