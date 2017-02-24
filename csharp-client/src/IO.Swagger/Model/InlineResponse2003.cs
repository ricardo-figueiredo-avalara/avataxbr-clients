/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
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
    /// InlineResponse2003
    /// </summary>
    [DataContract]
    public partial class InlineResponse2003 :  IEquatable<InlineResponse2003>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003" /> class.
        /// </summary>
        /// <param name="Contingency">Contingency.</param>
        /// <param name="StartDate">StartDate.</param>
        /// <param name="FinishDate">FinishDate.</param>
        public InlineResponse2003(bool? Contingency = default(bool?), DateTime? StartDate = default(DateTime?), DateTime? FinishDate = default(DateTime?))
        {
            this.Contingency = Contingency;
            this.StartDate = StartDate;
            this.FinishDate = FinishDate;
        }
        
        /// <summary>
        /// Gets or Sets Contingency
        /// </summary>
        [DataMember(Name="contingency", EmitDefaultValue=false)]
        public bool? Contingency { get; set; }
        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="startDate", EmitDefaultValue=false)]
        public DateTime? StartDate { get; set; }
        /// <summary>
        /// Gets or Sets FinishDate
        /// </summary>
        [DataMember(Name="finishDate", EmitDefaultValue=false)]
        public DateTime? FinishDate { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003 {\n");
            sb.Append("  Contingency: ").Append(Contingency).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  FinishDate: ").Append(FinishDate).Append("\n");
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
            return this.Equals(obj as InlineResponse2003);
        }

        /// <summary>
        /// Returns true if InlineResponse2003 instances are equal
        /// </summary>
        /// <param name="other">Instance of InlineResponse2003 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003 other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Contingency == other.Contingency ||
                    this.Contingency != null &&
                    this.Contingency.Equals(other.Contingency)
                ) && 
                (
                    this.StartDate == other.StartDate ||
                    this.StartDate != null &&
                    this.StartDate.Equals(other.StartDate)
                ) && 
                (
                    this.FinishDate == other.FinishDate ||
                    this.FinishDate != null &&
                    this.FinishDate.Equals(other.FinishDate)
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
                if (this.Contingency != null)
                    hash = hash * 59 + this.Contingency.GetHashCode();
                if (this.StartDate != null)
                    hash = hash * 59 + this.StartDate.GetHashCode();
                if (this.FinishDate != null)
                    hash = hash * 59 + this.FinishDate.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
