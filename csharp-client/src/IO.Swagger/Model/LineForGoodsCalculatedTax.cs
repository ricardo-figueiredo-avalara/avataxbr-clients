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
    /// LineForGoodsCalculatedTax
    /// </summary>
    [DataContract]
    public partial class LineForGoodsCalculatedTax :  IEquatable<LineForGoodsCalculatedTax>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LineForGoodsCalculatedTax" /> class.
        /// </summary>
        /// <param name="TaxByType">TaxByType.</param>
        /// <param name="Tax">Tax.</param>
        /// <param name="Details">Details.</param>
        public LineForGoodsCalculatedTax(LineForGoodsCalculatedTaxTaxByType TaxByType = default(LineForGoodsCalculatedTaxTaxByType), double? Tax = default(double?), List<DetailsCalculatedTaxItem> Details = default(List<DetailsCalculatedTaxItem>))
        {
            this.TaxByType = TaxByType;
            this.Tax = Tax;
            this.Details = Details;
        }
        
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name="taxByType", EmitDefaultValue=false)]
        public LineForGoodsCalculatedTaxTaxByType TaxByType { get; set; }
        /// <summary>
        /// Gets or Sets Tax
        /// </summary>
        [DataMember(Name="tax", EmitDefaultValue=false)]
        public double? Tax { get; set; }
        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name="details", EmitDefaultValue=false)]
        public List<DetailsCalculatedTaxItem> Details { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LineForGoodsCalculatedTax {\n");
            sb.Append("  TaxByType: ").Append(TaxByType).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
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
            return this.Equals(obj as LineForGoodsCalculatedTax);
        }

        /// <summary>
        /// Returns true if LineForGoodsCalculatedTax instances are equal
        /// </summary>
        /// <param name="other">Instance of LineForGoodsCalculatedTax to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LineForGoodsCalculatedTax other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.TaxByType == other.TaxByType ||
                    this.TaxByType != null &&
                    this.TaxByType.Equals(other.TaxByType)
                ) && 
                (
                    this.Tax == other.Tax ||
                    this.Tax != null &&
                    this.Tax.Equals(other.Tax)
                ) && 
                (
                    this.Details == other.Details ||
                    this.Details != null &&
                    this.Details.SequenceEqual(other.Details)
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
                if (this.TaxByType != null)
                    hash = hash * 59 + this.TaxByType.GetHashCode();
                if (this.Tax != null)
                    hash = hash * 59 + this.Tax.GetHashCode();
                if (this.Details != null)
                    hash = hash * 59 + this.Details.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}