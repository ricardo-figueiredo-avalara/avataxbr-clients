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
    /// - &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation). 
    /// </summary>
    /// <value>- &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation). </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PaymentModeEnum
    {

        /// <summary>
        /// Enum CALCULATE for "CALCULATE"
        /// </summary>
        [EnumMember(Value = "CALCULATE")]
        CALCULATE,

        /// <summary>
        /// Enum ASIS for "ASIS"
        /// </summary>
        [EnumMember(Value = "ASIS")]
        ASIS
    }
}
