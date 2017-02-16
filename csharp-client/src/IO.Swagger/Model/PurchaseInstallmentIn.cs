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
    /// PurchaseInstallmentIn
    /// </summary>
    [DataContract]
    public partial class PurchaseInstallmentIn :  IEquatable<PurchaseInstallmentIn>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseInstallmentIn" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PurchaseInstallmentIn() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseInstallmentIn" /> class.
        /// </summary>
        /// <param name="DocumentNumber">DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction (required).</param>
        /// <param name="Date">installment, Due Date (required).</param>
        /// <param name="GrossValue">Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount) (required).</param>
        public PurchaseInstallmentIn(string DocumentNumber = default(string), DateTime? Date = default(DateTime?), double? GrossValue = default(double?))
        {
            // to ensure "DocumentNumber" is required (not null)
            if (DocumentNumber == null)
            {
                throw new InvalidDataException("DocumentNumber is a required property for PurchaseInstallmentIn and cannot be null");
            }
            else
            {
                this.DocumentNumber = DocumentNumber;
            }
            // to ensure "Date" is required (not null)
            if (Date == null)
            {
                throw new InvalidDataException("Date is a required property for PurchaseInstallmentIn and cannot be null");
            }
            else
            {
                this.Date = Date;
            }
            // to ensure "GrossValue" is required (not null)
            if (GrossValue == null)
            {
                throw new InvalidDataException("GrossValue is a required property for PurchaseInstallmentIn and cannot be null");
            }
            else
            {
                this.GrossValue = GrossValue;
            }
        }
        
        /// <summary>
        /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
        /// </summary>
        /// <value>DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction</value>
        [DataMember(Name="documentNumber", EmitDefaultValue=false)]
        public string DocumentNumber { get; set; }
        /// <summary>
        /// installment, Due Date
        /// </summary>
        /// <value>installment, Due Date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
        /// <summary>
        /// Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
        /// </summary>
        /// <value>Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)</value>
        [DataMember(Name="grossValue", EmitDefaultValue=false)]
        public double? GrossValue { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseInstallmentIn {\n");
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
            return this.Equals(obj as PurchaseInstallmentIn);
        }

        /// <summary>
        /// Returns true if PurchaseInstallmentIn instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseInstallmentIn to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseInstallmentIn other)
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
            yield break;
        }
    }

}
