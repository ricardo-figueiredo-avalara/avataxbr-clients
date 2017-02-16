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
    /// WithholdDef
    /// </summary>
    [DataContract]
    public partial class WithholdDef :  IEquatable<WithholdDef>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WithholdDef" /> class.
        /// </summary>
        /// <param name="ExemptionReasonCode">UUID Reference to an item in the LegalReason store..</param>
        /// <param name="CustomExemptionReasonDescription">CustomExemptionReasonDescription.</param>
        public WithholdDef(string ExemptionReasonCode = default(string), string CustomExemptionReasonDescription = default(string))
        {
            this.ExemptionReasonCode = ExemptionReasonCode;
            this.CustomExemptionReasonDescription = CustomExemptionReasonDescription;
        }
        
        /// <summary>
        /// UUID Reference to an item in the LegalReason store.
        /// </summary>
        /// <value>UUID Reference to an item in the LegalReason store.</value>
        [DataMember(Name="exemptionReasonCode", EmitDefaultValue=false)]
        public string ExemptionReasonCode { get; set; }
        /// <summary>
        /// Gets or Sets CustomExemptionReasonDescription
        /// </summary>
        [DataMember(Name="customExemptionReasonDescription", EmitDefaultValue=false)]
        public string CustomExemptionReasonDescription { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WithholdDef {\n");
            sb.Append("  ExemptionReasonCode: ").Append(ExemptionReasonCode).Append("\n");
            sb.Append("  CustomExemptionReasonDescription: ").Append(CustomExemptionReasonDescription).Append("\n");
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
            return this.Equals(obj as WithholdDef);
        }

        /// <summary>
        /// Returns true if WithholdDef instances are equal
        /// </summary>
        /// <param name="other">Instance of WithholdDef to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WithholdDef other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ExemptionReasonCode == other.ExemptionReasonCode ||
                    this.ExemptionReasonCode != null &&
                    this.ExemptionReasonCode.Equals(other.ExemptionReasonCode)
                ) && 
                (
                    this.CustomExemptionReasonDescription == other.CustomExemptionReasonDescription ||
                    this.CustomExemptionReasonDescription != null &&
                    this.CustomExemptionReasonDescription.Equals(other.CustomExemptionReasonDescription)
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
                if (this.ExemptionReasonCode != null)
                    hash = hash * 59 + this.ExemptionReasonCode.GetHashCode();
                if (this.CustomExemptionReasonDescription != null)
                    hash = hash * 59 + this.CustomExemptionReasonDescription.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
