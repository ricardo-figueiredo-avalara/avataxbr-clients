using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Gets or Sets LineType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LineTypeEnum
    {

        /// <summary>
        /// Enum Installment for "installment"
        /// </summary>
        [EnumMember(Value = "installment")]
        Installment
    }
}
