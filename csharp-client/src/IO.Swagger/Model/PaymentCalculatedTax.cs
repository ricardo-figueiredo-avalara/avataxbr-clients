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
    /// Structure with value for each tax withhold value of this line
    /// </summary>
    [DataContract]
    public partial class PaymentCalculatedTax :  IEquatable<PaymentCalculatedTax>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentCalculatedTax" /> class.
        /// </summary>
        /// <param name="TaxByType">TaxByType.</param>
        /// <param name="Tax">Sum of tax type not VAT (Value Added Tax).</param>
        public PaymentCalculatedTax(PaymentTaxByType TaxByType = default(PaymentTaxByType), double? Tax = default(double?))
        {
            this.TaxByType = TaxByType;
            this.Tax = Tax;
        }
        
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name="taxByType", EmitDefaultValue=false)]
        public PaymentTaxByType TaxByType { get; set; }
        /// <summary>
        /// Sum of tax type not VAT (Value Added Tax)
        /// </summary>
        /// <value>Sum of tax type not VAT (Value Added Tax)</value>
        [DataMember(Name="tax", EmitDefaultValue=false)]
        public double? Tax { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PaymentCalculatedTax {\n");
            sb.Append("  TaxByType: ").Append(TaxByType).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
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
            return this.Equals(obj as PaymentCalculatedTax);
        }

        /// <summary>
        /// Returns true if PaymentCalculatedTax instances are equal
        /// </summary>
        /// <param name="other">Instance of PaymentCalculatedTax to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaymentCalculatedTax other)
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
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
