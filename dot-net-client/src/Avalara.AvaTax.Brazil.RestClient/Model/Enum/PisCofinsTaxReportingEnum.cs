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
    /// when the company is Real Profit inform if this item is cumulative or no cumulative by default
    /// </summary>
    /// <value>when the company is Real Profit inform if this item is cumulative or no cumulative by default</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PisCofinsTaxReportingEnum
    {

        /// <summary>
        /// Enum Cumulative for "cumulative"
        /// </summary>
        [EnumMember(Value = "cumulative")]
        Cumulative,

        /// <summary>
        /// Enum NoCumulative for "noCumulative"
        /// </summary>
        [EnumMember(Value = "noCumulative")]
        NoCumulative
    }
}
