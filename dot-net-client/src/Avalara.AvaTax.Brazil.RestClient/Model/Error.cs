using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Error
    /// </summary>
    [DataContract]
    public class Error
    {
        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public int? Code { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets Field
        /// </summary>
        [DataMember(Name = "field", EmitDefaultValue = false)]
        public string Field { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets _In
        /// </summary>
        [DataMember(Name = "in", EmitDefaultValue = false)]
        public In? _In { get; set; }
    }
}
