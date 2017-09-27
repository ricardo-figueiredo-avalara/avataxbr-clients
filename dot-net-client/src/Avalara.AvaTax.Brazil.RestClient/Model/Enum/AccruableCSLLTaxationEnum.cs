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
    /// Inform if this item by nature is subject to CSLL taxation or exempt - ';T'; # TAXABLE - ';E'; # EXEMPT 
    /// </summary>
    /// <value>Inform if this item by nature is subject to CSLL taxation or exempt - ';T'; # TAXABLE - ';E'; # EXEMPT </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AccruableCSLLTaxationEnum
    {

        /// <summary>
        /// Enum T for "T"
        /// </summary>
        [EnumMember(Value = "T")]
        T,

        /// <summary>
        /// Enum E for "E"
        /// </summary>
        [EnumMember(Value = "E")]
        E
    }
}
