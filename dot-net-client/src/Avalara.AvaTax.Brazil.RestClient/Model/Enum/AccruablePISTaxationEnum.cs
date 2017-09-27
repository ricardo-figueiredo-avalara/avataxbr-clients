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
    /// Inform if this item by nature is subject to PIS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE 
    /// </summary>
    /// <value>Inform if this item by nature is subject to PIS taxation or exempt - ';T'; # TAXABLE - ';Z'; # TAXABLE WITH RATE&#x3D;0.00 - ';E'; # EXEMPT - ';H'; # SUSPENDED - ';N'; # NO TAXABLE </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AccruablePISTaxationEnum
    {

        /// <summary>
        /// Enum T for "T"
        /// </summary>
        [EnumMember(Value = "T")]
        T,

        /// <summary>
        /// Enum Z for "Z"
        /// </summary>
        [EnumMember(Value = "Z")]
        Z,

        /// <summary>
        /// Enum E for "E"
        /// </summary>
        [EnumMember(Value = "E")]
        E,

        /// <summary>
        /// Enum H for "H"
        /// </summary>
        [EnumMember(Value = "H")]
        H,

        /// <summary>
        /// Enum N for "N"
        /// </summary>
        [EnumMember(Value = "N")]
        N
    }
}
