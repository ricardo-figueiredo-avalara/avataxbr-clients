/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '00' # Taxed in its totality - '10' # Taxed and subject to tax substitution (ICMS ST) - '20' # Taxed with Tax Base Reduction - '30' # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - '40' # Tax Exempt - '41' # Not Taxed - '50' # Taxes Suspended - '51' # Taxes Diferred - '60' # ICMS Tax already collected through Substituition (ICMS ST) - '70' # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - '90' # Others 
    /// </summary>
    /// <value>Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '00' # Taxed in its totality - '10' # Taxed and subject to tax substitution (ICMS ST) - '20' # Taxed with Tax Base Reduction - '30' # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - '40' # Tax Exempt - '41' # Not Taxed - '50' # Taxes Suspended - '51' # Taxes Diferred - '60' # ICMS Tax already collected through Substituition (ICMS ST) - '70' # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - '90' # Others </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CSTTableBEnum
    {
        
        /// <summary>
        /// Enum _00 for "00"
        /// </summary>
        [EnumMember(Value = "00")]
        _00,
        
        /// <summary>
        /// Enum _10 for "10"
        /// </summary>
        [EnumMember(Value = "10")]
        _10,
        
        /// <summary>
        /// Enum _20 for "20"
        /// </summary>
        [EnumMember(Value = "20")]
        _20,
        
        /// <summary>
        /// Enum _30 for "30"
        /// </summary>
        [EnumMember(Value = "30")]
        _30,
        
        /// <summary>
        /// Enum _40 for "40"
        /// </summary>
        [EnumMember(Value = "40")]
        _40,
        
        /// <summary>
        /// Enum _41 for "41"
        /// </summary>
        [EnumMember(Value = "41")]
        _41,
        
        /// <summary>
        /// Enum _50 for "50"
        /// </summary>
        [EnumMember(Value = "50")]
        _50,
        
        /// <summary>
        /// Enum _51 for "51"
        /// </summary>
        [EnumMember(Value = "51")]
        _51,
        
        /// <summary>
        /// Enum _60 for "60"
        /// </summary>
        [EnumMember(Value = "60")]
        _60,
        
        /// <summary>
        /// Enum _70 for "70"
        /// </summary>
        [EnumMember(Value = "70")]
        _70,
        
        /// <summary>
        /// Enum _90 for "90"
        /// </summary>
        [EnumMember(Value = "90")]
        _90
    }

}
