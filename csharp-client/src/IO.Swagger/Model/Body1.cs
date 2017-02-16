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
    /// Body1
    /// </summary>
    [DataContract]
    public partial class Body1 :  IEquatable<Body1>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Body1" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Body1() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Body1" /> class.
        /// </summary>
        /// <param name="NewCode">Destination code. (required).</param>
        public Body1(string NewCode = default(string))
        {
            // to ensure "NewCode" is required (not null)
            if (NewCode == null)
            {
                throw new InvalidDataException("NewCode is a required property for Body1 and cannot be null");
            }
            else
            {
                this.NewCode = NewCode;
            }
        }
        
        /// <summary>
        /// Destination code.
        /// </summary>
        /// <value>Destination code.</value>
        [DataMember(Name="newCode", EmitDefaultValue=false)]
        public string NewCode { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Body1 {\n");
            sb.Append("  NewCode: ").Append(NewCode).Append("\n");
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
            return this.Equals(obj as Body1);
        }

        /// <summary>
        /// Returns true if Body1 instances are equal
        /// </summary>
        /// <param name="other">Instance of Body1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Body1 other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.NewCode == other.NewCode ||
                    this.NewCode != null &&
                    this.NewCode.Equals(other.NewCode)
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
                if (this.NewCode != null)
                    hash = hash * 59 + this.NewCode.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // NewCode (string) maxLength
            if(this.NewCode != null && this.NewCode.Length > 60)
            {
                yield return new ValidationResult("Invalid value for NewCode, length must be less than 60.", new [] { "NewCode" });
            }

            yield break;
        }
    }

}