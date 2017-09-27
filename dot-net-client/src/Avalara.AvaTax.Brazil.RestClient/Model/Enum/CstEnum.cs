using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// - &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE 
    /// </summary>
    /// <value>- &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CstEnum
    {

        /// <summary>
        /// Enum _01 for "01"
        /// </summary>
        [EnumMember(Value = "01")]
        _01,

        /// <summary>
        /// Enum _02 for "02"
        /// </summary>
        [EnumMember(Value = "02")]
        _02,

        /// <summary>
        /// Enum _03 for "03"
        /// </summary>
        [EnumMember(Value = "03")]
        _03,

        /// <summary>
        /// Enum _04 for "04"
        /// </summary>
        [EnumMember(Value = "04")]
        _04,

        /// <summary>
        /// Enum _05 for "05"
        /// </summary>
        [EnumMember(Value = "05")]
        _05,

        /// <summary>
        /// Enum _21 for "21"
        /// </summary>
        [EnumMember(Value = "21")]
        _21,

        /// <summary>
        /// Enum _22 for "22"
        /// </summary>
        [EnumMember(Value = "22")]
        _22,

        /// <summary>
        /// Enum _23 for "23"
        /// </summary>
        [EnumMember(Value = "23")]
        _23,

        /// <summary>
        /// Enum _24 for "24"
        /// </summary>
        [EnumMember(Value = "24")]
        _24,

        /// <summary>
        /// Enum _25 for "25"
        /// </summary>
        [EnumMember(Value = "25")]
        _25,

        /// <summary>
        /// Enum _40 for "40"
        /// </summary>
        [EnumMember(Value = "40")]
        _40
    }
}
