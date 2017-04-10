using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
    /// </summary>
    /// <value>Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' </value>
    [DataContract(Name = "useType")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum UseType
    {
        /// <summary>
        /// Enum Resale for "resale"
        /// </summary>
        [EnumMember(Value = "resale")]
        Resale,

        /// <summary>
        /// Enum Production for "production"
        /// </summary>
        [EnumMember(Value = "production")]
        Production,

        /// <summary>
        /// Enum Useorconsumption for "use or consumption"
        /// </summary>
        [EnumMember(Value = "use or consumption")]
        Useorconsumption,

        /// <summary>
        /// Enum Fixedassets for "fixed assets"
        /// </summary>
        [EnumMember(Value = "fixed assets")]
        Fixedassets
    }
}
