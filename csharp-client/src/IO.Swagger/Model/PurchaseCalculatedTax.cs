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
    /// PurchaseCalculatedTax
    /// </summary>
    [DataContract]
    public partial class PurchaseCalculatedTax :  IEquatable<PurchaseCalculatedTax>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseCalculatedTax" /> class.
        /// </summary>
        /// <param name="TaxByType">TaxByType.</param>
        /// <param name="Tax">Sum of tax type not VAT (Value Added Tax).</param>
        /// <param name="Details">Details.</param>
        public PurchaseCalculatedTax(PurchaseTaxByType TaxByType = default(PurchaseTaxByType), double? Tax = default(double?), List<PurchaseTaxByTypeDetail> Details = default(List<PurchaseTaxByTypeDetail>))
        {
            this.TaxByType = TaxByType;
            this.Tax = Tax;
            this.Details = Details;
        }
        
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name="taxByType", EmitDefaultValue=false)]
        public PurchaseTaxByType TaxByType { get; set; }
        /// <summary>
        /// Sum of tax type not VAT (Value Added Tax)
        /// </summary>
        /// <value>Sum of tax type not VAT (Value Added Tax)</value>
        [DataMember(Name="tax", EmitDefaultValue=false)]
        public double? Tax { get; set; }
        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name="details", EmitDefaultValue=false)]
        public List<PurchaseTaxByTypeDetail> Details { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseCalculatedTax {\n");
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
            return this.Equals(obj as PurchaseCalculatedTax);
        }

        /// <summary>
        /// Returns true if PurchaseCalculatedTax instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseCalculatedTax to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseCalculatedTax other)
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