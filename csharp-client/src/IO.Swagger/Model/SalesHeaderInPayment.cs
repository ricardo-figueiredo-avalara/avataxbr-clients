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
    /// SalesHeaderInPayment
    /// </summary>
    [DataContract]
    public partial class SalesHeaderInPayment :  IEquatable<SalesHeaderInPayment>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SalesHeaderInPayment" /> class.
        /// </summary>
        /// <param name="Terms">Terms.</param>
        /// <param name="Installments">installments.</param>
        public SalesHeaderInPayment(PaymentTerms Terms = default(PaymentTerms), List<SalesInstallmentIn> Installments = default(List<SalesInstallmentIn>))
        {
            this.Terms = Terms;
            this.Installments = Installments;
        }
        
        /// <summary>
        /// Gets or Sets Terms
        /// </summary>
        [DataMember(Name="terms", EmitDefaultValue=false)]
        public PaymentTerms Terms { get; set; }
        /// <summary>
        /// installments
        /// </summary>
        /// <value>installments</value>
        [DataMember(Name="installments", EmitDefaultValue=false)]
        public List<SalesInstallmentIn> Installments { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SalesHeaderInPayment {\n");
            sb.Append("  Terms: ").Append(Terms).Append("\n");
            sb.Append("  Installments: ").Append(Installments).Append("\n");
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
            return this.Equals(obj as SalesHeaderInPayment);
        }

        /// <summary>
        /// Returns true if SalesHeaderInPayment instances are equal
        /// </summary>
        /// <param name="other">Instance of SalesHeaderInPayment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SalesHeaderInPayment other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Terms == other.Terms ||
                    this.Terms != null &&
                    this.Terms.Equals(other.Terms)
                ) && 
                (
                    this.Installments == other.Installments ||
                    this.Installments != null &&
                    this.Installments.SequenceEqual(other.Installments)
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
                if (this.Terms != null)
                    hash = hash * 59 + this.Terms.GetHashCode();
                if (this.Installments != null)
                    hash = hash * 59 + this.Installments.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
