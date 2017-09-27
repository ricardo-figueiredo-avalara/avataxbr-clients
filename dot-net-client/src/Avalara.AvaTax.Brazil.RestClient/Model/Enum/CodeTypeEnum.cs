using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Gets or Sets CodeType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CodeTypeEnum
    {

        /// <summary>
        /// Enum NCM for "NCM"
        /// </summary>
        [EnumMember(Value = "NCM")]
        NCM,

        /// <summary>
        /// Enum NBS for "NBS"
        /// </summary>
        [EnumMember(Value = "NBS")]
        NBS,

        /// <summary>
        /// Enum LC116 for "LC116"
        /// </summary>
        [EnumMember(Value = "LC116")]
        LC116,

        /// <summary>
        /// Enum SERVICEUNREGULATED for "SERVICE UNREGULATED"
        /// </summary>
        [EnumMember(Value = "SERVICE UNREGULATED")]
        SERVICEUNREGULATED
    }
}
