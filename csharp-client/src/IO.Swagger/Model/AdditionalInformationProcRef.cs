/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
    /// AdditionalInformationProcRef
    /// </summary>
    [DataContract]
    public partial class AdditionalInformationProcRef :  IEquatable<AdditionalInformationProcRef>, IValidatableObject
    {
        /// <summary>
        /// Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
        /// </summary>
        /// <value>Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IndProcEnum
        {
            
            /// <summary>
            /// Enum _0 for "0"
            /// </summary>
            [EnumMember(Value = "0")]
            _0,
            
            /// <summary>
            /// Enum _1 for "1"
            /// </summary>
            [EnumMember(Value = "1")]
            _1,
            
            /// <summary>
            /// Enum _2 for "2"
            /// </summary>
            [EnumMember(Value = "2")]
            _2,
            
            /// <summary>
            /// Enum _3 for "3"
            /// </summary>
            [EnumMember(Value = "3")]
            _3,
            
            /// <summary>
            /// Enum _9 for "9"
            /// </summary>
            [EnumMember(Value = "9")]
            _9
        }

        /// <summary>
        /// Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
        /// </summary>
        /// <value>Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros </value>
        [DataMember(Name="indProc", EmitDefaultValue=false)]
        public IndProcEnum? IndProc { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AdditionalInformationProcRef" /> class.
        /// </summary>
        /// <param name="NProc">Process Identifier.</param>
        /// <param name="IndProc">Process Origin - &#39;0&#39; # SEFAZ; - &#39;1&#39; # Justiça Federal; - &#39;2&#39; # Justiça Estadual; - &#39;3&#39; # Secex/RFB; - &#39;9&#39; # Outros .</param>
        public AdditionalInformationProcRef(string NProc = default(string), IndProcEnum? IndProc = default(IndProcEnum?))
        {
            this.NProc = NProc;
            this.IndProc = IndProc;
        }
        
        /// <summary>
        /// Process Identifier
        /// </summary>
        /// <value>Process Identifier</value>
        [DataMember(Name="nProc", EmitDefaultValue=false)]
        public string NProc { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdditionalInformationProcRef {\n");
            sb.Append("  NProc: ").Append(NProc).Append("\n");
            sb.Append("  IndProc: ").Append(IndProc).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as AdditionalInformationProcRef);
        }

        /// <summary>
        /// Returns true if AdditionalInformationProcRef instances are equal
        /// </summary>
        /// <param name="other">Instance of AdditionalInformationProcRef to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdditionalInformationProcRef other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.NProc == other.NProc ||
                    this.NProc != null &&
                    this.NProc.Equals(other.NProc)
                ) && 
                (
                    this.IndProc == other.IndProc ||
                    this.IndProc != null &&
                    this.IndProc.Equals(other.IndProc)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.NProc != null)
                    hash = hash * 59 + this.NProc.GetHashCode();
                if (this.IndProc != null)
                    hash = hash * 59 + this.IndProc.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // NProc (string) maxLength
            if(this.NProc != null && this.NProc.Length > 60)
            {
                yield return new ValidationResult("Invalid value for NProc, length must be less than 60.", new [] { "NProc" });
            }

            yield break;
        }
    }

}