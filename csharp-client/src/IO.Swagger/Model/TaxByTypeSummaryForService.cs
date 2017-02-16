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
    /// summary of all taxes
    /// </summary>
    [DataContract]
    public partial class TaxByTypeSummaryForService :  IEquatable<TaxByTypeSummaryForService>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxByTypeSummaryForService" /> class.
        /// </summary>
        /// <param name="Tax">sum of referenced tax value.</param>
        /// <param name="Jurisdictions">Jurisdictions.</param>
        public TaxByTypeSummaryForService(double? Tax = default(double?), List<TaxByTypeSummaryJurisdiction> Jurisdictions = default(List<TaxByTypeSummaryJurisdiction>))
        {
            this.Tax = Tax;
            this.Jurisdictions = Jurisdictions;
        }
        
        /// <summary>
        /// sum of referenced tax value
        /// </summary>
        /// <value>sum of referenced tax value</value>
        [DataMember(Name="tax", EmitDefaultValue=false)]
        public double? Tax { get; set; }
        /// <summary>
        /// Gets or Sets Jurisdictions
        /// </summary>
        [DataMember(Name="jurisdictions", EmitDefaultValue=false)]
        public List<TaxByTypeSummaryJurisdiction> Jurisdictions { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaxByTypeSummaryForService {\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Jurisdictions: ").Append(Jurisdictions).Append("\n");
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
            return this.Equals(obj as TaxByTypeSummaryForService);
        }

        /// <summary>
        /// Returns true if TaxByTypeSummaryForService instances are equal
        /// </summary>
        /// <param name="other">Instance of TaxByTypeSummaryForService to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaxByTypeSummaryForService other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Tax == other.Tax ||
                    this.Tax != null &&
                    this.Tax.Equals(other.Tax)
                ) && 
                (
                    this.Jurisdictions == other.Jurisdictions ||
                    this.Jurisdictions != null &&
                    this.Jurisdictions.SequenceEqual(other.Jurisdictions)
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
                if (this.Tax != null)
                    hash = hash * 59 + this.Tax.GetHashCode();
                if (this.Jurisdictions != null)
                    hash = hash * 59 + this.Jurisdictions.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}