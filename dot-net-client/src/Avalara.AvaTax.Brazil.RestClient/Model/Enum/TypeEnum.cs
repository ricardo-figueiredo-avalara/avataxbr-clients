using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
    /// </summary>
    /// <value>Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TypeEnum
    {

        /// <summary>
        /// Enum CSRF for "CSRF"
        /// </summary>
        [EnumMember(Value = "CSRF")]
        CSRF,

        /// <summary>
        /// Enum Individual for "individual"
        /// </summary>
        [EnumMember(Value = "individual")]
        Individual
    }
}
