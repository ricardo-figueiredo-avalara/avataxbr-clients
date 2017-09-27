using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// ProcessingInfo
    /// </summary>
    [DataContract]
    public class ProcessingInfo
    {
        /// <summary>
        /// Gets or Sets VersionId
        /// </summary>
        [DataMember(Name = "versionId", EmitDefaultValue = false)]
        public string VersionId { get; set; }

        /// <summary>
        /// Gets or Sets Duration
        /// </summary>
        [DataMember(Name = "duration", EmitDefaultValue = false)]
        public double? Duration { get; set; }
    }
}
