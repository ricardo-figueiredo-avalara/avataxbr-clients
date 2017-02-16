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
    /// PaymentInstallment
    /// </summary>
    [DataContract]
    public partial class PaymentInstallment :  IEquatable<PaymentInstallment>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentInstallment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PaymentInstallment() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentInstallment" /> class.
        /// </summary>
        /// <param name="DocumentNumber">Instalment number identifier.</param>
        /// <param name="Date">Installment expiration date.</param>
        /// <param name="GrossValue">Installment value (required).</param>
        public PaymentInstallment(string DocumentNumber = default(string), DateTime? Date = default(DateTime?), double? GrossValue = default(double?))
        {
            // to ensure "GrossValue" is required (not null)
            if (GrossValue == null)
            {
                throw new InvalidDataException("GrossValue is a required property for PaymentInstallment and cannot be null");
            }
            else
            {
                this.GrossValue = GrossValue;
            }
            this.DocumentNumber = DocumentNumber;
            this.Date = Date;
        }
        
        /// <summary>
        /// Instalment number identifier
        /// </summary>
        /// <value>Instalment number identifier</value>
        [DataMember(Name="documentNumber", EmitDefaultValue=false)]
        public string DocumentNumber { get; set; }
        /// <summary>
        /// Installment expiration date
        /// </summary>
        /// <value>Installment expiration date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
        /// <summary>
        /// Installment value
        /// </summary>
        /// <value>Installment value</value>
        [DataMember(Name="grossValue", EmitDefaultValue=false)]
        public double? GrossValue { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PaymentInstallment {\n");
            sb.Append("  DocumentNumber: ").Append(DocumentNumber).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  GrossValue: ").Append(GrossValue).Append("\n");
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
            return this.Equals(obj as PaymentInstallment);
        }

        /// <summary>
        /// Returns true if PaymentInstallment instances are equal
        /// </summary>
        /// <param name="other">Instance of PaymentInstallment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaymentInstallment other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.DocumentNumber == other.DocumentNumber ||
                    this.DocumentNumber != null &&
                    this.DocumentNumber.Equals(other.DocumentNumber)
                ) && 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
                ) && 
                (
                    this.GrossValue == other.GrossValue ||
                    this.GrossValue != null &&
                    this.GrossValue.Equals(other.GrossValue)
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
                if (this.DocumentNumber != null)
                    hash = hash * 59 + this.DocumentNumber.GetHashCode();
                if (this.Date != null)
                    hash = hash * 59 + this.Date.GetHashCode();
                if (this.GrossValue != null)
                    hash = hash * 59 + this.GrossValue.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // DocumentNumber (string) maxLength
            if(this.DocumentNumber != null && this.DocumentNumber.Length > 60)
            {
                yield return new ValidationResult("Invalid value for DocumentNumber, length must be less than 60.", new [] { "DocumentNumber" });
            }

            // DocumentNumber (string) minLength
            if(this.DocumentNumber != null && this.DocumentNumber.Length < 1)
            {
                yield return new ValidationResult("Invalid value for DocumentNumber, length must be greater than 1.", new [] { "DocumentNumber" });
            }

            yield break;
        }
    }

}
