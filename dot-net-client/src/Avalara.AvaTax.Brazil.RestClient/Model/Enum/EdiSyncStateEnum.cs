using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - &#39;STORED&#39; - &#39;WAITING APPROVAL&#39; - &#39;AUTHORIZED&#39; - &#39;AUTHORIZED with NOTE&#39; - &#39;ERROR&#39; - &#39;CANCELED REPLACED&#39; - &#39;CANCELED&#39; - &#39;CANCELLATION REQUESTED&#39; 
    /// </summary>
    /// <value>Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - &#39;STORED&#39; - &#39;WAITING APPROVAL&#39; - &#39;AUTHORIZED&#39; - &#39;AUTHORIZED with NOTE&#39; - &#39;ERROR&#39; - &#39;CANCELED REPLACED&#39; - &#39;CANCELED&#39; - &#39;CANCELLATION REQUESTED&#39; </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EdiSyncStateEnum
    {

        /// <summary>
        /// Enum STORED for "STORED"
        /// </summary>
        [EnumMember(Value = "STORED")]
        STORED,

        /// <summary>
        /// Enum WAITINGAPPROVAL for "WAITING APPROVAL"
        /// </summary>
        [EnumMember(Value = "WAITING APPROVAL")]
        WAITINGAPPROVAL,

        /// <summary>
        /// Enum AUTHORIZED for "AUTHORIZED"
        /// </summary>
        [EnumMember(Value = "AUTHORIZED")]
        AUTHORIZED,

        /// <summary>
        /// Enum AUTHORIZEDwithNOTE for "AUTHORIZED with NOTE"
        /// </summary>
        [EnumMember(Value = "AUTHORIZED with NOTE")]
        AUTHORIZEDwithNOTE,

        /// <summary>
        /// Enum ERROR for "ERROR"
        /// </summary>
        [EnumMember(Value = "ERROR")]
        ERROR,

        /// <summary>
        /// Enum CANCELEDREPLACED for "CANCELED REPLACED"
        /// </summary>
        [EnumMember(Value = "CANCELED REPLACED")]
        CANCELEDREPLACED,

        /// <summary>
        /// Enum CANCELED for "CANCELED"
        /// </summary>
        [EnumMember(Value = "CANCELED")]
        CANCELED,

        /// <summary>
        /// Enum CANCELLATIONREQUESTED for "CANCELLATION REQUESTED"
        /// </summary>
        [EnumMember(Value = "CANCELLATION REQUESTED")]
        CANCELLATIONREQUESTED
    }
}
