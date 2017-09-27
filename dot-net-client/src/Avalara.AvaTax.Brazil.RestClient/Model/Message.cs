using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Message
    /// </summary>
    [DataContract]
    public class Message
    {
        /// <summary>
        /// Gets or Sets _Message
        /// </summary>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string _Message { get; set; }
    }
}
