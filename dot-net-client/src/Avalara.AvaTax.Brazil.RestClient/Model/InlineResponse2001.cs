using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// InlineResponse2001
    /// </summary>
    [DataContract]
    public class InlineResponse2001
    {
        /// <summary>
        /// Item description
        /// </summary>
        /// <value>Item description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// uuid
        /// </summary>
        /// <value>uuid</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Custom item code
        /// </summary>
        /// <value>Custom item code</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }
    }
}
